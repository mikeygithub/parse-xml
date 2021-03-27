package com.tongdun.parsexml.entity.person;

import javax.annotation.Generated;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import static com.tongdun.parsexml.config.ConnectionManager.getConnection;


public class Name {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long id;

//    @Generated("org.mybatis.generator.api.MyBatisGenerator")
//    public String personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String nametype;

    //包含列表
    public List<NameValue> NameVlaue;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

//    @Generated("org.mybatis.generator.api.MyBatisGenerator")
//    public String getPersonId() {
//        return personId;
//    }
//
//    @Generated("org.mybatis.generator.api.MyBatisGenerator")
//    public void setPersonId(String personId) {
//        this.personId = personId == null ? null : personId.trim();
//    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNametype() {
        return nametype;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNametype(String nametype) {
        this.nametype = nametype == null ? null : nametype.trim();
    }

    public static Long insertRetrunKey(Name name){
        try {

            Connection conn = getConnection();
            if (null != conn) {
                String sql = "insert into Name(person_id,NameType) values(?,?)";
                // 指定返回生成的主键
                PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                // 如果使用静态的SQL，则不需要动态插入参数
//                pstmt.setString(1, name.personId);
                pstmt.setString(2, name.nametype);
                pstmt.executeUpdate();
                // 检索由于执行此 Statement 对象而创建的所有自动生成的键
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    name.id = rs.getLong(1);
                    return name.id;
                    //System.out.println("数据主键：" + id);
                }
            } else {
                System.out.println("无法获取数据库连接");
            }
            return name.id;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}