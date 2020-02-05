package com.xr.boot.dao.accBusinessAdmissibility;

import com.xr.boot.dao.accBusinessAdmissibility.provider.AccWorkSheetSql;
import com.xr.boot.entity.AccWorkSheet;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccWorkSheetMapper {
    /**
     * 快速录入工作单
     * @param accWorkSheet
     */
    @Insert("insert into Acc_WorkSheet(WorkSheetNo,Destination,Product,Total,Weight,StowageRequirements) values(#{workSheetNo},#{destination},#{product},#{total},#{weight},#{stowageRequirements})")
    void addAccWorkSheet(AccWorkSheet accWorkSheet);
    /**
     * 工作单查询
     */
    @Select("select id,workSheetNo, from Acc_workSheet")
    List<AccWorkSheet> findAllAccworkSheet();

    /**
     * 工作单多条件查询
     * @param accWorkSheet
     * @return
     */
    @SelectProvider(type = AccWorkSheetSql.class,method = "findAccWorkSheetWhere")
    List<AccWorkSheet> findAllWhereAccworkSheet(AccWorkSheet accWorkSheet);
}
