package com.xr.boot.dao.accBusinessAdmissibility;

import com.xr.boot.dao.accBusinessAdmissibility.provider.AccBusinessAdmissibilitySql;
import com.xr.boot.entity.AccBusinessAdmissibility;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
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
    @Select("select id, BusinessNoticeNo,CustomCode,CustomName,Linkman,TelPhone,PickupAddress,ArriveCity,ProcueId,ReservationTime from acc_businessadmissibility")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "businessNoticeNo", column = "businessNoticeNo"),
            @Result(property = "customName", column = "CustomName"),
            @Result(property = "linkman", column = "Linkman"),
            @Result(property = "telPhone", column = "telPhone"),
            @Result(property = "pickupAddress", column = "PickupAddress"),
            @Result(property = "arriveCity", column = "ArriveCity"),
            @Result(column = "ProcueId", property = "pro",
                    one = @One(select = "com.xr.boot.dao.accBusinessAdmissibility.AccProductListMapper.findAccProListByid", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "reservationTime", column = "ReservationTime")
    })
    List<AccBusinessAdmissibility> findAllAccBusinessAdmissibility();

    /**
     * 业务受理多条件查询
     * @param accBusinessAdmissibility
     * @return
     */
    @SelectProvider(type = AccBusinessAdmissibilitySql.class,method = "findAccBusinessAdmissibilityWhere")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "businessNoticeNo", column = "businessNoticeNo"),
            @Result(property = "customName", column = "CustomName"),
            @Result(property = "linkman", column = "Linkman"),
            @Result(property = "telPhone", column = "telPhone"),
            @Result(property = "pickupAddress", column = "PickupAddress"),
            @Result(property = "arriveCity", column = "ArriveCity"),
            @Result(column = "ProcueId", property = "pro",
                    one = @One(select = "com.xr.boot.dao.accBusinessAdmissibility.AccProductListMapper.findAccProListByid", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "reservationTime", column = "ReservationTime")
    })
    List<AccBusinessAdmissibility> findAllWhereAccBusinessAdmissibility(AccBusinessAdmissibility accBusinessAdmissibility);
}
