package com.tongdun.parsexml.mapper;

import static com.tongdun.parsexml.mapper.AddressDynamicSqlSupport.*;

import com.tongdun.parsexml.entity.Address;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface AddressMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(personId, addressline, addresscity, addresscountry, url);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Address> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Address> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AddressResult")
    Optional<Address> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AddressResult", value = {
        @Result(column="person_id", property="personId", jdbcType=JdbcType.CHAR),
        @Result(column="AddressLine", property="addressline", jdbcType=JdbcType.CHAR),
        @Result(column="AddressCity", property="addresscity", jdbcType=JdbcType.CHAR),
        @Result(column="AddressCountry", property="addresscountry", jdbcType=JdbcType.CHAR),
        @Result(column="URL", property="url", jdbcType=JdbcType.CHAR)
    })
    List<Address> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, address, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, address, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Address record) {
        return MyBatis3Utils.insert(this::insert, record, address, c ->
            c.map(personId).toProperty("personId")
            .map(addressline).toProperty("addressline")
            .map(addresscity).toProperty("addresscity")
            .map(addresscountry).toProperty("addresscountry")
            .map(url).toProperty("url")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Address> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, address, c ->
            c.map(personId).toProperty("personId")
            .map(addressline).toProperty("addressline")
            .map(addresscity).toProperty("addresscity")
            .map(addresscountry).toProperty("addresscountry")
            .map(url).toProperty("url")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Address record) {
        return MyBatis3Utils.insert(this::insert, record, address, c ->
            c.map(personId).toPropertyWhenPresent("personId", record::getPersonId)
            .map(addressline).toPropertyWhenPresent("addressline", record::getAddressline)
            .map(addresscity).toPropertyWhenPresent("addresscity", record::getAddresscity)
            .map(addresscountry).toPropertyWhenPresent("addresscountry", record::getAddresscountry)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Address> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, address, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Address> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, address, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Address> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, address, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, address, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Address record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(personId).equalTo(record::getPersonId)
                .set(addressline).equalTo(record::getAddressline)
                .set(addresscity).equalTo(record::getAddresscity)
                .set(addresscountry).equalTo(record::getAddresscountry)
                .set(url).equalTo(record::getUrl);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Address record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(personId).equalToWhenPresent(record::getPersonId)
                .set(addressline).equalToWhenPresent(record::getAddressline)
                .set(addresscity).equalToWhenPresent(record::getAddresscity)
                .set(addresscountry).equalToWhenPresent(record::getAddresscountry)
                .set(url).equalToWhenPresent(record::getUrl);
    }
}