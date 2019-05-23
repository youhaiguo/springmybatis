package com.you.springmybatis.controller;


import com.you.springmybatis.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuInfoController {

    @Autowired
    MenuInfoService menuInfoService;

    @RequestMapping("findRolesController")
    @ResponseBody
    public Object findRolesController(@RequestParam Integer userid){
        return menuInfoService.findRoles(userid);
    }

    @RequestMapping("findMenuInfoController")
    @ResponseBody
    public Object findMenuInfo(@RequestParam int roleid){
        return menuInfoService.findMenuInfo(roleid);
    }
}
