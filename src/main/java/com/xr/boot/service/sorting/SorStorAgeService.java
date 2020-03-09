package com.xr.boot.service.sorting;

import com.xr.boot.entity.SorPackage;
import com.xr.boot.entity.SorPackageDetails;
import com.xr.boot.entity.SorStorage;
import com.xr.boot.entity.SorStorageDetails;

import java.util.List;

public interface SorStorAgeService {
    /**新增入库业务*/
    void addSorStorAge(SorPackage sorPackage, List<SorPackageDetails> sorPackageDetails, String unit)throws Exception;
    /**根绝条件查询入库表*/
    List<SorStorage> findSOrStorAgeByIdAndDate(SorStorage sorStorage) throws Exception;
}
