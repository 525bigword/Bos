package com.xr.boot.service.sorting.impl;

import com.xr.boot.dao.sorting.SorAbnormalMapper;
import com.xr.boot.entity.SorAbnormal;
import com.xr.boot.service.sorting.SorAbnormalService;
import com.xr.boot.util.DateUtil;
import com.xr.boot.util.SnowflakeIdFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SorAbnormalServiceImpl implements SorAbnormalService {
    @Autowired
    private SorAbnormalMapper sorAbnormalMapper;
    private SnowflakeIdFactory SorAbnormalIdFactory=new SnowflakeIdFactory(20);
    private SnowflakeIdFactory SorAbnormalHedgeAbnIntFactory=new SnowflakeIdFactory(22);
    @Override
    @Transactional
    public void saveSorAbnormal(SorAbnormal sorAbnormal) throws Exception {
        String date=DateUtil.getTimeNosmd();
        sorAbnormal.setId(SorAbnormalIdFactory.generateKey().toString());
        sorAbnormal.setLaunchDate(date);
        sorAbnormal.setHedgeAbnInt(SorAbnormalHedgeAbnIntFactory.generateKey().toString());
        sorAbnormal.setHandleDate(date);
        sorAbnormalMapper.saveSorAbnormal(sorAbnormal);
    }

    @Override
    public List<SorAbnormal> findSorAbnormalByWhere(SorAbnormal sorAbnormal) throws Exception {
        List<SorAbnormal> sorAbnormals = sorAbnormalMapper.findSorAbnormal(sorAbnormal);
        return sorAbnormals;
    }
    @Transactional
    @Override
    public void upSorAbnormalAboStateById(String[] ids) throws Exception {
        for (String id : ids) {
            sorAbnormalMapper.upSorAbnormalAboStateById(id);
        }
    }
}
