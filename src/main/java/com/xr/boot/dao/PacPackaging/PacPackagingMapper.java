package com.xr.boot.dao.PacPackaging;

import com.xr.boot.entity.PacPackaging;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PacPackagingMapper {
    @Select("select id,ItemCode,ItemName,PlannedPrice,Specifications,type,MeasurementUnit,`Status` from PAC_Packaging;")
    List<PacPackaging> queryAllpacpackaging();
    @Insert("insert into PAC_Packaging(ItemCode,ItemName,PlannedPrice,Specifications,type,MeasurementUnit,`Status`,OperatorID,OperationUnitID,OperationTime) values(#{ItemCode},#{ItemName},#{PlannedPrice},#{Specifications},#{type},#{MeasurementUnit},#{Status},#{OperatorID},#{OperationUnitID},#{OperationTime});")
   void addPacpackaging(PacPackaging pacPackaging);
    @Update("update PAC_Packaging set ItemCode=#{ItemCode},ItemName=#{ItemName},PlannedPrice=#{PlannedPrice},Specifications=#{Specifications},type=#{type},MeasurementUnit=#{MeasurementUnit},`Status`=#{Status},OperatorID=#{OperatorID},OperationUnitID=#{OperationUnitID},OperationTime=#{OperationTime} where id=#{id};")
    void updatePacpackaging(PacPackaging pacPackaging);
}
