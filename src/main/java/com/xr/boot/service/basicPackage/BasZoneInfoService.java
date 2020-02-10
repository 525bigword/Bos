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

    /**
     * 修改定区
     * @param basZoneInfo
     */
    void upBasZoneInfoByID(BasZoneInfo basZoneInfo);

    /**
     * 新增定区
     * @param basZoneInfo
     */
    void saveBasZoneInfo(BasZoneInfo basZoneInfo);

    /**
     * 修改定区状态
     * @param stats
     */
    void upBasZoneInfoByStats(long stats);

    /**
     * 查定区名称是否重复
     * @param basZoneInfo
     * @return
     */
    List<String> findBasZoneInfoByZoneName(BasZoneInfo basZoneInfo);
}
