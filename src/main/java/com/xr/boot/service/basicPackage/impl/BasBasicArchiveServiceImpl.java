package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.BasBasicArchiveMapper;
import com.xr.boot.entity.BasBasicArchives;
import com.xr.boot.service.basicPackage.BasBasicArchiveService;
import com.xr.boot.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
}
