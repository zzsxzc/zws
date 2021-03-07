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
    @GetMapping("/")
    public String home(){
        return "freedommxc_homepage";
    }

    @GetMapping("/webapp")
    public String webapp(){ return "freedommxc_applist_webapp";}

    @GetMapping("/app")
    public String app(){
        return "freedommxc_applist_app";
    }

    @GetMapping("/pc")
    public String pc(){
        return "freedommxc_applist_pc";
    }

    @GetMapping("/wechat")
    public String wechat(){
        return "freedommxc_applist_wechat";
    }

    @GetMapping("/game")
    public String game(){
        return "freedommxc_applist_game";
}

    @GetMapping("/about")
    public String about(){
        return "freedommxc_about";
    }
}
