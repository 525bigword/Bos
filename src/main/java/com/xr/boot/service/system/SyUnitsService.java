package com.xr.boot.service.system;

import com.xr.boot.dao.system.SyUnitsMapper;
import com.xr.boot.entity.SyUnits;

public interface SyUnitsService extends SyUnitsMapper {
    SyUnits findSyUnitById(Integer operationUnitid);
}
