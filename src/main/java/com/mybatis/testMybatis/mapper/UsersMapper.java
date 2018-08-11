package com.mybatis.testMybatis.mapper;

import com.mybatis.testMybatis.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UsersMapper {
    @Select("select * from information_schema.users")
    List<Users> findAllUsers();
}

