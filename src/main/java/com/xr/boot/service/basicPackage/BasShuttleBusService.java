package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BasShuttleBus;

public interface BasShuttleBusService {
    /**
     * 查询所有班车设置
     * @param basShuttleBus
     * @return
     */
    Object findBasShuttleBus(BasShuttleBus basShuttleBus);
}
