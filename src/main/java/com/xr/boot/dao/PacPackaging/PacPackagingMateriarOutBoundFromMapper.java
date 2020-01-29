package com.xr.boot.dao.PacPackaging;

import com.xr.boot.entity.PacPackagingMateriarOutBoundFrom;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PacPackagingMateriarOutBoundFromMapper {
    //查询所有出库记录
    @Select("select id,outboundNumber,outboundType,transportSlip,affiliatedUnit,issuedByTheUnit,OperatorUnit,OperEmpNo,clienterid,recipientsTime from Pac_PackagingMateriarOutBoundFrom")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "outboundNumber", column = "outboundNumber"),
            @Result(column = "outboundType", property = "pacOutType",
                    one = @One(select = "com.xr.boot.dao.PacPackaging.PacOutTypeMapper.findpacOutTypeById", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "transportSlip", column = "transportSlip"),
            @Result(column = "affiliatedUnit", property = "saffiliatedUnit",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "issuedByTheUnit", property = "sissuedByTheUnit",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "operatorUnit", property = "sosperatorUnit",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "operEmpNo", property = "syEmpno",
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpByEmpNo", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "clienterid", property = "syEmpc",
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "recipientsTime", column = "recipientsTime"),
    })
    public List <PacPackagingMateriarOutBoundFrom> findAllPacOutBoundFrom();
    //新增出库记录
    @Insert("insert into Pac_PackagingMateriarOutBoundFrom(outboundNumber,outboundType,transportSlip,affiliatedUnit,issuedByTheUnit,OperatorUnit,OperEmpNo,clienterid,recipient,recipientsTime,single,orderTime) values(#{outboundNumber},#{outboundType},#{transportSlip},#{affiliatedUnit},#{issuedByTheUnit},#{operatorUnit},#{operEmpNo},#{clienterid},#{recipient},#{recipientsTime},#{single},#{orderTime})")
    public void insertPacPackagingOutFrom(PacPackagingMateriarOutBoundFrom pacPackagingMateriarOutBoundFrom);
}