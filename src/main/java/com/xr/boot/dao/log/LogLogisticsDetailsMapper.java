package com.xr.boot.dao.log;

import com.xr.boot.entity.LogLogisticsDetails;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface LogLogisticsDetailsMapper {
    /**
     * 根据物流序号查询物流详情表
     */
    @Select("select id,LogisticsInt,CompanyName,ExpectArrivalDate,ActualArrivalDate,ExpectDepartureDate,ActualDepartureDate,OperationPerson,LogisticsType from log_logisticsDetails where logisticsInt=#{logisticsInt}")
    @Results({
            @Result(id=true,column ="ID",property = "id"),
            @Result(column = "LogisticsInt", property = "logisticsInt"),
            @Result(column = "CompanyName", property = "companyName"),
            @Result(column = "ExpectArrivalDate", property = "expectArrivalDate"),
            @Result(column = "ActualArrivalDate", property = "actualArrivalDate"),
            @Result(column = "ExpectDepartureDate", property = "expectDepartureDate"),
            @Result(column = "ActualDepartureDate", property = "actualDepartureDate"),
            @Result(column = "OperationPerson", property = "operationPerson"),
            @Result(column = "LogisticsType", property = "logisticsType")
    })
   List<LogLogisticsDetails> findAllLogLogisticsDetailsByLogisticsInt(String logisticsInt);
}
