package com.xr.boot.dao.sorting;

import com.xr.boot.entity.SorStorage;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface SorStorageMapper {
    @Insert("insert into sor_storage values(#{id},#{acceptDate},#{acceptCompany},#{deliveryCompany},#{packageID},#{state})")
    void saveSorStorage(SorStorage sorStorage);
}
