package com.tongdun.parsexml.util;

import com.tongdun.parsexml.config.Constant;
import com.tongdun.parsexml.sax.SaxService;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;


public class CountLableUtils extends DefaultHandler {
    //初步统计记录
    private static Integer count = 0;
    //当前标签
    private static String label;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes){
        //如果当前标签为Person
        if (label.equals(qName))count++;

    }
    public static void countLable(String lab) {
        Long startTime = System.currentTimeMillis();
        label = lab;
        SaxService.ReadXML(Constant.PARSE_FILE_PATH, "class",new CountLableUtils());
        System.out.println(lab+"数量="+count);
        System.out.printf("解析耗时:");
        System.out.println(((System.currentTimeMillis()-startTime) / 1000)+"秒");
    }

    public static void main(String[] args) throws InterruptedException {
//        countLable("Person");//2658644
//        countLable("Entity");//182219
//        countLable("PublicFigure");//1469520
//        countLable("SpecialEntity");//48652
    }
}
