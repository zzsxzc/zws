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
        for(AppMessage app : result){
            System.out.println(app.toString());
        }
    }
}