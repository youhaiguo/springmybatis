package com.you.springmybatis.service.impl;

import com.you.springmybatis.dto.RoleDto;
import com.you.springmybatis.entity.UserInfo;
import com.you.springmybatis.mapper.UserInfoMapper;
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

    @Autowired
    UserInfoMapper userInfoMapper;
    public UserInfo findUser(UserInfo userInfo){
        UserInfo user = userInfoMapper.findUser(userInfo);
        return user;
    }

    public List<UserInfo> findAllUser() {
        return userInfoMapper.findAllUser();
    }

    public UserInfo findUserById(int userid) {
        return userInfoMapper.findUserById(userid);
    }

    public int upDataUserById(UserInfo userInfo) {
        return userInfoMapper.upDataUserById(userInfo);
    }

    public List<RoleDto> findRoleById(int userid) {
        return userInfoMapper.findRoleById(userid);
    }


}
