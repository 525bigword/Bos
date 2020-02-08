package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BasZoneCustomInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BasZoneCustomInfoService {
    /**
     * 查找客户信息
     * @param zoneCode
     * @return
     */
    Object findBasZoneCustomInfoByZoneCode(String zoneCode);

    /**
     * 删除客户信息
     * @param customCode
     */
    void delBasZoneCustomInfoById(long customCode);

    /**
     * 修改客户信息
     * @param basZoneCustomInfo
     */
    void upBasZoneCustomInfoById(BasZoneCustomInfo basZoneCustomInfo);

    /**
     * 新增客户信息
     * @param basZoneCustomInfo
     */
    void saveBasZoneCustomInfo(BasZoneCustomInfo basZoneCustomInfo);

    /**
     * 查名称是否重复
     * @param basZoneCustomInfo
     * @return
     */
    List<String> findBasSubstituteByCustomName(BasZoneCustomInfo basZoneCustomInfo);
}
