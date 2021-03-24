package com.tongdun.parsexml.entity;

import javax.annotation.Generated;

public class Role {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String roletype;

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
    public String getRoletype() {
        return roletype;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRoletype(String roletype) {
        this.roletype = roletype == null ? null : roletype.trim();
    }
}