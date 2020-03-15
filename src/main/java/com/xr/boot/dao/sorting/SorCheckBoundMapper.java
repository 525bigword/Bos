package com.xr.boot.dao.sorting;

import com.xr.boot.dao.sorting.provider.SorCheckBoundProviderSql;
import com.xr.boot.entity.SorCheckBound;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SorCheckBoundMapper {
    @Insert("insert into sor_checkbound values(#{id},#{cargoSum},#{checkPerson},#{checkDate},#{checkCompany}," +
            "#{packging})")
    void saveSorCheckBound(SorCheckBound sorCheckBound);
    @SelectProvider(type = SorCheckBoundProviderSql.class,method = "findSorCheckBoundByWhere")
    List<SorCheckBound> findSorCheckBoundByWhere(SorCheckBound sorCheckBound);
}
