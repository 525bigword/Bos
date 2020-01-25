package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BasArea;

import java.util.List;

public interface BasAreaService {
    /**
     * 查询区域设置全部
     * @param basArea
     * @return
     */
    Object findBasAreas(BasArea basArea);

    /**
     * 按条件查询区域设置
     * @param basArea
     * @return
     */
    List<BasArea> findBasAreaByTerm(BasArea basArea);
}
