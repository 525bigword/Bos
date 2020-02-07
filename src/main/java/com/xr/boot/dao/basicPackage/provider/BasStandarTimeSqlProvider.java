package com.xr.boot.dao.basicPackage.provider;

import com.xr.boot.entity.BasStandarTime;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class BasStandarTimeSqlProvider {
    public String findBasStandarTimebyWhere(BasStandarTime basStandarTime){
        return new SQL(){
            {
                SELECT("ID,TimeName,SubordinateUnit,WorkingTime,ClosingTime,SaturdayWorkingTime,SaturdayClosingTime,SundayWorkingTime,SundayClosingTime,Stats");
                FROM("bas_standartime");
                String tj=" 1=1";
                try {
                    if(basStandarTime.getSyUnits().getId()!=0){
                        tj+=" and SubordinateUnit=#{unitId}";
                    }
                    if (basStandarTime.getTimeName()!=null&&!basStandarTime.getTimeName().equals("")){
                        tj += " and TimeName Like CONCAT('%',#{timeName},'%')";
                    }
                    WHERE(tj);
                }catch (Exception e){
                    WHERE(tj);
                }
            }
        }.toString()+" order by ID desc";
    }
}
