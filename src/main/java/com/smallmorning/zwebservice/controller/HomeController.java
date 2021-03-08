package com.smallmorning.zwebservice.controller;

import com.smallmorning.zwebservice.entity.AppMessage;
import com.smallmorning.zwebservice.service.data.impl.AppQueryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.soap.Addressing;
import java.util.List;

/**
 * 首页控制器
 */

@Controller
public class HomeController {

    @Autowired
    AppQueryImpl appQuery;

    //测试前端页面的时候，直接在这里改测试页的路由地址即可
    @GetMapping("/")
    public String home(){
        return "freedommxc_homepage";
    }

    @GetMapping("/webapp")
    public String webapp(){
        return "freedommxc_applist_webapp";
    }

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

    @GetMapping("/getwebapplist")
    @ResponseBody
    public List<AppMessage> getWebappList(){
        List<AppMessage> result = appQuery.selsctAppByKind("webapp");
        return result;
    }

    @GetMapping("/getapplist")
    @ResponseBody
    public List<AppMessage> getAppList(){
        List<AppMessage> result = appQuery.selsctAppByKind("app");
        return result;
    }

    @GetMapping("/getpclist")
    @ResponseBody
    public List<AppMessage> getPcList(){
        List<AppMessage> result = appQuery.selsctAppByKind("pc");
        return result;
    }

    @GetMapping("/getwechatlist")
    @ResponseBody
    public List<AppMessage> getWeChatList(){
        List<AppMessage> result = appQuery.selsctAppByKind("wechat");
        return result;
    }

    @GetMapping("/getgamelist")
    @ResponseBody
    public List<AppMessage> getGameList(){
        List<AppMessage> result = appQuery.selsctAppByKind("game");
        return result;
    }
}
