package com.you.springmybatis.service.impl;

import com.you.springmybatis.dto.MenuInfoDto;
import com.you.springmybatis.dto.RoleDto;
import com.you.springmybatis.mapper.MenuInfoMapper;
import com.you.springmybatis.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuInfoServiceImpl implements MenuInfoService {

    @Autowired
    MenuInfoMapper menuInfoMapper;

    public MenuInfoDto findMenuInfo(int roleid) {
        return menuInfoMapper.findMenuInfo(roleid);
    }

    public List<RoleDto> findRoles(Integer userid) {
        return menuInfoMapper.findRoles(userid);
    }
}
