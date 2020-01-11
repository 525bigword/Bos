package com.xr.boot.dao.system;

import com.xr.boot.entity.SyUnits;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface SyUnitsMapper {

    @Select("select ID,`Name`,Remarks,OperatorID,parentid,OperationTime,Stats from sy_units where id=#{operationUnitid}")
    @Results({
            @Result(id = true, column = "ID", property = "id"),
            @Result(column = "Name", property = "name"),
            @Result(column = "Remarks", property = "remarks"),
            @Result(column = "OperatorID",property = "operatorid"),
            @Result(column = "parentid",property = "parentid"),
            @Result(column = "OperationTime", property = "operationTime"),
            @Result(column = "Stats", property = "stats")
    })
    SyUnits findSyUnitById(Integer operationUnitid);

}
