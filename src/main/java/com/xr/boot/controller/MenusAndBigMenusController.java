package com.xr.boot.controller;

import com.alibaba.fastjson.JSON;
import com.xr.boot.ienum.Return;
import com.xr.boot.ienum.StausEnum;
import com.xr.boot.service.service.MenusAndBigMenusService;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("jurisdiction")
@Slf4j
@Api(tags = "权限接口")
public class MenusAndBigMenusController {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private MenusAndBigMenusService menusAndBigMenusService;

    @ApiOperation("模块信息")
    @GetMapping("/loadoptions")
    public Return loadOptions(){
        Map<String, List<Object>> sySyBigmenus = null;
        if(redisUtil.hasKey("com.xr.boot.controller.MenusAndBigMenusController.LoadOptions")){
            log.debug("从redis中取出值");
            return new Return(StausEnum.SUCCESS,redisUtil.get("com.xr.boot.controller.MenusAndBigMenusController.LoadOptions"));
        }else {
            try {
                sySyBigmenus = menusAndBigMenusService.findyBigmenus();

                return new Return(StausEnum.SUCCESS,sySyBigmenus);
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return new Return(StausEnum.NO, null);
            }
        }
    }

    @ApiOperation("父级栏目信息")
    @GetMapping("/loadmenus")
    public Return loadMenus(){
        Map<String, List<Object>> syMenusBypParentidTozero = null;
        if(redisUtil.hasKey("com.xr.boot.controller.MenusAndBigMenusController.LoadMenus")){
            log.debug("从redis中取出值");
            return new Return(StausEnum.SUCCESS,redisUtil.get("com.xr.boot.controller.MenusAndBigMenusController.LoadMenus"));
        }else {
            try {
                syMenusBypParentidTozero = menusAndBigMenusService.findSyMenusBypParentidTozero();

                return new Return(StausEnum.SUCCESS, syMenusBypParentidTozero);
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return new Return(StausEnum.NO, null);
            }
        }
    }
}
