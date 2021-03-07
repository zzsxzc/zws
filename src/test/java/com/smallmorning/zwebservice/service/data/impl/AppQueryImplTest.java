package com.smallmorning.zwebservice.service.data.impl;

import com.smallmorning.zwebservice.entity.AppMessage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AppQueryImplTest {

    @Autowired
    AppQueryImpl appQuery;

    @Test
    void selsctAppByKind() {
        List<AppMessage> result = appQuery.selsctAppByKind("webapp");
        List<AppMessage> result2 = appQuery.selsctAppByKind("app");
        List<AppMessage> result3 = appQuery.selsctAppByKind("pc");
        List<AppMessage> result4 = appQuery.selsctAppByKind("wechat");
        List<AppMessage> result5 = appQuery.selsctAppByKind("game");
        for(AppMessage app : result){
            System.out.println(app.toString());
        }
        for(AppMessage app : result2){
            System.out.println(app.toString());
        }
        for(AppMessage app : result3){
            System.out.println(app.toString());
        }
        for(AppMessage app : result4){
            System.out.println(app.toString());
        }
        for(AppMessage app : result5){
            System.out.println(app.toString());
        }
    }
}