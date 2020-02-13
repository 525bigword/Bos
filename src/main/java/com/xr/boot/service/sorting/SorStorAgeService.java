package com.xr.boot.service.sorting;

import com.xr.boot.entity.SorStorage;
import com.xr.boot.entity.SorStorageDetails;

import java.util.List;

public interface SorStorAgeService {
    /**新增入库业务*/
    void addSorStorAge(SorStorage sorStorage, List<SorStorageDetails> sorStorageDetails)throws Exception;
}
