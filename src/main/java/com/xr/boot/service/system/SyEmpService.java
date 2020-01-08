package com.xr.boot.service.system;

import com.xr.boot.entity.SyEmp;

public interface SyEmpService {
    SyEmp Login(SyEmp syEmp) throws Exception;

    SyEmp getUserByName(String username);
}
