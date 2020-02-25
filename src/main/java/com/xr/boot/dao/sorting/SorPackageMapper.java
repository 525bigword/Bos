package com.xr.boot.dao.sorting;

import com.xr.boot.dao.sorting.provider.SorPackageMapperProviderSql;
import com.xr.boot.entity.SorPackage;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SorPackageMapper {
    /**新增SorPackageMapper*/
    @Insert("insert into sor_package values(#{id},#{packageperson},#{sealInt},#{destination},#{reckonDes}," +
            "#{timeLimit},#{ticketSum},#{cargoSum},#{weightSum},#{volumeSum},#{state},#{ask})")
    void saveSorPackage(SorPackage sorPackage);
    /**查询所有合包SorPackageMapper*/
    @SelectProvider(type = SorPackageMapperProviderSql.class,method = "findWhere")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "PackagePerson",property = "packagepersonname",
                one=@One(
                        select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpNameById"
                )
            ),
            @Result(column = "SealInt",property = "sealInt"),
            @Result(column = "Destination",property = "destination"),
            @Result(column = "ReckonDes",property = "reckonDes"),
            @Result(column = "TimeLimit",property = "timeLimit"),
            @Result(column = "TicketSum",property = "ticketSum"),
            @Result(column = "CargoSum",property = "cargoSum"),
            @Result(column = "WeightSum",property = "weightSum"),
            @Result(column = "VolumeSum",property = "volumeSum"),
            @Result(column = "State",property = "state"),
            @Result(column = "Ask",property = "ask"),

    })
    List<SorPackage> findSorPackage(SorPackage sorPackage);
}
