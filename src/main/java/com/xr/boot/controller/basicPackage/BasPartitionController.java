package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.BasPartition;
import com.xr.boot.service.basicPackage.BasPartitionService;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basPartitionController")
@Slf4j
@Api(tags = "分区管理接口")
public class BasPartitionController {
    @Autowired
    private BasPartitionService basPartitionService;
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/findBasPartitions")
    public Object findBasPartitions() {
        Object findBasPartitions = null;
        if (redisUtil.hasKey("com.xr.boot.controller.BasPartitionController.findBasPartitions")) {
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.BasPartitionController.findBasPartitions");
        } else {
            try {
                findBasPartitions= basPartitionService.findBasPartitions(null);
                return findBasPartitions;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
    @PostMapping("/findBasPartitionByTerm")
    public List<BasPartition> findBasPartitionByTerm(BasPartition basPartition){
        return basPartitionService.findBasPartitionByTerm(basPartition);
    }
}
