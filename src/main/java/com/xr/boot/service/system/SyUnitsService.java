package com.xr.boot.service.system;

import com.xr.boot.entity.SyUnits;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SyUnitsService  {
    SyUnits findSyUnitById(Integer operationUnitid);

    /**
     * 查询所有公司
     * @return
     */
   Object findSyUnits();
    List<SyUnits> findSyUnitAllByStats(@Param("stats") Integer stats);
}
