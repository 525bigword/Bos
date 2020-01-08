package com.xr.boot.controller;

import com.xr.boot.service.BasDeliveryStandardService;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basDeliveryStandard")
@Slf4j
@Api(tags = "权限接口")
public class BasDeliveryStandardController {
    @Autowired
    private BasDeliveryStandardService basDeliveryStandardService;
    @Autowired
    private RedisUtil redisUtil;
    @ApiOperation("收派标准")
    @RequestMapping("/findBasDeliveryStandardAll")
    public String findBasDeliveryStandardAll(){
        String basDeliveryStandardAll="";
        if(redisUtil.hasKey("com.xr.boot.controller.BasDeliveryStandardController")){
            log.debug("从redis中取出值");
            basDeliveryStandardAll=redisUtil.get("com.xr.boot.controller.BasDeliveryStandardController").toString();
            return basDeliveryStandardAll;
        }else {
            try {
                log.info("sdfcgvhjjv");
                basDeliveryStandardAll=basDeliveryStandardService.findBasDeliveryStandardAll(null);

                return basDeliveryStandardAll;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
}
