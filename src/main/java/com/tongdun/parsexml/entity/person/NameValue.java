package com.tongdun.parsexml.entity.person;

import com.tongdun.parsexml.config.ConnectionManager;

import javax.annotation.Generated;
import java.sql.*;
import java.util.List;

public class NameValue {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String nameId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String titlehonorific;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String firstname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String middlename;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String surname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String maidenname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String entityname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String originalscriptname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String suffix;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String singlestringname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNameId() {
        return nameId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNameId(String nameId) {
        this.nameId = nameId == null ? null : nameId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTitlehonorific() {
        return titlehonorific;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTitlehonorific(String titlehonorific) {
        this.titlehonorific = titlehonorific == null ? null : titlehonorific.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getFirstname() {
        return firstname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMiddlename() {
        return middlename;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMiddlename(String middlename) {
        this.middlename = middlename == null ? null : middlename.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSurname() {
        return surname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSurname(String surname) {
        this.surname = surname == null ? null : surname.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMaidenname() {
        return maidenname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMaidenname(String maidenname) {
        this.maidenname = maidenname == null ? null : maidenname.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEntityname() {
        return entityname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEntityname(String entityname) {
        this.entityname = entityname == null ? null : entityname.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOriginalscriptname() {
        return originalscriptname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOriginalscriptname(String originalscriptname) {
        this.originalscriptname = originalscriptname == null ? null : originalscriptname.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSuffix() {
        return suffix;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSuffix(String suffix) {
        this.suffix = suffix == null ? null : suffix.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSinglestringname() {
        return singlestringname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSinglestringname(String singlestringname) {
        this.singlestringname = singlestringname == null ? null : singlestringname.trim();
    }

//    public static NameValue insertRetrunKey(NameValue nameValue) throws Exception{
//        Connection conn = getConnection();
//        if (null != conn) {
//            String sql = "insert into NameValue(person_id,DateType) values(?,?)";
//            // 指定返回生成的主键
//            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            // 如果使用静态的SQL，则不需要动态插入参数
//            pstmt.setString(1, "1");
//            pstmt.setString(2, "2");
//            pstmt.executeUpdate();
//            // 检索由于执行此 Statement 对象而创建的所有自动生成的键
//            ResultSet rs = pstmt.getGeneratedKeys();
//            if (rs.next()) {
//                Long id = rs.getLong(1);
//                return id;
//                //System.out.println("数据主键：" + id);
//            }
//        }
//        return 0L;
//    }

    public static void insert(List<NameValue> list) {
        String sql = "insert into NameValue(name_id,TitleHonorific,FirstName,MiddleName,Surname,MaidenName,EntityName,OriginalScriptName,Suffix,SingleStringName) values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (NameValue widd : list) {
            if (widd!=null)
            try {
                pstmt.setString(1, String.valueOf(widd.nameId));
                pstmt.setString(2, widd.titlehonorific);
                pstmt.setString(3, widd.firstname);
                pstmt.setString(4, widd.middlename);
                pstmt.setString(5, widd.surname);
                pstmt.setString(6, widd.maidenname);
                pstmt.setString(7, widd.entityname);
                pstmt.setString(8, widd.originalscriptname);
                pstmt.setString(9, widd.suffix);
                pstmt.setString(10, widd.singlestringname);
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