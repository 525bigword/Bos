package com.xr.boot.service.PacPackaging.impl;

import com.xr.boot.dao.PacPackaging.PacGetBoundTypeMapper;
import com.xr.boot.entity.PacGetBoundType;
import com.xr.boot.service.PacPackaging.PacGetBoundTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacGetBoundTypeServiceImpl implements PacGetBoundTypeService {
    @Autowired
    private PacGetBoundTypeMapper pacGetBoundTypeMapper;
    @Override
    public List<PacGetBoundType> queryAllpacGetBoundtype() {
        return pacGetBoundTypeMapper.queryAllpacGetBoundtype();
    }
}
