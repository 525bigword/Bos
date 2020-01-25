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

    /**
     * 根据id修改区域设置
     * @param id
     */
    void upBasAreaById(int id);

    /**
     * 新增区域设置
     * @param basArea
     */
    void saveBasArea(BasArea basArea);
}
