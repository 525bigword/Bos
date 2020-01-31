package com.xr.boot.dao.PacPackaging;

import com.xr.boot.dao.PacPackaging.provider.PacPackSqlll;
import com.xr.boot.entity.PacPackaging;
import com.xr.boot.entity.SyEmp;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PacPackagingMapper {
    @Select("select id,ItemCode,ItemName,PlannedPrice,Specifications,type,MeasurementUnit,`Status`,operatorId from PAC_Packaging order by id desc;")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "itemCode", column = "itemCode"),
            @Result(property = "itemName", column = "itemName"),
            @Result(property = "plannedPrice", column = "plannedPrice"),
            @Result(property = "specifications", column = "specifications"),
            @Result(column = "type", property = "pacOutBoundType",
                    one = @One(select = "com.xr.boot.dao.PacPackaging.PacOutBoundTypeMapper.findPacTypeById", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "measurementUnit", column = "measurementUnit"),
            @Result(property = "status", column = "status"), @Result(column = "operatorId", property = "syEmp",
            one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
    )
    })
    List<PacPackaging> queryAllpacpackaging();
    @Select("select id,ItemCode,ItemName,PlannedPrice,Specifications,type,MeasurementUnit,`Status`,operatorId,operationTime from PAC_Packaging where id=#{id};")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "itemCode", column = "itemCode"),
            @Result(property = "itemName", column = "itemName"),
            @Result(property = "plannedPrice", column = "plannedPrice"),
            @Result(property = "specifications", column = "specifications"),
            @Result(column = "type", property = "pacOutBoundType",
                    one = @One(select = "com.xr.boot.dao.PacPackaging.PacOutBoundTypeMapper.findPacTypeById", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "operationTime", column = "operationTime"),
            @Result(property = "measurementUnit", column = "measurementUnit"),
            @Result(property = "status", column = "status"),
            @Result(column = "operatorId", property = "syEmp",
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            )
    })
    PacPackaging findOnebyid(int id);
    @SelectProvider(type = PacPackSqlll.class,method = "findPacPackWhere")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "itemCode", column = "itemCode"),
            @Result(property = "itemName", column = "itemName"),
            @Result(property = "plannedPrice", column = "plannedPrice"),
            @Result(property = "specifications", column = "specifications"),
            @Result(column = "type", property = "pacOutBoundType",
                    one = @One(select = "com.xr.boot.dao.PacPackaging.PacOutBoundTypeMapper.findPacTypeById", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "measurementUnit", column = "measurementUnit"),
            @Result(property = "status", column = "status"), @Result(column = "operatorId", property = "syEmp",
            one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
    )
    })
    List<PacPackaging> findWherepacpackaging(PacPackaging pacPackaging);
    @Insert("insert into PAC_Packaging(itemCode,ItemName,PlannedPrice,Specifications,type,MeasurementUnit,`Status`,OperatorID,OperationUnitID,OperationTime) values(#{itemCode},#{itemName},#{plannedPrice},#{specifications},#{type},#{measurementUnit},#{status},#{operatorId},#{operationUnitid},#{operationTime});")
   void addPacpackaging(PacPackaging pacPackaging);
    @Update("update PAC_Packaging set ItemCode=#{itemCode},ItemName=#{itemName},PlannedPrice=#{plannedPrice},Specifications=#{specifications},type=#{type},`Status`=#{status} where id=#{id};")//,OperatorID=#{operatorId},OperationUnitID=#{operationUnitid},OperationTime=#{operationTime}
    void updatePacpackaging(PacPackaging pacPackaging);
    @Update("update PAC_Packaging set status=1 where id=#{id}")
    void updatePaczuofei(PacPackaging pacPackaging);
    @Select("select id,empunit from sy_emp where empName=#{empName}")
    SyEmp selectIdbyname(String empName);
    /**
     * 根据物品编码查物品信息
     */
    @Select("select id,ItemCode,ItemName,PlannedPrice,Specifications,type,MeasurementUnit,`Status`,operatorId,operationTime from PAC_Packaging where itemCode=#{itemCode};")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "itemCode", column = "itemCode"),
            @Result(property = "itemName", column = "itemName"),
            @Result(property = "plannedPrice", column = "plannedPrice"),
            @Result(property = "specifications", column = "specifications"),
            @Result(column = "type", property = "pacOutBoundType",
                    one = @One(select = "com.xr.boot.dao.PacPackaging.PacOutBoundTypeMapper.findPacTypeById", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "operationTime", column = "operationTime"),
            @Result(property = "measurementUnit", column = "measurementUnit"),
            @Result(property = "status", column = "status"),
            @Result(column = "operatorId", property = "syEmp",
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            )
    })
    PacPackaging findPacPackagingByitemcode(String itemCode);

}
