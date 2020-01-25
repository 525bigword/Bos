package com.xr.boot.dao.basicPackage.provider;

import com.xr.boot.entity.BasArea;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class BasAreaSqlProvider {
    public String findBasAreabyWhere(BasArea basArea){
        return new SQL(){
            {
                SELECT("ID,Province,City,County,PostalCode,SimpleCode,CityCode,EntryUnitID,ComplementUnitID,Nature,TheArea,Stats");
                FROM("bas_area");
                String tj=" 1=1";
               try {
                    if(basArea.getProvince()!=null&&!basArea.getProvince().equals("")){
                        tj+=" and Province=#{province}";
                    }

                   if(basArea.getCity()!=null&&!basArea.getCity().equals("")){
                       tj+=" and City=#{city}";
                   }

                   if(basArea.getCounty()!=null&&!basArea.getCounty().equals("")){
                       tj+=" and County=#{county}";
                   }

                   if(basArea.getSimpleCode()!=null&&!basArea.getSimpleCode().equals("")){
                       tj += " and SimpleCode Like CONCAT('%',#{simpleCode},'%')";
                   }

                   if(basArea.getCityCode()!=null&&!basArea.getCityCode().equals("")){
                       tj+=" and CityCode=#{cityCode}";
                   }
                    WHERE(tj);
                }catch (Exception e){
                    WHERE(tj);
                }
            }
        }.toString()+" order by InvalidateMark asc,id desc";
    }
}
