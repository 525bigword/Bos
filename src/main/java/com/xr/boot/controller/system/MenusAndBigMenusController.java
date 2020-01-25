package com.xr.boot.controller.system;

import com.alibaba.fastjson.JSON;
import com.xr.boot.entity.SyBigMenus;
import com.xr.boot.entity.SyMenus;
import com.xr.boot.entity.SyRoles;
import com.xr.boot.entity.SyRolesMenus;
import com.xr.boot.ienum.Return;
import com.xr.boot.ienum.StausEnum;
import com.xr.boot.service.system.MenusAndBigMenusService;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jurisdiction")
@Slf4j
@Api(tags = "权限用户相关接口")
public class MenusAndBigMenusController {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private MenusAndBigMenusService menusAndBigMenusService;

    @ApiOperation("分配角色权限")
    @PostMapping("/assignrolepermissions")
    public void assignRolePermissions(@RequestParam("menuid[]") List<Integer> menuid,
                                        @RequestParam("roleid")Integer roleid){
        System.out.println(roleid);
        menusAndBigMenusService.assignRolePermissions(menuid,roleid);
    }

    @ApiOperation("查询目标角色的权限")
    @GetMapping("/findmenubyrole")
    public Object findSymenuBySyrole(SyRoles syRoles){
        Object o=null;
        String key="com.xr.boot.controller.system.MenusAndBigMenusController.findSyMenusBySyRole"+syRoles.getId();
        if(redisUtil.hasKey(key)){
            o = redisUtil.get(key);
        }else{
            o=menusAndBigMenusService.findSyMenusBySyRole(syRoles);
        }
        return o;
    }

    @ApiOperation("权限树形菜单接口")
    @GetMapping("/symenustree")
    public Object syMenusTree(){
        Object o=null;
        String key="com.xr.boot.controller.system.MenusAndBigMenusController.syMenusTree";
        if(redisUtil.hasKey(key)){
           o = redisUtil.get(key);
        }else{
            o=menusAndBigMenusService.findSyMenusToTree();
        }
        return o;
    }

    @ApiOperation("根据id删除栏目")
    @PostMapping("/delmenus")
    public StausEnum delMenus(@RequestParam("ids[]") List<Integer> ids){
        try {
            menusAndBigMenusService.delSyMenus(ids);
            return StausEnum.SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return StausEnum.NO;
        }
    }

    @ApiOperation("修改栏目")
    @PostMapping("/upmenus")
    public StausEnum upSyMenus(SyMenus syMenus){
        try {
            menusAndBigMenusService.upSyMenus(syMenus);
        } catch (Exception e) {
            e.printStackTrace();
            return StausEnum.NO;
        }
        return  StausEnum.SUCCESS;
    }
    @ApiOperation("模块信息")
    @GetMapping("/loadoptions")
    public Object loadOptions(){
        Object sySyBigmenus = null;
        if(redisUtil.hasKey("com.xr.boot.controller.MenusAndBigMenusController.LoadOptions")){
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.MenusAndBigMenusController.LoadOptions");
        }else {
            try {
                sySyBigmenus = menusAndBigMenusService.findyBigmenus();
                return sySyBigmenus;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
    @ApiOperation("查询栏目信息")
    @GetMapping("/loadmenues")
    public Object loadMenus(SyMenus syMenus){
        System.out.println(syMenus.getParentID()+syMenus.getText());
        Object syMenusa=null;
        if(redisUtil.hasKey("com.xr.boot.controller.loadMenues"+syMenus.getParentID()+syMenus.getText())){
            syMenusa = redisUtil.get("com.xr.boot.controller.loadMenues"+syMenus.getParentID()+syMenus.getText());
        }else{
            syMenusa=menusAndBigMenusService.findAllSyMenus(syMenus);
        }
        System.out.println(syMenusa);
        return syMenusa;
    }


    @ApiOperation("父级栏目信息")
    @GetMapping("/loadmenus")
    public Object loadMenus(){
        Object syMenusBypParentidTozero = null;
        if(redisUtil.hasKey("com.xr.boot.controller.MenusAndBigMenusController.LoadMenus")){
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.MenusAndBigMenusController.LoadMenus");
        }else {
            try {
                syMenusBypParentidTozero = menusAndBigMenusService.findSyMenusBypParentidTozero();
                return  syMenusBypParentidTozero;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
    @ApiOperation("新增模块")
    @PostMapping("/addsybigmenus")
    public Return addSyBigMenus(SyBigMenus syBigMenus) throws Exception {
        menusAndBigMenusService.saveSyBigMenus(syBigMenus);
        return new Return(StausEnum.SUCCESS);
    }
    @ApiOperation("新增栏目")
    @RequestMapping(value = "/addsymenus",method = RequestMethod.POST)
    public Return addSyMenus(SyMenus syMenus){
        try{
            menusAndBigMenusService.saveSyMenus(syMenus);
        }catch (Exception e){
            return new Return(StausEnum.NO);
        }
        return new Return(StausEnum.SUCCESS);
    }
}
