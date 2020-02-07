package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BasStandarTime;
import com.xr.boot.entity.SyUnits;

import java.util.List;

public interface BasStandarTimeService {
    /**
     * 查询所有收派时间管理
     * @param basStandarTime
     * @return
     */
    Object findBasStandarTimes(BasStandarTime basStandarTime);

    /**
     * 按条件查询收派时间管理
     * @param basStandarTime
     * @return
     */
    List<BasStandarTime> findBasStandarTimeByTerm(BasStandarTime basStandarTime);

    /**
     * 修改单个收派
     * @param basStandarTime
     */
    void upBasStandarTimeById(BasStandarTime basStandarTime);

    /**
     * 新增单个收派
     * @param basStandarTime
     */
    void saveBasStandarTime(BasStandarTime basStandarTime);

    /**
     * 删除单个收派
     * @param id
     */
    void delBasStandarTime(int id);

    /**
     * 查询名称是否重复
     * @param basStandarTime
     * @return
     */
    List<String> findBasStandarTimeByTimeName(BasStandarTime basStandarTime);

    /**
     * 根据公司找时间
     * @param unit
     * @return
     */
    List<BasStandarTime> findBasAssociateMemberByUId(SyUnits syUnits);
}
