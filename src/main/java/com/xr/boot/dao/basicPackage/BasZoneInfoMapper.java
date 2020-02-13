package com.xr.boot.dao.basicPackage;

import com.xr.boot.dao.basicPackage.provider.BasZoneInfoSqlProvider;
import com.xr.boot.entity.BasZoneInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BasZoneInfoMapper {
    @SelectProvider(type = BasZoneInfoSqlProvider.class,method = "findBasZoneInfobyWhere")
    @Results({
            @Result(column = "ZoneName",property = "zoneName"),
            @Result(column = "ZoneCode",property = "zoneCode"),
            @Result(column = "TelPhone",property = "telPhone"),
            @Result(column = "Stats",property = "stats"),
            @Result(column = "ZonePeople", property = "syEmp",
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "SubordinateUnit", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            )
    })
    List<BasZoneInfo> findBasZoneInfos(BasZoneInfo basZoneInfo);

    @Update("update bas_zoneinfo set ZonePeople=#{empId},TelPhone=#{telPhone},SubordinateUnit=#{unitId} where ZoneCode=#{zoneCode}")
    void upBasZoneInfoByID(BasZoneInfo basZoneInfo);

    @Insert("insert into bas_zoneinfo(ZoneName,ZoneCode,ZonePeople,TelPhone,SubordinateUnit,Stats) VALUES(#{zoneName},#{zoneCode},#{empId},#{telPhone},#{unitId},0)")
    void saveBasZoneInfo(BasZoneInfo basZoneInfo);

    @Update("update bas_zoneinfo set Stats=#{stats} where ZoneCode=#{zoneCode}")
    void upBasZoneInfoByStats(BasZoneInfo basZoneInfo);

    @Select("select ZoneName from bas_zoneinfo where ZoneName=#{zoneName}")
    @Results({
            @Result(column = "ZoneName", property = "zoneName")
    })
    List<String> findBasZoneInfoByZoneName(BasZoneInfo basZoneInfo);
}
