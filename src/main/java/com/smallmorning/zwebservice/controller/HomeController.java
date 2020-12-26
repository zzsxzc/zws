package com.smallmorning.zwebservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 首页控制器
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

}
