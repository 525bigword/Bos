package com.xr.boot.service;

import com.xr.boot.entity.SyUnits;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SyUnitsMapper {
    @Select("select ID,`Name`,Remarks,OperatorID,OperationTime,Stats from sy_units where id=#{operationUnitid}")
    @Results({
            @Result(id = true, column = "ID", property = "id"),
            @Result(column = "Name", property = "name"),
            @Result(column = "Remarks", property = "remarks"),
            @Result(column = "OperationTime", property = "operationTime"),
            @Result(column = "Stats", property = "stats")
    })
    SyUnits findSyUnitById(Integer operationUnitid);
}
