package com.xr.boot.controller.system;

import com.xr.boot.entity.SyRoles;
import com.xr.boot.ienum.StausEnum;
import com.xr.boot.service.system.SyRoleService;
import com.xr.boot.util.RedisUtil;
import io.lettuce.core.dynamic.annotation.Param;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "权限用户相关接口")
@RequestMapping("jurisdiction")
public class SyRoleController {
    @Autowired
    private SyRoleService syRoleService;
    @Autowired
    private RedisUtil redisUtil;
    @ApiOperation("批量删除角色")
    @PostMapping("/delrole")
    public StausEnum delRole(@RequestParam("ids[]") List<Integer> ids){
        try {
            syRoleService.delSyRole(ids);
            return StausEnum.SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return StausEnum.NO;
        }
    }

    @ApiOperation("新增角色或者修改角色")
    @PutMapping("/addOrUprole")
    public StausEnum addRole(SyRoles syRoles,@Param("bj") Integer bj){
        try {
            syRoleService.saveOrUpSyRole(syRoles,bj);
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
