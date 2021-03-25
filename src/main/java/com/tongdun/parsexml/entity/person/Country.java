package com.tongdun.parsexml.entity.person;

import com.tongdun.parsexml.config.ConnectionManager;

import javax.annotation.Generated;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Country {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String countrytype;

    public String personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String code;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCountrytype() {
        return countrytype;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCountrytype(String countrytype) {
        this.countrytype = countrytype == null ? null : countrytype.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCode() {
        return code;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public static void insert(List<Country> list) {
        String sql = "insert into Country values(?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (Country widd : list) {
            if (widd!=null)
            try {
                pstmt.setString(1, widd.countrytype);
                pstmt.setString(2, widd.code);
                pstmt.setString(3, widd.personId);
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