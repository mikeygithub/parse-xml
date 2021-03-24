package com.tongdun.parsexml.entity;

import javax.annotation.Generated;

public class DateValue {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long dateId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String day;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String month;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String year;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String dnotes;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getDateId() {
        return dateId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDateId(Long dateId) {
        this.dateId = dateId;
    }

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
}