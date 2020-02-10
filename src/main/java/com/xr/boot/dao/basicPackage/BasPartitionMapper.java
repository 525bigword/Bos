package com.xr.boot.dao.basicPackage;

import com.xr.boot.dao.basicPackage.provider.BasPartitionSqlProvider;
import com.xr.boot.entity.BasPartition;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BasPartitionMapper {
    @SelectProvider(type = BasPartitionSqlProvider.class,method = "findBasPartitionByWhere")
    @Results({
            @Result(id=true,column = "ID",property = "id"),
            @Result(column = "Province",property = "province"),
            @Result(column = "City",property = "city"),
            @Result(column = "County",property = "county"),
            @Result(column = "SortingCode",property = "sortingCode"),
            @Result(column = "ZoneCode",property = "zoneCode"),
            @Result(column = "Keyword",property = "keyword"),
            @Result(column = "StartInt",property = "startInt"),
            @Result(column = "TerminateInt",property = "terminateInt"),
            @Result(column = "SDInt",property = "sDInt"),
            @Result(column = "Stats",property = "stats"),
            @Result(column = "OperatorID", property = "syEmp",
                    one = @One(select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationUnitID", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(column = "OperationTime", property = "operationTime")
    })
    List<BasPartition> findBasPartitions(BasPartition basPartition);

    @Update("update bas_partition set Province=#{province},City=#{city},ZoneCode=#{zoneCode},County=#{county},Keyword=#{keyword},StartInt=#{startInt},TerminateInt=#{terminateInt},SDInt=#{sDInt} where ID=#{id}")
    void upBasPartitionById(BasPartition basPartition);

    @Insert("insert into bas_partition(ID,Province,City,County,SortingCode,ZoneCode,Keyword,StartInt,TerminateInt,SDInt,Stats,OperatorID,OperationUnitID,OperationTime) VALUES(null,#{province},#{city},#{county},#{sortingCode},#{zoneCode},#{keyword},#{startInt},#{terminateInt},#{sDInt},0,#{empId},#{unitId},NOW())")
    void saveBasPartition(BasPartition basPartition);

    @Delete("delete from bas_partition where ID=#{id}")
    void delBasPartition(int id);
}
