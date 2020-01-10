package com.xr.boot.dao.basicPackage;

import com.xr.boot.dao.basicPackage.provider.BasDeliveryStandardSqlProvider;
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
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationUnitID", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationTime", property = "operationTime"),
            @Result(column = "Status", property = "status")
    })
    List<BasDeliveryStandard> findBasDeliveryStandards(BasDeliveryStandard basDeliveryStandard);

    @Select("select `name` from bas_deliverystandard where `name`=#{name}")
    @Results({
            @Result(column = "Name", property = "name")
    })
    List<String> findBasDeliveryStandardByName(String name);

    @Update("UPDATE bas_deliverystandard set `name`=#{name},minweight=#{minWeight},maxweight=#{maxWeight} where BasicFileNumber=#{basicFileNumber}")
    void upBasDeliveryStandardByBasicFileNumber(BasDeliveryStandard basDeliveryStandard);

    @Update("UPDATE bas_deliverystandard set `status`=#{status}  where BasicFileNumber=#{basicFileNumber}")
    void upBasDeliveryStandardStatus(BasDeliveryStandard basDeliveryStandard);

}
