package com.tongdun.parsexml.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class IDDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final ID ID = new ID();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> personId = ID.personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> idtype = ID.idtype;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> idvalue = ID.idvalue;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> idnotes = ID.idnotes;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class ID extends SqlTable {
        public final SqlColumn<String> personId = column("person_id", JDBCType.CHAR);

        public final SqlColumn<String> idtype = column("IDType", JDBCType.CHAR);

        public final SqlColumn<String> idvalue = column("IDValue", JDBCType.CHAR);

        public final SqlColumn<String> idnotes = column("IDNotes", JDBCType.LONGVARCHAR);

        public ID() {
            super("ID");
        }
    }
}