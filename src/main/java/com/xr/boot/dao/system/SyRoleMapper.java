package com.xr.boot.dao.system;

import com.xr.boot.entity.SyRoles;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface SyRoleMapper {
    //向角色表新增
    @Insert("insert into sy_roles values(null,#{roleName},#{roleDesc},#{disabled})")
    void saveSyRole(SyRoles syRoles);

    //根据Id查sy_roles
    @Select("select id,rolename,roledesc,disable from sy_roles where id=#{id}")
    SyRoles findSyRolesById(@Param("id") Integer Id);

    @Select("select roleid from sy_emp where empno=#{empno}")
    @Results({
            @Result(column = "roleid",property = "roleid")
    })
    Integer findSyRolrBySyEmp(@Param("empno") String empno);

    @Select("select roleName from sy_roles where Id=#{id} and disabled=1")
    @Results({
            @Result(column = "rolename",property = "rolename")
    })
    String findSyRolrById(@Param("id") Integer id);

}
