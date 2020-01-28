package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.BasZoneInfo;
import com.xr.boot.service.basicPackage.BasZoneInfoService;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basZoneInfoController")
@Slf4j
@Api(tags = "管理定区接口")
public class BasZoneInfoController {
    @Autowired
    private BasZoneInfoService basZoneInfoService;
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
}
