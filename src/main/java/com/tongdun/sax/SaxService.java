package com.tongdun.sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * @author mikey
 */
public class SaxService {

    public static void ReadXML(String uri, String NodeName) {
        try {
            // 创建一个解析XML的工厂对象
            SAXParserFactory parserFactory = SAXParserFactory.newInstance();
            // 创建一个解析XML的对象
            SAXParser parser = parserFactory.newSAXParser();
            // 创建一个解析助手类
//            ParseHandler parseHandler = new ParseHandler();
            ParsePersonHandler parsePersonHandler = new ParsePersonHandler();
            parser.parse(uri,parsePersonHandler);
//            parser.parse(uri, parseHandler);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}