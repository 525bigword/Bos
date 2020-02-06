package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.BasZoneInfoMapper;
import com.xr.boot.entity.BasZoneInfo;
import com.xr.boot.service.basicPackage.BasZoneInfoService;
import com.xr.boot.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@Slf4j
public class BasZoneInfoServiceImpl implements BasZoneInfoService {
    @Autowired
    private BasZoneInfoMapper basZoneInfoMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Transactional
    @Override
    public Object findBasZoneInfos(BasZoneInfo basZoneInfo) {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("BasZoneInfo", Collections.singletonList(basZoneInfoMapper.findBasZoneInfos(basZoneInfo)));
        redisUtil.set("com.xr.boot.controller.BasZoneInfoController.findBasZoneInfos", maps);
        return redisUtil.get("com.xr.boot.controller.BasZoneInfoController.findBasZoneInfos");
    }

    @Override
    public List<BasZoneInfo> findBasZoneInfoTrem(BasZoneInfo basZoneInfo) {
        return basZoneInfoMapper.findBasZoneInfos(basZoneInfo);
    }
}
