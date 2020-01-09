package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.BasDeliveryStandardMapper;
import com.xr.boot.entity.BasDeliveryStandard;
import com.xr.boot.service.basicPackage.BasDeliveryStandardService;
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
public class BasDeliveryStandardServiceImpl implements BasDeliveryStandardService {
    @Autowired
    private BasDeliveryStandardMapper basDeliveryStandardMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public Object findBasDeliveryStandardAll(BasDeliveryStandard basDeliveryStandard) {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("BasDeliveryStandardAll", Collections.singletonList(basDeliveryStandardMapper.findBasDeliveryStandards(basDeliveryStandard)));
        redisUtil.set("com.xr.boot.controller.BasDeliveryStandardController.findBasDeliveryStandardAll", maps);
        return redisUtil.get("com.xr.boot.controller.BasDeliveryStandardController.findBasDeliveryStandardAll");
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public List<BasDeliveryStandard> findBasDeliveryStandardByTerm(BasDeliveryStandard basDeliveryStandard) {
        return basDeliveryStandardMapper.findBasDeliveryStandards(basDeliveryStandard);
    }
}
