package com.xr.boot.dao.basicPackage;

import com.xr.boot.dao.basicPackage.provider.BasStandarTimeSqlProvider;
import com.xr.boot.entity.BasStandarTime;
import com.xr.boot.entity.SyUnits;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BasStandarTimeMapper {
    @SelectProvider(type = BasStandarTimeSqlProvider.class,method = "findBasStandarTimebyWhere")
    @Results({
            @Result(id=true,column = "ID",property = "id"),
            @Result(column = "TimeName",property = "timeName"),
            @Result(column = "WorkingTime",property = "workingTime"),
            @Result(column = "ClosingTime",property = "closingTime"),
            @Result(column = "SaturdayWorkingTime",property = "saturdayWorkingTime"),
            @Result(column = "SaturdayClosingTime",property = "saturdayClosingTime"),
            @Result(column = "SundayWorkingTime",property = "sundayWorkingTime"),
            @Result(column = "SundayClosingTime",property = "sundayClosingTime"),
            @Result(column = "Stats",property = "stats"),
            @Result(column = "SubordinateUnit", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            )
    })
    List<BasStandarTime> findBasStandarTimes(BasStandarTime basStandarTime);

    @Update("update bas_standartime set SubordinateUnit=#{unitId},WorkingTime=#{workingTime},ClosingTime=#{closingTime},SaturdayWorkingTime=#{saturdayWorkingTime},SaturdayClosingTime=#{saturdayClosingTime},SundayWorkingTime=#{sundayWorkingTime},SundayClosingTime=#{sundayClosingTime} where ID=#{id}")
    void upBasStandarTimeById(BasStandarTime basStandarTime);

    @Insert("insert into bas_standartime(ID,TimeName,SubordinateUnit,WorkingTime,ClosingTime,SaturdayWorkingTime,SaturdayClosingTime,SundayWorkingTime,SundayClosingTime,Stats) VALUES(null,#{timeName},#{unitId},#{workingTime},#{closingTime},#{saturdayWorkingTime},#{saturdayClosingTime},#{sundayWorkingTime},#{sundayClosingTime},0)")
    void saveBasStandarTime(BasStandarTime basStandarTime);

    @Delete("DELETE from bas_standartime where ID=#{id}")
    void delBasStandarTime(int id);

    @Select("select TimeName from bas_standartime where TimeName=#{timeName} and SubordinateUnit=#{unitId}")
    @Results({
            @Result(column = "TimeName", property = "timeName")
    })
    List<String> findBasStandarTimeByTimeName(BasStandarTime basStandarTime);
    @Select("SELECT ID,TimeName,SubordinateUnit,WorkingTime,ClosingTime,SaturdayWorkingTime,SaturdayClosingTime,SundayWorkingTime,SundayClosingTime,Stats from bas_standartime where ID=#{basStandardTimeId}")
    @Results({
            @Result(id=true,column = "ID",property = "id"),
            @Result(column = "TimeName",property = "timeName"),
            @Result(column = "WorkingTime",property = "workingTime"),
            @Result(column = "ClosingTime",property = "closingTime"),
            @Result(column = "SaturdayWorkingTime",property = "saturdayWorkingTime"),
            @Result(column = "SaturdayClosingTime",property = "saturdayClosingTime"),
            @Result(column = "SundayWorkingTime",property = "sundayWorkingTime"),
            @Result(column = "SundayClosingTime",property = "sundayClosingTime"),
            @Result(column = "Stats",property = "stats"),
            @Result(column = "SubordinateUnit", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            )
    })
    BasStandarTime findBasAssociateMemberById(int basStandardTimeId);

    @Select("SELECT ID,TimeName,SubordinateUnit from bas_standartime where SubordinateUnit=#{id}")
    @Results({
            @Result(id=true,column = "ID",property = "id"),
            @Result(column = "TimeName",property = "timeName"),
            @Result(column = "SubordinateUnit", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            )
    })
    List<BasStandarTime> findBasAssociateMemberByUId(SyUnits syUnits);
}
