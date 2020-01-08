package com.xr.boot.service.impl;

import com.xr.boot.dao.SyEmpMapper;
import com.xr.boot.entity.SyEmp;
import com.xr.boot.service.SyEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SyEmpServiceImpl implements SyEmpService {
    @Autowired
    private SyEmpMapper syEmpMapper;
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public SyEmp findSyEmpById(int operatorid) {
        return  syEmpMapper.findSyEmpById(operatorid);
    }
}
