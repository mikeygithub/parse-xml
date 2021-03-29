package com.tongdun.parsexml.sax;


import com.google.gson.Gson;
import com.tongdun.parsexml.config.Constant;
import com.tongdun.parsexml.entity.associate.Associate;
import com.tongdun.parsexml.entity.associate.PublicFigure;
import com.tongdun.parsexml.entity.entity.Company;
import com.tongdun.parsexml.entity.entity.Entity;
import com.tongdun.parsexml.entity.entity.Vessel;
import com.tongdun.parsexml.entity.person.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


/**
 * @author mikey
 */
public class ParsePublicFigureToJSONHandler extends DefaultHandler {
    Gson gson = new Gson();
    PublicFigure publicFigure;
    List<PublicFigure> publicFigureList = new LinkedList<>();
    Integer count = 0;
    //当前标签
    String currTag;
    boolean start = false;
    Associate associate;
    List<Associate> associateList = new LinkedList<>();

    // 开始解析文档，即开始解析XML根元素时调用该方法
    @Override
    public void startDocument() throws SAXException {
        System.out.println("--开始解析XML文档--");
    }
    // 开始解析每个元素时都会调用该方法
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes){
        //如果当前标签为Person
        if ("PublicFigure".equals(qName)){
            this.start = true;
        }
        if (this.start) {
            currTag = qName;
            if ("PublicFigure".equals(qName)){
                publicFigure = new PublicFigure();
                publicFigure.id = attributes.getValue("id");
            }
            if ("Associate".equals(qName)) {
                associate = new Associate();
                associate.id = attributes.getValue("id");
                associate.ex = attributes.getValue("ex");
                associate.code = attributes.getValue("code");
            }
        }
    }

    // 解析到每个元素的内容时会调用此方法
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
    }

    // 每个元素结束的时候都会调用该方法
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("Associate".equals(qName)) {
            associateList.add(associate);
            associate = null;
            //清空列表
        }
        if ("PublicFigure".equals(qName)){
            publicFigure.associateList = gson.toJson(associateList);
            publicFigureList.add(publicFigure);
            //clear ass
            publicFigure = null;
            associateList.clear();
            if (publicFigureList.size()> Constant.FULL_FLASH_DB) {
                PublicFigure.insert(publicFigureList);
                System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                publicFigureList.clear();
            }
        }

    }


    // 结束解析文档，即解析根元素结束标签时调用该方法
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        PublicFigure.insert(publicFigureList);
    }



    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        SaxService.ReadXML(Constant.PARSE_FILE_PATH, "class",new ParsePublicFigureToJSONHandler());
        System.out.printf("解析耗时:");
        System.out.println(((System.currentTimeMillis()-startTime) / 1000)+"秒");
    }
}
