package com.xr.boot.service.system.impl;

import com.xr.boot.dao.system.SyUnitsMapper;
import com.xr.boot.entity.SyUnits;
import com.xr.boot.service.system.SyUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SyUnitsServiceImpl implements SyUnitsService {
    @Autowired
    private SyUnitsMapper syUnitsMapper;
    @Override
    public SyUnits findSyUnitById(Integer operationUnitid) {
        return syUnitsMapper.findSyUnitById(operationUnitid);
    }
}
