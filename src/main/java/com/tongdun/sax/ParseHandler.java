package com.tongdun.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class ParseHandler extends DefaultHandler {

    int flag = 0;
    // 开始解析文档，即开始解析XML根元素时调用该方法
    @Override
    public void startDocument() throws SAXException {
        System.out.println("--开始解析XML文档--");
    }
    // 开始解析每个元素时都会调用该方法
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//        System.out.println(qName);
        if (flag ==1)
        if (attributes != null) {
//                countryName.code = attributes.getValue("Description1Id");
//                countryName.name = attributes.getValue("RecordType");
//                countryName.status = attributes.getValue("status");
//                countryName.Description2Id = attributes.getValue("Description2Id");

            for (int i = 0; i < attributes.getLength(); i++) System.out.println(qName+"="+attributes.getQName(i)+"="+attributes.getValue(i));
        }
    }

    // 解析到每个元素的内容时会调用此方法
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String s = String.valueOf(ch);
//        countryName.Description2Id = s;
//        list.add(countryName);
        System.out.println(String.valueOf(ch));
    }

    // 每个元素结束的时候都会调用该方法
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("SanctionsReferencesList".equals(qName))flag=1;
        if ("Description1List".equals(qName))System.exit(0);
        if ("Description1List".equals(qName)) {
//            try {
//                insertStudent(list);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
        }
        // 判断是否为一个节点结束的元素标签
    }
    // 结束解析文档，即解析根元素结束标签时调用该方法
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
//        try {
//            e.printStackTrace();
//        }
    }
}
