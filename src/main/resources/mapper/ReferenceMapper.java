package com.tongdun.parsexml.mapper;

import static com.tongdun.parsexml.mapper.ReferenceDynamicSqlSupport.*;

import com.tongdun.parsexml.entity.Reference;
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
public interface ReferenceMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(personId, sinceday, sincemonth, sinceyear, today, tomonth, toyear, value);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Reference> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Reference> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ReferenceResult")
    Optional<Reference> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ReferenceResult", value = {
        @Result(column="person_id", property="personId", jdbcType=JdbcType.CHAR),
        @Result(column="SinceDay", property="sinceday", jdbcType=JdbcType.CHAR),
        @Result(column="SinceMonth", property="sincemonth", jdbcType=JdbcType.CHAR),
        @Result(column="SinceYear", property="sinceyear", jdbcType=JdbcType.CHAR),
        @Result(column="ToDay", property="today", jdbcType=JdbcType.CHAR),
        @Result(column="ToMonth", property="tomonth", jdbcType=JdbcType.CHAR),
        @Result(column="ToYear", property="toyear", jdbcType=JdbcType.CHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.CHAR)
    })
    List<Reference> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, reference, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, reference, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Reference record) {
        return MyBatis3Utils.insert(this::insert, record, reference, c ->
            c.map(personId).toProperty("personId")
            .map(sinceday).toProperty("sinceday")
            .map(sincemonth).toProperty("sincemonth")
            .map(sinceyear).toProperty("sinceyear")
            .map(today).toProperty("today")
            .map(tomonth).toProperty("tomonth")
            .map(toyear).toProperty("toyear")
            .map(value).toProperty("value")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Reference> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, reference, c ->
            c.map(personId).toProperty("personId")
            .map(sinceday).toProperty("sinceday")
            .map(sincemonth).toProperty("sincemonth")
            .map(sinceyear).toProperty("sinceyear")
            .map(today).toProperty("today")
            .map(tomonth).toProperty("tomonth")
            .map(toyear).toProperty("toyear")
            .map(value).toProperty("value")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Reference record) {
        return MyBatis3Utils.insert(this::insert, record, reference, c ->
            c.map(personId).toPropertyWhenPresent("personId", record::getPersonId)
            .map(sinceday).toPropertyWhenPresent("sinceday", record::getSinceday)
            .map(sincemonth).toPropertyWhenPresent("sincemonth", record::getSincemonth)
            .map(sinceyear).toPropertyWhenPresent("sinceyear", record::getSinceyear)
            .map(today).toPropertyWhenPresent("today", record::getToday)
            .map(tomonth).toPropertyWhenPresent("tomonth", record::getTomonth)
            .map(toyear).toPropertyWhenPresent("toyear", record::getToyear)
            .map(value).toPropertyWhenPresent("value", record::getValue)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Reference> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, reference, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Reference> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, reference, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Reference> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, reference, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, reference, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Reference record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(personId).equalTo(record::getPersonId)
                .set(sinceday).equalTo(record::getSinceday)
                .set(sincemonth).equalTo(record::getSincemonth)
                .set(sinceyear).equalTo(record::getSinceyear)
                .set(today).equalTo(record::getToday)
                .set(tomonth).equalTo(record::getTomonth)
                .set(toyear).equalTo(record::getToyear)
                .set(value).equalTo(record::getValue);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Reference record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(personId).equalToWhenPresent(record::getPersonId)
                .set(sinceday).equalToWhenPresent(record::getSinceday)
                .set(sincemonth).equalToWhenPresent(record::getSincemonth)
                .set(sinceyear).equalToWhenPresent(record::getSinceyear)
                .set(today).equalToWhenPresent(record::getToday)
                .set(tomonth).equalToWhenPresent(record::getTomonth)
                .set(toyear).equalToWhenPresent(record::getToyear)
                .set(value).equalToWhenPresent(record::getValue);
    }
}