package com.you.springmybatis;

import com.you.springmybatis.service.UserService;
import com.you.springmybatis.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
        UserService us = (UserService) applicationContext.getBean(UserService.class);
        System.out.println(us);
        us.addUser();

    }
}
