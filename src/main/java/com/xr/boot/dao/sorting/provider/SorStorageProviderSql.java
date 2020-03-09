package com.xr.boot.dao.sorting.provider;

import com.xr.boot.entity.SorStorage;
import jodd.util.StringUtil;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class SorStorageProviderSql {
    public String findSorStorageByWhere(SorStorage sorStorage){
        SQL sql=new SQL();
        sql.SELECT("ID,AcceptDate,AcceptPerson,AcceptCompany,PackageID");
        sql.FROM("sor_storage");
        if(StringUtil.isNotEmpty(sorStorage.getId())){
            sql.WHERE("ID=#{id}");
        }
        if(StringUtil.isNotEmpty(sorStorage.getAcceptDate())){
            sql.WHERE("AcceptDate=#{acceptDate}");
        }
        return sql.toString();
    }
}
