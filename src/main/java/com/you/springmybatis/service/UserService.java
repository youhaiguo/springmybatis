package com.you.springmybatis.service;

import com.you.springmybatis.dto.RoleDto;
import com.you.springmybatis.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void addUser();


    UserInfo findUser(UserInfo userInfo);

    List<UserInfo> findAllUser();

    UserInfo findUserById(int userid);

    int upDataUserById(UserInfo userInfo);

    List<RoleDto> findRoleById(int userid);
}
