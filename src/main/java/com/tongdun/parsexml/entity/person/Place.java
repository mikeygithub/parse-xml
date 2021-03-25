package com.tongdun.parsexml.entity.person;

import com.tongdun.parsexml.config.ConnectionManager;

import javax.annotation.Generated;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Place {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPersonId() {
        return personId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public static void insert(List<Place> list)  {
        String sql = "insert into Place values(?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (Place widd : list) {
            if (widd!=null)
            try {
                pstmt.setString(1, widd.personId);
                pstmt.setString(2, widd.name);
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