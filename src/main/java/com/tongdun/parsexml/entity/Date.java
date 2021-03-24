package com.tongdun.parsexml.entity;

import javax.annotation.Generated;

public class Date {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String datetype;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPersonId() {
        return personId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDatetype() {
        return datetype;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDatetype(String datetype) {
        this.datetype = datetype == null ? null : datetype.trim();
    }
}