package com.xr.boot.dao.sorting;

import com.xr.boot.dao.sorting.provider.SorPackageDetailProviderSql;
import com.xr.boot.entity.SorPackageDetails;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SorPackageDetailMapper {
    /**修改SorPackageDetail*/
    @Update("update sor_packagedetails set Packging=#{packging} where ID=#{id}")
    void upSorPackageDetail(SorPackageDetails sorPackageDetails);
    /**动态查询所有没有合包得SorPackageDetail*/
    @SelectProvider(type = SorPackageDetailProviderSql.class,method = "findWhere")
    List<SorPackageDetails> findSorPackageDetailNoPack(SorPackageDetails sorPackageDetails);
    /**根据合包号查询SorPackageDetail*/
    @Select("select ID,WareName,Destination,Ticket,ActualCargoInt,CargoInt,Weight,Volume,Service,ImportantHints,Ask," +
            "InputType,Packging from sor_packagedetails where Packging=#{packing}")
    List<SorPackageDetails> findSorPackageDetailByPackage(@Param("packing") String packing);
    /**将SorPackageDetail得合包号修改位null*/
    @Update("update sor_packagedetails set `Packging`=Null where `Packging`=#{packing}")
    void upSorPackageDetailPackingNull(@Param("packing") String packing);
}
