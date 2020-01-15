package com.xr.boot.controller.system;

import com.xr.boot.entity.SyRoles;
import com.xr.boot.ienum.StausEnum;
import com.xr.boot.service.system.SyRoleService;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "权限用户相关接口")
@RequestMapping("jurisdiction")
public class SyRoleController {
    @Autowired
    private SyRoleService syRoleService;
    @Autowired
    private RedisUtil redisUtil;
    @ApiOperation("新增角色")
    @PutMapping("/addrole")
    public StausEnum addRole(SyRoles syRoles){
        try {
            syRoleService.saveSyRole(syRoles);
            return StausEnum.SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return StausEnum.NO;
        }
    }
    @ApiOperation("查询角色")
    @GetMapping("/findrole")
    public Object findSyRole(SyRoles syRoles){
        //判断该条件是否有在redis中存在数据
        Object o=null;
        if(redisUtil.hasKey("com.xr.boot.SyRoleController.findSyRole"+syRoles.getRoleName()+syRoles.getDisabled())){
            o = redisUtil.get("com.xr.boot.SyRoleController.findSyRole" + syRoles.getRoleName() + syRoles.getDisabled());
        }else{
            o = syRoleService.findSyRoleByWhere(syRoles);
        }
        return o;
    }
}
