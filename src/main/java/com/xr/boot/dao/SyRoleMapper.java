package com.xr.boot.dao;

import com.xr.boot.entity.SyRoles;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface SyRoleMapper {
    //向角色表新增
    @Insert("insert into sy_roles values(null,#{roleName},#{roleDesc},#{disabled})")
    void saveSyRole(SyRoles syRoles);
}
