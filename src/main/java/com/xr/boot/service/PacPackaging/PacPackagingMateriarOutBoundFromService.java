package com.xr.boot.service.PacPackaging;

import com.xr.boot.entity.PacPackagingMateriarOutBoundFrom;

import java.util.List;

public interface PacPackagingMateriarOutBoundFromService {
    List<PacPackagingMateriarOutBoundFrom> findAllPacOutBoundFrom();
    public void insertPacPackagingOutFrom(PacPackagingMateriarOutBoundFrom pacPackagingMateriarOutBoundFrom);
}
