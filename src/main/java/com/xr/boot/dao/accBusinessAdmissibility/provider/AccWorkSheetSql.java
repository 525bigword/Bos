package com.xr.boot.dao.accBusinessAdmissibility.provider;

import com.xr.boot.entity.AccWorkSheet;
import org.springframework.stereotype.Component;

@Component
public class AccWorkSheetSql {
    public String findAccWorkSheetWhere(AccWorkSheet accWorkSheet) {
       StringBuffer sql=new StringBuffer("select id, BusinessNoticeNo,CustomCode,CustomName,Linkman,TelPhone,PickupAddress,ArriveCity,ProcueId,ReservationTime from Acc_BusinessAdmissibility where 1=1");
 /*       if (accWorkSheet.getDestination()!= null && !accWorkSheet.getDestination().equals("")) {
            sql.append( " and CustomCode =#{customCode}");
        }
        if (accWorkSheet.getProductTime() != null && !accWorkSheet.getProductTime().equals("")) {
            sql.append( " and BusinessNoticeNo =#{businessNoticeNo}");
        }
        sql.append(" order by id desc");*/

        return sql.toString();

    }
}
