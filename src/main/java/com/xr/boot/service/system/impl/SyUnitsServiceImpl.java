package com.xr.boot.service.system.impl;

import com.xr.boot.dao.system.SyUnitsMapper;
import com.xr.boot.entity.SyUnits;
import com.xr.boot.service.system.SyUnitsService;
import com.xr.boot.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class SyUnitsServiceImpl implements SyUnitsService {
    @Autowired
    private SyUnitsMapper syUnitsMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public SyUnits findSyUnitById(Integer operationUnitid) {
        return syUnitsMapper.findSyUnitById(operationUnitid);
    }
    @Transactional
    @Override
    public Object findSyUnits() {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("SyUnits", Collections.singletonList(syUnitsMapper.findSyUnits()));
        redisUtil.set("com.xr.boot.controller.basicPackage.SyUnitsController.findSyUnits", maps);
        return redisUtil.get("com.xr.boot.controller.basicPackage.SyUnitsController.findSyUnits");
    }
}
