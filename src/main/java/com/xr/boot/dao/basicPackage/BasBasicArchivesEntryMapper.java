package com.xr.boot.dao.basicPackage;

import com.xr.boot.entity.BasBasicArchivesEntry;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BasBasicArchivesEntryMapper {
    @Select("select id,`name`,parentID,mnemonicCode,available,remarks,operatorid,operationunitid,operationtime from bas_basicarchivesentry where parentid=#{parentID}")
    @Results({
            @Result(id=true,column ="ID",property = "id"),
            @Result(column ="Name",property = "name"),
            @Result(column = "ParentID", property = "parentID"),
            @Result(column = "MnemonicCode", property = "mnemonicCode"),
            @Result(column = "Available", property = "available"),
            @Result(column = "Remarks", property = "remarks"),
            @Result(column = "OperatorID", property = "syEmp",
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationUnitID", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationTime", property = "operationTime")
    })
    List<BasBasicArchivesEntry> findBasBasicArchivesEntryByParentID(int parentID);
}
