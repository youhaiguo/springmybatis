package com.you.springmybatis.mapper;



import com.you.springmybatis.entity.User;
import com.you.springmybatis.entity.UserInfo;
import com.you.springmybatis.vo.UserVo;

import java.util.List;

public interface UserMapper {

//    List<User> findAll(UserVo userVo);
//
//    int deleteByName(UserVo userVo);

    List<UserInfo> findRoleByUser();

    List<UserInfo> findMenuByUser();
}
