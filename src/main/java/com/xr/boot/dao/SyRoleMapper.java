package com.xr.boot.dao;

import com.xr.boot.entity.SyRoles;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface SyRoleMapper {
    //向角色表新增
    @Insert("insert into sy_roles values(null,#{roleName},#{roleDesc},#{disabled})")
    void saveSyRole(SyRoles syRoles);

    //根据Id查sy_roles
    @Select("select id,rolename,roledesc,disable from sy_roles where id=#{id}")
    SyRoles findSyRolesById(@Param("id") Integer Id);
}
