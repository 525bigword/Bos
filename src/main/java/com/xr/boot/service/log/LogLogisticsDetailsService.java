package com.xr.boot.service.log;

import com.xr.boot.entity.LogLogisticsDetails;

import java.util.List;

public interface LogLogisticsDetailsService {
    /**
     * 根据物流序号查询物流详情表
     */
    List<LogLogisticsDetails> findAllLogLogisticsDetailsByLogisticsInt(String logisticsInt);
}
