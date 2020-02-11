package com.xr.boot.dao.basicPackage;

import com.xr.boot.entity.BasAssociateMember;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BasAssociatememberMapper {
    @Select("select ID,ZoneCode,EmpNo,EmpName,StandardKg,StandardLength,StandardTimeId,SubordinateUnit,type from bas_associatemember ORDER BY ID desc")
    @Results({
            @Result(id=true,column = "ID",property = "id"),
            @Result(column = "EmpNo",property = "empNo"),
            @Result(column = "EmpName",property = "empName"),
            @Result(column = "ZoneCode",property = "zoneCode"),
            @Result(column = "StandardKg",property = "standardKg"),
            @Result(column = "StandardLength",property = "standardLength"),
            @Result(column = "StandardTimeId", property = "basStandardTime",
                    one = @One(select = "com.xr.boot.dao.basicPackage.BasStandarTimeMapper.findBasAssociateMemberById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "SubordinateUnit", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "type",property = "type")
    })
    List<BasAssociateMember> findBasAssociateMember();

    @Update("update bas_associatemember set StandardTimeId=#{standardTimeId},SubordinateUnit=#{unitId},type=#{type} where ID=#{id}")
    void upBasAssociateMemberById(BasAssociateMember basAssociateMember);

    @Update("UPDATE bas_associatemember set ZoneCode=#{zoneCode} where ID=#{id}")
    void upBasAssociateMemberByZoneCode(BasAssociateMember basAssociateMember);

    @Insert("insert into bas_associatemember(ID,EmpNo,EmpName,StandardKg,StandardLength,StandardTimeId,SubordinateUnit,type) VALUES(NULL,#{empNo},#{empName},#{standardKg},#{standardLength},#{standardTimeId},#{unitId},#{type})")
    void saveBasAssociateMember(BasAssociateMember basAssociateMember);

    @Delete("delete from bas_associatemember where ID=#{id}")
    void delBasAssociateMemberById(BasAssociateMember basAssociateMember);

    @Select("select EmpNo from bas_associatemember where empNo=#{empNo}")
    @Results({
            @Result(column = "EmpNo", property = "empNo")
    })
    List<String> findBasAssociateMemberByEmpNo(BasAssociateMember basAssociateMember);

    @Select("select ID,ZoneCode,EmpNo,EmpName,StandardKg,StandardLength,StandardTimeId,SubordinateUnit,type from bas_associatemember where ZoneCode is NULL or ZoneCode=#{zoneCode}")
    @Results({
            @Result(id=true,column = "ID",property = "id"),
            @Result(column = "EmpNo",property = "empNo"),
            @Result(column = "EmpName",property = "empName"),
            @Result(column = "ZoneCode",property = "zoneCode"),
            @Result(column = "StandardKg",property = "standardKg"),
            @Result(column = "StandardLength",property = "standardLength"),
            @Result(column = "StandardTimeId", property = "basStandardTime",
                    one = @One(select = "com.xr.boot.dao.basicPackage.BasStandarTimeMapper.findBasAssociateMemberById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "SubordinateUnit", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "type",property = "type")
    })
    List<BasAssociateMember> findBasAssociateMemberByZoneCode(String zoneCode);
}