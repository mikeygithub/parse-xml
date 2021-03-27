package com.tongdun.parsexml.config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author mikey
 */
public class ConnectionManager {

    private static Connection conn = null;
    public static Connection getConnection() {
        if (conn==null) {
            try {
                com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
                Properties properties = new Properties();
                properties.put("user", Constant.username);
                properties.put("password", Constant.password);
                conn = driver.connect(Constant.url, properties);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return conn;
        }else{
            return conn;
        }
    }
}
