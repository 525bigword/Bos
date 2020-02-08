package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.BasZoneCustomInfo;
import com.xr.boot.service.basicPackage.BasZoneCustomInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basZoneCustomInfoController")
@Slf4j
public class BasZoneCustomInfoController {
    @Autowired
    private BasZoneCustomInfoService basZoneCustomInfoService;
    @PostMapping("/findBasZoneCustomInfoByZoneCode")
    public Object findBasZoneCustomInfoByZoneCode(String zoneCode){
        Object basZoneCustomInfoByZoneCode = null;
        try {
            basZoneCustomInfoByZoneCode =basZoneCustomInfoService.findBasZoneCustomInfoByZoneCode(zoneCode);
            return basZoneCustomInfoByZoneCode;
        } catch (Exception e) {
            log.info("获取数据库资源异常。。。。");
            return null;
        }
    }
    @PostMapping("/delBasZoneCustomInfoById")
    public int delBasZoneCustomInfoById(long customCode){
        basZoneCustomInfoService.delBasZoneCustomInfoById(customCode);
        return 1;
    }
    @PostMapping("/upBasZoneCustomInfoById")
    public int upBasZoneCustomInfoById(BasZoneCustomInfo basZoneCustomInfo){
        List<String> customName = basZoneCustomInfoService.findBasSubstituteByCustomName(basZoneCustomInfo);
        if(customName.size()>0){
            return 0;
        }
        basZoneCustomInfoService.upBasZoneCustomInfoById(basZoneCustomInfo);
        return 1;
    }
    @PostMapping("/saveBasZoneCustomInfo")
    public int saveBasZoneCustomInfo(BasZoneCustomInfo basZoneCustomInfo){
        List<String> customName = basZoneCustomInfoService.findBasSubstituteByCustomName(basZoneCustomInfo);
        if(customName.size()>0){
            return 0;
        }
        basZoneCustomInfoService.saveBasZoneCustomInfo(basZoneCustomInfo);
        return 1;
    }
}
