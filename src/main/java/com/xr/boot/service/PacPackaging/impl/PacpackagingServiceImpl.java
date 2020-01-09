package com.xr.boot.service.PacPackaging.impl;

import com.xr.boot.dao.PacPackaging.PacPackagingMapper;
import com.xr.boot.entity.PacPackaging;
import com.xr.boot.entity.SyEmp;
import com.xr.boot.entity.SyMenus;
import com.xr.boot.service.PacPackaging.PacPackagingService;
import com.xr.boot.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class PacpackagingServiceImpl implements PacPackagingService {
    @Resource
    private PacPackagingMapper pacPackagingMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public Map<String,List<Object>> queryAllpacpackaging() {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        List<PacPackaging> pacPack = pacPackagingMapper.queryAllpacpackaging();
        maps.put("PacPackagingAll", Collections.singletonList(pacPack));
        redisUtil.set("com.xr.boot.controller.PacPackagingController.queryAllpacpackaging", maps);
        return maps;
    }

    @Override
    public PacPackaging findOnebyid(int id) {
        return pacPackagingMapper.findOnebyid(id);
    }

    @Override
    public List<PacPackaging> findWherepacpackaging(PacPackaging pacPackaging) {
        return pacPackagingMapper.findWherepacpackaging(pacPackaging);
    }

    @Override
    public void addPacpackaging(PacPackaging pacPackaging) {
        pacPackagingMapper.addPacpackaging(pacPackaging);
    }
    @Override
    public void updatePacpackaging(PacPackaging pacPackaging) {
pacPackagingMapper.updatePacpackaging(pacPackaging);
    }

    @Override
    public void updatePaczuofei(PacPackaging pacPackaging) {
pacPackagingMapper.updatePaczuofei(pacPackaging);
    }

    @Override
    public SyEmp selectIdbyname(String empName) {
        return pacPackagingMapper.selectIdbyname(empName);
    }
}
