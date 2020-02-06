package com.xr.boot.service.PacPackaging;

import com.xr.boot.entity.PacPackagingMateriarOutBoundFrom;
import com.xr.boot.entity.SyEmp;

import java.util.List;

public interface PacPackagingMateriarOutBoundFromService {
    List<PacPackagingMateriarOutBoundFrom> findAllPacOutBoundFrom();
    public void insertPacPackagingOutFrom(PacPackagingMateriarOutBoundFrom pacPackagingMateriarOutBoundFrom);
    /**
     * 多条件查询包装材料出库记录
     */
    List<PacPackagingMateriarOutBoundFrom> findWherePacagingMateriar(PacPackagingMateriarOutBoundFrom pacPackagingMateriarOutBoundFrom);
    /**
     * 根据姓名查询是否有该员工
     * @param empName
     * @return
     */
    SyEmp findByempName(String empName);
}
