package com.you.springmybatis.controller;

import com.you.springmybatis.dto.RoleDto;
import com.you.springmybatis.entity.UserInfo;
import com.you.springmybatis.service.MenuInfoService;
import com.you.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserInfoController {



    @RequestMapping("init")  //请求路径的注解与地址
    @ResponseBody  //该注解用于将Controller的方法返回的对象，
                   // 通过适当的HttpMessageConverter转换为指定格式后，
                   // 写入到Response对象的body数据区
    public Object init(@RequestBody UserInfo name){ //该注解用于将Controller的方法返回的对象，
                                                   // 通过适当的HttpMessageConverter转换为指定格式后，
                                                   // 写入到Response对象的body数据区
        System.out.println("hello word");

        System.out.println(name);
        return name;
    }

    @Autowired
    UserService userService;
    @RequestMapping("loginController")
    @ResponseBody
    public Object login(@RequestBody UserInfo userInfo){
        //UserInfo user = userInfoMapper.findUser(userInfo);
        UserInfo user = userService.findUser(userInfo);
        if (user != null){
            return user.getUserid();
        }
        return null;
    }

    @RequestMapping("findAllController")
    @ResponseBody
    public List<UserInfo> findAllUser(){

        return userService.findAllUser();
    }

    @RequestMapping("upDataUserController")
    @ResponseBody
    public UserInfo upDataUser(@RequestParam int userid){
        UserInfo userInfo = userService.findUserById(userid);
        return userInfo;
    }

    @RequestMapping("upDataUserByIdController")
    @ResponseBody
    public int upDataUserById(@RequestBody UserInfo userInfo){
        int i = userService.upDataUserById(userInfo);
//        System.out.println(i);
//        System.out.println(userInfo);
        return i;
    }
    @RequestMapping("findRoleBy")
    @ResponseBody
    public List<RoleDto> findRoleBy(@RequestParam int userid){
        System.out.println(userid);
        return userService.findRoleById(userid);
    }

}
