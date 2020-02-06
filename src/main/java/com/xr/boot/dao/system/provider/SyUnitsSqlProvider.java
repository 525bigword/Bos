package com.xr.boot.dao.system.provider;

import com.xr.boot.entity.SyUnits;
import org.apache.ibatis.jdbc.SQL;

public class SyUnitsSqlProvider {
    public String select(SyUnits syUnits){
        SQL sql=new SQL();
        sql.SELECT("ID,`Name`,Remarks,OperatorID,(select EmpName from sy_emp where id=sy_units.operatorid)" +
                "operatorname,parentid," +
                "OperationTime,Stats");
        if(!"".equals(syUnits.getName())){
            sql.WHERE("`Name`=#{name}");
        }
        sql.WHERE("parentid=#{parentid}");
        sql.FROM("sy_units");
        return sql.toString();
    }
}
