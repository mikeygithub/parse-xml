package com.tongdun.parsexml;

import com.tongdun.parsexml.sax.SaxService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.helpers.DefaultHandler;

@SpringBootApplication
public class ParseXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParseXmlApplication.class, args);
        SaxService.ReadXML("/home/mikey/Music/PFA2_202101072200_F/Factiva_PFA_Feed_XML/PFA2_202101072200_F.xml", "class",new DefaultHandler());
    }

}
