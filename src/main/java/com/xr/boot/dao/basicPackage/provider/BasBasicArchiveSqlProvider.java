package com.xr.boot.dao.basicPackage.provider;

import com.xr.boot.entity.BasBasicArchives;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class BasBasicArchiveSqlProvider {
    public String findBasBasicArchivebyWhere(BasBasicArchives basBasicArchive){
        return new SQL(){
            {
                SELECT("bb.ID,bb.BasicFileNumber,bb.`Name`,bb.Grade,bb.OperatorID,bb.OperationUnitID,bb.Remarks,bb.OperationTime");
                FROM("bas_basicarchives bb,sy_emp se,sy_units su");
                String tj="bb.OperatorID=se.ID and bb.OperationUnitID=su.ID and 1=1";
                try {
                    if (basBasicArchive.getBasicFileNumber()!= null && !basBasicArchive.getBasicFileNumber().equals("")) {
                        tj += " and bb.BasicFileNumber=#{basicFileNumber}";
                    }
                    if (basBasicArchive.getName()!= null && !basBasicArchive.getName().equals("")) {
                        tj += " and bb.`Name` Like CONCAT('%',#{name},'%')";
                    }
                    if (basBasicArchive.getSyEmp().getEmpName()!=null&&basBasicArchive.getSyEmp().getEmpName().equals("")){
                        tj += " and se.EmpName Like CONCAT('%',#{syEmp.empName},'%')";
                    }

                    if (basBasicArchive.getOperationTime() != null && !basBasicArchive.getOperationTime().equals("")) {
                        tj += " and bb.OperationTime=#{operationTime}";
                    }
                    WHERE(tj);
                }catch (Exception e){
                    WHERE(tj);
                }
            }
        }.toString()+" order by bb.OperationTime desc";
    }
}
