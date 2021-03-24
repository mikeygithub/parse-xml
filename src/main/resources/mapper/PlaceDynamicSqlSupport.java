package com.tongdun.parsexml.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PlaceDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Place place = new Place();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> personId = place.personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = place.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Place extends SqlTable {
        public final SqlColumn<String> personId = column("person_id", JDBCType.CHAR);

        public final SqlColumn<String> name = column("name", JDBCType.CHAR);

        public Place() {
            super("Place");
        }
    }
}