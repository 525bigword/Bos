package com.xr.boot.controller.basicPackage;

import com.xr.boot.service.basicPackage.BasBasicArchivesEntryService;
import com.xr.boot.service.basicPackage.BasDeliveryStandardService;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("basBasicArchivesEntry")
@Slf4j
@Api(tags = "基础档案条目")
public class BasBasicArchivesEntryController {
    @Autowired
    private BasBasicArchivesEntryService basBasicArchivesEntryService;
    @Autowired
    private RedisUtil redisUtil;
    @ApiOperation("基本档案条目标准")
    @PostMapping("/findBasBasicArchivesEntryByParentID")
    public Object findBasBasicArchivesEntryByParentID(int parentID) {
        Object basBasBasicArchivesEntry = null;
        if(redisUtil.hasKey("com.xr.boot.controller.basicPackage.BasBasicArchivesEntryController.findBasBasicArchivesEntryByParentID")){
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.basicPackage.BasBasicArchivesEntryController.findBasBasicArchivesEntryByParentID");
        }else {
            try {
                basBasBasicArchivesEntry = basBasicArchivesEntryService.findBasBasicArchivesEntryByParentID(parentID);
                return basBasBasicArchivesEntry;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
}
