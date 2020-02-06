package com.xr.boot.service.accBusinessAdmissibility.impl;

import com.xr.boot.dao.accBusinessAdmissibility.AccProductListMapper;
import com.xr.boot.entity.AccProductList;
import com.xr.boot.service.accBusinessAdmissibility.AccProductlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccProductlistServiceImpl implements AccProductlistService {
    @Autowired
    private AccProductListMapper accProductListMapper;
    /**
     * 查看全部产品信息
     */
    @Override
    public List<AccProductList> findAllAccProductlist() {
        return accProductListMapper.findAllAccProductlist();
    }
}
