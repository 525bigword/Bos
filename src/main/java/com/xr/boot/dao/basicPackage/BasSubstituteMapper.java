package com.xr.boot.dao.basicPackage;

import com.xr.boot.dao.basicPackage.provider.BasSubstituteSqlProvider;
import com.xr.boot.entity.BasSubstitute;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BasSubstituteMapper {
    @SelectProvider(type = BasSubstituteSqlProvider.class,method = "findBasSubstitutebyWhere")
    @Results({
            @Result(id=true,column = "ID",property = "id"),
            @Result(column = "EmpNo",property = "empNo"),
            @Result(column = "EmpName",property = "empName"),
            @Result(column = "MobileNo",property = "mobileNo"),
            @Result(column = "Type",property = "basBasicArchivesEntry",
                one = @One(select = "com.xr.boot.dao.basicPackage.BasBasicArchivesEntryMapper.findBasBasicArchivesEntryById",fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "PDA",property = "pda"),
            @Result(column = "StandardKg",property = "standardKg"),
            @Result(column = "StandardLength",property = "standardLength"),
            @Result(column = "Models",property = "models"),
            @Result(column = "PlateInt",property = "plateInt"),
            @Result(column = "InvalidateMark",property = "invalidateMark"),
            @Result(column = "OperatorID", property = "syEmp",
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationUnitID", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationTime",property = "operationTime")
    })
    List<BasSubstitute> findBasSubstitutes(BasSubstitute basSubstitute);

    @Update("update bas_substitute set InvalidateMark=#{invalidateMark} where id=#{id}")
    void upBasSubstituteStateById(BasSubstitute basSubstitute);

    @Update("update bas_substitute set EmpNo=#{empNo},EmpName=#{empName},MobileNo=#{mobileNo},Type=#{type},PDA=#{pda},StandardKg=#{standardKg},StandardLength=#{standardLength},Models=#{models},PlateInt=#{plateInt},InvalidateMark=#{invalidateMark} where ID=#{id}")
    void upBasSubstituteById(BasSubstitute basSubstitute);

    @Insert("INSERT into bas_substitute(ID,EmpNo,EmpName,MobileNo,Type,PDA,StandardKg,StandardLength,Models,PlateInt,InvalidateMark,OperatorID,OperationUnitID,OperationTime) VALUES(null,#{empNo},#{empName},#{mobileNo},#{type},#{pda},#{standardKg},#{standardLength},#{models},#{plateInt},#{invalidateMark},#{empId},#{unitId},NOW())")
    void saveBasSubstitute(BasSubstitute basSubstitute);

    @Select("select EmpNo from bas_substitute where empNo=#{empNo}")
    @Results({
            @Result(column = "EmpNo", property = "empNo")
    })
    List<String> findBasSubstituteByEmpNo(BasSubstitute basSubstitute);
}
