package com.tongdun.parsexml.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ImageDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Image image = new Image();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> personId = image.personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> url = image.url;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Image extends SqlTable {
        public final SqlColumn<String> personId = column("person_id", JDBCType.CHAR);

        public final SqlColumn<String> url = column("URL", JDBCType.CHAR);

        public Image() {
            super("Image");
        }
    }
}