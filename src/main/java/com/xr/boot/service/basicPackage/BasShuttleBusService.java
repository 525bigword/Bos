package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BasShuttleBus;

import java.util.List;

public interface BasShuttleBusService {
    /**
     * 查询所有班车设置
     * @param basShuttleBus
     * @return
     */
    Object findBasShuttleBus(BasShuttleBus basShuttleBus);

    /**
     * 按条件查询
     * @param basShuttleBus
     * @return
     */
    List<BasShuttleBus> findBasShuttleBusByTerm(BasShuttleBus basShuttleBus);

    /**
     * 按id删除班车设置
     * @param basShuttleBus
     */
    void delBasShuttleBusById(BasShuttleBus basShuttleBus);

    /**
     * 按id修改班车设置
     * @param basShuttleBus
     */
    void upBasShuttleBusById(BasShuttleBus basShuttleBus);

    /**
     * 新增班车设置
     * @param basShuttleBus
     */
    void saveBasShuttleBus(BasShuttleBus basShuttleBus);
}
