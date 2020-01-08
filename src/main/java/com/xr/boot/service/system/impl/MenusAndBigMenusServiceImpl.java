package com.xr.boot.service.system.impl;

import com.xr.boot.dao.system.MenusAndBigMenusMapper;
import com.xr.boot.entity.SyBigMenus;
import com.xr.boot.entity.SyMenus;
import com.xr.boot.service.system.MenusAndBigMenusService;
import com.xr.boot.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@Slf4j
public class MenusAndBigMenusServiceImpl implements MenusAndBigMenusService {
    @Autowired
    private MenusAndBigMenusMapper menusAndBigMenusMapper;
    @Autowired
    private RedisUtil redisUtil;

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
        return redisUtil.get("com.xr.boot.controller.MenusAndBigMenusController.LoadOptions");
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void saveSyBigMenus(SyBigMenus syBigMenus) throws SQLException {
        try{
            menusAndBigMenusMapper.saveSyBigMenus(syBigMenus);
        }catch (Exception e){
            throw new SQLException("数据库新增错误");
        }
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void saveSyMenus(SyMenus syMenus) throws Exception {
        try {
            int parentid = menusAndBigMenusMapper.findSyMenusToTipByParentid(syMenus.getParentID());
            syMenus.setTip(++parentid);
        }catch (Exception e){
            throw new SQLException("获取排序错误");
        }
        try {
            menusAndBigMenusMapper.saveSyMenus(syMenus);
        }catch (Exception e){
            log.debug("新增失败");
            throw new SQLException("新增错误");
        }
    }
}
