package com.tongdun.parsexml.entity.person;

import com.tongdun.parsexml.config.ConnectionManager;

import javax.annotation.Generated;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OccTitle {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long rolesId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String sinceday;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String sincemonth;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String sinceyear;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String today;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String tomonth;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toyear;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String occcat;
    public String value;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getRolesId() {
        return rolesId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRolesId(Long rolesId) {
        this.rolesId = rolesId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSinceday() {
        return sinceday;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSinceday(String sinceday) {
        this.sinceday = sinceday == null ? null : sinceday.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSincemonth() {
        return sincemonth;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSincemonth(String sincemonth) {
        this.sincemonth = sincemonth == null ? null : sincemonth.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSinceyear() {
        return sinceyear;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSinceyear(String sinceyear) {
        this.sinceyear = sinceyear == null ? null : sinceyear.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getToday() {
        return today;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setToday(String today) {
        this.today = today == null ? null : today.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTomonth() {
        return tomonth;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTomonth(String tomonth) {
        this.tomonth = tomonth == null ? null : tomonth.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getToyear() {
        return toyear;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setToyear(String toyear) {
        this.toyear = toyear == null ? null : toyear.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOcccat() {
        return occcat;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOcccat(String occcat) {
        this.occcat = occcat == null ? null : occcat.trim();
    }

    public static void insert(List<OccTitle> list) {
        String sql = "insert into OccTitle values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (OccTitle widd : list) {
            try {
                pstmt.setInt(1, Math.toIntExact(widd.rolesId));
                pstmt.setString(2, widd.sinceday);
                pstmt.setString(3, widd.sincemonth);
                pstmt.setString(4, widd.sinceyear);
                pstmt.setString(5, widd.today);
                pstmt.setString(6, widd.tomonth);
                pstmt.setString(7, widd.toyear);
                pstmt.setString(8, widd.occcat);
                pstmt.setString(9, widd.value);
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