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
    public static final String driver = "com.mysql.cj.jdbc.Driver";
    public static final String url = "jdbc:mysql://127.0.0.1:3306/parse_xml?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
    public static final String username = "root";
//    public static final String username = "dongdun";
    public static final String password = "123456";
//    public static final String password = "tongdun@150713";

    /**
     * 插入数据返回主键id方便建立关联
     * @return
     * @throws Exception
     */
    public static Long insertRetrunKey() throws Exception{
        Connection conn = getConnection();
        if (null != conn) {
            String sql = "insert into Date(person_id,DateType) values(?,?)";
            // 指定返回生成的主键
            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            // 如果使用静态的SQL，则不需要动态插入参数
            pstmt.setString(1, "1");
            pstmt.setString(2, "2");
            pstmt.executeUpdate();
            // 检索由于执行此 Statement 对象而创建的所有自动生成的键
            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                Long id = rs.getLong(1);
                return id;
                //System.out.println("数据主键：" + id);
            }
        }
        return 0L;
    }
    private static Connection conn = null;
    public static Connection getConnection() {
        if (conn==null) {
            try {
                com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
                Properties properties = new Properties();
                properties.put("user", username);
                properties.put("password", password);
                conn = driver.connect(url, properties);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return conn;
        }else{
            return conn;
        }
    }
}
