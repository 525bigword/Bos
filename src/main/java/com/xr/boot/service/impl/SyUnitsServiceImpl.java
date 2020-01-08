package com.xr.boot.service.impl;

import com.xr.boot.dao.SyUnitsMapper;
import com.xr.boot.entity.SyUnits;
import com.xr.boot.service.SyUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SyUnitsServiceImpl implements SyUnitsService {
    @Autowired
    private SyUnitsMapper syUnitsMapper;
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public SyUnits findSyUnitById(Integer operationUnitid) {
        return syUnitsMapper.findSyUnitById(operationUnitid);
    }
}
