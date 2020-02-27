package com.xr.boot.dao.sorting;

import com.xr.boot.dao.sorting.provider.SorPackageDetailProviderSql;
import com.xr.boot.entity.SorPackageDetails;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SorPackageDetailMapper {
    /**新增SorPackageDetail*/
    @Insert("insert into sor_packagedetails values(#{id},#{wareName},#{destination},#{ticket},#{actualCargoInt},#{cargoInt},#{weight}," +
            "#{volume},#{service},#{importantHints},#{ask},#{inputType},#{packging})")
    void saveSorPackageDetail(SorPackageDetails sorPackageDetails);
    /**动态查询所有没有合包得SorPackageDetail*/
    @SelectProvider(type = SorPackageDetailProviderSql.class,method = "findWhere")
    List<SorPackageDetails> findSorPackageDetailNoPack(SorPackageDetails sorPackageDetails);
    /**根据合包号查询SorPackageDetail*/
    @Select("select ID,WareName,Destination,Ticket,ActualCargoInt,CargoInt,Weight,Volume,Service,ImportantHints,Ask," +
            "InputType,Packging from sor_packagedetails where Packging=#{packing}")
    List<SorPackageDetails> findSorPackageDetailByPackage(@Param("packing") String packing);
}
