package com.tongdun.parsexml.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PersonDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Person person = new Person();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> id = person.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> action = person.action;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> date = person.date;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> gender = person.gender;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> activestatus = person.activestatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deceased = person.deceased;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> profilenotes = person.profilenotes;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Person extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.CHAR);

        public final SqlColumn<String> action = column("action", JDBCType.CHAR);

        public final SqlColumn<String> date = column("date", JDBCType.CHAR);

        public final SqlColumn<String> gender = column("Gender", JDBCType.CHAR);

        public final SqlColumn<String> activestatus = column("ActiveStatus", JDBCType.CHAR);

        public final SqlColumn<String> deceased = column("Deceased", JDBCType.CHAR);

        public final SqlColumn<String> profilenotes = column("ProfileNotes", JDBCType.LONGVARCHAR);

        public Person() {
            super("Person");
        }
    }
}