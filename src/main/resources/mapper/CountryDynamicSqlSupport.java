package com.tongdun.parsexml.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CountryDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Country country = new Country();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> countrytype = country.countrytype;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> code = country.code;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Country extends SqlTable {
        public final SqlColumn<String> countrytype = column("CountryType", JDBCType.CHAR);

        public final SqlColumn<String> code = column("Code", JDBCType.CHAR);

        public Country() {
            super("Country");
        }
    }
}