package com.xr.boot.dao.sorting;

import com.xr.boot.entity.SorCheckBoundDetails;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SorCheckBoundDetailsMapper {
    @Insert("insert into sor_checkbounddetails values(#{id},#{cargoCount},#{weight},#{volume},#{direction}," +
            "#{storagePerson},#{storageDate},#{packging})")
    void saveSorCheckBoundDetails(SorCheckBoundDetails sorCheckBoundDetails);
    /**按合包号查询盘库详情*/
    @Select("select ID,CargoCount,Weight,Volume,Direction,StoragePerson,StorageDate,Packging from " +
            "sor_checkbounddetails where Packging=#{packing}")
    List<SorCheckBoundDetails> findSorCheckBoundDetailsByPacking(@Param("packing")String packing);
}
