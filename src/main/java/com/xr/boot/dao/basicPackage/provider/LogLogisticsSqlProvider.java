package com.xr.boot.dao.basicPackage.provider;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class LogLogisticsSqlProvider {
    public String findLogLogisticsByWhere(Integer lineID){
        return new SQL(){
            {
                SELECT("ID,LogisticsInt,LineName,StartCompany,GeneratePerson,CarInt,Driver,DriverPhone,CarType,LogisticsState,IsCancel");
                FROM("LOG_Logistics");
                String tj=" 1=1";
                try {
                    if (lineID!= null && lineID!=0) {
                        tj += " and id=#{lineID}";
                    }
                    WHERE(tj);
                }catch (Exception e){
                    WHERE(tj);
                }
            }
        }.toString();
    }
}
