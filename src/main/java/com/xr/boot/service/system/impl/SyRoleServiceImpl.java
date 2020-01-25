package com.xr.boot.service.system.impl;

import com.xr.boot.dao.system.SyRoleMapper;
import com.xr.boot.entity.SyRoles;
import com.xr.boot.service.system.SyRoleService;
import com.xr.boot.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class SyRoleServiceImpl implements SyRoleService {
    @Autowired
    private SyRoleMapper syRoleMapper;
    @Autowired
    private RedisUtil redisUtil;
    private Set<String> syrolekeys=new HashSet<>();
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void saveOrUpSyRole(SyRoles syRoles,Integer bj) throws SQLException {
        try{
            if(bj==0) {
                syRoleMapper.saveSyRole(syRoles);
            }else{
                syRoleMapper.upSyRole(syRoles);
            }
            for (String s : syrolekeys) {
                redisUtil.del(s);
            }
        }catch (Exception e){
            log.debug("com.xr.boot.service.service.impl.SyRoleServiceImpl查询数据库错误");
            throw new SQLException("com.xr.boot.service.service.impl.SyRoleServiceImpl查询数据库错误");
        }
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public Object findSyRoleByWhere(SyRoles syRoles) {
        List<SyRoles> syRoleByWhere = syRoleMapper.findSyRoleByWhere(syRoles);
        //新增一个查询条件进入redis
        redisUtil.set("com.xr.boot.SyRoleController.findSyRole"+syRoles.getRoleName()+syRoles.getDisabled(),
                syRoleByWhere);
        syrolekeys.add("com.xr.boot.SyRoleController.findSyRole"+syRoles.getRoleName()+syRoles.getDisabled());
        return redisUtil.get("com.xr.boot.SyRoleController.findSyRole"+syRoles.getRoleName()+syRoles.getDisabled());
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void delSyRole(List<Integer> ids) throws Exception {
        syRoleMapper.delSyRole(ids);
        for (String s : syrolekeys) {
            redisUtil.del(s);
        }
    }
}
