package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.BasArea;
import com.xr.boot.service.basicPackage.BasAreaService;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basAreaController")
@Slf4j
@Api(tags = "区域设置接口")
public class BasAreaController {
    @Autowired
    private BasAreaService basAreaService;
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/findBasAreas")
    public Object findBasAreas(){
        Object fbasAreas = null;
        if (redisUtil.hasKey("com.xr.boot.controller.BasAreaController.findBasAreas")) {
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.BasAreaController.findBasAreas");
        } else {
            try {
                fbasAreas=basAreaService.findBasAreas(null);
                return fbasAreas;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
    @PostMapping("/findBasAreaByTerm")
    public List<BasArea> findBasAreaByTerm(BasArea basArea){
        return basAreaService.findBasAreaByTerm(basArea);
    }
    @PostMapping("/upBasAreaById")
    public int upBasAreaById(BasArea basArea) {
        basAreaService.upBasAreaById(basArea);
        redisUtil.del("com.xr.boot.controller.BasAreaController.findBasAreas");
        return 1;
    }
    @PostMapping("/saveBasArea")
    public int saveBasArea(BasArea basArea) {
        basAreaService.saveBasArea(basArea);
        redisUtil.del("com.xr.boot.controller.BasAreaController.findBasAreas");
        return 1;
    }

}
