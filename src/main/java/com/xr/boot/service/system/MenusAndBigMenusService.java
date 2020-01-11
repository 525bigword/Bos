package com.xr.boot.service.system;

import com.xr.boot.entity.SyBigMenus;
import com.xr.boot.entity.SyMenus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface MenusAndBigMenusService {
    //查询所有栏目
    Object findAllSyMenus(SyMenus syMenus);
    //获取所有父级栏目
    Object findSyMenusBypParentidTozero();
    //获取所有顶部模块
    Object findyBigmenus();
    //向sy_bigmenus表新增
    void saveSyBigMenus(SyBigMenus syBigMenus) throws Exception;
    //向sy_menus表新增
    void saveSyMenus(SyMenus syMenus) throws Exception;
}
