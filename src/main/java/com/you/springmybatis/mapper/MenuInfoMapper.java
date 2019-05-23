package com.you.springmybatis.mapper;

import com.you.springmybatis.dto.MenuInfoDto;
import com.you.springmybatis.dto.RoleDto;

import java.util.List;

public interface MenuInfoMapper {
    MenuInfoDto findMenuInfo(int roleid);

    List<RoleDto> findRoles(Integer userid);
}
