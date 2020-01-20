package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.BasShuttleBus;
import com.xr.boot.service.basicPackage.BasShuttleBusService;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basShuttleBusController")
@Slf4j
@Api(tags = "班车设置接口")
public class BasShuttleBusController {
    @Autowired
    private BasShuttleBusService basShuttleBusService;
    @Autowired
    private RedisUtil redisUtil;

    @ApiOperation("班车设置")
    @PostMapping("/findBasShuttleBus")
    public Object findBasShuttleBus() {
        Object fbasShuttleBus = null;
        if (redisUtil.hasKey("com.xr.boot.controller.BasShuttleBusController.findBasShuttleBus")) {
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.BasShuttleBusController.findBasShuttleBus");
        } else {
            try {
                fbasShuttleBus = basShuttleBusService.findBasShuttleBus(null);
                return fbasShuttleBus;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
    @PostMapping("/findBasShuttleBusByTerm")
    public List<BasShuttleBus> findBasBasicArchivesByTerm(BasShuttleBus basShuttleBus){
        return basShuttleBusService.findBasShuttleBusByTerm(basShuttleBus);
    }
    @PostMapping("/delBasShuttleBusById")
    public int delBasShuttleBusById(BasShuttleBus basShuttleBus){
        basShuttleBusService.delBasShuttleBusById(basShuttleBus);
        redisUtil.del("com.xr.boot.controller.BasShuttleBusController.findBasShuttleBus");
        return 1;
    }
    @PostMapping("/upBasShuttleBusById")
    public int upBasShuttleBusById(BasShuttleBus basShuttleBus){
        basShuttleBusService.upBasShuttleBusById(basShuttleBus);
        redisUtil.del("com.xr.boot.controller.BasShuttleBusController.findBasShuttleBus");
        return 1;
    }
}

