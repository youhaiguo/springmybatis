package com.you.springmybatis.controller;

import com.you.springmybatis.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
