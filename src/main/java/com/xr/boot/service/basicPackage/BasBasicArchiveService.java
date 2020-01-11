package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BasBasicArchives;


public interface BasBasicArchiveService {
    /**
     * 查询基础档案(查询全部)
     * @param basBasicArchive
     * @return
     */
    Object findBasicArchives(BasBasicArchives basBasicArchive);
}
