package com.xr.boot.dao.sorting;

import com.xr.boot.dao.sorting.provider.SorAbnormalProviderSql;
import com.xr.boot.entity.SorAbnormal;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SorAbnormalMapper {
    /**新增异常交接单sor_abnormal*/
    @Insert("insert into sor_abnormal values(#{id},#{launchDate},#{launchPerson},#{launchCompany},#{abnormalType},#{transferInt},#{packageInt},#{hedgeAbnInt},#{aboState},#{handleDate},#{textare})")
    void saveSorAbnormal(SorAbnormal sorAbnormal);
    /**按条件动态查询异常监控表sor_abnormal*/
    @SelectProvider(type = SorAbnormalProviderSql.class,method = "findSorAbnormal")
    List<SorAbnormal> findSorAbnormal(SorAbnormal sorAbnormal);
}
