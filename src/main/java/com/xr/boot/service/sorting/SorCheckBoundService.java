package com.xr.boot.service.sorting;

import com.xr.boot.entity.SorCheckBound;

import java.util.List;

public interface SorCheckBoundService {
    /**新增盘库业务*/
    void saveSorCheckBound(SorCheckBound sorCheckBound) throws Exception;
    /**盘库查询业务*/
    List<SorCheckBound> findSorCheckBound(SorCheckBound sorCheckBound) throws Exception;
}
