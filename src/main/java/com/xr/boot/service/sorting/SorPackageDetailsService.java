package com.xr.boot.service.sorting;

import com.xr.boot.entity.SorPackageDetails;

import java.util.List;

public interface SorPackageDetailsService {
    /**查询sor_packagedetails中所有未合包的*/
    List<SorPackageDetails> findSorPackageDetailsNoPack(SorPackageDetails sorPackageDetails) throws Exception;
    /**根据合包号查询sor_packagedetails*/
    List<SorPackageDetails> findSorPackageDetailsByPackage(String packaging) throws Exception;
}
