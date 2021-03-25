package com.tongdun.parsexml;

import com.tongdun.parsexml.config.Constant;
import com.tongdun.parsexml.sax.SaxService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.helpers.DefaultHandler;

@SpringBootApplication
public class ParseXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParseXmlApplication.class, args);
        SaxService.ReadXML(Constant.PARSE_FILE_PATH, "class",new DefaultHandler());
    }

}
