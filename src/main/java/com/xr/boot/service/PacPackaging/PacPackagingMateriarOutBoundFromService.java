package com.xr.boot.service.PacPackaging;

import com.xr.boot.entity.PacPackagingMateriarOutBoundFrom;

import java.util.List;

public interface PacPackagingMateriarOutBoundFromService {
    List<PacPackagingMateriarOutBoundFrom> findAllPacOutBoundFrom();
    public void insertPacPackagingOutFrom(PacPackagingMateriarOutBoundFrom pacPackagingMateriarOutBoundFrom);
    /**
     * 多条件查询包装材料出库记录
     */
    List<PacPackagingMateriarOutBoundFrom> findWherePacagingMateriar(PacPackagingMateriarOutBoundFrom pacPackagingMateriarOutBoundFrom);
}
