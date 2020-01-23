package com.xr.boot.dao.system.provider;

import com.xr.boot.entity.SyRoles;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SyRoleSqlProvider {

    /**
     * 批量删除sy_roles表数据
     * @param ids 需要删除的行
     * @return
     */
    public String delListSyRoles(List<Integer> ids){
        StringBuffer sb=new StringBuffer();
        if(ids.size()>1) {
            sb.append("DELETE from sy_roles  WHERE id IN (");
            for (int i = 0; i < ids.size(); i++) {
                sb.append("'").append(ids.get(i)).append("'");
                if (i < ids.size() - 1)
                    sb.append(",");
            }
            sb.append(")");
        }else{
            sb.append("DELETE from sy_roles  WHERE id ="+ids.get(0));
        }
        return sb.toString();
    }
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
