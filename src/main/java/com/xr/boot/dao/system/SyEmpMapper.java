package com.xr.boot.dao.system;

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
    @Select("select id,empname,empno,pwd,querypwd,roleid,empunit,remark,disabled from sy_emp where empno=#{empNo} and pwd=#{pwd}")
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
    //shiro使用的
    @Select("select id,empname,empno,pwd,querypwd,roleid,empunit,remark,disabled from sy_emp where empno=#{empNo}")
    SyEmp login(@Param("empNo") String empNo);
    /**
     * 未判断状态
     * @param
     * @return
     * @Author mpy
     */
    @Select("select ID,EmpName,EmpNo,Pwd,QueryPwd,RoleID,EmpUnit,Remark,Disabled from sy_emp where ID=#{operatorid}")
    @Results({
            @Result(id = true, column = "ID", property = "id"),
            @Result(column = "EmpName", property = "empName"),
            @Result(column = "EmpNo", property = "empNo"),
            @Result(column = "Pwd", property = "pwd"),
            @Result(column = "QueryPwd", property = "queryPwd"),
            @Result(column = "Remark", property = "remark"),
            @Result(column = "Disabled", property = "disabled")
    })
    SyEmp findSyEmpById(int operatorid);

    //根据员工编号查询员工
    @Select("select id,empname,empno,pwd,querypwd,roleid,empunit,remark,disabled from sy_emp where empno=#{empNo}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "empname",property = "empName"),
            @Result(column = "empno",property = "empno"),
            @Result(column = "pwd",property ="pwd" ),
            @Result(column = "querypwd",property = "queryPwd"),
            @Result(column = "empunit",property = "empunit"),
            @Result(column = "remark",property = "remark"),
            @Result(column = "disable",property = "disable"),

    })
    SyEmp findSyEmpByEmpNo(SyEmp syEmp);

    @Update("update sy_emp set pwd=#{pwd} where empno=#{empNo}")
    //修改密码
    void UpSyEmpById(SyEmp syEmp);

}
