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

    //测试前端页面的时候，直接在这里改测试页的路由地址即可
    /*@GetMapping("/")
    public String index(){
        return "index";
    }
*/
    @GetMapping("/")
    public String index(){
        return "test1";
    }

    @GetMapping("/test2")
    public String test2(){
        return "test2";
    }

    @GetMapping("login/test3")
    public String test3(){
        return "login/test3";
    }
}
