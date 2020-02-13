package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.BasPartitionMapper;
import com.xr.boot.entity.BasPartition;
import com.xr.boot.service.basicPackage.BasPartitionService;
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
public class BasPartitionServiceImpl implements BasPartitionService {
    @Autowired
    private BasPartitionMapper basPartitionMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Transactional
    @Override
    public Object findBasPartitions(BasPartition basPartition) {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("BasPartition", Collections.singletonList(basPartitionMapper.findBasPartitions(basPartition)));
        redisUtil.set("com.xr.boot.controller.BasPartitionController.findBasPartitions", maps);
        return redisUtil.get("com.xr.boot.controller.BasPartitionController.findBasPartitions");
    }
    @Transactional
    @Override
    public List<BasPartition> findBasPartitionByTerm(BasPartition basPartition) {
        return basPartitionMapper.findBasPartitions(basPartition);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void upBasPartitionById(BasPartition basPartition) {
        basPartitionMapper.upBasPartitionById(basPartition);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void saveBasPartition(BasPartition basPartition) {
        basPartitionMapper.saveBasPartition(basPartition);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void delBasPartition(int id) {
        basPartitionMapper.delBasPartition(id);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void upBasPartitionByZoneCode(BasPartition basPartition) {
        basPartitionMapper.upBasPartitionByZoneCode(basPartition);
    }

    @Override
    public List<String> findBasPartitionBycounty(BasPartition basPartition) {
        return basPartitionMapper.findBasPartitionBycounty(basPartition);
    }
}
