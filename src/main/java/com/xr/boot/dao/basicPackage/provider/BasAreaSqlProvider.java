package com.xr.boot.dao.basicPackage.provider;

import com.xr.boot.entity.BasArea;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class BasAreaSqlProvider {
    public String findBasAreabyWhere(BasArea basArea){
        return new SQL(){
            {
                SELECT("ID,EmpNo,EmpName,MobileNo,Type,PDA,StandardKg,StandardLength,Models,PlateInt,InvalidateMark,OperatorID,OperationUnitID,OperationTime");
                FROM("bas_substitute");
                String tj=" 1=1";
               /* try {
                    if(basSubstitute.getEmpNo()!=null&&!basSubstitute.getEmpNo().equals("")){
                        tj+=" and EmpNo=#{empNo}";
                    }

                    if (basSubstitute.getEmpName()!=null&&!basSubstitute.getEmpName().equals("")){
                        tj += " and EmpName Like CONCAT('%',#{empName},'%')";
                    }

                    if(basSubstitute.getMobileNo()!=null&&!basSubstitute.getMobileNo().equals("")){
                        tj+=" and MobileNo=#{mobileNo}";
                    }

                    if(basSubstitute.getPda()!=null&&!basSubstitute.getPda().equals("")&&basSubstitute.getPda()!=3&&!basSubstitute.getPda().equals("3")){
                        tj+=" and PDA=#{pda}";
                    }
                    WHERE(tj);
                }catch (Exception e){
                    WHERE(tj);
                }*/
            }
        }.toString()+" order by InvalidateMark asc,id desc";
    }
}
