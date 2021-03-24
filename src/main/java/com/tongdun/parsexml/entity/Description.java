package com.tongdun.parsexml.entity;

import javax.annotation.Generated;

public class Description {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long nameId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String description1;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String description2;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String description3;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getNameId() {
        return nameId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNameId(Long nameId) {
        this.nameId = nameId;
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
}