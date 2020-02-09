package com.xr.boot.service.log;

import com.xr.boot.entity.LogLogistics;

import java.util.List;

public interface LogLogisticssService {
    /**
     * 跟踪表查询
     */
    List<LogLogistics> findAllLogLogistics();
    /**
     * 跟踪表多条件查询
     */
    List<LogLogistics> findAllWhereLogLogistics(LogLogistics logLogistics);
}
