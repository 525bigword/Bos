package com.xr.boot.dao.accBusinessAdmissibility;

import com.xr.boot.dao.accBusinessAdmissibility.provider.AccBusinessAdmissibilitySql;
import com.xr.boot.entity.AccBusinessAdmissibility;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccBusinessAdmissibilityMapper {
    /**
     * 业务受理
     * @param accBusinessAdmissibility
     */
    @Insert("insert into Acc_BusinessAdmissibility(BusinessNoticeNo,CustomCode,CustomName,Linkman,TelPhone,PickupAddress,ArriveCity,ProcueId,ReservationTime,Weight,Volume,ImportantHints) values(#{businessNoticeNo},#{customCode},#{customName},#{linkman},#{telPhone},#{pickupAddress},#{arriveCity},#{procueId},#{reservationTime},#{weight},#{volume},#{importantHints})")
    void addAccBusinessAdmissibility(AccBusinessAdmissibility accBusinessAdmissibility);

    /**
     * 业务受理查询
     * @return
     */
    @Select("select id, BusinessNoticeNo,CustomCode,CustomName,Linkman,TelPhone,PickupAddress,ArriveCity,ProcueId,ReservationTime from Acc_BusinessAdmissibility")
    List<AccBusinessAdmissibility> findAllAccBusinessAdmissibility();

    /**
     * 业务受理多条件查询
     * @param accBusinessAdmissibility
     * @return
     */
    @SelectProvider(type = AccBusinessAdmissibilitySql.class,method = "findAccBusinessAdmissibilityWhere")
    List<AccBusinessAdmissibility> findAllWhereAccBusinessAdmissibility(AccBusinessAdmissibility accBusinessAdmissibility);
}
