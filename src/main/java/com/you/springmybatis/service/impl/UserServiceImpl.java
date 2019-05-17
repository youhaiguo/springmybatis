package com.you.springmybatis.service.impl;

import com.you.springmybatis.dao.UserDao;
import com.you.springmybatis.entity.UserInfo;
import com.you.springmybatis.mapper.UserMapper;
import com.you.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    public void addUser() {
        System.out.println("service");
        List<UserInfo> roleByUser = userMapper.findRoleByUser();
        System.out.println(roleByUser);
    }

//    @Autowired
//    UserDao userDao;
//
//    public void addUser() {
//        System.out.println("service");
//        userDao.update();
//    }

}
