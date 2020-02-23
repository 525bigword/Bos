package com.xr.boot.service.sorting;

import com.xr.boot.entity.SorPackage;
import com.xr.boot.entity.SorPackageDetails;

import java.util.List;

public interface SorPackageService {
    void savePackageAndPackageDetail(SorPackage sorPackage, List<SorPackageDetails> sorPackageDetails) throws Exception;
}
