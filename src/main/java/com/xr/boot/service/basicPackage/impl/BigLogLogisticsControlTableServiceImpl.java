package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.BigLogLogisticsControlTableMapper;
import com.xr.boot.entity.BigLogLogisticsControlTable;
import com.xr.boot.service.basicPackage.BigLogLogisticsControlTableService;
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
public class BigLogLogisticsControlTableServiceImpl implements BigLogLogisticsControlTableService {
    @Autowired
    private BigLogLogisticsControlTableMapper bigLogLogisticsControlTableMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Transactional
    @Override
    public Object findBigLogLogisticsControlTables(BigLogLogisticsControlTable bigLogLogisticsControlTable) {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("BigLogLogisticsControlTable", Collections.singletonList(bigLogLogisticsControlTableMapper.findBigLogLogisticsControlTables(bigLogLogisticsControlTable)));
        redisUtil.set("com.xr.boot.controller.BigLogLogisticsControlTableController.findBigLogLogisticsControlTables", maps);
        return redisUtil.get("com.xr.boot.controller.BigLogLogisticsControlTableController.findBigLogLogisticsControlTables");
    }
    @Transactional
    @Override
    public List<BigLogLogisticsControlTable> findBigLogLogisticsControlTableByTerm(BigLogLogisticsControlTable bigLogLogisticsControlTable) {
        return bigLogLogisticsControlTableMapper.findBigLogLogisticsControlTables(bigLogLogisticsControlTable);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void upBigLogLogisticsControlTableById(BigLogLogisticsControlTable bigLogLogisticsControlTable) {
        bigLogLogisticsControlTableMapper.upBigLogLogisticsControlTableById(bigLogLogisticsControlTable);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void saveBigLogLogisticsControlTable(BigLogLogisticsControlTable bigLogLogisticsControlTable) {
        bigLogLogisticsControlTableMapper.saveBigLogLogisticsControlTable(bigLogLogisticsControlTable);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void delBigLogLogisticsControlTableByWorkSheetNo(String workSheetNo) {
        bigLogLogisticsControlTableMapper.delBigLogLogisticsControlTableByWorkSheetNo(workSheetNo);
    }
}
