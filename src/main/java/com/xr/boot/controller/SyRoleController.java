package com.xr.boot.controller;

import com.xr.boot.entity.SyRoles;
import com.xr.boot.service.service.SyRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "权限用户相关接口")
@RequestMapping("jurisdiction")
public class SyRoleController {
    @Autowired
    private SyRoleService syRoleService;
    @ApiOperation("新增角色")
    @PutMapping("/addrole")
    public void addRole(SyRoles syRoles){
        try {
            syRoleService.saveSyRole(syRoles);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
