package com.tongdun.parsexml.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OccTitleDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final OccTitle occTitle = new OccTitle();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> rolesId = occTitle.rolesId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sinceday = occTitle.sinceday;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sincemonth = occTitle.sincemonth;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sinceyear = occTitle.sinceyear;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> today = occTitle.today;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tomonth = occTitle.tomonth;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> toyear = occTitle.toyear;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> occcat = occTitle.occcat;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class OccTitle extends SqlTable {
        public final SqlColumn<Long> rolesId = column("roles_id", JDBCType.BIGINT);

        public final SqlColumn<String> sinceday = column("SinceDay", JDBCType.CHAR);

        public final SqlColumn<String> sincemonth = column("SinceMonth", JDBCType.CHAR);

        public final SqlColumn<String> sinceyear = column("SinceYear", JDBCType.CHAR);

        public final SqlColumn<String> today = column("ToDay", JDBCType.CHAR);

        public final SqlColumn<String> tomonth = column("ToMonth", JDBCType.CHAR);

        public final SqlColumn<String> toyear = column("ToYear", JDBCType.CHAR);

        public final SqlColumn<String> occcat = column("OccCat", JDBCType.CHAR);

        public OccTitle() {
            super("OccTitle");
        }
    }
}