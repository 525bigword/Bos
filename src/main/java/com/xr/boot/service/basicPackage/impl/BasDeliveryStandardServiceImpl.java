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

    /**
     * 查询收派标准所有未作废的数据
     * @param basDeliveryStandard
     * @return
     */
    @Transactional
    @Override
    public Object findBasDeliveryStandardAll(BasDeliveryStandard basDeliveryStandard) {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("BasDeliveryStandardAll", Collections.singletonList(basDeliveryStandardMapper.findBasDeliveryStandards(basDeliveryStandard)));
        redisUtil.set("com.xr.boot.controller.BasDeliveryStandardController.findBasDeliveryStandardAll", maps);
        return redisUtil.get("com.xr.boot.controller.BasDeliveryStandardController.findBasDeliveryStandardAll");
    }

    /**
     * 按条件查询收派标准
     * @param basDeliveryStandard
     * @return
     */
    @Transactional
    @Override
    public List<BasDeliveryStandard> findBasDeliveryStandardByTerm(BasDeliveryStandard basDeliveryStandard) {
        return basDeliveryStandardMapper.findBasDeliveryStandards(basDeliveryStandard);
    }

    /**
     *查询是否重复
     * @param name
     * @return
     */
    @Transactional
    @Override
    public List<String> findBasDeliveryStandardByName(String name){
        return basDeliveryStandardMapper.findBasDeliveryStandardByName(name);
    }
    /**
     * 通过id修改
     * @param basDeliveryStandard
     */
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void upBasDeliveryStandardByBasicFileNumber(BasDeliveryStandard basDeliveryStandard) {
        basDeliveryStandardMapper.upBasDeliveryStandardByBasicFileNumber(basDeliveryStandard);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void upBasDeliveryStandardStatus(BasDeliveryStandard basDeliveryStandard) {
        basDeliveryStandardMapper.upBasDeliveryStandardStatus(basDeliveryStandard);
    }

}
