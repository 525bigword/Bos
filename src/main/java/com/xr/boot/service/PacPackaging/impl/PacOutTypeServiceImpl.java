package com.xr.boot.service.PacPackaging.impl;

import com.xr.boot.dao.PacPackaging.PacOutTypeMapper;
import com.xr.boot.entity.PacOutType;
import com.xr.boot.service.PacPackaging.PacOutTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacOutTypeServiceImpl implements PacOutTypeService {
    @Autowired
    private PacOutTypeMapper pacOutTypeMapper;
    @Override
    public List<PacOutType> queryAllpacOutType() {
        return pacOutTypeMapper.queryAllpacOutType();
    }
}
