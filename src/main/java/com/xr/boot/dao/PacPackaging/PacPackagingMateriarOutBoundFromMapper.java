package com.xr.boot.dao.PacPackaging;

import com.xr.boot.entity.PacPackagingMateriarOutBoundFrom;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PacPackagingMateriarOutBoundFromMapper {
    @Select("select id,outboundNumber,outboundType，transportSlip,affiliatedUnit,assuedByTheUnit,operatorUnit,operatorName,clienterName,recipientsTime from Pac_PackagingMateriarOutBoundFrom")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "outboundNumber", column = "outboundNumber"),
            @Result(column = "outboundType", property = "pacOutType",
                    one = @One(select = "com.xr.boot.dao.PacPackaging.PacOutTypeMapper.findpacOutTypeById", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "transportSlip", column = "transportSlip"),
            @Result(column = "affiliatedUnit", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "assuedByTheUnit", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "operatorUnit", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "operatorName", property = "syEmp",
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "clienterName", property = "syEmp",
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "recipientsTime", column = "recipientsTime"),
    })
    public List <PacPackagingMateriarOutBoundFrom> findAllPacOutBoundFrom();
}