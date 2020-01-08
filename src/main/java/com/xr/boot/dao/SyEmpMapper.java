package com.xr.boot.dao;

import com.xr.boot.entity.SyEmp;
import com.xr.boot.entity.SyRolesMenus;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

@Repository
public interface SyEmpMapper {
    //根据roleid查询sy_rolesmenus
    @Select("select id,roleid,menuid from sy_rolesmenus where roleid=#{roleid}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "roleid",property = "roleNames",
                one = @One(
                        select = "com.xr.boot.dao.SyRoleMapper.findSyRolesById",
                        fetchType = FetchType.LAZY
                )
            ),
            @Result(column = "menuid",property = "menuNames",
                many = @Many(
                        select = "com.xr.boot.dao.MenusAndBigMenusMapper.findSyMenusById",
                        fetchType = FetchType.LAZY
                )
            )
    })
    SyRolesMenus findSyRolesMenusByroleId(@Param("roleid") Integer roleid);
    //根据员工编号密码查询员工
    @Select("select id,empname,empno,pwd,querypwd,roleid,empunit,remark,disabled from sy_emp where empno=#{empNo} and" +
            " pwd=#{pwd}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "empname",property = "empName"),
            @Result(column = "empno",property = "empno"),
            @Result(column = "pwd",property ="pwd" ),
            @Result(column = "querypwd",property = "queryPwd"),
            @Result(column = "empunit",property = "empunit"),
            @Result(column = "remark",property = "remark"),
            @Result(column = "disable",property = "disable"),
            @Result(column = "roleid",property = "syRolesMenus",
                one = @One(
                        select="com.xr.boot.dao.SyEmpMapper.findSyRolesMenusByroleId",
                        fetchType = FetchType.LAZY
                )
            )
    })
    SyEmp findSyEmpByEmpNoAndPwd(SyEmp syEmp);
    @Select("select id,empname,empno,pwd,querypwd,roleid,empunit,remark,disabled from sy_emp where empno=#{empNo}")
    SyEmp findSyEmpByEmpNoAndPwd(@Param("empNo") String empNo);

}