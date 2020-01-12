package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BasBasicArchives;
import com.xr.boot.entity.BasDeliveryStandard;

import java.util.List;


public interface BasBasicArchiveService {
    /**
     * 查询基础档案(查询全部)
     * @param basBasicArchive
     * @return
     */
    Object findBasicArchives(BasBasicArchives basBasicArchive);
    /**
     * 按条件查询收派标准
     */
    List<BasBasicArchives> findBasBasicArchivesByTerm(BasBasicArchives BasBasicArchive);
}
