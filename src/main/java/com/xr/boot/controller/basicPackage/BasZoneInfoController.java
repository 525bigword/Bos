package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.BasZoneInfo;
import com.xr.boot.entity.City;
import com.xr.boot.service.basicPackage.BasZoneInfoService;
import com.xr.boot.service.basicPackage.CityService;
import com.xr.boot.service.basicPackage.impl.CityServiceImpl;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basZoneInfoController")
@Slf4j
@Api(tags = "管理定区接口")
public class BasZoneInfoController {
    @Autowired
    private BasZoneInfoService basZoneInfoService;
    @Autowired
    private CityService cityService;
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/findBasZoneInfos")
    public Object findBasZoneInfos() {
        Object findBasZoneInfos = null;
        if (redisUtil.hasKey("com.xr.boot.controller.BasZoneInfoController.findBasZoneInfos")) {
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.BasZoneInfoController.findBasZoneInfos");
        } else {
            try {
                findBasZoneInfos= basZoneInfoService.findBasZoneInfos(null);
                return findBasZoneInfos;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
    @PostMapping("/findBasZoneInfoTrem")
    public List<BasZoneInfo> findBasZoneInfoTrem(BasZoneInfo basZoneInfo) {
        return basZoneInfoService.findBasZoneInfoTrem(basZoneInfo);
    }
    @PostMapping("/upBasZoneInfoByID")
    public int upBasZoneInfoByID(BasZoneInfo basZoneInfo){
        basZoneInfoService.upBasZoneInfoByID(basZoneInfo);
        redisUtil.del("com.xr.boot.controller.BasZoneInfoController.findBasZoneInfos");
        return 1;
    }
    @PostMapping("/saveBasZoneInfo")
    public int saveBasZoneInfo(BasZoneInfo basZoneInfo){
        List<City> city = cityService.findCitiesByCity(basZoneInfo.getZoneName());
        if(city.size()==0){
            return 0;
        }
        List<String> zoneName = basZoneInfoService.findBasZoneInfoByZoneName(basZoneInfo);
        if(zoneName.size()>0){
            return 2;
        }
        basZoneInfoService.saveBasZoneInfo(basZoneInfo);
        redisUtil.del("com.xr.boot.controller.BasZoneInfoController.findBasZoneInfos");
        return 1;
    }
    @PostMapping("/upBasZoneInfoByStats")
    public int upBasZoneInfoByStats(long stats){
        basZoneInfoService.upBasZoneInfoByStats(stats);
        redisUtil.del("com.xr.boot.controller.BasZoneInfoController.findBasZoneInfos");
        return 1;
    }
}
