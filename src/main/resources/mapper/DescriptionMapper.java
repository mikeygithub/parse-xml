package com.tongdun.parsexml.mapper;

import static com.tongdun.parsexml.mapper.DescriptionDynamicSqlSupport.*;

import com.tongdun.parsexml.entity.person.Description;
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
public interface DescriptionMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(nameId, description1, description2, description3);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Description> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Description> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DescriptionResult")
    Optional<Description> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DescriptionResult", value = {
        @Result(column="name_id", property="nameId", jdbcType=JdbcType.BIGINT),
        @Result(column="Description1", property="description1", jdbcType=JdbcType.CHAR),
        @Result(column="Description2", property="description2", jdbcType=JdbcType.CHAR),
        @Result(column="Description3", property="description3", jdbcType=JdbcType.CHAR)
    })
    List<Description> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, description, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, description, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Description record) {
        return MyBatis3Utils.insert(this::insert, record, description, c ->
            c.map(nameId).toProperty("nameId")
            .map(description1).toProperty("description1")
            .map(description2).toProperty("description2")
            .map(description3).toProperty("description3")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Description> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, description, c ->
            c.map(nameId).toProperty("nameId")
            .map(description1).toProperty("description1")
            .map(description2).toProperty("description2")
            .map(description3).toProperty("description3")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Description record) {
        return MyBatis3Utils.insert(this::insert, record, description, c ->
            c.map(nameId).toPropertyWhenPresent("nameId", record::getNameId)
            .map(description1).toPropertyWhenPresent("description1", record::getDescription1)
            .map(description2).toPropertyWhenPresent("description2", record::getDescription2)
            .map(description3).toPropertyWhenPresent("description3", record::getDescription3)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Description> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, description, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Description> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, description, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Description> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, description, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, description, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Description record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(nameId).equalTo(record::getNameId)
                .set(description1).equalTo(record::getDescription1)
                .set(description2).equalTo(record::getDescription2)
                .set(description3).equalTo(record::getDescription3);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Description record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(nameId).equalToWhenPresent(record::getNameId)
                .set(description1).equalToWhenPresent(record::getDescription1)
                .set(description2).equalToWhenPresent(record::getDescription2)
                .set(description3).equalToWhenPresent(record::getDescription3);
    }
}