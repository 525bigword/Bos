package com.xr.boot.dao.sorting.provider;

import com.xr.boot.entity.SorPackage;
import jodd.util.StringUtil;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class SorPackageMapperProviderSql {
    public String findWhere(SorPackage sorPackage){
        SQL sql=new SQL();
        sql.SELECT("ID,PackagePerson,SealInt,Destination,ReckonDes,TimeLimit,TicketSum,CargoSum,WeightSum,VolumeSum," +
                "State,Ask");
        sql.FROM("sor_package");
        if(StringUtil.isNotBlank(sorPackage.getId())){
            sql.WHERE("ID = #{id}");
        }
        if(StringUtil.isNotBlank(sorPackage.getDestination())){
            sql.WHERE("Destination = #{destination}");
        }
        sql.WHERE(" State='未拆包'");
        return sql.toString();
    }

    public String findSorPackageByIdAndState(SorPackage sorPackage){
        SQL sql=new SQL();
        sql.SELECT("ID,PackagePerson,SealInt,Destination,ReckonDes,TimeLimit,TicketSum,CargoSum,WeightSum,VolumeSum," +
                "State,Ask");
        sql.FROM("sor_package");

        if(StringUtil.isNotEmpty(sorPackage.getId())){
            sql.WHERE("ID="+sorPackage.getId());
        }
        if(!"全部".equals(sorPackage.getState())){
            sql.WHERE("State=#{state}");
        }
        return sql.toString();
    }
}
