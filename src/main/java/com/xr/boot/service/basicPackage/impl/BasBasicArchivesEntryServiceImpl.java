package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.BasBasicArchivesEntryMapper;
import com.xr.boot.entity.BasBasicArchivesEntry;
import com.xr.boot.service.basicPackage.BasBasicArchivesEntryService;
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
public class BasBasicArchivesEntryServiceImpl implements BasBasicArchivesEntryService {
    @Autowired
    private BasBasicArchivesEntryMapper basBasicArchivesEntryMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Transactional
    @Override
    public Object findBasBasicArchivesEntryByParentID(int parentID) {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("BasBasicArchivesEntry", Collections.singletonList(basBasicArchivesEntryMapper.findBasBasicArchivesEntryByParentID(parentID)));
        redisUtil.set("com.xr.boot.controller.basicPackage.BasBasicArchivesEntryController.findBasBasicArchivesEntryByParentID", maps);
        return redisUtil.get("com.xr.boot.controller.basicPackage.BasBasicArchivesEntryController.findBasBasicArchivesEntryByParentID");
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void upBasBasicArchivesEntryById(BasBasicArchivesEntry basBasicArchivesEntry) {
        basBasicArchivesEntryMapper.upBasBasicArchivesEntryById(basBasicArchivesEntry);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void upBasBasicArchivesEntryAvailable(BasBasicArchivesEntry basBasicArchivesEntry) {
        basBasicArchivesEntryMapper.upBasBasicArchivesEntryAvailable(basBasicArchivesEntry);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void saveBasBasicArchivesEntry(BasBasicArchivesEntry basBasicArchivesEntry) {
        basBasicArchivesEntryMapper.saveBasBasicArchivesEntry(basBasicArchivesEntry);
    }

    @Override
    public List<String> findBasBasicArchivesEntryByName(BasBasicArchivesEntry basBasicArchivesEntry) {
        return basBasicArchivesEntryMapper.findBasBasicArchivesEntryByName(basBasicArchivesEntry);
    }


}
