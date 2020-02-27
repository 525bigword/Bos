package com.xr.boot.service.sorting.impl;

import com.xr.boot.dao.sorting.SorPackageDetailMapper;
import com.xr.boot.entity.SorPackageDetails;
import com.xr.boot.service.sorting.SorPackageDetailsService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SorPackageDetailsServiceimpl implements SorPackageDetailsService {
    @Autowired
    private SorPackageDetailMapper sorPackageDetailMapper;
    @Override
    public List<SorPackageDetails> findSorPackageDetailsNoPack(SorPackageDetails sorPackageDetails) throws Exception{
        List<SorPackageDetails> sorPackageDetailNoPack = sorPackageDetailMapper.findSorPackageDetailNoPack(sorPackageDetails);
        return sorPackageDetailNoPack;
    }

    @Override
    public List<SorPackageDetails> findSorPackageDetailsByPackage(String packaging) throws Exception {
        List<SorPackageDetails> sorPackageDetailByPackage = sorPackageDetailMapper.findSorPackageDetailByPackage(packaging);
        return sorPackageDetailByPackage;
    }
}
