package com.xr.boot.service.system;

import com.xr.boot.entity.SyRoles;

public interface SyRoleService {
    //新增一个角色
    void saveSyRole(SyRoles syRoles)throws Exception;
}
