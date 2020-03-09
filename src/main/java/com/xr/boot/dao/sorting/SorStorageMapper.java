package com.xr.boot.dao.sorting;

import com.xr.boot.dao.sorting.provider.SorStorageProviderSql;
import com.xr.boot.entity.SorStorage;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SorStorageMapper {
    @Insert("insert into sor_storage values(#{id},#{acceptDate},#{acceptperson},#{acceptCompany},#{packageID})")
    void saveSorStorage(SorStorage sorStorage);
    /**根据条件动态查询sor_storage*/
    @SelectProvider(type = SorStorageProviderSql.class,method = "findSorStorageByWhere")
    @Results({
            @Result(property = "acceptpersonname",column = "AcceptPerson",
                one = @One(
                        select = "com.xr.boot.dao.system.SyEmpMapper.findSyEmpNameById"
                )
            )
    })
    List<SorStorage> findSorStorageByWhere(SorStorage sorStorage);
}
