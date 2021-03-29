package com.tongdun.parsexml.config;

public class Constant {
    //文件存放位置
    public static final String PARSE_FILE_PATH = "/Users/mikey/Downloads/Factiva_PFA_Feed_XML/PFA2_202101072200_F.xml";
    //当数据到达多少刷入数据库
    public static final Integer FULL_FLASH_DB = 100000;
    //
//    public static final String IP = "127.0.0.1";
    public static final String IP = "10.57.31.147";

    public static final String url = "jdbc:mysql://"+Constant.IP+":3306/parse_dqs?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";

//    public static final String username = "root";
    public static final String username = "tongdun";

//    public static final String password = "Admin@123456";
    public static final String password = "tongdun@150713";
}


/**
 Address
 Name
 Date
 Role
 ID
 */