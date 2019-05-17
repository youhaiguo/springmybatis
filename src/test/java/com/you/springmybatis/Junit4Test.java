package com.you.springmybatis;

import com.you.springmybatis.dao.UserDao;
import com.you.springmybatis.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

//@RunWith(SpringJUnit4ClassRunner.class)

//@ContextConfiguration("classpath:spring-service.xml")
public class Junit4Test {

    @Autowired
    UserDao user;
    @Test
    public void test(){

        System.out.println();
    }
}
