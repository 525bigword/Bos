package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.BasAreaMapper;
import com.xr.boot.entity.BasArea;
import com.xr.boot.service.basicPackage.BasAreaService;
import com.xr.boot.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@Slf4j
public class BasAreaServiceImpl implements BasAreaService {
    @Autowired
    private BasAreaMapper basAreaMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Transactional
    @Override
    public Object findBasAreas(BasArea basArea) {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("BasArea", Collections.singletonList(basAreaMapper.findBasAreas(basArea)));
        redisUtil.set("com.xr.boot.controller.BasAreaController.findBasAreas", maps);
        return redisUtil.get("com.xr.boot.controller.BasAreaController.findBasAreas");
    }
    @Transactional
    @Override
    public List<BasArea> findBasAreaByTerm(BasArea basArea) {
        return basAreaMapper.findBasAreas(basArea);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void upBasAreaById(BasArea basArea) {
        basAreaMapper.upBasAreaById(basArea);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void saveBasArea(BasArea basArea) {
        basAreaMapper.saveBasArea(basArea);
    }
}
