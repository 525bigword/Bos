package com.xr.boot.service.system.impl;

import com.xr.boot.dao.system.SyEmpMapper;
import com.xr.boot.entity.SyEmp;
import com.xr.boot.service.system.SyEmpService;
import com.xr.boot.util.AES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class SyEmpServiceImpl implements SyEmpService {

    @Autowired
    private SyEmpMapper syEmpMapper;

    /**
     * 登录业务
     * @param syEmp
     * @return
     */
    @Override
    public SyEmp login(SyEmp syEmp) throws Exception {
        SyEmp syEmps=null;
        try {
            syEmp.setPwd(AES.encryptAES(syEmp.getPwd()));
            syEmps = syEmpMapper.findSyEmpByEmpNoAndPwd(syEmp);
            if(syEmps==null){
                return null;
            }
        }catch (Exception e){
            throw new SQLException("sql查询出错");
        }
        if(syEmps.getDisabled()==0){
            throw new Exception("账号已经被冻结");
        }else{
            //生成一个token码

        }
        return syEmps;
    }


    @Override
    public SyEmp getUserByName(String username) {
        return syEmpMapper.login(username);
    }

    @Override
    public void upSyEmpById(SyEmp syEmp) {
        syEmpMapper.upSyEmpById(syEmp);
    }

    @Override
    public SyEmp findSyEmpById(int operatorid) {

        return null;
    }
}
