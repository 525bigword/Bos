package com.xr.boot.dao.system;

import com.xr.boot.dao.system.provider.SyEmpSqlProvider;
import com.xr.boot.entity.SyEmp;
import com.xr.boot.entity.SyRolesMenus;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SyEmpMapper {
    @Update("update sy_emp set empname=#{empName},pwd=#{pwd},queryPwd=#{queryPwd},roleid=#{roleid}," +
            "disabled=#{disabled},empunit=#{empunit},remark=#{remark} where id=#{id}")
    void upSyEmpById(SyEmp syEmp);
    //删除员工
    @DeleteProvider(type = SyEmpSqlProvider.class,method = "delListSyEmps")
    void delSyEmps(@Param("ids")List<Integer> ids);

    //新增员工
    @Insert("insert into sy_emp values(null,#{empName},#{empNo},#{pwd},#{queryPwd},#{roleid},#{empunit},#{remark},#{disabled})")
    void saveSyEmp(SyEmp syEmp);
    //动态查询员工和员工得角色
    @SelectProvider(type = SyEmpSqlProvider.class,method = "findSyEmpByWhere")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "empname",property = "empName"),
            @Result(column = "roleid",property = "roleid"),
            @Result(column = "remark",property = "remark"),
            @Result(column = "empno",property = "empNo"),
            @Result(column = "rolename",property = "rolename"),
            @Result(column = "disabled",property = "disabled"),
    })
    List<SyEmp> findSyEmpByWhere(SyEmp syEmp);
    //根据roleid查询sy_rolesmenus
    @Select("select id,menuid from sy_rolesmenus where roleid=#{roleid}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(property = "roleid",column = "roleid"),
            @Result(column = "menuid",property = "menuNames",
                    many = @Many(
                            select = "com.xr.boot.dao.system.MenusAndBigMenusMapper.findSyMenusByIdAndParentToZero",
                            fetchType = FetchType.EAGER
                    )
            )
    })
    List<SyRolesMenus> findSyRolesMenusByroleId(@Param("roleid") Integer roleid);
    //根据员工编号密码查询员工
    @Select("select id,empname,empno,pwd,querypwd,roleid,empunit,remark,disabled from sy_emp where empno=#{empNo} and" +
            " #{pwd}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "empname",property = "empName"),
            @Result(column = "empno",property = "empNo"),
            @Result(column = "pwd",property ="pwd" ),
            @Result(column = "querypwd",property = "queryPwd"),
            @Result(column = "remark",property = "remark"),
            @Result(column = "disabled",property = "disabled"),
            @Result(column = "roleid",property = "roleid"),
            @Result(column = "roleid",property = "syRoles",
                    one = @One(
                            select="com.xr.boot.dao.system.SyRoleMapper.findSyRolesById",
                            fetchType = FetchType.DEFAULT
                    )
            ),
            @Result(column = "empunit",property = "syUnits",
                    one=@One(
                            select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitAllById",
                            fetchType = FetchType.DEFAULT
                    )
            )
    })
    SyEmp findSyEmpByEmpNoAndPwd(SyEmp syEmp);
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
    //查询工号和名称  mpy
    @Select("select EmpNo,EmpName from sy_emp where Disabled=0 order by empNo asc")
    @Results({
            @Result(column = "EmpNo",property = "empNo"),
            @Result(column = "EmpName",property = "empName")
    })
    List<SyEmp> findSyEmp();
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
    void upSyEmpToPwdById(SyEmp syEmp);

}
