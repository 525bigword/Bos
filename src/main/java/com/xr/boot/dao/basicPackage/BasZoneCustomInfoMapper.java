package com.xr.boot.dao.basicPackage;

import com.xr.boot.entity.BasZoneCustomInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BasZoneCustomInfoMapper {
    @Select("select CustomCode,CustomName,MobileNo,CityName,CstomAddress,ZoneCode,OperatorID,OperationUnitID,OperationTime from bas_zonecustominfo where ZoneCode=#{zoneCode} order by OperationTime desc")
    @Results({
            @Result(id=true,column = "CustomCode",property = "customCode"),
            @Result(column = "CustomName",property = "customName"),
            @Result(column = "MobileNo",property = "mobileNo"),
            @Result(column = "CityName",property = "cityName"),
            @Result(column = "CstomAddress",property = "cstomAddress"),
            @Result(column = "ZoneCode",property = "zoneCode"),
            @Result(column = "OperatorID", property = "syEmp",
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationUnitID", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationTime",property = "operationTime")
    })
   List<BasZoneCustomInfo> findBasZoneCustomInfoByZoneCode(String zoneCode);

    @Delete("DELETE from bas_zonecustominfo where CustomCode=#{customCode}")
    void delBasZoneCustomInfoById(long customCode);

    @Update("update bas_zonecustominfo set CustomName=#{customName},MobileNo=#{mobileNo},CityName=#{cityName},CstomAddress=#{cstomAddress} where CustomCode=#{customCode}")
    void upBasZoneCustomInfoById(BasZoneCustomInfo basZoneCustomInfo);

    @Insert("insert into bas_zonecustominfo(CustomCode,CustomName,MobileNo,CityName,CstomAddress,OperatorID,OperationUnitID,OperationTime) values(null,#{customName},#{mobileNo},#{cityName},#{cstomAddress},#{empId},#{unitId},NOW())")
    void saveBasZoneCustomInfo(BasZoneCustomInfo basZoneCustomInfo);

    @Select("select CustomName from bas_zonecustominfo where CustomName=#{customName}")
    @Results({
            @Result(column = "CustomName", property = "customName")
    })
    List<String> findBasSubstituteByCustomName(BasZoneCustomInfo basZoneCustomInfo);
}
