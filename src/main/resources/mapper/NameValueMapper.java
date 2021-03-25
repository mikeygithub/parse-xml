package com.tongdun.parsexml.mapper;

import static com.tongdun.parsexml.mapper.NameValueDynamicSqlSupport.*;

import com.tongdun.parsexml.entity.person.NameValue;
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
public interface NameValueMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, nameId, titlehonorific, firstname, middlename, surname, maidenname, entityname, originalscriptname, suffix, singlestringname);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<NameValue> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<NameValue> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("NameValueResult")
    Optional<NameValue> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="NameValueResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="name_id", property="nameId", jdbcType=JdbcType.CHAR),
        @Result(column="TitleHonorific", property="titlehonorific", jdbcType=JdbcType.CHAR),
        @Result(column="FirstName", property="firstname", jdbcType=JdbcType.CHAR),
        @Result(column="MiddleName", property="middlename", jdbcType=JdbcType.CHAR),
        @Result(column="Surname", property="surname", jdbcType=JdbcType.CHAR),
        @Result(column="MaidenName", property="maidenname", jdbcType=JdbcType.CHAR),
        @Result(column="EntityName", property="entityname", jdbcType=JdbcType.CHAR),
        @Result(column="OriginalScriptName", property="originalscriptname", jdbcType=JdbcType.CHAR),
        @Result(column="Suffix", property="suffix", jdbcType=JdbcType.CHAR),
        @Result(column="SingleStringName", property="singlestringname", jdbcType=JdbcType.CHAR)
    })
    List<NameValue> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, nameValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, nameValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(NameValue record) {
        return MyBatis3Utils.insert(this::insert, record, nameValue, c ->
            c.map(id).toProperty("id")
            .map(nameId).toProperty("nameId")
            .map(titlehonorific).toProperty("titlehonorific")
            .map(firstname).toProperty("firstname")
            .map(middlename).toProperty("middlename")
            .map(surname).toProperty("surname")
            .map(maidenname).toProperty("maidenname")
            .map(entityname).toProperty("entityname")
            .map(originalscriptname).toProperty("originalscriptname")
            .map(suffix).toProperty("suffix")
            .map(singlestringname).toProperty("singlestringname")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<NameValue> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, nameValue, c ->
            c.map(id).toProperty("id")
            .map(nameId).toProperty("nameId")
            .map(titlehonorific).toProperty("titlehonorific")
            .map(firstname).toProperty("firstname")
            .map(middlename).toProperty("middlename")
            .map(surname).toProperty("surname")
            .map(maidenname).toProperty("maidenname")
            .map(entityname).toProperty("entityname")
            .map(originalscriptname).toProperty("originalscriptname")
            .map(suffix).toProperty("suffix")
            .map(singlestringname).toProperty("singlestringname")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(NameValue record) {
        return MyBatis3Utils.insert(this::insert, record, nameValue, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(nameId).toPropertyWhenPresent("nameId", record::getNameId)
            .map(titlehonorific).toPropertyWhenPresent("titlehonorific", record::getTitlehonorific)
            .map(firstname).toPropertyWhenPresent("firstname", record::getFirstname)
            .map(middlename).toPropertyWhenPresent("middlename", record::getMiddlename)
            .map(surname).toPropertyWhenPresent("surname", record::getSurname)
            .map(maidenname).toPropertyWhenPresent("maidenname", record::getMaidenname)
            .map(entityname).toPropertyWhenPresent("entityname", record::getEntityname)
            .map(originalscriptname).toPropertyWhenPresent("originalscriptname", record::getOriginalscriptname)
            .map(suffix).toPropertyWhenPresent("suffix", record::getSuffix)
            .map(singlestringname).toPropertyWhenPresent("singlestringname", record::getSinglestringname)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<NameValue> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, nameValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<NameValue> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, nameValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<NameValue> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, nameValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, nameValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(NameValue record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(nameId).equalTo(record::getNameId)
                .set(titlehonorific).equalTo(record::getTitlehonorific)
                .set(firstname).equalTo(record::getFirstname)
                .set(middlename).equalTo(record::getMiddlename)
                .set(surname).equalTo(record::getSurname)
                .set(maidenname).equalTo(record::getMaidenname)
                .set(entityname).equalTo(record::getEntityname)
                .set(originalscriptname).equalTo(record::getOriginalscriptname)
                .set(suffix).equalTo(record::getSuffix)
                .set(singlestringname).equalTo(record::getSinglestringname);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(NameValue record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(nameId).equalToWhenPresent(record::getNameId)
                .set(titlehonorific).equalToWhenPresent(record::getTitlehonorific)
                .set(firstname).equalToWhenPresent(record::getFirstname)
                .set(middlename).equalToWhenPresent(record::getMiddlename)
                .set(surname).equalToWhenPresent(record::getSurname)
                .set(maidenname).equalToWhenPresent(record::getMaidenname)
                .set(entityname).equalToWhenPresent(record::getEntityname)
                .set(originalscriptname).equalToWhenPresent(record::getOriginalscriptname)
                .set(suffix).equalToWhenPresent(record::getSuffix)
                .set(singlestringname).equalToWhenPresent(record::getSinglestringname);
    }
}