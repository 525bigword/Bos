package com.xr.boot.dao.PacPackaging;

import com.xr.boot.entity.PacPackaging;
import com.xr.boot.entity.SyEmp;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PacPackagingMapper {
    @Select("select id,ItemCode,ItemName,PlannedPrice,Specifications,type,MeasurementUnit,`Status` from PAC_Packaging;")
    List<PacPackaging> queryAllpacpackaging();
    @Select("select id,ItemCode,ItemName,PlannedPrice,Specifications,type,MeasurementUnit,`Status` from PAC_Packaging where id=#{id};")
    PacPackaging findOnebyid(int id);
    @Select(value = {" <script>" +
            " SELECT * FROM kuser " +
            " <where> 1=1 " +
            " <if test=\"itemCode != null\"> AND itemCode=#{itemCode}</if> " +
            " <if test=\"itemName != null\" >  AND itemName=#{itemName}</if> " +
            " <if test=\"plannedPrice != null\" >  AND plannedPrice=#{plannedPrice}</if> " +
            " <if test=\"specifications != null\" >  AND specifications=#{specifications}</if> " +
            " <if test=\"type != null\" >  AND type=#{type}</if> " +
            " <if test=\"status != null\" >  AND status=#{status}</if> " +
            " </where>" +
            " </script>"})
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "itemCode", column = "itemCode"),
            @Result(property = "itemName", column = "itemName"),
            @Result(property = "plannedPrice", column = "plannedPrice"),
            @Result(property = "specifications", column = "specifications"),
            @Result(property = "type", column = "type"),
            @Result(property = "measurementUnit", column = "measurementUnit"),
            @Result(property = "status", column = "status")
    })
    List<PacPackaging> findWherepacpackaging(PacPackaging pacPackaging);
    @Insert("insert into PAC_Packaging(itemCode,ItemName,PlannedPrice,Specifications,type,MeasurementUnit,`Status`,OperatorID,OperationUnitID,OperationTime) values(#{itemCode},#{itemName},#{plannedPrice},#{specifications},#{type},#{measurementUnit},#{status},#{operatorId},#{operationUnitid},#{operationTime});")
   void addPacpackaging(PacPackaging pacPackaging);
    @Update("update PAC_Packaging set ItemCode=#{itemCode},ItemName=#{itemName},PlannedPrice=#{plannedPrice},Specifications=#{specifications},type=#{type},MeasurementUnit=#{measurementUnit},`Status`=#{status},OperatorID=#{operatorId},OperationUnitID=#{operationUnitid},OperationTime=#{operationTime} where id=#{id};")
    void updatePacpackaging(PacPackaging pacPackaging);
    @Update("update PAC_Packaging set status=#{status},InvalidateJobInt=#{invalidateJobInt},invalidateName=#{invalidateName},invalidateTime=#{invalidateTime} where id=#{id}")
    void updatePaczuofei(PacPackaging pacPackaging);
    @Select("select id,empunit from sy_emp where empName=#{empName}")
    SyEmp selectIdbyname(String empName);

}
