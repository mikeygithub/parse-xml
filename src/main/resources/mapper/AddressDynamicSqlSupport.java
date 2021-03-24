package com.tongdun.parsexml.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AddressDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Address address = new Address();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> personId = address.personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> addressline = address.addressline;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> addresscity = address.addresscity;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> addresscountry = address.addresscountry;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> url = address.url;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Address extends SqlTable {
        public final SqlColumn<String> personId = column("person_id", JDBCType.CHAR);

        public final SqlColumn<String> addressline = column("AddressLine", JDBCType.CHAR);

        public final SqlColumn<String> addresscity = column("AddressCity", JDBCType.CHAR);

        public final SqlColumn<String> addresscountry = column("AddressCountry", JDBCType.CHAR);

        public final SqlColumn<String> url = column("URL", JDBCType.CHAR);

        public Address() {
            super("Address");
        }
    }
}