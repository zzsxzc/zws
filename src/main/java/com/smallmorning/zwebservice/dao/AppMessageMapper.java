package com.smallmorning.zwebservice.dao;

import com.smallmorning.zwebservice.entity.AppMessage;

import java.util.List;

public interface AppMessageMapper {
    List<AppMessage> selectAppByKind(String kind); //根据种类查找APP
}
