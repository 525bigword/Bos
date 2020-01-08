package com.xr.boot.dao;

import com.xr.boot.dao.provider.BasDeliveryStandardSqlProvider;
import com.xr.boot.entity.BasDeliveryStandard;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface BasDeliveryStandardMapper {
    @SelectProvider(type = BasDeliveryStandardSqlProvider.class,method = "findBasDeliveryStandardbyWhere")
    @Results({
            @Result(id=true,column ="BasicFileNumber",property = "basicFileNumber"),
            @Result(column = "Name", property = "name"),
            @Result(column = "MinWeight", property = "minWeight"),
            @Result(column = "MaxWeight", property = "maxWeight"),
            @Result(column = "OperatorID", property = "syEmp",
                    one = @One(select = "com.xr.boot.dao.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationUnitID", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationTime", property = "operationTime"),
            @Result(column = "Status", property = "status")
    })
    List<BasDeliveryStandard> findBasDeliveryStandards(BasDeliveryStandard basDeliveryStandard);
}
