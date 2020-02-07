package com.xr.boot.dao.accBusinessAdmissibility.provider;

import com.xr.boot.entity.AccBusinessAdmissibility;
import org.springframework.stereotype.Component;

@Component
public class AccBusinessAdmissibilitySql {
        public String findAccBusinessAdmissibilityWhere(AccBusinessAdmissibility accBusinessAdmissibility) {
        StringBuffer sql=new StringBuffer("select id, BusinessNoticeNo,CustomCode,CustomName,Linkman,TelPhone,PickupAddress,ArriveCity,ProcueId,ReservationTime from acc_businessadmissibility where 1=1");
        if (accBusinessAdmissibility.getCustomCode() != null && !accBusinessAdmissibility.getCustomCode().equals("")) {
            sql.append( " and CustomCode =#{customCode}");
        }
            if (accBusinessAdmissibility.getBusinessNoticeNo() != null && !accBusinessAdmissibility.getBusinessNoticeNo().equals("")) {
                sql.append( " and BusinessNoticeNo =#{businessNoticeNo}");
            }
        sql.append(" order by id desc");

        return sql.toString();

    }
}
