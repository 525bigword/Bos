package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.BasDeliveryStandard;
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
@RequestMapping("basDeliveryStandard")
@Slf4j
@Api(tags = "权限接口")
public class BasDeliveryStandardController {
    private  SnowflakeIdFactory snowflakeIdFactory=new SnowflakeIdFactory();
    @Autowired
    private BasDeliveryStandardService basDeliveryStandardService;
    @Autowired
    private RedisUtil redisUtil;
    @ApiOperation("收派标准")
    @PostMapping("/findBasDeliveryStandardAll")
    public Object findBasDeliveryStandardAll(){
        Object basDeliveryStandardAll = null;
        if(redisUtil.hasKey("com.xr.boot.controller.BasDeliveryStandardController.findBasDeliveryStandardAll")){
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.BasDeliveryStandardController.findBasDeliveryStandardAll");
        }else {
            try {
                basDeliveryStandardAll = basDeliveryStandardService.findBasDeliveryStandardAll(null);
                return basDeliveryStandardAll;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
    @PostMapping("/findBasDeliveryStandards")
    public List<BasDeliveryStandard> findBasDeliveryStandardByTerm(BasDeliveryStandard basDeliveryStandard){
       // basDeliveryStandard.getSyEmp().setEmpName(basDeliveryStandard.getSyEmp().getEmpName());
        return basDeliveryStandardService.findBasDeliveryStandardByTerm(basDeliveryStandard);
    }
    @PostMapping("/upBasDeliveryStandardByBasicFileNumber")
    public int upBasDeliveryStandardByBasicFileNumber(BasDeliveryStandard basDeliveryStandard){
        List<String> nameList = basDeliveryStandardService.findBasDeliveryStandardByName(basDeliveryStandard.getName());
        if(nameList.size()!=0){
            return 1;
        }
        basDeliveryStandardService.upBasDeliveryStandardByBasicFileNumber(basDeliveryStandard);
        redisUtil.del("com.xr.boot.controller.BasDeliveryStandardController.findBasDeliveryStandardAll");
        return 0;
    }
    @PostMapping("/upBasDeliveryStandardStatus")
    public void upBasDeliveryStandardStatus(BasDeliveryStandard basDeliveryStandard){
        basDeliveryStandardService.upBasDeliveryStandardStatus(basDeliveryStandard);
        redisUtil.del("com.xr.boot.controller.BasDeliveryStandardController.findBasDeliveryStandardAll");
    }
    @PostMapping("/saveBasDeliveryStandard")
    public int saveBasDeliveryStandard(BasDeliveryStandard basDeliveryStandard) {
        List<String> nameList = basDeliveryStandardService.findBasDeliveryStandardByName(basDeliveryStandard.getName());
        if(nameList.size()!=0){
            return 1;
        }
        String basicFileNumber = snowflakeIdFactory.generateKey().toString();
        basDeliveryStandard.setBasicFileNumber(basicFileNumber);
        basDeliveryStandardService.saveBasDeliveryStandard(basDeliveryStandard);
        redisUtil.del("com.xr.boot.controller.BasDeliveryStandardController.findBasDeliveryStandardAll");
        return 0;
    }
}
