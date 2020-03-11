package com.xr.boot.service.sorting;

import com.xr.boot.entity.SorAbnormal;

import java.util.List;

public interface SorAbnormalService {
    /**新增异常单业务*/
    void saveSorAbnormal(SorAbnormal sorAbnormal) throws Exception;
    /**按条件查询异常单*/
    List<SorAbnormal> findSorAbnormalByWhere(SorAbnormal sorAbnormal) throws Exception;
}
