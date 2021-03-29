package com.tongdun.parsexml.sax;


import com.google.gson.Gson;
import com.tongdun.parsexml.config.Constant;
import com.tongdun.parsexml.entity.associate.Associate;
import com.tongdun.parsexml.entity.associate.PublicFigure;
import com.tongdun.parsexml.entity.associate.SpecialEntity;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.LinkedList;
import java.util.List;


/**
 * @author mikey
 */
public class ParseSpecialEntiyToJSONHandler extends DefaultHandler {
    Gson gson = new Gson();
    SpecialEntity specialEntity;
    List<SpecialEntity> specialEntityList = new LinkedList<>();
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
        if ("SpecialEntity".equals(qName)){
            this.start = true;
        }
        if (this.start) {
            currTag = qName;
            if ("SpecialEntity".equals(qName)){
                specialEntity = new SpecialEntity();
                specialEntity.id = attributes.getValue("id");
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
        if (this.start) {
            if ("Associate".equals(qName)) {
                associateList.add(associate);
                associate = null;
                //清空列表
            }
            if ("SpecialEntity".equals(qName)) {
                specialEntity.associateList = gson.toJson(associateList);
                specialEntityList.add(specialEntity);
                //clear ass
                specialEntity = null;
                associateList.clear();
                if (specialEntityList.size() > Constant.FULL_FLASH_DB) {
                    SpecialEntity.insert(specialEntityList);
                    System.out.println("向数据库刷入数据:" + qName + Constant.FULL_FLASH_DB + "条:" + qName);
                    specialEntityList.clear();
                }
            }
        }
    }


    // 结束解析文档，即解析根元素结束标签时调用该方法
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        SpecialEntity.insert(specialEntityList);
    }



    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        SaxService.ReadXML(Constant.PARSE_FILE_PATH, "class",new ParseSpecialEntiyToJSONHandler());
        System.out.printf("解析耗时:");
        System.out.println(((System.currentTimeMillis()-startTime) / 1000)+"秒");
    }
}
