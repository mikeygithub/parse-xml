package com.tongdun.parsexml.mapper;

import static com.tongdun.parsexml.mapper.IDDynamicSqlSupport.*;

import com.tongdun.parsexml.entity.person.ID;
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
public interface IDMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(personId, idtype, idvalue, idnotes);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ID> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ID> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("IDResult")
    Optional<ID> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="IDResult", value = {
        @Result(column="person_id", property="personId", jdbcType=JdbcType.CHAR),
        @Result(column="IDType", property="idtype", jdbcType=JdbcType.CHAR),
        @Result(column="IDValue", property="idvalue", jdbcType=JdbcType.CHAR),
        @Result(column="IDNotes", property="idnotes", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<ID> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ID, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ID, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(ID record) {
        return MyBatis3Utils.insert(this::insert, record, ID, c ->
            c.map(personId).toProperty("personId")
            .map(idtype).toProperty("idtype")
            .map(idvalue).toProperty("idvalue")
            .map(idnotes).toProperty("idnotes")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<ID> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, ID, c ->
            c.map(personId).toProperty("personId")
            .map(idtype).toProperty("idtype")
            .map(idvalue).toProperty("idvalue")
            .map(idnotes).toProperty("idnotes")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(ID record) {
        return MyBatis3Utils.insert(this::insert, record, ID, c ->
            c.map(personId).toPropertyWhenPresent("personId", record::getPersonId)
            .map(idtype).toPropertyWhenPresent("idtype", record::getIdtype)
            .map(idvalue).toPropertyWhenPresent("idvalue", record::getIdvalue)
            .map(idnotes).toPropertyWhenPresent("idnotes", record::getIdnotes)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<ID> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, ID, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ID> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, ID, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ID> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, ID, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ID, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(ID record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(personId).equalTo(record::getPersonId)
                .set(idtype).equalTo(record::getIdtype)
                .set(idvalue).equalTo(record::getIdvalue)
                .set(idnotes).equalTo(record::getIdnotes);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ID record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(personId).equalToWhenPresent(record::getPersonId)
                .set(idtype).equalToWhenPresent(record::getIdtype)
                .set(idvalue).equalToWhenPresent(record::getIdvalue)
                .set(idnotes).equalToWhenPresent(record::getIdnotes);
    }
}