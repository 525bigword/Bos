package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.BasBasicArchives;
import com.xr.boot.entity.BasDeliveryStandard;
import com.xr.boot.service.basicPackage.BasBasicArchiveService;
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
@RequestMapping("/basicArchiveController")
@Slf4j
@Api(tags = "基础档案接口")
public class BasicArchiveController {
    @Autowired
    private BasBasicArchiveService basBasicArchiveService;
    @Autowired
    private RedisUtil redisUtil;
    @ApiOperation("收派标准")
    @PostMapping("/findBasicArchives")
    public Object findBasicArchives() {
        Object basBasicArchives = null;
        if (redisUtil.hasKey("com.xr.boot.controller.BasicArchiveController.findBasicArchives")) {
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.BasicArchiveController.findBasicArchives");
        } else {
            try {
                basBasicArchives = basBasicArchiveService.findBasicArchives(null);
                return basBasicArchives;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
    @PostMapping("/findBasBasicArchivesByTerm")
    public List<BasBasicArchives> findBasBasicArchivesByTerm(BasBasicArchives basBasicArchive){
        return basBasicArchiveService.findBasBasicArchivesByTerm(basBasicArchive);
    }
    @PostMapping("/upBasBasicArchivesById")
    public int upBasBasicArchivesById(BasBasicArchives basBasicArchive){
        basBasicArchiveService.upBasBasicArchivesById(basBasicArchive);
        redisUtil.del("com.xr.boot.controller.BasicArchiveController.findBasicArchives");
        return 0;
    }
    @PostMapping("/delBasBasicArchivesById")
    public int delBasBasicArchivesById(BasBasicArchives basBasicArchive){
        basBasicArchiveService.delBasBasicArchivesById(basBasicArchive);
        redisUtil.del("com.xr.boot.controller.BasicArchiveController.findBasicArchives");
        return 0;
    }
}
