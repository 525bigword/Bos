package com.xr.boot.service.service.impl;

import com.alibaba.fastjson.JSON;
import com.xr.boot.dao.MenusAndBigMenusMapper;
import com.xr.boot.entity.SyMenus;
import com.xr.boot.service.service.MenusAndBigMenusService;
import com.xr.boot.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class MenusAndBigMenusServiceImpl implements MenusAndBigMenusService {
    @Autowired
    private MenusAndBigMenusMapper menusAndBigMenusMapper;
    @Autowired
    private RedisUtil redisUtil;

    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public Map<String, List<Object>> findSyMenusBypParentidTozero() {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        List<SyMenus> syMenus = menusAndBigMenusMapper.findSyMenusByParentId(0);
        maps.put("SyMenusBypParentidTozero", Collections.singletonList(syMenus));
        redisUtil.set("com.xr.boot.controller.MenusAndBigMenusController.LoadOptions", maps);
        return maps;
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public Map<String, List<Object>> findyBigmenus() {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("bigmenus", Collections.singletonList(menusAndBigMenusMapper.findSyBigMenusAll()));
        redisUtil.set("com.xr.boot.controller.MenusAndBigMenusController.LoadMenus", maps);
        return maps;
    }
}
