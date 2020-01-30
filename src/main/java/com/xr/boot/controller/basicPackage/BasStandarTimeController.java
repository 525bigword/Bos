package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.BasStandarTime;
import com.xr.boot.service.basicPackage.BasStandarTimeService;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basStandarTimeController")
@Slf4j
@Api(tags = "收派时间管理")
public class BasStandarTimeController {
    @Autowired
    private BasStandarTimeService basStandarTimeService;
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/findBasStandarTimes")
    public Object findBasStandarTimes(BasStandarTime basStandarTime){
        Object findBasStandarTimes = null;
        if (redisUtil.hasKey("com.xr.boot.controller.BasStandarTimeController.findBasStandarTimes")) {
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.BasStandarTimeController.findBasStandarTimes");
        } else {
            try {
                findBasStandarTimes= basStandarTimeService.findBasStandarTimes(null);
                return findBasStandarTimes;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
    @PostMapping("/findBasStandarTimeByTerm")
    public List<BasStandarTime> findBasStandarTimeByTerm(BasStandarTime basStandarTime){
        return basStandarTimeService.findBasStandarTimeByTerm(basStandarTime);
    }
    @PostMapping("/upBasStandarTimeById")
    public int upBasStandarTimeById(BasStandarTime basStandarTime){
        basStandarTimeService.upBasStandarTimeById(basStandarTime);
        redisUtil.del("com.xr.boot.controller.BasStandarTimeController.findBasStandarTimes");
        return 1;
    }
    @PostMapping("/saveBasStandarTime")
    public int saveBasStandarTime(BasStandarTime basStandarTime){
        List<String> list = basStandarTimeService.findBasStandarTimeByTimeName(basStandarTime);
        if(list.size()!=0){
            return 0;
        }
        basStandarTimeService.saveBasStandarTime(basStandarTime);
        redisUtil.del("com.xr.boot.controller.BasStandarTimeController.findBasStandarTimes");
        return 1;
    }
    @PostMapping("/delBasStandarTime")
    public int delBasStandarTime(int id){
        basStandarTimeService.delBasStandarTime(id);
        redisUtil.del("com.xr.boot.controller.BasStandarTimeController.findBasStandarTimes");
        return 1;
    }
}
