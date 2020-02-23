package com.xr.boot.dao.sorting;

import com.xr.boot.entity.SorPackageDetails;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface SorPackageDetailMapper {
    /**新增SorPackageDetail*/
    @Insert("insert into sor_packagedetails values(#{id},#{wareName},#{destination},#{ticket},#{actualCargoInt},#{cargoInt},#{weight}," +
            "#{volume},#{service},#{importantHints},#{ask},#{inputType},#{packging})")
    void saveSorPackageDetail(SorPackageDetails sorPackageDetails);
}
