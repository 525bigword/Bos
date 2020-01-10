package com.xr.boot.dao.basicPackage.provider;

import com.xr.boot.entity.BasDeliveryStandard;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class BasDeliveryStandardSqlProvider {
    public String findBasDeliveryStandardbyWhere(BasDeliveryStandard basDeliveryStandard){

        return new SQL(){
            {
                SELECT("ds.BasicFileNumber,ds.`Name`,ds.MinWeight,ds.MaxWeight,ds.OperatorID,ds.OperationUnitID,ds.OperationTime,ds.`Status`");
                FROM("bas_deliverystandard ds,sy_emp se,sy_units su");
                String tj="ds.OperatorID=se.ID and ds.OperationUnitID=su.ID and 1=1";
                try {
                    if (basDeliveryStandard.getName() != null && !basDeliveryStandard.getName().equals("")) {
                        tj += " and ds.`Name` Like CONCAT('%',#{name},'%')";
                    }

                    if (basDeliveryStandard.getStatus() != null) {
                        tj += " and ds.`Status`=#{status}";
                    }
                    if (basDeliveryStandard.getMinWeight() != null &&! basDeliveryStandard.getMinWeight().equals("")) {
                        tj += " and ds.MinWeight=#{minWeight}";
                    }
                    if (basDeliveryStandard.getMaxWeight() != null && !basDeliveryStandard.getMaxWeight().equals("")) {
                        tj += " and ds.MaxWeight=#{maxWeight}";
                    }
                    if (basDeliveryStandard.getSyEmp().getEmpName() != null && !basDeliveryStandard.getSyEmp().getEmpName().equals("")) {
                        tj += " and se.EmpName Like CONCAT('%',#{syEmp.empName},'%')";
                    }
                    if (basDeliveryStandard.getOperationTime() != null && !basDeliveryStandard.getOperationTime().equals("")) {
                        tj += " and ds.OperationTime=#{operationTime}";
                    }
                    WHERE(tj);
                }catch (Exception e){
                    WHERE(tj += " and ds.`Status`=0");
                }

            }
        }.toString()+" order by ds.OperationTime desc";
    }
}
