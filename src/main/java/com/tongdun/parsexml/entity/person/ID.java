package com.tongdun.parsexml.entity.person;

import com.tongdun.parsexml.config.ConnectionManager;

import javax.annotation.Generated;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ID {
//    @Generated("org.mybatis.generator.api.MyBatisGenerator")
//    public String personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String idtype;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String idvalue;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String idnotes;

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
    public String getIdtype() {
        return idtype;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIdtype(String idtype) {
        this.idtype = idtype == null ? null : idtype.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getIdvalue() {
        return idvalue;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIdvalue(String idvalue) {
        this.idvalue = idvalue == null ? null : idvalue.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getIdnotes() {
        return idnotes;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIdnotes(String idnotes) {
        this.idnotes = idnotes == null ? null : idnotes.trim();
    }

    public static void insert(List<ID> list) {
        String sql = "insert into ID values(?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (ID widd : list) {
            if (widd!=null)
            try {
//                pstmt.setString(1, widd.personId);
                pstmt.setString(2, widd.idtype);
                pstmt.setString(3, widd.idvalue);
                pstmt.setString(4, widd.idnotes);
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