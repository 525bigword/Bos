package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.LogLogisticsMapper;
import com.xr.boot.entity.LogLogistics;
import com.xr.boot.service.basicPackage.LogLogisticsService;
import com.xr.boot.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@Slf4j
public class LogLogisticsServiceImpl implements LogLogisticsService {
    @Autowired
    private LogLogisticsMapper logLogisticsMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public Object findLogLogisticsById(Integer lineID) {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("LogLogistics", Collections.singletonList(logLogisticsMapper.findLogLogisticsById(lineID)));
        redisUtil.set("com.xr.boot.controller.LogLogisticsController.findLogLogistics", maps);
        return redisUtil.get("com.xr.boot.controller.LogLogisticsController.findLogLogistics");
    }
}
