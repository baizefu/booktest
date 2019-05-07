package com.example.demo.dao;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectByName(@Param("name")String name);


}