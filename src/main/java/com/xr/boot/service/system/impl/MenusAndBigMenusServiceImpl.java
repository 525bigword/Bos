package com.xr.boot.service.system.impl;

import com.alibaba.fastjson.JSON;
import com.xr.boot.dao.system.MenusAndBigMenusMapper;
import com.xr.boot.entity.SyBigMenus;
import com.xr.boot.entity.SyMenus;
import com.xr.boot.entity.SyRoles;
import com.xr.boot.entity.SyRolesMenus;
import com.xr.boot.service.system.MenusAndBigMenusService;
import com.xr.boot.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.boot.autoconfigure.klock.model.LockTimeoutStrategy;
import org.springframework.boot.autoconfigure.klock.model.ReleaseTimeoutStrategy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import static org.springframework.boot.autoconfigure.klock.model.LockTimeoutStrategy.KEEP_ACQUIRE;
import static org.springframework.boot.autoconfigure.klock.model.LockTimeoutStrategy.NO_OPERATION;

@Service
@Slf4j
public class MenusAndBigMenusServiceImpl implements MenusAndBigMenusService {
    @Autowired
    private MenusAndBigMenusMapper menusAndBigMenusMapper;
    @Autowired
    private RedisUtil redisUtil;
    private Set<String> Menus=new HashSet<>();
    private Set<String> BigMenus =new HashSet<>();
    @Override
    @Klock(leaseTime = Long.MAX_VALUE)
    @Transactional
    public Object findAllSyMenus(SyMenus syMenus) {
        List<SyMenus> syMenusAll = menusAndBigMenusMapper.findSyMenusAll(syMenus);
        System.out.println(syMenusAll.size());
        redisUtil.set("com.xr.boot.controller.loadMenues"+syMenus.getParentID()+syMenus.getText(), syMenusAll);
        Menus.add("com.xr.boot.controller.loadMenues"+syMenus.getParentID()+syMenus.getText());
        return redisUtil.get("com.xr.boot.controller.loadMenues"+syMenus.getParentID()+syMenus.getText());
    }

    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public Object findSyMenusBypParentidTozero() {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        List<SyMenus> syMenus = menusAndBigMenusMapper.findSyMenusByParentId(0);
        maps.put("SyMenusBypParentidTozero", Collections.singletonList(syMenus));
        redisUtil.set("com.xr.boot.controller.MenusAndBigMenusController.LoadMenus", maps);
        return redisUtil.get("com.xr.boot.controller.MenusAndBigMenusController.LoadMenus");
    }


    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public Object findyBigmenus() {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("bigmenus", Collections.singletonList(menusAndBigMenusMapper.findSyBigMenusAll()));
        redisUtil.set("com.xr.boot.controller.MenusAndBigMenusController.LoadOptions", maps);
        BigMenus.add("com.xr.boot.controller.MenusAndBigMenusController.LoadOptions");
        return redisUtil.get("com.xr.boot.controller.MenusAndBigMenusController.LoadOptions");
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void saveSyBigMenus(SyBigMenus syBigMenus) throws SQLException {
        try{
            menusAndBigMenusMapper.saveSyBigMenus(syBigMenus);
            for (String s : Menus) {
                redisUtil.del(s);
            }
            Menus.clear();
        }catch (Exception e){
            throw new SQLException("数据库新增错误");
        }
    }
    @Klock(
            releaseTimeoutStrategy = ReleaseTimeoutStrategy.NO_OPERATION,leaseTime=Long.MAX_VALUE,waitTime = Long
           .MAX_VALUE)
    @Transactional
    @Override
    public void saveSyMenus(SyMenus syMenus) throws Exception {
        try {
            syMenus.setIcon("&#xe620;");
            int count = menusAndBigMenusMapper.findSyMenusTochildcount(syMenus.getParentID());
            if(count==0){
                syMenus.setTip(0);
                menusAndBigMenusMapper.saveSyMenus(syMenus);
            }else{
                int parentid = menusAndBigMenusMapper.findSyMenusToTipByParentid(syMenus.getParentID());
                syMenus.setTip(++parentid);
                menusAndBigMenusMapper.saveSyMenus(syMenus);
            }
            String[] key=new String[Menus.size()];
            redisUtil.del(Menus.toArray(key));
        }catch (Exception e){
            throw new SQLException("获取排序错误");
        }
    }

    @Klock(leaseTime = Long.MAX_VALUE)
    @Transactional
    @Override
    public void upSyMenus(SyMenus syMenus) throws Exception {
        try{
            menusAndBigMenusMapper.upSymenus(syMenus);
            String[] key=new String[Menus.size()];
            redisUtil.del(Menus.toArray(key));
        }catch (Exception e){
            throw new Exception("com.xr.boot.service.system.impl.MenusAndBigMenusServiceImpl.upSymenus");
        }

    }

    @Klock
    @Transactional
    @Override
    public void delSyMenus(List<Integer> id) throws Exception {
        try{
            menusAndBigMenusMapper.delSyMenusById(id);
            String[] key=new String[Menus.size()];
            redisUtil.del(Menus.toArray(key));
        }catch (Exception e){
            throw new Exception("com.xr.boot.service.system.impl.MenusAndBigMenusServiceImpl.delSyMenus");
        }
    }

    @Override
    public Object findSyMenusToTree() {
        String key="com.xr.boot.controller.system.MenusAndBigMenusController.syMenusTree";
        List<SyMenus> syMenusByParentidToZero = menusAndBigMenusMapper.findSyMenusByParentidToZero();
        redisUtil.set(key,syMenusByParentidToZero);
        Menus.add(key);
        return redisUtil.get(key);
    }
    @Klock
    @Override
    public Object findSyMenusBySyRole(SyRoles syRoles) {
        String key="com.xr.boot.controller.system.MenusAndBigMenusController.findSyMenusBySyRole"+syRoles.getId();
        List<SyRolesMenus> syMenusBySyRoles = menusAndBigMenusMapper.findSyMenusBySyRoles(syRoles);
        redisUtil.set(key,syMenusBySyRoles);
        Menus.add(key);
        return redisUtil.get(key);
    }
    @Transactional
    @Klock
    @Override
    public void assignRolePermissions(List<Integer> menuid, Integer roleid) {
        SyRoles syRoles=new SyRoles();
        syRoles.setId(roleid);
        List<SyRolesMenus> syMenusBySyRoles = menusAndBigMenusMapper.findSyMenusBySyRoles(syRoles);
        for(int i=0;i<menuid.size();i++){
            for(int j=0;j<syMenusBySyRoles.size();j++){
                if(menuid.get(i)==syMenusBySyRoles.get(j).getMenuid()){
                    menuid.remove(i);
                    continue;
                }
            }
        }
        if(menuid.size()>0) {
            menusAndBigMenusMapper.saveSyRoleAndSyMenu(menuid, roleid);
            for (String s : Menus) {
                redisUtil.del(s);
            }
            Menus.clear();
        }
    }
}
