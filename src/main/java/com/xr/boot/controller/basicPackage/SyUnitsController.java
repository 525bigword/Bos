package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.SyUnits;
import com.xr.boot.service.system.SyUnitsService;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/syUnitsController")
@Slf4j
@Api(tags = "公司接口")
public class SyUnitsController {
    @Autowired
    private SyUnitsService syUnitsService;
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/findSyUnits")
    public Object findSyUnits() {
        Object fSyUnits = null;
        if (redisUtil.hasKey("com.xr.boot.controller.basicPackage.SyUnitsController.findSyUnits")) {
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.basicPackage.SyUnitsController.findSyUnits");
        } else {
            try {
                fSyUnits= syUnitsService.findSyUnits();
                return fSyUnits;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
    @GetMapping("/findsyunitsbyparentid")
    public Object findSyUnitsByparentid(SyUnits syUnits) {
        System.out.println(syUnits);
        String key="com.xr.boot.controller.basicPackage.SyUnitsController.findSyUnitsByParentid"+syUnits.getParentid()+syUnits.getName();
        if(redisUtil.hasKey(key)){
            return redisUtil.get(key);
        }
        return syUnitsService.findSyUnitByParentId(syUnits);

    }
}
