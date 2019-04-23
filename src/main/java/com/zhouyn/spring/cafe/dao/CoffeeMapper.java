package com.zhouyn.spring.cafe.dao;

import com.zhouyn.spring.cafe.model.Coffee;
import com.zhouyn.spring.cafe.model.CoffeeExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CoffeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coffee
     *
     * @mbg.generated Tue Apr 23 21:44:26 CST 2019
     */
    long countByExample(CoffeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coffee
     *
     * @mbg.generated Tue Apr 23 21:44:26 CST 2019
     */
    int deleteByExample(CoffeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coffee
     *
     * @mbg.generated Tue Apr 23 21:44:26 CST 2019
     */
    @Delete({
        "delete from t_coffee",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coffee
     *
     * @mbg.generated Tue Apr 23 21:44:26 CST 2019
     */
    @Insert({
        "insert into t_coffee (create_time, update_time, ",
        "name, price)",
        "values (#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{name,jdbcType=VARCHAR}, #{price,jdbcType=BIGINT,typeHandler=geektime.spring.data.mybatis.handler.MoneyTypeHandler})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Long.class)
    int insert(Coffee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coffee
     *
     * @mbg.generated Tue Apr 23 21:44:26 CST 2019
     */
    int insertSelective(Coffee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coffee
     *
     * @mbg.generated Tue Apr 23 21:44:26 CST 2019
     */
    List<Coffee> selectByExampleWithRowbounds(CoffeeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coffee
     *
     * @mbg.generated Tue Apr 23 21:44:26 CST 2019
     */
    List<Coffee> selectByExample(CoffeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coffee
     *
     * @mbg.generated Tue Apr 23 21:44:26 CST 2019
     */
    @Select({
        "select",
        "id, create_time, update_time, name, price",
        "from t_coffee",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.zhouyn.spring.cafe.dao.CoffeeMapper.BaseResultMap")
    Coffee selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coffee
     *
     * @mbg.generated Tue Apr 23 21:44:26 CST 2019
     */
    int updateByExampleSelective(@Param("record") Coffee record, @Param("example") CoffeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coffee
     *
     * @mbg.generated Tue Apr 23 21:44:26 CST 2019
     */
    int updateByExample(@Param("record") Coffee record, @Param("example") CoffeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coffee
     *
     * @mbg.generated Tue Apr 23 21:44:26 CST 2019
     */
    int updateByPrimaryKeySelective(Coffee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coffee
     *
     * @mbg.generated Tue Apr 23 21:44:26 CST 2019
     */
    @Update({
        "update t_coffee",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "name = #{name,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=BIGINT,typeHandler=geektime.spring.data.mybatis.handler.MoneyTypeHandler}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Coffee record);
}