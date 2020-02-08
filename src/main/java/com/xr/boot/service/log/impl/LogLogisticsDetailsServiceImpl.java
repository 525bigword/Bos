package com.xr.boot.service.log.impl;

import com.xr.boot.dao.log.LogLogisticsDetailsMapper;
import com.xr.boot.entity.LogLogisticsDetails;
import com.xr.boot.service.log.LogLogisticsDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogLogisticsDetailsServiceImpl implements LogLogisticsDetailsService {
    @Autowired
    private LogLogisticsDetailsMapper logLogisticsDetailsMapper;
    /**
     * 根据物流序号查询物流详情表
     */
    @Override
    public List<LogLogisticsDetails> findAllLogLogisticsDetailsByLogisticsInt(String logisticsInt) {
        return logLogisticsDetailsMapper.findAllLogLogisticsDetailsByLogisticsInt(logisticsInt);
    }
}
