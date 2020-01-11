package com.xr.boot.dao.system;

import com.xr.boot.entity.SyUnits;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface SyUnitsMapper {
    @Select("select ID,`Name`,Remarks,OperatorID,parentid,OperationTime,Stats from sy_units where " +
            "id=#{operationUnitid}")
    @Results({
            @Result(id = true, column = "ID", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "remarks", property = "remarks"),
            @Result(column = "OperatorID",property = "operatorid"),
            @Result(column = "OperationTime", property = "operationTime"),
            @Result(column = "parentid",property = "parentid"),
            @Result(column = "Stats", property = "stats")
    })
    SyUnits findSyUnitById(@Param("operationUnitid") Integer operationUnitid);


    @Select("select ID,`Name`,Remarks,OperatorID,parentid,OperationTime,Stats from sy_units where " +
            "id=#{operationUnitid}")
    @Results({
            @Result(id = true, column = "ID", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "remarks", property = "remarks"),
            @Result(column = "OperatorID",property = "operatorid"),
            @Result(column = "OperationTime", property = "operationTime"),
            @Result(column = "parentid",property = "parentid"),
            @Result(column = "Stats", property = "stats")
    })
    SyUnits findSyUnitAllById(@Param("operationUnitid") Integer operationUnitid);

}
