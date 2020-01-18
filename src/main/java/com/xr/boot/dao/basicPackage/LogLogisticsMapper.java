package com.xr.boot.dao.basicPackage;

import com.xr.boot.entity.LogLogistics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface LogLogisticsMapper {
    @Select("select ID,LogisticsInt,LineName,StartCompany,GeneratePerson,CarInt,Driver,DriverPhone,CarType,LogisticsState,IsCancel from LOG_Logistics where id=#{lineID}")
    LogLogistics findLogLogisticsById(Integer lineID);
}
