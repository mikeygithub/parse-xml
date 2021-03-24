package com.tongdun.parsexml.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DescriptionDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Description description = new Description();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> nameId = description.nameId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> description1 = description.description1;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> description2 = description.description2;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> description3 = description.description3;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Description extends SqlTable {
        public final SqlColumn<Long> nameId = column("name_id", JDBCType.BIGINT);

        public final SqlColumn<String> description1 = column("Description1", JDBCType.CHAR);

        public final SqlColumn<String> description2 = column("Description2", JDBCType.CHAR);

        public final SqlColumn<String> description3 = column("Description3", JDBCType.CHAR);

        public Description() {
            super("Description");
        }
    }
}