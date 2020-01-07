package com.xr.boot.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface MenusAndBigMenusService {

    //获取所有父级栏目
    Map<String,List<Object>> findSyMenusBypParentidTozero();
    //获取所有顶部模块
    Map<String,List<Object>> findyBigmenus();
}
