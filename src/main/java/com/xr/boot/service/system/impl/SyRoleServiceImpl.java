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
import java.util.List;

@Service
@Slf4j
public class SyRoleServiceImpl implements SyRoleService {
    @Autowired
    private SyRoleMapper syRoleMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void saveSyRole(SyRoles syRoles) throws SQLException {
        try{
            syRoleMapper.saveSyRole(syRoles);
        }catch (Exception e){
            log.debug("com.xr.boot.service.service.impl.SyRoleServiceImpl查询数据库错误");
            throw new SQLException("com.xr.boot.service.service.impl.SyRoleServiceImpl查询数据库错误");
        }
    }
    @Transactional
    @Override
    public Object findSyRoleByWhere(SyRoles syRoles) {
        List<SyRoles> syRoleByWhere = syRoleMapper.findSyRoleByWhere(syRoles);
        //新增一个查询条件进入redis
        redisUtil.set("com.xr.boot.SyRoleController.findSyRole"+syRoles.getRoleName()+syRoles.getDisabled(),
                syRoleByWhere);

        return redisUtil.get("com.xr.boot.SyRoleController.findSyRole"+syRoles.getRoleName()+syRoles.getDisabled());
    }


}
