package com.tongdun.parsexml.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DateValueDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final DateValue dateValue = new DateValue();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> dateId = dateValue.dateId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> day = dateValue.day;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> month = dateValue.month;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> year = dateValue.year;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dnotes = dateValue.dnotes;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class DateValue extends SqlTable {
        public final SqlColumn<Long> dateId = column("Date_id", JDBCType.BIGINT);

        public final SqlColumn<String> day = column("Day", JDBCType.CHAR);

        public final SqlColumn<String> month = column("Month", JDBCType.CHAR);

        public final SqlColumn<String> year = column("Year", JDBCType.CHAR);

        public final SqlColumn<String> dnotes = column("Dnotes", JDBCType.CHAR);

        public DateValue() {
            super("DateValue");
        }
    }
}