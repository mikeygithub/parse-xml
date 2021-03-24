package com.tongdun.parsexml.entity;

import javax.annotation.Generated;

public class Address {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String addressline;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String addresscity;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String addresscountry;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String url;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPersonId() {
        return personId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAddressline() {
        return addressline;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAddressline(String addressline) {
        this.addressline = addressline == null ? null : addressline.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAddresscity() {
        return addresscity;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAddresscity(String addresscity) {
        this.addresscity = addresscity == null ? null : addresscity.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAddresscountry() {
        return addresscountry;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAddresscountry(String addresscountry) {
        this.addresscountry = addresscountry == null ? null : addresscountry.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUrl() {
        return url;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}