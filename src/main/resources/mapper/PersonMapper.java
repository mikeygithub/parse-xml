package com.tongdun.parsexml.mapper;

import static com.tongdun.parsexml.mapper.PersonDynamicSqlSupport.*;

import com.tongdun.parsexml.entity.person.Person;
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
public interface PersonMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, action, date, gender, activestatus, deceased, profilenotes);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Person> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Person> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PersonResult")
    Optional<Person> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PersonResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR),
        @Result(column="action", property="action", jdbcType=JdbcType.CHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.CHAR),
        @Result(column="Gender", property="gender", jdbcType=JdbcType.CHAR),
        @Result(column="ActiveStatus", property="activestatus", jdbcType=JdbcType.CHAR),
        @Result(column="Deceased", property="deceased", jdbcType=JdbcType.CHAR),
        @Result(column="ProfileNotes", property="profilenotes", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Person> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, person, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, person, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Person record) {
        return MyBatis3Utils.insert(this::insert, record, person, c ->
            c.map(id).toProperty("id")
            .map(action).toProperty("action")
            .map(date).toProperty("date")
            .map(gender).toProperty("gender")
            .map(activestatus).toProperty("activestatus")
            .map(deceased).toProperty("deceased")
            .map(profilenotes).toProperty("profilenotes")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Person> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, person, c ->
            c.map(id).toProperty("id")
            .map(action).toProperty("action")
            .map(date).toProperty("date")
            .map(gender).toProperty("gender")
            .map(activestatus).toProperty("activestatus")
            .map(deceased).toProperty("deceased")
            .map(profilenotes).toProperty("profilenotes")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Person record) {
        return MyBatis3Utils.insert(this::insert, record, person, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(action).toPropertyWhenPresent("action", record::getAction)
            .map(date).toPropertyWhenPresent("date", record::getDate)
            .map(gender).toPropertyWhenPresent("gender", record::getGender)
            .map(activestatus).toPropertyWhenPresent("activestatus", record::getActivestatus)
            .map(deceased).toPropertyWhenPresent("deceased", record::getDeceased)
            .map(profilenotes).toPropertyWhenPresent("profilenotes", record::getProfilenotes)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Person> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, person, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Person> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, person, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Person> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, person, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, person, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Person record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(action).equalTo(record::getAction)
                .set(date).equalTo(record::getDate)
                .set(gender).equalTo(record::getGender)
                .set(activestatus).equalTo(record::getActivestatus)
                .set(deceased).equalTo(record::getDeceased)
                .set(profilenotes).equalTo(record::getProfilenotes);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Person record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(action).equalToWhenPresent(record::getAction)
                .set(date).equalToWhenPresent(record::getDate)
                .set(gender).equalToWhenPresent(record::getGender)
                .set(activestatus).equalToWhenPresent(record::getActivestatus)
                .set(deceased).equalToWhenPresent(record::getDeceased)
                .set(profilenotes).equalToWhenPresent(record::getProfilenotes);
    }
}