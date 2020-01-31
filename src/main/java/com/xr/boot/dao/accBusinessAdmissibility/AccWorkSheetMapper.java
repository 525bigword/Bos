package com.xr.boot.dao.accBusinessAdmissibility;

import com.xr.boot.entity.AccWorkSheet;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface AccWorkSheetMapper {
    /**
     * 快速录入工作单
     * @param accWorkSheet
     */
    @Insert("insert into Acc_WorkSheet(WorkSheetNo,Destination,Product,Total,Weight,StowageRequirements) values(#{workSheetNo},#{destination},#{product},#{total},#{weight},#{stowageRequirements})")
    void addAccWorkSheet(AccWorkSheet accWorkSheet);
}
