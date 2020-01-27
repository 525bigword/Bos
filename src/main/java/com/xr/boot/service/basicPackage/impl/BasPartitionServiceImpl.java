package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.BasPartitionMapper;
import com.xr.boot.entity.BasPartition;
import com.xr.boot.service.basicPackage.BasPartitionService;
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
public class BasPartitionServiceImpl implements BasPartitionService {
    @Autowired
    private BasPartitionMapper basPartitionMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public Object findBasPartitions(BasPartition basPartition) {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("BasPartition", Collections.singletonList(basPartitionMapper.findBasPartitions(basPartition)));
        redisUtil.set("com.xr.boot.controller.BasPartitionController.findBasPartitions", maps);
        return redisUtil.get("com.xr.boot.controller.BasPartitionController.findBasPartitions");
    }

    @Override
    public List<BasPartition> findBasPartitionByTerm(BasPartition basPartition) {
        return basPartitionMapper.findBasPartitions(basPartition);
    }
}
