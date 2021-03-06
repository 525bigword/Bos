package com.xr.boot.service.system.impl;

import com.xr.boot.dao.system.SyUnitsMapper;
import com.xr.boot.entity.SyEmp;
import com.xr.boot.entity.SyUnits;
import com.xr.boot.service.system.SyUnitsService;
import com.xr.boot.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class SyUnitsServiceImpl implements SyUnitsService {
    @Autowired
    private SyUnitsMapper syUnitsMapper;
    @Autowired
    private RedisUtil redisUtil;
    private Set syunitkey=new HashSet();

    @Override
    public SyUnits findSyUnitById(Integer operationUnitid) {
        return syUnitsMapper.findSyUnitById(operationUnitid);
    }
    @Transactional
    @Override
    public Object findSyUnits() {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("SyUnits", Collections.singletonList(syUnitsMapper.findSyUnits()));
        redisUtil.set("com.xr.boot.controller.basicPackage.SyUnitsController.findSyUnits", maps);
        return redisUtil.get("com.xr.boot.controller.basicPackage.SyUnitsController.findSyUnits");
    }
    /**
     * 查询正常运作的所有单位 未修正
     * @param stats
     * @return
     */
    @Override
    public List<SyUnits> findSyUnitAllByStats(Integer stats) {
        return syUnitsMapper.findSyUnitAllByStats(stats);
    }

    @Override
    @Transactional
    @Klock
    public void saveSyUnit(SyUnits syUnits) throws Exception {
        syUnitsMapper.saveSyUnit(syUnits);
        for (Object  o: syunitkey) {
            redisUtil.del(o.toString());
        }
        syunitkey.clear();
    }

    @Override
    @Transactional
    @Klock
    public void upSyUnit(SyUnits syUnits) throws Exception {
        syUnitsMapper.upSyUnit(syUnits);
        for (Object  o: syunitkey) {
            redisUtil.del(o.toString());
        }
        syunitkey.clear();
    }
    @Transactional
    @Klock
    @Override
    public void delSyUnit(List<Integer> ids) throws Exception {
        for (Integer id : ids) {
            syUnitsMapper.delSyUnit(id);
        }
        for (Object  o: syunitkey) {
            redisUtil.del(o.toString());
        }
        syunitkey.clear();
    }


    @Override
    public Object findSyUnitByParentId(SyUnits syUnits) {
        String key=
                "com.xr.boot.controller.basicPackage.SyUnitsController.findSyUnitsByParentid"+syUnits.getParentid()+syUnits.getName();
        List<SyUnits> syUnitAllByParentId = syUnitsMapper.findSYUnitAllByParentId(syUnits);
        redisUtil.set(key,syUnitAllByParentId);
        syunitkey.add(key);
        return redisUtil.get(key);
    }
}
