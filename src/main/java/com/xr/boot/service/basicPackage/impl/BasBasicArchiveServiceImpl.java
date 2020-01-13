package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.BasBasicArchiveMapper;
import com.xr.boot.entity.BasBasicArchives;
import com.xr.boot.service.basicPackage.BasBasicArchiveService;
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
public class BasBasicArchiveServiceImpl implements BasBasicArchiveService {
    @Autowired
    private BasBasicArchiveMapper basBasicArchiveMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Transactional
    @Override
    public Object findBasicArchives(BasBasicArchives basBasicArchive) {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("BasicArchives", Collections.singletonList(basBasicArchiveMapper.findBasicArchives(basBasicArchive)));
        redisUtil.set("com.xr.boot.controller.BasicArchiveController.findBasicArchives", maps);
        return redisUtil.get("com.xr.boot.controller.BasicArchiveController.findBasicArchives");
    }
    @Transactional
    @Override
    public List<BasBasicArchives> findBasBasicArchivesByTerm(BasBasicArchives basBasicArchive) {
        return basBasicArchiveMapper.findBasicArchives(basBasicArchive);
    }
    @Transactional
    @Override
    public List<String> findBasBasicArchivesByName(String name) {
        return basBasicArchiveMapper.findBasBasicArchivesByName(name);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void upBasBasicArchivesById(BasBasicArchives basBasicArchive) {
        basBasicArchiveMapper.upBasBasicArchivesById(basBasicArchive);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void delBasBasicArchivesById(BasBasicArchives basBasicArchive) {
        basBasicArchiveMapper.delBasBasicArchivesById(basBasicArchive);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void saveBasBasicArchives(BasBasicArchives basBasicArchive) {
        basBasicArchiveMapper.saveBasBasicArchives(basBasicArchive);
    }
}
