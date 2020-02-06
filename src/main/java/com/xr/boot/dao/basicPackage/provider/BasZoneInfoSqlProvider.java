package com.xr.boot.dao.basicPackage.provider;

import com.xr.boot.entity.BasZoneInfo;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class BasZoneInfoSqlProvider {
    public String findBasZoneInfobyWhere(BasZoneInfo basZoneInfo){
        return new SQL(){
            {
                SELECT("bz.ZoneName,bz.ZoneCode,bz.ZonePeople,bz.TelPhone,bz.SubordinateUnit,bz.Stats");
                FROM("bas_zoneinfo bz,sy_emp se");
                String tj=" bz.ZonePeople=se.ID";
                try {
                    if(basZoneInfo.getSyUnits().getId()!=0){
                        tj+=" and bz.SubordinateUnit=#{unitId}";
                    }

                    if (basZoneInfo.getZoneCode()!=null&&!basZoneInfo.getZoneCode().equals("")){
                        tj+=" and bz.ZoneCode=#{zoneCode}";

                    }

                    if(basZoneInfo.getSyEmp().getEmpNo()!=null&&basZoneInfo.getSyEmp().getEmpNo()!=""){
                        tj += " and se.EmpNo=#{empNo}";
                    }

                    WHERE(tj);
                }catch (Exception e){
                    WHERE(tj);
                }
            }
        }.toString()+" order by ZoneName desc";
    }
}
