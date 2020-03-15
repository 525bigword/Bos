package com.xr.boot.dao.sorting;

import com.xr.boot.entity.SorCheckBoundDetails;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface SorCheckBoundDetailsMapper {
    @Insert("insert into sor_checkbounddetails values(#{id},#{cargoCount},#{weight},#{volume},#{direction}," +
            "#{storagePerson},#{storageDate},#{packging})")
    void saveSorCheckBoundDetails(SorCheckBoundDetails sorCheckBoundDetails);
}
