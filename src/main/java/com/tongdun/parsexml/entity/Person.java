package com.tongdun.parsexml.entity;

import javax.annotation.Generated;
import java.util.List;

public class Person {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String action;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String date;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String gender;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String activestatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String deceased;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String profilenotes;

    //内含标签列表
    public List<Description> Descriptions;
    public List<Name> NameDetails;
    public List<Role> RoleDetails;
    public List<Date> DateDetails;
    public List<Place> BirthPlace;
    public List<Reference> SanctionsReferences;
    public List<Address> Address;
    public List<Country> CountryDetails;
    public List<ID> IDNumberTypers;
    public List<Source> SourceDescription;
    public List<Image> Images;


    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAction() {
        return action;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDate() {
        return date;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getGender() {
        return gender;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getActivestatus() {
        return activestatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setActivestatus(String activestatus) {
        this.activestatus = activestatus == null ? null : activestatus.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDeceased() {
        return deceased;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeceased(String deceased) {
        this.deceased = deceased == null ? null : deceased.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProfilenotes() {
        return profilenotes;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProfilenotes(String profilenotes) {
        this.profilenotes = profilenotes == null ? null : profilenotes.trim();
    }
}