package com.xr.boot.service.system;

import com.xr.boot.entity.SyEmp;

public interface SyEmpService {
    SyEmp login(SyEmp syEmp) throws Exception;

    SyEmp getUserByName(String username);

    void upSyEmpById(SyEmp syEmp);
}
