package com.example.mvc.service;

import com.example.mvc.mapper.userMapper;
import com.example.mvc.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private userMapper usermapper;

    public user findbyid(int id){

        return usermapper.findbyid(id);

    }
    public  int add(user u){

        return usermapper.add(u);

    }
}
