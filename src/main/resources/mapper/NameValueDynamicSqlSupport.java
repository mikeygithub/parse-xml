package com.tongdun.parsexml.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class NameValueDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final NameValue nameValue = new NameValue();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = nameValue.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> nameId = nameValue.nameId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> titlehonorific = nameValue.titlehonorific;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> firstname = nameValue.firstname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> middlename = nameValue.middlename;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> surname = nameValue.surname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> maidenname = nameValue.maidenname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> entityname = nameValue.entityname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> originalscriptname = nameValue.originalscriptname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> suffix = nameValue.suffix;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> singlestringname = nameValue.singlestringname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class NameValue extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> nameId = column("name_id", JDBCType.CHAR);

        public final SqlColumn<String> titlehonorific = column("TitleHonorific", JDBCType.CHAR);

        public final SqlColumn<String> firstname = column("FirstName", JDBCType.CHAR);

        public final SqlColumn<String> middlename = column("MiddleName", JDBCType.CHAR);

        public final SqlColumn<String> surname = column("Surname", JDBCType.CHAR);

        public final SqlColumn<String> maidenname = column("MaidenName", JDBCType.CHAR);

        public final SqlColumn<String> entityname = column("EntityName", JDBCType.CHAR);

        public final SqlColumn<String> originalscriptname = column("OriginalScriptName", JDBCType.CHAR);

        public final SqlColumn<String> suffix = column("Suffix", JDBCType.CHAR);

        public final SqlColumn<String> singlestringname = column("SingleStringName", JDBCType.CHAR);

        public NameValue() {
            super("NameValue");
        }
    }
}