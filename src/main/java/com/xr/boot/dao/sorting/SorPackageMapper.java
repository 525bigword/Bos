package com.xr.boot.dao.sorting;

import com.xr.boot.entity.SorPackage;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface SorPackageMapper {
    /**新增SorPackageMapper*/
    @Insert("insert into sor_package values(#{id},#{packageperson},#{sealInt},#{destination},#{reckonDes}," +
            "#{timeLimit},#{ticketSum},#{cargoSum},#{weightSum},#{volumeSum},#{state},#{ask})")
    void saveSorPackage(SorPackage sorPackage);
}
