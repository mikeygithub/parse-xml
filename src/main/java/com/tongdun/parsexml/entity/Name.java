package com.tongdun.parsexml.entity;

import javax.annotation.Generated;
import java.util.List;

public class Name {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String nametype;

    //包含列表
    public List<NameValue> NameVlaue;

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
    public String getNametype() {
        return nametype;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNametype(String nametype) {
        this.nametype = nametype == null ? null : nametype.trim();
    }
}