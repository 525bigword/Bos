package com.xr.boot.controller.basicPackage;

import com.xr.boot.service.basicPackage.LogLogisticsService;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logLogisticsController")
@Slf4j
@Api(tags = "物流设置接口")
public class LogLogisticsController {
    @Autowired
    private LogLogisticsService logLogisticsService;
    @Autowired
    private RedisUtil redisUtil;
    @ApiOperation("物流设置")
    @PostMapping("/findLogLogistics")
    public Object findLogLogistics(Integer lineID){
        Object fLogLogistics = null;
        if (redisUtil.hasKey("com.xr.boot.controller.LogLogisticsController.findLogLogistics")) {
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.LogLogisticsController.findLogLogistics");
        } else {
            try {
                fLogLogistics =logLogisticsService.findLogLogisticsById(lineID);
                return fLogLogistics;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
}
