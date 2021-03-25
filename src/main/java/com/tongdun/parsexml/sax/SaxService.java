package com.tongdun.parsexml.sax;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * @author mikey
 */
public class SaxService {

    public static void ReadXML(String uri, String NodeName, DefaultHandler handler) {
        try {
            // 创建一个解析XML的工厂对象
            SAXParserFactory parserFactory = SAXParserFactory.newInstance();
            // 创建一个解析XML的对象
            SAXParser parser = parserFactory.newSAXParser();
            // 创建一个解析助手类
            ParsePersonHandler parsePersonHandler = new ParsePersonHandler();
            parser.parse(uri,handler);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}