package com.xr.boot.controller.basicPackage;

import com.xr.boot.service.basicPackage.BigLogLogisticsControlTableService;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bigLogLogisticsControlTableController")
@Slf4j
@Api(tags = "大物流对照接口")
public class BigLogLogisticsControlTableController {
    @Autowired
    private BigLogLogisticsControlTableService bigLogLogisticsControlTableService;
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/findBigLogLogisticsControlTables")
    public Object findBigLogLogisticsControlTables() {
        Object findBigLogLogisticsControlTables = null;
        if (redisUtil.hasKey("com.xr.boot.controller.BigLogLogisticsControlTableController.findBigLogLogisticsControlTables")) {
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.BigLogLogisticsControlTableController.findBigLogLogisticsControlTables");
        } else {
            try {
                findBigLogLogisticsControlTables=bigLogLogisticsControlTableService.findBigLogLogisticsControlTables(null);
                return findBigLogLogisticsControlTables;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
}
