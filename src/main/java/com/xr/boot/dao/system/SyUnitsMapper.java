package com.xr.boot.dao.system;

import com.xr.boot.entity.SyUnits;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    @Select("select ID,`Name`,Remarks,OperatorID,parentid,OperationTime,Stats from sy_units where stats=0")
    @Results({
            @Result(id = true, column = "ID", property = "id"),
            @Result(column = "Name", property = "name"),
            @Result(column = "Remarks", property = "remarks"),
            @Result(column = "OperatorID",property = "operatorid"),
            @Result(column = "parentid",property = "parentid"),
            @Result(column = "OperationTime", property = "operationTime"),
            @Result(column = "Stats", property = "stats")
    })
    List<SyUnits> findSyUnits();

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
    /**
     * 查询正常运作的所有单位
     * @param stats
     * @return
     */
    @Select("select ID,`Name`,Remarks,OperatorID,parentid,OperationTime,Stats from sy_units where " +
            "stats=#{stats}")
    @Results({
            @Result(id = true, column = "ID", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "remarks", property = "remarks"),
            @Result(column = "OperatorID",property = "operatorid"),
            @Result(column = "OperationTime", property = "operationTime"),
            @Result(column = "parentid",property = "parentid"),
            @Result(column = "Stats", property = "stats")
    })
    List<SyUnits> findSyUnitAllByStats(@Param("stats") Integer stats);

}
