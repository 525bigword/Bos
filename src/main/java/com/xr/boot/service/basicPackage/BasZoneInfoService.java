package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BasZoneInfo;

import java.util.List;

public interface BasZoneInfoService {
    /**
     * 查询所有管理定区
     * @param basZoneInfo
     * @return
     */
    Object findBasZoneInfos(BasZoneInfo basZoneInfo);
    /**
     *按条件查询管理定区
     * @param basZoneInfo
     * @return
     */
    List<BasZoneInfo> findBasZoneInfoTrem(BasZoneInfo basZoneInfo);
}
