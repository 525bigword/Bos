package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BasZoneInfo;

public interface BasZoneInfoService {
    /**
     * 查询所有管理定区
     * @param basZoneInfo
     * @return
     */
    Object findBasZoneInfos(BasZoneInfo basZoneInfo);
}
