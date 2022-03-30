package com.mybatis.mybatis_demo;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface EmpMapper {

    @Select("select * from Employee")
    List<Employee> findAll();
    

    @Insert("insert into Employee(name,salary) values(#{name},#{salary})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
            before = false, resultType = Integer.class)
    void insert(Employee emp);

    @Update("update Employee set salary=#{salary} where name=#{name}")
    void update(Employee emp);

    @Delete("delete from Employee where name =#{name}")
    void delete(Employee emp);




}
