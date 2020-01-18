package com.xr.boot.service.PacPackaging.impl;

import com.xr.boot.dao.PacPackaging.PacPackagingMateriarOutBoundFromMapper;
import com.xr.boot.entity.PacPackagingMateriarOutBoundFrom;
import com.xr.boot.service.PacPackaging.PacPackagingMateriarOutBoundFromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacPackagingMateriarOutBoundFromServiceImpl implements PacPackagingMateriarOutBoundFromService {
    @Autowired
    private PacPackagingMateriarOutBoundFromMapper pacPackagingMateriarOutBoundFromMapper;
    @Override
    public List<PacPackagingMateriarOutBoundFrom> findAllPacOutBoundFrom() {
        return pacPackagingMateriarOutBoundFromMapper.findAllPacOutBoundFrom();
    }
}
