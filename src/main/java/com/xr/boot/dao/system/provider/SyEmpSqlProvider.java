package com.xr.boot.dao.system.provider;

import com.xr.boot.entity.SyEmp;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SyEmpSqlProvider {
    /**
     * 批量删除sy_Emp表数据
     * @param ids 需要删除的行
     * @return
     */
    public String delListSyEmps(List<Integer> ids){
        StringBuffer sb=new StringBuffer();
        if(ids.size()>1) {
            sb.append("DELETE from sy_emp  WHERE id IN (");
            for (int i = 0; i < ids.size(); i++) {
                sb.append("'").append(ids.get(i)).append("'");
                if (i < ids.size() - 1)
                    sb.append(",");
            }
            sb.append(")");
        }else{
            sb.append("DELETE from sy_emp  WHERE id ="+ids.get(0));
        }
        return sb.toString();
    }


    public String findSyEmpByWhere(SyEmp syEmp){
        SQL sql=new SQL();
        sql.SELECT("id,empname,empno,(select rolename from sy_roles where sy_roles.id=sy_emp.roleid) rolename," +
                "disabled,roleid,remark");
        if(!"".equals(syEmp.getEmpName())){
            sql.WHERE("sy_emp.empname=#{empName}");
        }
        if(syEmp.getDisabled()!=null){
            sql.WHERE("sy_emp.disabled=#{disabled}");
        }
        sql.WHERE("empunit=#{empunit}");
        sql.FROM("sy_emp");
        return sql.toString();
    }
}
