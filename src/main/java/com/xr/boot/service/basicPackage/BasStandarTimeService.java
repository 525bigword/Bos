package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BasStandarTime;

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
     * @param timeName
     * @return
     */
    List<String> findBasStandarTimeByTimeName(String timeName);
}
