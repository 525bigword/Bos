package com.xr.boot.dao.sorting.provider;

import com.xr.boot.entity.SorCheckBound;
import jodd.util.StringUtil;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SorCheckBoundProviderSql {
    public String findSorCheckBoundByWhere(SorCheckBound sorCheckBound){
        SQL sql=new SQL();
        sql.SELECT("ID,CargoSum,VolumeSum,CheckPerson,CheckDate,CheckCompany,Packging");
        sql.FROM("sor_checkbound");
        if(StringUtil.isNotEmpty(sorCheckBound.getId())){
            sql.WHERE("ID=#{id}");
        }
        if(StringUtil.isNotEmpty(sorCheckBound.getCheckCompany())){
            sql.WHERE("CheckCompany=#{checkCompany}");
        }
        if(StringUtil.isNotEmpty(sorCheckBound.getCheckDate())){
            sql.WHERE("CheckDate=#{checkDate}");
        }
        if(StringUtil.isNotEmpty(sorCheckBound.getCheckPerson())){
            sql.WHERE("CheckPerson=#{checkPerson}");
        }
        return sql.toString();
    }
}
