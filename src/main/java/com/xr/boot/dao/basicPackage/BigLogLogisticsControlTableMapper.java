package com.xr.boot.dao.basicPackage;

import com.xr.boot.dao.basicPackage.provider.BigLogLogisticsControlTableSqlProvider;
import com.xr.boot.entity.BigLogLogisticsControlTable;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BigLogLogisticsControlTableMapper {
    @SelectProvider(type = BigLogLogisticsControlTableSqlProvider.class,method = "findBigLogLogisticsControlTablebyWhere")
    @Results({
            @Result(id = true,column = "ID",property = "id"),
            @Result(column = "WorkSheetNo",property = "workSheetNo"),
            @Result(column = "CType",property = "cType"),
            @Result(column = "Corporation",property = "corporation"),
            @Result(column = "WaybillID",property = "waybillID"),
            @Result(column = "Remarks",property = "remarks"),
            @Result(column = "InputPerson",property = "syEmp",
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "InputDate",property = "inputDate"),
            @Result(column = "InputCompany", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "Stats",property = "stats")
    })
    List<BigLogLogisticsControlTable> findBigLogLogisticsControlTables(BigLogLogisticsControlTable bigLogLogisticsControlTable);

    @Update("update biglog_logisticscontroltable set Corporation=#{corporation},Remarks=#{remarks} where ID=#{id}")
    void upBigLogLogisticsControlTableById(BigLogLogisticsControlTable bigLogLogisticsControlTable);

    @Insert("insert into biglog_logisticscontroltable(ID,WorkSheetNo,CType,Corporation,WaybillID,Remarks,InputPerson,InputDate,InputCompany,Stats) VALUES(null,#{workSheetNo},#{cType},#{corporation},#{waybillID},#{remarks},#{empId},NOW(),#{unitId},0)")
    void saveBigLogLogisticsControlTable(BigLogLogisticsControlTable bigLogLogisticsControlTable);


    @Delete("DELETE from biglog_logisticscontroltable where WorkSheetNo=#{workSheetNo}")
    void delBigLogLogisticsControlTableByWorkSheetNo(String workSheetNo);

}
