package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.BasBasicArchivesEntry;
import com.xr.boot.service.basicPackage.BasBasicArchivesEntryService;
import com.xr.boot.service.basicPackage.BasDeliveryStandardService;
import com.xr.boot.util.RedisUtil;
import com.xr.boot.util.SnowflakeIdFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basBasicArchivesEntryController")
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
            try {
                basBasBasicArchivesEntry = basBasicArchivesEntryService.findBasBasicArchivesEntryByParentID(parentID);
                return basBasBasicArchivesEntry;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }

    }
    @PostMapping("/upBasBasicArchivesEntryById")
    public int upBasBasicArchivesEntryById(BasBasicArchivesEntry basBasicArchivesEntry){
        basBasicArchivesEntryService.upBasBasicArchivesEntryById(basBasicArchivesEntry);
        redisUtil.del("com.xr.boot.controller.basicPackage.BasBasicArchivesEntryController.findBasBasicArchivesEntryByParentID");
        return 1;
    }
    @PostMapping("/upBasBasicArchivesEntryAvailable")
    public int upBasBasicArchivesEntryAvailable(BasBasicArchivesEntry basBasicArchivesEntry){
        basBasicArchivesEntryService.upBasBasicArchivesEntryAvailable(basBasicArchivesEntry);
        redisUtil.del("com.xr.boot.controller.basicPackage.BasBasicArchivesEntryController.findBasBasicArchivesEntryByParentID");
        return 1;
    }

    @PostMapping("/findBasBasicArchivesEntryMCode")
    public  String findBasBasicArchivesEntryMCode(){
        SnowflakeIdFactory snowflakeIdFactory=new SnowflakeIdFactory(24);
        String McodeNumber = snowflakeIdFactory.generateKey().toString();
        return McodeNumber;
    }

    @PostMapping("/saveBasBasicArchivesEntry")
    public int saveBasBasicArchivesEntry(BasBasicArchivesEntry basBasicArchivesEntry){
        List<String> byName = basBasicArchivesEntryService.findBasBasicArchivesEntryByName(basBasicArchivesEntry);
        if(byName.size()!=0){
            return 1;
        }
        basBasicArchivesEntryService.saveBasBasicArchivesEntry(basBasicArchivesEntry);
        redisUtil.del("com.xr.boot.controller.basicPackage.BasBasicArchivesEntryController.findBasBasicArchivesEntryByParentID");
        return 0;
    }
}
