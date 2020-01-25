package com.xr.boot.dao.basicPackage;

import com.xr.boot.dao.basicPackage.provider.BasAreaSqlProvider;
import com.xr.boot.entity.BasArea;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BasAreaMapper {
    @SelectProvider(type = BasAreaSqlProvider.class,method = "findBasAreabyWhere")
    @Results({
            @Result(id=true,column ="ID",property = "id"),
            @Result(column ="Province",property = "province"),
            @Result(column = "City", property = "city"),
            @Result(column = "County", property = "county"),
            @Result(column = "PostalCode", property = "postalCode"),
            @Result(column = "SimpleCode", property = "simpleCode"),
            @Result(column = "CityCode", property = "cityCode"),
            @Result(column = "EntryUnitID", property = "entryUnit",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "ComplementUnitID", property = "complementUnit",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "Nature", property = "nature"),
            @Result(column = "TheArea", property = "theArea"),
            @Result(column = "OperatorID", property = "syEmp",
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationTime", property = "operationTime")
    })
    List<BasArea> findBasAreas(BasArea basArea);
    @Update("update bas_area set EntryUnitID=#{entryUnitID},Nature=#{nature},TheArea=#{theArea} where id=#{id}")
    void upBasAreaById(int id);


    @Insert("insert into bas_area(ID,Province,City,County,PostalCode,SimpleCode,CityCode,EntryUnitID,ComplementUnitID,Nature,TheArea,OperatorID,OperationTime) VALUES(NULL,#{province},#{city},#{county},#{postalCode},#{simpleCode},#{cityCode},#{entryUnitID},#{complementUnitID},#{nature},#{theArea},#{empId},NOW())")
    void saveBasArea(BasArea basArea);
}
