package com.xr.boot.dao.basicPackage;

import com.xr.boot.dao.basicPackage.provider.BasBasicArchiveSqlProvider;
import com.xr.boot.entity.BasBasicArchives;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BasBasicArchiveMapper {
    @SelectProvider(type = BasBasicArchiveSqlProvider.class,method = "findBasBasicArchivebyWhere")
    @Results({
            @Result(id=true,column ="ID",property = "id"),
            @Result(column ="BasicFileNumber",property = "basicFileNumber"),
            @Result(column = "Name", property = "name"),
            @Result(column = "Grade", property = "grade"),
            @Result(column = "Remarks", property = "remarks"),
            @Result(column = "OperatorID", property = "syEmp",
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationUnitID", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationTime", property = "operationTime")
    })
    List<BasBasicArchives> findBasicArchives(BasBasicArchives basBasicArchive);

    @Select("select `name` from bas_basicarchives where `name`=#{name}")
    @Results({
            @Result(column = "Name", property = "name")
    })
    List<String> findBasBasicArchivesByName(String name);

    @Update("update bas_basicarchives set Grade=#{grade},Remarks=#{remarks} where Id=#{id}")
    void upBasBasicArchivesById(BasBasicArchives basBasicArchive);

    @Delete("delete from bas_basicarchives where id=#{id}")
    void delBasBasicArchivesById(BasBasicArchives basBasicArchive);

    @Insert("insert into bas_basicarchives(id,BasicFileNumber,`Name`,Grade,OperatorID,OperationUnitID,Remarks,OperationTime) VALUES(null,#{basicFileNumber},#{name},#{grade},#{empId},#{unitId},#{remarks},NOW())")
    void saveBasBasicArchives(BasBasicArchives basBasicArchive);
}
