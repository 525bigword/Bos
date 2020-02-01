package com.xr.boot.dao.basicPackage.provider;

import com.xr.boot.entity.BigLogLogisticsControlTable;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class BigLogLogisticsControlTableSqlProvider {
    public String findBigLogLogisticsControlTablebyWhere(BigLogLogisticsControlTable bigLogLogisticsControlTable){
        return new SQL(){
            {
                SELECT("bl.ID,bl.WorkSheetNo,bl.CType,bl.Corporation,bl.WaybillID,bl.Remarks,bl.InputPerson,bl.InputDate,bl.InputCompany,bl.Stats");
                FROM("biglog_logisticscontroltable bl,sy_emp se");
                String tj=" bl.InputPerson=se.ID";
                try {
                    if(bigLogLogisticsControlTable.getWorkSheetNo()!=null&&!bigLogLogisticsControlTable.getWorkSheetNo().equals("")){
                        tj+=" and bl.WorkSheetNo=#{workSheetNo}";
                    }

                    if (bigLogLogisticsControlTable.getCorporation()!=null&&!bigLogLogisticsControlTable.getCorporation().equals("")){
                        tj += " and bl.Corporation Like CONCAT('%',#{corporation},'%')";
                    }

                    if(bigLogLogisticsControlTable.getInputDate()!=null&&!bigLogLogisticsControlTable.getInputDate().equals("")){
                        tj+=" and bl.InputDate=#{inputDate}";
                    }

                    if (bigLogLogisticsControlTable.getSyEmp().getEmpName()!=null&&!bigLogLogisticsControlTable.getSyEmp().getEmpName().equals("")){
                        tj += " and se.EmpName Like CONCAT('%',#{empName},'%')";
                    }

                    if (bigLogLogisticsControlTable.getcType()!=null&&!bigLogLogisticsControlTable.getcType().equals("")){
                        tj += " and bl.CType Like CONCAT('%',#{cType},'%')";
                    }

                    WHERE(tj);
                }catch (Exception e){
                    WHERE(tj);
                }
            }
        }.toString()+" order by InputDate desc";
    }
}
