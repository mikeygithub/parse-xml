package com.tongdun.parsexml.entity.person;

import com.tongdun.parsexml.config.ConnectionManager;

import javax.annotation.Generated;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Description {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String description1;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String description2;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String description3;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPersonId() {
        return personId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDescription1() {
        return description1;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDescription1(String description1) {
        this.description1 = description1 == null ? null : description1.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDescription2() {
        return description2;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDescription2(String description2) {
        this.description2 = description2 == null ? null : description2.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDescription3() {
        return description3;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDescription3(String description3) {
        this.description3 = description3 == null ? null : description3.trim();
    }
    public static void insert(List<Description> list)  {
        String sql = "insert into Description values(?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (Description widd : list) {
            if (widd!=null)
            try {
                pstmt.setString(1, widd.personId);
                pstmt.setString(2, widd.description1);
                pstmt.setString(3, widd.description2);
                pstmt.setString(4, widd.description3);
                pstmt.addBatch();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        try {
            pstmt.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}