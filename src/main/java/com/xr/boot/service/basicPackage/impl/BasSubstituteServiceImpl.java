package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.BasSubstituteMapper;
import com.xr.boot.entity.BasSubstitute;
import com.xr.boot.service.basicPackage.BasSubstituteService;
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
public class BasSubstituteServiceImpl implements BasSubstituteService {
    @Autowired
    private BasSubstituteMapper basSubstituteMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Transactional
    @Override
    public Object findBasSubstitutes(BasSubstitute basSubstitute) {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("BasSubstitute", Collections.singletonList(basSubstituteMapper.findBasSubstitutes(basSubstitute)));
        redisUtil.set("com.xr.boot.controller.BasSubstituteController.findBasSubstitutes", maps);
        return redisUtil.get("com.xr.boot.controller.BasSubstituteController.findBasSubstitutes");
    }
    @Transactional
    @Override
    public List<BasSubstitute> findBasSubstituteByTerm(BasSubstitute basSubstitute) {
        return basSubstituteMapper.findBasSubstitutes(basSubstitute);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void upBasSubstituteStateById(BasSubstitute basSubstitute) {
        basSubstituteMapper.upBasSubstituteStateById(basSubstitute);
    }

    @Override
    public void upBasSubstituteById(BasSubstitute basSubstitute) {
        basSubstituteMapper.upBasSubstituteById(basSubstitute);
    }

    @Override
    public void saveBasSubstitute(BasSubstitute basSubstitute) {
        basSubstituteMapper.saveBasSubstitute(basSubstitute);
    }
}
