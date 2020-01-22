package com.xr.boot.service.system;

import com.xr.boot.entity.SyEmp;

import java.util.List;
import java.util.Map;

public interface SyEmpService {
    //批量删除员工
    void DelSyEmp(List<Integer> ids);
    //新增员工
    void saveSyEmp(SyEmp syEmp);
    //动态查询员工
    Object findSyEmpByWhere(SyEmp syEmp);

    Map<String,Object> login(SyEmp syEmp) throws Exception;


    //修改密码
    void upSyEmpToPwdById(SyEmp syEmp);
    //修改密码
    void upSyEmpById(SyEmp syEmp) throws Exception;
    /**
     * 对应单个员工信息
     * @param operatorid
     * @return
     */
    SyEmp findSyEmpById(int operatorid);

    /**
     * 查询工号和名称 mpy
     * @return
     */
    List<SyEmp> findSyEmp();
}
