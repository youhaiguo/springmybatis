package com.you.springmybatis.service;

import com.you.springmybatis.dto.MenuInfoDto;
import com.you.springmybatis.dto.RoleDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuInfoService {

    MenuInfoDto findMenuInfo(int roleid);

    List<RoleDto> findRoles(Integer userid);
}
