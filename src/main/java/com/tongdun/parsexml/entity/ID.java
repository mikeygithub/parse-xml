package com.tongdun.parsexml.entity;

import javax.annotation.Generated;

public class ID {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String idtype;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String idvalue;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String idnotes;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPersonId() {
        return personId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

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
}