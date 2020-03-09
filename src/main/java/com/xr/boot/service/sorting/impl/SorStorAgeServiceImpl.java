package com.xr.boot.service.sorting.impl;

import com.xr.boot.dao.sorting.SorPackageDetailMapper;
import com.xr.boot.dao.sorting.SorPackageMapper;
import com.xr.boot.dao.sorting.SorStorageDetailMapper;
import com.xr.boot.dao.sorting.SorStorageMapper;
import com.xr.boot.entity.SorPackage;
import com.xr.boot.entity.SorPackageDetails;
import com.xr.boot.entity.SorStorage;
import com.xr.boot.entity.SorStorageDetails;
import com.xr.boot.service.sorting.SorStorAgeService;
import com.xr.boot.util.DateUtil;
import com.xr.boot.util.SnowflakeIdFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Null;
import java.util.List;

@Service
public class SorStorAgeServiceImpl implements SorStorAgeService {
    @Autowired
    private SorPackageMapper sorPackageMapper;
    @Autowired
    private SorPackageDetailMapper sorPackageDetailMapper;
    @Autowired
    private SorStorageMapper sorStorageMapper;
    @Autowired
    private SorStorageDetailMapper sorStorageDetailMapper;
    //合包号数据中心17号
    private SnowflakeIdFactory PackageIdFactory=new SnowflakeIdFactory(17);
    //封签号数据中心18号
    private SnowflakeIdFactory PackageSealIntFactory=new SnowflakeIdFactory(18);
    //合包详情id数据中心19号
    private SnowflakeIdFactory PackageDetalsFactory=new SnowflakeIdFactory(19);
    //入库交接单数据中心18号
    private SnowflakeIdFactory SorStorageFactory=new SnowflakeIdFactory(9);
    //入库详情交接单数据中心11号
    private SnowflakeIdFactory SorStorageDetailFactory=new SnowflakeIdFactory(11);
    @Klock
    @Transactional
    @Override
    public void addSorStorAge(SorPackage sorPackage, List<SorPackageDetails> sorPackageDetails, String unit) throws Exception {

        //生成合包对象
        sorPackage.setId(PackageIdFactory.generateKey().toString());
        sorPackage.setSealInt(PackageSealIntFactory.generateKey().toString());
        //生成合包明细
        for(int i=0;i<sorPackageDetails.size();i++){
            SorPackageDetails sorPackageDetail = sorPackageDetails.get(i);
            sorPackageDetail.setPackging(sorPackage.getId());
            sorPackageDetail.setId(PackageDetalsFactory.generateKey().toString());
            sorPackageDetails.set(i,sorPackageDetail);
        }
        //合包
        sorPackageMapper.saveSorPackage(sorPackage);
        //入库
        Long sorStorageId = SorStorageFactory.generateKey();
        sorStorageMapper.saveSorStorage(new SorStorage(sorStorageId.toString(),
                DateUtil.getTimeNosmd(),sorPackage.getPackageperson(),unit,sorPackage.getId()));
        for (SorPackageDetails sorPackageDetail : sorPackageDetails) {
            sorPackageDetailMapper.saveSorPackageDetail(sorPackageDetail);
            //生成入库生成入库详情
            sorStorageDetailMapper.saveSorStorageDetails(new SorStorageDetails(SorStorageDetailFactory.generateKey().toString(),sorPackage.getId(),sorPackageDetail.getWeight()));
        }
    }

    @Override
    public List<SorStorage> findSOrStorAgeByIdAndDate(SorStorage sorStorage) throws Exception {
        List<SorStorage> sorStorageByWhere = sorStorageMapper.findSorStorageByWhere(sorStorage);
        return sorStorageByWhere;
    }
}
