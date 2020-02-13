package com.xr.boot.service.sorting.impl;

import com.xr.boot.dao.sorting.SorStorageDetailMapper;
import com.xr.boot.dao.sorting.SorStorageMapper;
import com.xr.boot.entity.SorStorage;
import com.xr.boot.entity.SorStorageDetails;
import com.xr.boot.service.sorting.SorStorAgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SorStorAgeServiceImpl implements SorStorAgeService {
    @Autowired
    private SorStorageMapper sorStorageMapper;
    @Autowired
    private SorStorageDetailMapper sorStorageDetailMapper;
    @Override
    @Transactional
    @Klock
    public void addSorStorAge(SorStorage sorStorage, List<SorStorageDetails> sorStorageDetails) throws Exception {
        sorStorageMapper.saveSorStorage(sorStorage);
        for (SorStorageDetails sorStorageDetail : sorStorageDetails) {

        }
    }
}
