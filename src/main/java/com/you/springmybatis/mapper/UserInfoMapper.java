package com.you.springmybatis.mapper;

import com.you.springmybatis.dto.RoleDto;
import com.you.springmybatis.entity.UserInfo;
import org.springframework.stereotype.Component;

import java.util.List;


public interface UserInfoMapper {


    UserInfo findUser(UserInfo userInfo);

    List<UserInfo> findAllUser();

    UserInfo findUserById(int userid);

    int upDataUserById(UserInfo userInfo);

    List<RoleDto> findRoleById(int userid);
}
