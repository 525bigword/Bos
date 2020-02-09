package com.xr.boot.dao.log;

import com.xr.boot.dao.PacPackaging.provider.PacManegementSql;
import com.xr.boot.dao.log.provider.LogLogisticsSql;
import com.xr.boot.entity.LogLogistics;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface LogLogisticssMapper {
    /**
     * 跟踪表查询
     */
    @Select("select id,LogisticsInt,LineName,StartCompany,GeneratePerson,CarInt,Driver,DriverPhone,CarType,LogisticsState,IsCancel from log_logistics")
    @Results({
            @Result(id=true,column ="ID",property = "id"),
            @Result(column = "LogisticsInt", property = "logisticsInt"),
            @Result(column = "LineName", property = "lineName"),
            @Result(column = "StartCompany", property = "startCompany"),
            @Result(column = "GeneratePerson", property = "generatePerson"),
            @Result(column = "CarInt", property = "carInt"),
            @Result(column = "Driver", property = "driver"),
            @Result(column = "carInt", property = "carInt"),
            @Result(column = "driverPhone", property = "driverPhone"),
            @Result(column = "CarType", property = "carType"),
            @Result(column = "LogisticsState", property = "logisticsState"),
            @Result(column = "IsCancel", property = "isCancel")
    })
    List<LogLogistics> findAllLogLogistics();
    /**
     * 跟踪表多条件查询
     */
    @SelectProvider(type = LogLogisticsSql.class,method = "findLogLogisticsWhere")
    @Results({
            @Result(id=true,column ="ID",property = "id"),
            @Result(column = "LogisticsInt", property = "logisticsInt"),
            @Result(column = "LineName", property = "lineName"),
            @Result(column = "StartCompany", property = "startCompany"),
            @Result(column = "GeneratePerson", property = "generatePerson"),
            @Result(column = "CarInt", property = "carInt"),
            @Result(column = "Driver", property = "driver"),
            @Result(column = "carInt", property = "carInt"),
            @Result(column = "driverPhone", property = "driverPhone"),
            @Result(column = "CarType", property = "carType"),
            @Result(column = "LogisticsState", property = "logisticsState"),
            @Result(column = "IsCancel", property = "isCancel")
    })
    List<LogLogistics> findAllWhereLogLogistics(LogLogistics logLogistics);
}
