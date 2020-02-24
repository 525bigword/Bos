package com.xr.boot.dao.sorting.provider;

import com.xr.boot.entity.SorPackageDetails;
import jodd.util.StringUtil;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class SorPackageDetailProviderSql {

    public String findWhere(SorPackageDetails sorPackageDetails){
        SQL sql=new SQL();
        sql.SELECT("ID,WareName,Destination,Ticket,ActualCargoInt,CargoInt,Weight,Volume,Service,ImportantHints,Ask," +
                "InputType,Packging");
        sql.FROM("sor_packagedetails");
        if(StringUtil.isNotBlank(sorPackageDetails.getId())){
            sql.WHERE("ID=#{id}");
        }
        if(StringUtil.isNotBlank(sorPackageDetails.getDestination())){
            sql.WHERE("Destination=#{destination}");
        }
        sql.WHERE("Packging is NULL");
        return sql.toString();
    }
}
