package com.xr.boot.dao.system;

import com.xr.boot.dao.system.provider.SyRoleSqlProvider;
import com.xr.boot.entity.SyRoles;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SyRoleMapper {
    //批量删除角色
    @DeleteProvider(type = SyRoleSqlProvider.class,method = "delListSyRoles")
    void delSyRole(@Param("ids")List<Integer> ids);
    //动态查询角色
    @SelectProvider(type = SyRoleSqlProvider.class,method = "select")
    List<SyRoles> findSyRoleByWhere(SyRoles syRoles);
    //向角色表新增
    @Insert("insert into sy_roles values(null,#{roleName},#{roleDesc},#{disabled})")
    void saveSyRole(SyRoles syRoles);
    //向角色表修改
    @Update("update sy_roles set rolename=#{roleName},roledesc=#{roleDesc},disabled=#{disabled} where id=#{id}")
    void upSyRole(SyRoles syRoles);
    //根据Id查sy_roles
    @Select("select id,rolename,roledesc,disabled from sy_roles where id=#{id}")
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
