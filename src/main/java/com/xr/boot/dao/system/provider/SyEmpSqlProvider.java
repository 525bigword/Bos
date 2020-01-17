package com.xr.boot.dao.system.provider;

import com.xr.boot.entity.SyEmp;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class SyEmpSqlProvider {
    public String findSyEmpByWhere(SyEmp syEmp){
        SQL sql=new SQL();
        sql.SELECT("empname,empno,(select rolename from sy_roles where sy_roles.id=sy_emp.roleid) rolename,disabled");
        if(!"".equals(syEmp.getEmpName())){
            sql.WHERE("sy_emp.empname=#{empName}");
        }
        if(syEmp.getDisabled()!=null){
            sql.WHERE("sy_emp.disabled=#{disabled}");
        }
        sql.FROM("sy_emp");
        return sql.toString();
    }
}
