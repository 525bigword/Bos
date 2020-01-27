package com.xr.boot.dao.basicPackage.provider;

import com.xr.boot.entity.BasPartition;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class BasPartitionSqlProvider {
    public String findBasPartitionByWhere(BasPartition basPartition){
        return new SQL(){
            {
                SELECT("ID,Province,City,County,SortingCode,ZoneCode,Keyword,StartInt,TerminateInt,SDInt,Stats,OperatorID,OperationUnitID,OperationTime");
                FROM("bas_partition");
                String tj=" 1=1";
                try {
                    if (basPartition.getProvince()!= null && !basPartition.getProvince().equals("")) {
                        tj += " and Province=#{province}";
                    }

                    if (basPartition.getCity()!= null && !basPartition.getCity().equals("")) {
                        tj += " and City=#{city}";
                    }

                    if (basPartition.getCounty()!= null && !basPartition.getCounty().equals("")) {
                        tj += " and County=#{county}";
                    }

                    if (basPartition.getZoneCode()!= null && !basPartition.getZoneCode().equals("")) {
                        tj += " and ZoneCode=#{zoneCode}";
                    }

                    if (basPartition.getKeyword()!=null&&basPartition.getKeyword().equals("")){
                        tj += " and Keyword Like CONCAT('%',#{keyword},'%')";
                    }
                    WHERE(tj);
                }catch (Exception e){
                    WHERE(tj);
                }
            }
        }.toString()+" order by operationTime desc";
    }
}
