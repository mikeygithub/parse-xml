package com.tongdun.parsexml.entity.person;

import com.tongdun.parsexml.config.ConnectionManager;

import javax.annotation.Generated;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Person {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String action;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String date;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String gender;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String activestatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String deceased;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String profilenotes;

    //内含标签列表
//    public List<Description> Descriptions;
//    public List<Name> NameDetails;
//    public List<Role> RoleDetails;
//    public List<Date> DateDetails;
//    public List<Place> BirthPlace;
//    public List<Reference> SanctionsReferences;
//    public List<Address> Address;
//    public List<Country> CountryDetails;//到这里了
//    public List<ID> IDNumberTypers;
//    public List<Source> SourceDescription;//
//    public List<Image> Images;

    public String Descriptions;
    public String NameDetails;
    public String RoleDetails;
    public String DateDetails;
    public String BirthPlace;
    public String SanctionsReferences;
    public String Address;
    public String CountryDetails;
    public String IDNumberTypers;
    public String SourceDescription;
    public String Images;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAction() {
        return action;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDate() {
        return date;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getGender() {
        return gender;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getActivestatus() {
        return activestatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setActivestatus(String activestatus) {
        this.activestatus = activestatus == null ? null : activestatus.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDeceased() {
        return deceased;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeceased(String deceased) {
        this.deceased = deceased == null ? null : deceased.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProfilenotes() {
        return profilenotes;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProfilenotes(String profilenotes) {
        this.profilenotes = profilenotes == null ? null : profilenotes.trim();
    }

    public static void  insert(List<Person> list) {
        String sql = "insert into Person values(?,?,?,?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (Person widd : list) {
            try {
                pstmt.setString(1, widd.id);
                pstmt.setString(2, widd.action);
                pstmt.setString(3, widd.date);
                pstmt.setString(4, widd.gender);
                pstmt.setString(5, widd.activestatus);
                pstmt.setString(6, widd.deceased);
                pstmt.setString(7, widd.profilenotes);
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

    public static void  insertToJSON(List<Person> list) {
        String sql = "insert into person_json values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (Person widd : list) {
            try {
                pstmt.setString(1, widd.id);
                pstmt.setString(2, widd.action);
                pstmt.setString(3, widd.date);
                pstmt.setString(4, widd.gender);
                pstmt.setString(5, widd.activestatus);
                pstmt.setString(6, widd.deceased);
                pstmt.setString(7, widd.profilenotes);
                pstmt.setString(8, widd.Descriptions);
                pstmt.setString(9, widd.NameDetails);
                pstmt.setString(10, widd.RoleDetails);
                pstmt.setString(11, widd.DateDetails);
                pstmt.setString(12, widd.BirthPlace);
                pstmt.setString(13, widd.SanctionsReferences);
                pstmt.setString(14, widd.Address);
                pstmt.setString(15, widd.CountryDetails);
                pstmt.setString(16, widd.IDNumberTypers);
                pstmt.setString(17, widd.SourceDescription);
                pstmt.setString(18, widd.Images);
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