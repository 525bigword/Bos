package com.xr.boot.service.PacPackaging.impl;

import com.xr.boot.dao.PacPackaging.PacPackagingMateriarOutBoundFromMapper;
import com.xr.boot.dao.system.SyEmpMapper;
import com.xr.boot.entity.PacPackagingMateriarOutBoundFrom;
import com.xr.boot.entity.SyEmp;
import com.xr.boot.service.PacPackaging.PacPackagingMateriarOutBoundFromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacPackagingMateriarOutBoundFromServiceImpl implements PacPackagingMateriarOutBoundFromService {
    @Autowired
    private PacPackagingMateriarOutBoundFromMapper pacPackagingMateriarOutBoundFromMapper;
    @Autowired
    private SyEmpMapper syEmpMapper;
    @Override
    public List<PacPackagingMateriarOutBoundFrom> findAllPacOutBoundFrom() {
        return pacPackagingMateriarOutBoundFromMapper.findAllPacOutBoundFrom();
    }

    @Override
    public void insertPacPackagingOutFrom(PacPackagingMateriarOutBoundFrom pacPackagingMateriarOutBoundFrom) {
        pacPackagingMateriarOutBoundFromMapper.insertPacPackagingOutFrom(pacPackagingMateriarOutBoundFrom);
    }
    /**
     * 多条件查询包装材料出库记录
     */
    @Override
    public List<PacPackagingMateriarOutBoundFrom> findWherePacagingMateriar(PacPackagingMateriarOutBoundFrom pacPackagingMateriarOutBoundFrom) {
        return pacPackagingMateriarOutBoundFromMapper.findWherePacagingMateriar(pacPackagingMateriarOutBoundFrom);
    }
    /**
     * 根据姓名查询是否有该员工
     * @param empName
     * @return
     */
    @Override
    public SyEmp findByempName(String empName) {
        return syEmpMapper.findByempName(empName);
    }
}
