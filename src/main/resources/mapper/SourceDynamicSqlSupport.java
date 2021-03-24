package com.tongdun.parsexml.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;

public final class SourceDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Source source = new Source();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> personId = source.personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = source.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Source extends SqlTable {
        public final SqlColumn<String> personId = column("person_id", JDBCType.CHAR);

        public final SqlColumn<String> name = column("name", JDBCType.CHAR);

        public Source() {
            super("Source");
        }
    }
}