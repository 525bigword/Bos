package com.xr.boot.dao.accBusinessAdmissibility;

import com.xr.boot.entity.AccBusinessAdmissibility;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface AccBusinessAdmissibilityMapper {
    /**
     * 业务受理
     * @param accBusinessAdmissibility
     */
    @Insert("insert into Acc_BusinessAdmissibility(BusinessNoticeNo,CustomCode,CustomName,Linkman,TelPhone,PickupAddress,ArriveCity,ProcueId,ReservationTime,Weight,Volume,ImportantHints) values(#{businessNoticeNo},#{customCode},#{customName},#{linkman},#{telPhone},#{pickupAddress},#{arriveCity},#{procueId},#{reservationTime},#{weight},#{volume},#{importantHints})")
    void addAccBusinessAdmissibility(AccBusinessAdmissibility accBusinessAdmissibility);
}
