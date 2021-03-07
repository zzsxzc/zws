package com.smallmorning.zwebservice.service.data;

import com.smallmorning.zwebservice.entity.AppMessage;

import java.util.List;

public interface AppQuery {
    List<AppMessage> selsctAppByKind(String kind);
}
