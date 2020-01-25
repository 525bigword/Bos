package com.xr.boot.service.system;

import com.xr.boot.entity.SyRoles;

import java.util.List;

public interface SyRoleService {
    //批量删除橘色
    void delSyRole(List<Integer> ids) throws Exception;

    //新增一个角色
    void saveOrUpSyRole(SyRoles syRoles,Integer bj)throws Exception;
    //动态查询角色表
    Object findSyRoleByWhere(SyRoles syRoles);
}
