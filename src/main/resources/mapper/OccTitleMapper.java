package com.tongdun.parsexml.mapper;

import static com.tongdun.parsexml.mapper.OccTitleDynamicSqlSupport.*;

import com.tongdun.parsexml.entity.OccTitle;
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
public interface OccTitleMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(rolesId, sinceday, sincemonth, sinceyear, today, tomonth, toyear, occcat);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OccTitle> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OccTitle> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OccTitleResult")
    Optional<OccTitle> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OccTitleResult", value = {
        @Result(column="roles_id", property="rolesId", jdbcType=JdbcType.BIGINT),
        @Result(column="SinceDay", property="sinceday", jdbcType=JdbcType.CHAR),
        @Result(column="SinceMonth", property="sincemonth", jdbcType=JdbcType.CHAR),
        @Result(column="SinceYear", property="sinceyear", jdbcType=JdbcType.CHAR),
        @Result(column="ToDay", property="today", jdbcType=JdbcType.CHAR),
        @Result(column="ToMonth", property="tomonth", jdbcType=JdbcType.CHAR),
        @Result(column="ToYear", property="toyear", jdbcType=JdbcType.CHAR),
        @Result(column="OccCat", property="occcat", jdbcType=JdbcType.CHAR)
    })
    List<OccTitle> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, occTitle, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, occTitle, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(OccTitle record) {
        return MyBatis3Utils.insert(this::insert, record, occTitle, c ->
            c.map(rolesId).toProperty("rolesId")
            .map(sinceday).toProperty("sinceday")
            .map(sincemonth).toProperty("sincemonth")
            .map(sinceyear).toProperty("sinceyear")
            .map(today).toProperty("today")
            .map(tomonth).toProperty("tomonth")
            .map(toyear).toProperty("toyear")
            .map(occcat).toProperty("occcat")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<OccTitle> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, occTitle, c ->
            c.map(rolesId).toProperty("rolesId")
            .map(sinceday).toProperty("sinceday")
            .map(sincemonth).toProperty("sincemonth")
            .map(sinceyear).toProperty("sinceyear")
            .map(today).toProperty("today")
            .map(tomonth).toProperty("tomonth")
            .map(toyear).toProperty("toyear")
            .map(occcat).toProperty("occcat")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(OccTitle record) {
        return MyBatis3Utils.insert(this::insert, record, occTitle, c ->
            c.map(rolesId).toPropertyWhenPresent("rolesId", record::getRolesId)
            .map(sinceday).toPropertyWhenPresent("sinceday", record::getSinceday)
            .map(sincemonth).toPropertyWhenPresent("sincemonth", record::getSincemonth)
            .map(sinceyear).toPropertyWhenPresent("sinceyear", record::getSinceyear)
            .map(today).toPropertyWhenPresent("today", record::getToday)
            .map(tomonth).toPropertyWhenPresent("tomonth", record::getTomonth)
            .map(toyear).toPropertyWhenPresent("toyear", record::getToyear)
            .map(occcat).toPropertyWhenPresent("occcat", record::getOcccat)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OccTitle> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, occTitle, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OccTitle> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, occTitle, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OccTitle> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, occTitle, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, occTitle, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(OccTitle record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(rolesId).equalTo(record::getRolesId)
                .set(sinceday).equalTo(record::getSinceday)
                .set(sincemonth).equalTo(record::getSincemonth)
                .set(sinceyear).equalTo(record::getSinceyear)
                .set(today).equalTo(record::getToday)
                .set(tomonth).equalTo(record::getTomonth)
                .set(toyear).equalTo(record::getToyear)
                .set(occcat).equalTo(record::getOcccat);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OccTitle record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(rolesId).equalToWhenPresent(record::getRolesId)
                .set(sinceday).equalToWhenPresent(record::getSinceday)
                .set(sincemonth).equalToWhenPresent(record::getSincemonth)
                .set(sinceyear).equalToWhenPresent(record::getSinceyear)
                .set(today).equalToWhenPresent(record::getToday)
                .set(tomonth).equalToWhenPresent(record::getTomonth)
                .set(toyear).equalToWhenPresent(record::getToyear)
                .set(occcat).equalToWhenPresent(record::getOcccat);
    }
}