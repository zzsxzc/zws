package com.smallmorning.zwebservice.service.data.impl;

import com.smallmorning.zwebservice.dao.AppMessageMapper;
import com.smallmorning.zwebservice.entity.AppMessage;
import com.smallmorning.zwebservice.service.data.AppQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppQueryImpl implements AppQuery {

    @Autowired
    AppMessageMapper appMessageMapper;

    @Override
    public List<AppMessage> selsctAppByKind(String kind) {
        return appMessageMapper.selectAppByKind(kind);
    }
}
