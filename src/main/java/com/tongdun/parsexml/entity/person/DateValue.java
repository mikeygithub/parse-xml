package com.tongdun.parsexml.entity.person;

import com.tongdun.parsexml.config.ConnectionManager;

import javax.annotation.Generated;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DateValue {
//    @Generated("org.mybatis.generator.api.MyBatisGenerator")
//    public Long dateId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String day;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String month;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String year;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String dnotes;

//    @Generated("org.mybatis.generator.api.MyBatisGenerator")
//    public Long getDateId() {
//        return dateId;
//    }

//    @Generated("org.mybatis.generator.api.MyBatisGenerator")
//    public void setDateId(Long dateId) {
//        this.dateId = dateId;
//    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDay() {
        return day;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMonth() {
        return month;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getYear() {
        return year;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDnotes() {
        return dnotes;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDnotes(String dnotes) {
        this.dnotes = dnotes == null ? null : dnotes.trim();
    }


    public static void insert(List<DateValue> list)  {
        String sql = "insert into DateValue values(?,?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (DateValue widd : list) {
            if (widd!=null)
            try {
//                pstmt.setInt(1, Math.toIntExact(widd.dateId));
                pstmt.setString(2, widd.day);
                pstmt.setString(3, widd.month);
                pstmt.setString(4, widd.year);
                pstmt.setString(5, widd.dnotes);
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