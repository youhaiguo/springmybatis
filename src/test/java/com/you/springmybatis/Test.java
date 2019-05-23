package com.you.springmybatis;

import com.alibaba.druid.support.json.JSONUtils;
import com.you.springmybatis.dto.MenuInfoDto;
import com.you.springmybatis.dto.RoleDto;
import com.you.springmybatis.entity.UserInfo;
import com.you.springmybatis.service.MenuInfoService;
import com.you.springmybatis.service.UserService;
import com.you.springmybatis.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
        UserService us = (UserService) applicationContext.getBean(UserService.class);

        List<RoleDto> list = us.findRoleById(1);
        System.out.println(list);

//        UserInfo userInfo = new UserInfo();
//        userInfo.setUserid(1);
//        userInfo.setUsername("you");
//        userInfo.setRegEmall("12345");
//        System.out.println(us.upDataUserById(userInfo));
//        UserInfo user = us.findUser(userInfo);
//        System.out.println(user);

    }

    @Autowired
    UserService userService;
    @org.junit.Test
    public void testmvc(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("you");
        userInfo.setPassword("123");
        //UserInfo user = userService.findUser(userInfo);
        System.out.println(userService);
    }

    @Autowired
    MenuInfoService menuInfoService;
    @org.junit.Test
    public void testMenu(){
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
        MenuInfoService bean = applicationContext.getBean(MenuInfoService.class);
        //MenuInfoDto menuInfo = bean.findMenuInfo();
        //String s = JSONUtils.toJSONString(menuInfo);
        //System.out.println(menuInfo);

    }
}
