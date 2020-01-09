package com.xr.boot.service.system;

import com.xr.boot.entity.SyEmp;

public interface SyEmpService {
    SyEmp login(SyEmp syEmp) throws Exception;

    SyEmp getUserByName(String username);
    //修改密码
    void upSyEmpById(SyEmp syEmp);

    /**
     * 对应单个员工信息
     * @param operatorid
     * @return
     */
    SyEmp findSyEmpById(int operatorid);
}
