package com.tongdun.parsexml.entity.person;

import javax.annotation.Generated;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import static com.tongdun.parsexml.config.ConnectionManager.getConnection;

public class Date {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String datetype;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPersonId() {
        return personId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDatetype() {
        return datetype;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDatetype(String datetype) {
        this.datetype = datetype == null ? null : datetype.trim();
    }

    public static Long insertRetrunKey(Date date) {
        Connection conn = getConnection();
        if (null != conn) {
            String sql = "insert into Date(person_id,DateType) values(?,?)";
            // 指定返回生成的主键
            try {

                PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                // 如果使用静态的SQL，则不需要动态插入参数
                pstmt.setString(1, date.personId);
                pstmt.setString(2, date.datetype);
                pstmt.executeUpdate();
                // 检索由于执行此 Statement 对象而创建的所有自动生成的键
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    Long id = rs.getLong(1);
                    date.id = id;
                    return date.id;
                    //System.out.println("数据主键：" + id);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return date.id;
    }
}