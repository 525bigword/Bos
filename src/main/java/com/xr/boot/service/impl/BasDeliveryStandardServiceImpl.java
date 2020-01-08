package com.xr.boot.service.impl;

import com.alibaba.fastjson.JSON;
import com.xr.boot.dao.BasDeliveryStandardMapper;
import com.xr.boot.entity.BasDeliveryStandard;
import com.xr.boot.service.BasDeliveryStandardService;
import com.xr.boot.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class BasDeliveryStandardServiceImpl implements BasDeliveryStandardService {
    @Autowired
    private BasDeliveryStandardMapper basDeliveryStandardMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public String findBasDeliveryStandardAll(BasDeliveryStandard basDeliveryStandard) {
        List<BasDeliveryStandard> basDeliveryStandardAll = basDeliveryStandardMapper.findBasDeliveryStandardAll(basDeliveryStandard);
        redisUtil.set("com.xr.boot.controller.BasDeliveryStandardController", JSON.toJSONString(basDeliveryStandard));
        return redisUtil.get("com.xr.boot.controller.BasDeliveryStandardController").toString();
    }
}
