package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.BasShuttleBusMapper;
import com.xr.boot.entity.BasShuttleBus;
import com.xr.boot.service.basicPackage.BasShuttleBusService;
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
public class BasShuttleBusServiceImpl implements BasShuttleBusService {
    @Autowired
    private BasShuttleBusMapper basShuttleBusMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Transactional
    @Override
    public Object findBasShuttleBus(BasShuttleBus basShuttleBus) {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("BasShuttleBus", Collections.singletonList(basShuttleBusMapper.findBasShuttleBus(basShuttleBus)));
        redisUtil.set("com.xr.boot.controller.BasShuttleBusController.findBasShuttleBus", maps);
        return redisUtil.get("com.xr.boot.controller.BasShuttleBusController.findBasShuttleBus");
    }
    @Transactional
    @Override
    public List<BasShuttleBus> findBasShuttleBusByTerm(BasShuttleBus basShuttleBus) {
        return basShuttleBusMapper.findBasShuttleBus(basShuttleBus);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void delBasShuttleBusById(BasShuttleBus basShuttleBus) {
        basShuttleBusMapper.delBasShuttleBusById(basShuttleBus);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void upBasShuttleBusById(BasShuttleBus basShuttleBus) {
        basShuttleBusMapper.upBasShuttleBusById(basShuttleBus);
    }
}
