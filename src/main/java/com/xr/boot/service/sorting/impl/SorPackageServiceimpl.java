package com.xr.boot.service.sorting.impl;

import com.xr.boot.dao.sorting.SorPackageDetailMapper;
import com.xr.boot.dao.sorting.SorPackageMapper;
import com.xr.boot.entity.SorPackage;
import com.xr.boot.entity.SorPackageDetails;
import com.xr.boot.service.sorting.SorPackageService;
import com.xr.boot.util.SnowflakeIdFactory;
import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Slf4j
public class SorPackageServiceimpl implements SorPackageService {
    @Autowired
    private SorPackageMapper sorPackageMapper;
    @Autowired
    private SorPackageDetailMapper sorPackageDetailMapper;
    @Override
    @Transactional
    @Klock
    public void savePackageAndPackageDetail(SorPackage sorPackage, List<SorPackageDetails> sorPackageDetails) throws Exception {
        //合包号数据中心17号
        SnowflakeIdFactory PackageIdFactory=new SnowflakeIdFactory(17);
        //封签号数据中心18号
        SnowflakeIdFactory PackageSealIntFactory=new SnowflakeIdFactory(18);
        //封签号数据中心19号
        //SnowflakeIdFactory PackageDetailIdFactory=new SnowflakeIdFactory(19);
        sorPackage.setId(PackageIdFactory.generateKey().toString());
        sorPackage.setSealInt(PackageSealIntFactory.generateKey().toString());
        //sorPackageDetails.stream().forEach(e -> e.setId(PackageDetailIdFactory.generateKey().toString()));
        for(int i=0;i<sorPackageDetails.size();i++){
            SorPackageDetails sorPackageDetail = sorPackageDetails.get(i);
            sorPackageDetail.setPackging(sorPackage.getId());
            sorPackageDetails.set(i,sorPackageDetail);
        }
        sorPackageMapper.saveSorPackage(sorPackage);
        for (SorPackageDetails sorPackageDetail : sorPackageDetails) {
            sorPackageDetailMapper.upSorPackageDetail(sorPackageDetail);
        }
        System.out.println(sorPackage);
        sorPackageDetails.forEach(System.out::println);
    }

    @Override
    public List<SorPackage> findSorPackageByWhere(SorPackage sorPackage)throws Exception {
        List<SorPackage> sorPackages = sorPackageMapper.findSorPackage(sorPackage);
        return sorPackages;
    }

    @Override
    @Transactional
    @Klock
    public void unpacking(String[] packing,Integer personid) throws Exception {
        for (String s : packing) {
            sorPackageDetailMapper.upSorPackageDetailPackingNull(s);
            sorPackageMapper.delSorPackageStateById(s);
        }
    }

    @Override
    public List<SorPackage> findSorPackageByIdAndState(SorPackage sorPackage) throws Exception {
        List<SorPackage> sorPackageByIdAndState = sorPackageMapper.findSorPackageByIdAndState(sorPackage);
        return sorPackageByIdAndState;
    }
}
