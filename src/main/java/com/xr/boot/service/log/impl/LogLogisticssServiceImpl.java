package com.xr.boot.service.log.impl;

import com.xr.boot.dao.log.LogLogisticssMapper;
import com.xr.boot.entity.LogLogistics;
import com.xr.boot.service.log.LogLogisticssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogLogisticssServiceImpl implements LogLogisticssService {
    @Autowired
    private LogLogisticssMapper logLogisticssMapper;
    /**
     * 跟踪表查询
     */
    @Override
    public List<LogLogistics> findAllLogLogistics() {
        return logLogisticssMapper.findAllLogLogistics();
    }
    /**
     * 跟踪表多条件查询
     */
    @Override
    public List<LogLogistics> findAllWhereLogLogistics(LogLogistics logLogistics) {
        return logLogisticssMapper.findAllWhereLogLogistics(logLogistics);
    }
}
