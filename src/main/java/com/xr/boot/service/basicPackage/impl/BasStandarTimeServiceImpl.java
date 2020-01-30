package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.BasStandarTimeMapper;
import com.xr.boot.entity.BasStandarTime;
import com.xr.boot.service.basicPackage.BasStandarTimeService;
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
public class BasStandarTimeServiceImpl implements BasStandarTimeService {
    @Autowired
    private BasStandarTimeMapper basStandarTimeMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Transactional
    @Override
    public Object findBasStandarTimes(BasStandarTime basStandarTime) {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("BasStandarTime", Collections.singletonList(basStandarTimeMapper.findBasStandarTimes(basStandarTime)));
        redisUtil.set("com.xr.boot.controller.BasStandarTimeController.findBasStandarTimes", maps);
        return redisUtil.get("com.xr.boot.controller.BasStandarTimeController.findBasStandarTimes");
    }
    @Transactional
    @Override
    public List<BasStandarTime> findBasStandarTimeByTerm(BasStandarTime basStandarTime) {
        return basStandarTimeMapper.findBasStandarTimes(basStandarTime);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void upBasStandarTimeById(BasStandarTime basStandarTime) {
        basStandarTimeMapper.upBasStandarTimeById(basStandarTime);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void saveBasStandarTime(BasStandarTime basStandarTime) {
        basStandarTimeMapper.saveBasStandarTime(basStandarTime);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void delBasStandarTime(int id) {
        basStandarTimeMapper.delBasStandarTime(id);
    }
    @Transactional
    @Override
    public List<String> findBasStandarTimeByTimeName(BasStandarTime basStandarTime) {
        return basStandarTimeMapper.findBasStandarTimeByTimeName(basStandarTime);
    }

}
