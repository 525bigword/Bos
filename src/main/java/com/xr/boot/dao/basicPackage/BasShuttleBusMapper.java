package com.xr.boot.dao.basicPackage;

import com.xr.boot.dao.basicPackage.provider.BasShuttleBusSqlProvider;
import com.xr.boot.entity.BasShuttleBus;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BasShuttleBusMapper {
    @SelectProvider(type = BasShuttleBusSqlProvider.class,method = "findBasShuttleBusbyWhere")
    @Results({
            @Result(id=true,column ="ID",property = "id"),
            @Result(column = "LineType", property = "lineType"),
            @Result(column = "lineID", property = "logLogistics",
                    one = @One(select = "com.xr.boot.dao.basicPackage.LogLogisticsMapper.findLogLogisticsById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "LicensePlateInt", property = "licensePlateInt"),
            @Result(column = "Carrier", property = "carrier"),
            @Result(column = "Models", property = "models"),
            @Result(column = "Driver", property = "driver"),
            @Result(column = "Telephone", property = "telephone"),
            @Result(column = "Ton", property = "ton"),
            @Result(column = "Remarks", property = "remarks"),
            @Result(column = "OperatorID", property = "syEmp",
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationUnitID", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationTime", property = "operationTime")
    })
    List<BasShuttleBus> findBasShuttleBus(BasShuttleBus basShuttleBus);

    @Update("update bas_shuttlebus set lineType=#{lineType},lineID=#{lineID},LicensePlateInt=#{licensePlateInt},Carrier=#{carrier},Models=#{models},Driver=#{driver},Telephone=#{telephone},Ton=#{ton},Remarks=#{remarks} where id=#{id}")
    void upBasShuttleBusById(BasShuttleBus basShuttleBus);

    @Delete("delete from bas_shuttlebus where id=#{id}")
    void delBasShuttleBusById(BasShuttleBus basShuttleBus);

    @Insert("insert into bas_shuttlebus(ID,LineType,lineID,LicensePlateInt,Carrier,Models,Driver,Telephone,Ton,Remarks,OperationUnitID,OperatorID,OperationTime) values(null,#{lineType},#{lineID},#{licensePlateInt},#{carrier},#{models},#{driver},#{telephone},#{ton},#{remarks},#{unitId},#{empId},NOW())")
    void saveBasShuttleBus(BasShuttleBus basShuttleBus);
}
