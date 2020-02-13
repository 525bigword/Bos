package com.xr.boot.dao.sorting;

import com.xr.boot.entity.SorStorageDetails;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface SorStorageDetailMapper {
    @Insert("insert into sor_storagedetails values(#{id},#{packageID},#{weight})")
    void saveSorStorageDetails(SorStorageDetails sorStorageDetails);
}
