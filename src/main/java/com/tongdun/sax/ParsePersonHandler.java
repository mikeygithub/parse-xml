package com.tongdun.sax;

import com.tongdun.parsexml.entity.Person;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


public class ParsePersonHandler extends DefaultHandler {

    List<Person> list = new LinkedList<>();
    Person person = new Person();
    Integer count = 0;
    String currTag;
    // 开始解析文档，即开始解析XML根元素时调用该方法
    @Override
    public void startDocument() throws SAXException {
        System.out.println("--开始解析XML文档--");
    }
    // 开始解析每个元素时都会调用该方法
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currTag = qName;
        if ("Person".equals(qName)){
            person = new Person();
            //设置person的属性
            person.id = attributes.getValue("id");
            person.action = attributes.getValue("action");
            person.date = attributes.getValue("date");
        }
    }

    // 解析到每个元素的内容时会调用此方法
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if ("Gender".equals(currTag)&& !Objects.isNull(person))person.gender = String.valueOf(ch,start,length);
    }

    // 每个元素结束的时候都会调用该方法
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        //Person总数：2658644
        if (!Objects.isNull(person))list.add(person);
        if ("Person".equals(qName))person = null;//结束解析一个person将其进行置空

//        if ("Records".equals(qName))System.exit(0);//Entity总数：182219
        // 判断是否为一个节点结束的元素标签
    }
    // 结束解析文档，即解析根元素结束标签时调用该方法
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("Person总数："+count);
    }

    public static void main(String[] args) {
//        Integer i = 0;
//        while (true) System.out.println(++i);
        SaxService.ReadXML("/home/mikey/Music/PFA2_202101072200_F/Factiva_PFA_Feed_XML/PFA2_202101072200_F.xml", "class");
    }
}
