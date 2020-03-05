package com.xr.boot.service.sorting;

import com.xr.boot.entity.SorPackage;
import com.xr.boot.entity.SorPackageDetails;

import java.util.List;

public interface SorPackageService {
    /**新增合包PackageAndPackageDetail业务*/
    void savePackageAndPackageDetail(SorPackage sorPackage, List<SorPackageDetails> sorPackageDetails) throws Exception;
    /**查询所有合包业务*/
    List<SorPackage> findSorPackageByWhere(SorPackage sorPackage) throws Exception;
    /**拆包业务*/
    void unpacking(String[] packing,Integer personid) throws Exception;
    /**按照id和状态查询合包*/
    List<SorPackage> findSorPackageByIdAndState(SorPackage sorPackage) throws Exception;
}
