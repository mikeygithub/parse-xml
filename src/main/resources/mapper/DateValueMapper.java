package com.tongdun.parsexml.mapper;

import static com.tongdun.parsexml.mapper.DateValueDynamicSqlSupport.*;

import com.tongdun.parsexml.entity.DateValue;
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
public interface DateValueMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(dateId, day, month, year, dnotes);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DateValue> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<DateValue> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DateValueResult")
    Optional<DateValue> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DateValueResult", value = {
        @Result(column="Date_id", property="dateId", jdbcType=JdbcType.BIGINT),
        @Result(column="Day", property="day", jdbcType=JdbcType.CHAR),
        @Result(column="Month", property="month", jdbcType=JdbcType.CHAR),
        @Result(column="Year", property="year", jdbcType=JdbcType.CHAR),
        @Result(column="Dnotes", property="dnotes", jdbcType=JdbcType.CHAR)
    })
    List<DateValue> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, dateValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, dateValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(DateValue record) {
        return MyBatis3Utils.insert(this::insert, record, dateValue, c ->
            c.map(dateId).toProperty("dateId")
            .map(day).toProperty("day")
            .map(month).toProperty("month")
            .map(year).toProperty("year")
            .map(dnotes).toProperty("dnotes")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<DateValue> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, dateValue, c ->
            c.map(dateId).toProperty("dateId")
            .map(day).toProperty("day")
            .map(month).toProperty("month")
            .map(year).toProperty("year")
            .map(dnotes).toProperty("dnotes")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(DateValue record) {
        return MyBatis3Utils.insert(this::insert, record, dateValue, c ->
            c.map(dateId).toPropertyWhenPresent("dateId", record::getDateId)
            .map(day).toPropertyWhenPresent("day", record::getDay)
            .map(month).toPropertyWhenPresent("month", record::getMonth)
            .map(year).toPropertyWhenPresent("year", record::getYear)
            .map(dnotes).toPropertyWhenPresent("dnotes", record::getDnotes)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<DateValue> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, dateValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<DateValue> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, dateValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<DateValue> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, dateValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, dateValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(DateValue record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(dateId).equalTo(record::getDateId)
                .set(day).equalTo(record::getDay)
                .set(month).equalTo(record::getMonth)
                .set(year).equalTo(record::getYear)
                .set(dnotes).equalTo(record::getDnotes);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DateValue record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(dateId).equalToWhenPresent(record::getDateId)
                .set(day).equalToWhenPresent(record::getDay)
                .set(month).equalToWhenPresent(record::getMonth)
                .set(year).equalToWhenPresent(record::getYear)
                .set(dnotes).equalToWhenPresent(record::getDnotes);
    }
}