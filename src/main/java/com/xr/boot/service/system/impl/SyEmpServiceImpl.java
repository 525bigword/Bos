package com.xr.boot.service.system.impl;

import com.xr.boot.dao.system.MenusAndBigMenusMapper;
import com.xr.boot.dao.system.SyEmpMapper;
import com.xr.boot.entity.SyBigMenus;
import com.xr.boot.entity.SyEmp;
import com.xr.boot.service.system.MenusAndBigMenusService;
import com.xr.boot.service.system.SyEmpService;
import com.xr.boot.util.AES;
import com.xr.boot.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static javafx.scene.input.KeyCode.L;

@Service
public class SyEmpServiceImpl implements SyEmpService {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private SyEmpMapper syEmpMapper;
    @Autowired
    private MenusAndBigMenusMapper menusAndBigMenusMapper;
    //存储SyEmp信息得key
    private List<String> SyEmpkeys;
    /**
     * 登录业务
     * @param syEmp
     * @return
     */
    @Klock(leaseTime = Long.MAX_VALUE)
    @Override
    public Map<String,Object> login(SyEmp syEmp) throws Exception {
        SyEmp syEmps=null;
        try {
            syEmp.setPwd(AES.encryptAES(syEmp.getPwd()));
            syEmps = syEmpMapper.findSyEmpByEmpNoAndPwd(syEmp);
            if(syEmps==null){
                return null;
            }else{
                syEmps.setSyRolesMenus(syEmpMapper.findSyRolesMenusByroleId(syEmps.getRoleid()));
            }
            if(syEmps.getDisabled()==1){
                throw new Exception("账号已经被冻结");
            }
            List<SyBigMenus> syBigMenusAll = menusAndBigMenusMapper.findSyBigMenusAll();
            Map<String,Object> map=new ConcurrentHashMap<>();
            map.put("syEmps",syEmps);
            map.put("o",syBigMenusAll);
            return map;
        }catch (Exception e){
            throw new SQLException("sql查询出错");
        }


    }




    @Override
    public void upSyEmpById(SyEmp syEmp) {
        syEmpMapper.upSyEmpById(syEmp);
    }

    @Override
    public SyEmp findSyEmpById(int operatorid) {
        return syEmpMapper.findSyEmpById(operatorid);
    }

    @Override
    public List<SyEmp> findSyEmp() {
        return syEmpMapper.findSyEmp();
    }

    @Override
    public Object findSyEmpByWhere(SyEmp syEmp) {
        String key="SyEmpController.getEmpAll"+syEmp.getEmpName()+syEmp.getDisabled();
        List<SyEmp> syEmpByWhere = syEmpMapper.findSyEmpByWhere(syEmp);
        redisUtil.set(key,syEmpByWhere);
        SyEmpkeys.add(key);
        return redisUtil.get(key);
    }
    @Klock(leaseTime = Long.MAX_VALUE)
    @Transactional
    @Override
    public void saveSyEmp(SyEmp syEmp) {
        String key="SyEmpController.getEmpAll"+syEmp.getEmpName()+syEmp.getDisabled();
        syEmpMapper.saveSyEmp(syEmp);
        String[] keys=new String[SyEmpkeys.size()];
        redisUtil.del(SyEmpkeys.toArray(keys));
    }
}
