package com.xr.boot.dao.basicPackage.provider;

import com.xr.boot.entity.BasZoneInfo;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class BasZoneInfoSqlProvider {
    public String findBasZoneInfobyWhere(BasZoneInfo basZoneInfo){
        return new SQL(){
            {
                SELECT("ZoneName,ZoneCode,ZonePeople,TelPhone,SubordinateUnit,Stats");
                FROM("bas_zoneinfo");
                String tj=" 1=1";
                try {
                    if(basZoneInfo.getSyUnits().getId()!=0){
                        tj+=" and SubordinateUnit=#{unitId}";
                    }

                    if (basZoneInfo.getZoneCode()!=null&&!basZoneInfo.getZoneCode().equals("")){
                        tj+=" and ZoneCode=#{zoneCode}";

                    }

                    if(basZoneInfo.getSyEmp().getId()!=0){
                        tj += " and ZonePeople=#{empId}";
                    }

                    WHERE(tj);
                }catch (Exception e){
                    WHERE(tj);
                }
            }
        }.toString()+" order by ZoneName desc";
    }
}
