package com.xr.boot.service.PacPackaging.impl;

import com.xr.boot.dao.PacPackaging.PacStockMapper;
import com.xr.boot.entity.PacStock;
import com.xr.boot.service.PacPackaging.PacStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacStockServiceImpl implements PacStockService {
    @Autowired
    private PacStockMapper pacStockMapper;
    @Override
    public List<PacStock> queryAllpacStock() {
        return pacStockMapper.queryAllpacStock();
    }

    @Override
    public PacStock queryOnebyid(int id) {
        return pacStockMapper.queryOnebyid(id);
    }
}
