package com.xr.boot.dao.system.provider;

import com.xr.boot.entity.SyRoles;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class SyRoleSqlProvider {
    public String select(SyRoles syRoles){
        SQL sql=new SQL();
        sql.SELECT("id,rolename,roledesc,disabled");
        sql.FROM("sy_roles");
        if(!"".equals(syRoles.getRoleName())){
            sql.WHERE("rolename=#{roleName}");
        }
        if(null!=syRoles.getDisabled()){
            sql.WHERE("disable=#{disable}");
        }
        return sql.toString();
    }
}
