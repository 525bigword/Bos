package com.xr.boot.service.service;

import com.xr.boot.entity.SyEmp;

import java.sql.SQLException;

public interface SyEmpService {
    SyEmp Login(SyEmp syEmp) throws Exception;

    SyEmp getUserByName(String username);
}
