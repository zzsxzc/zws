package com.smallmorning.zwebservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
*@Author zheng zs
*@Date 21:24 2020/9/11
*@Description 首页控制器
**/

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "HomePage-zws";
    }

}
