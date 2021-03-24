package com.tongdun.parsexml.entity;

import javax.annotation.Generated;

public class Country {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String countrytype;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String code;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCountrytype() {
        return countrytype;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCountrytype(String countrytype) {
        this.countrytype = countrytype == null ? null : countrytype.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCode() {
        return code;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}