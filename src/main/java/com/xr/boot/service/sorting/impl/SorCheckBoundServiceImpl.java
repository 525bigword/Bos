package com.xr.boot.service.sorting.impl;

import com.xr.boot.dao.sorting.SorCheckBoundDetailsMapper;
import com.xr.boot.dao.sorting.SorCheckBoundMapper;
import com.xr.boot.dao.sorting.SorPackageDetailMapper;
import com.xr.boot.dao.sorting.SorPackageMapper;
import com.xr.boot.entity.SorCheckBound;
import com.xr.boot.entity.SorCheckBoundDetails;
import com.xr.boot.entity.SorPackageDetails;
import com.xr.boot.service.sorting.SorCheckBoundService;
import com.xr.boot.util.DateUtil;
import com.xr.boot.util.SnowflakeIdFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SorCheckBoundServiceImpl implements SorCheckBoundService {
    @Autowired
    private SorPackageDetailMapper sorPackageDetailMapper;
    @Autowired
    private SorCheckBoundMapper sorCheckBoundMapper;
    @Autowired
    private SorCheckBoundDetailsMapper sorCheckBoundDetailsMapper;
    //盘库ID
    private SnowflakeIdFactory SorCheckBoundIdFactory=new SnowflakeIdFactory(15);
    //盘库详情ID
    private SnowflakeIdFactory SorCheckBoundDetailIdFactory=new SnowflakeIdFactory(16);
    @Override
    @Transactional
    public void saveSorCheckBound(SorCheckBound sorCheckBound) throws Exception {
        //完善盘库信息
        sorCheckBound.setId(SorCheckBoundIdFactory.generateKey().toString());
        sorCheckBound.setCheckDate(DateUtil.getTime());
        sorCheckBoundMapper.saveSorCheckBound(sorCheckBound);
        //盘库详情
        //根据合包查询对应详情包
        List<SorPackageDetails> sorPackageDetails =sorPackageDetailMapper.findSorPackageDetailByPackage(sorCheckBound.getPackging());
        for (int i = 0; i < sorPackageDetails.size(); i++) {
            SorPackageDetails sorPackageDetailsfor = sorPackageDetails.get(i);
            SorCheckBoundDetails sorCheckBoundDetails = new SorCheckBoundDetails();
            sorCheckBoundDetails.setId(SorCheckBoundDetailIdFactory.generateKey().toString());
            sorCheckBoundDetails.setCargoCount(sorPackageDetailsfor.getCargoInt());
            sorCheckBoundDetails.setWeight(sorPackageDetailsfor.getWeight());
            sorCheckBoundDetails.setVolume(sorPackageDetailsfor.getVolume());
            sorCheckBoundDetails.setDirection(sorPackageDetailsfor.getDestination());
            sorCheckBoundDetails.setStoragePerson(sorCheckBound.getCheckPerson());
            sorCheckBoundDetails.setStorageDate(DateUtil.getTimeNosmd());
            sorCheckBoundDetails.setPackging(sorCheckBound.getPackging());
            sorCheckBoundDetailsMapper.saveSorCheckBoundDetails(sorCheckBoundDetails);
        }
    }

    @Override
    public List<SorCheckBound> findSorCheckBound(SorCheckBound sorCheckBound) throws Exception {
        return sorCheckBoundMapper.findSorCheckBoundByWhere(sorCheckBound);
    }
}
