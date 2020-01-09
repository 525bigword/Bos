package com.xr.boot.service.PacPackaging.impl;

import com.xr.boot.dao.PacPackaging.PacOutBoundTypeMapper;
import com.xr.boot.entity.PacOutBoundType;
import com.xr.boot.entity.PacPackaging;
import com.xr.boot.service.PacPackaging.PacOutBoundTypeService;
import com.xr.boot.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class PacOutBoundTypeServiceImpl implements PacOutBoundTypeService {
    @Autowired
    private PacOutBoundTypeMapper pacOutBoundTypeMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public Map<String, List<Object>>  queryAllpactype() {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        List<PacOutBoundType> pacOut =pacOutBoundTypeMapper.queryAllpactype();
        maps.put("PacOutBound", Collections.singletonList(pacOut));
        redisUtil.set("com.xr.boot.controller.PacPackagingController.queryAllpactype", maps);
        return maps;
    }
}
