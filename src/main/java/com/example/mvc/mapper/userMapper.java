package com.example.mvc.mapper;

import com.example.mvc.pojo.user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userMapper {
     user findbyid(int id);
     int add(user u);







}

