package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.BasZoneCustomInfoMapper;
import com.xr.boot.entity.BasZoneCustomInfo;
import com.xr.boot.service.basicPackage.BasZoneCustomInfoService;
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
public class BasZoneCustomInfoServiceImpl implements BasZoneCustomInfoService {
    @Autowired
    private BasZoneCustomInfoMapper basZoneCustomInfoMapper;
    @Transactional
    @Override
    public Object findBasZoneCustomInfoByZoneCode(String zoneCode) {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("BasZoneCustomInfo", Collections.singletonList(basZoneCustomInfoMapper.findBasZoneCustomInfoByZoneCode(zoneCode)));
        return maps;
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void delBasZoneCustomInfoById(long customCode) {
        basZoneCustomInfoMapper.delBasZoneCustomInfoById(customCode);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void upBasZoneCustomInfoById(BasZoneCustomInfo basZoneCustomInfo) {
        basZoneCustomInfoMapper.upBasZoneCustomInfoById(basZoneCustomInfo);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void saveBasZoneCustomInfo(BasZoneCustomInfo basZoneCustomInfo) {
        basZoneCustomInfoMapper.saveBasZoneCustomInfo(basZoneCustomInfo);
    }

    @Override
    public List<String> findBasSubstituteByCustomName(BasZoneCustomInfo basZoneCustomInfo) {
        return basZoneCustomInfoMapper.findBasSubstituteByCustomName(basZoneCustomInfo);
    }
}
