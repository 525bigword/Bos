package com.xr.boot.service.sorting.impl;

import com.xr.boot.dao.sorting.SorCheckBoundDetailsMapper;
import com.xr.boot.entity.SorCheckBoundDetails;
import com.xr.boot.service.sorting.SorCheckBoundDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SorCheckBoundDetailServiceImpl implements SorCheckBoundDetailService {
    @Autowired
    private SorCheckBoundDetailsMapper sorCheckBoundDetailsMapper;
    @Override
    public List<SorCheckBoundDetails> findSorCheckBoundDetailsByPacking(String packing) throws Exception {
        List<SorCheckBoundDetails> sorCheckBoundDetailsByPacking = sorCheckBoundDetailsMapper.findSorCheckBoundDetailsByPacking(packing);
        return sorCheckBoundDetailsByPacking;
    }
}
