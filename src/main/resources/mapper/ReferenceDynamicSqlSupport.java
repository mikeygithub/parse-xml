package com.tongdun.parsexml.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReferenceDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Reference reference = new Reference();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> personId = reference.personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sinceday = reference.sinceday;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sincemonth = reference.sincemonth;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sinceyear = reference.sinceyear;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> today = reference.today;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tomonth = reference.tomonth;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> toyear = reference.toyear;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> value = reference.value;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Reference extends SqlTable {
        public final SqlColumn<String> personId = column("person_id", JDBCType.CHAR);

        public final SqlColumn<String> sinceday = column("SinceDay", JDBCType.CHAR);

        public final SqlColumn<String> sincemonth = column("SinceMonth", JDBCType.CHAR);

        public final SqlColumn<String> sinceyear = column("SinceYear", JDBCType.CHAR);

        public final SqlColumn<String> today = column("ToDay", JDBCType.CHAR);

        public final SqlColumn<String> tomonth = column("ToMonth", JDBCType.CHAR);

        public final SqlColumn<String> toyear = column("ToYear", JDBCType.CHAR);

        public final SqlColumn<String> value = column("value", JDBCType.CHAR);

        public Reference() {
            super("Reference");
        }
    }
}