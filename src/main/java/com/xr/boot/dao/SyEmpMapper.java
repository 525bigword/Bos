package com.xr.boot.dao;

import com.xr.boot.entity.SyEmp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SyEmpMapper {
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
}
