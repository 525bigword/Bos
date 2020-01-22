package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.BasSubstitute;
import com.xr.boot.service.basicPackage.BasSubstituteService;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basSubstituteController")
@Slf4j
@Api(tags = "取派设置接口")
public class BasSubstituteController {
    @Autowired
    private BasSubstituteService basSubstituteService;
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/findBasSubstitutes")
    public Object findBasSubstitutes(){
        Object fbasSubstitutes = null;
        if (redisUtil.hasKey("com.xr.boot.controller.BasSubstituteController.findBasSubstitutes")) {
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.BasSubstituteController.findBasSubstitutes");
        } else {
            try {
                fbasSubstitutes= basSubstituteService.findBasSubstitutes(null);
                return fbasSubstitutes;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }

    @PostMapping("/findBasSubstituteByTerm")
    public List<BasSubstitute> findBasSubstituteByTerm(BasSubstitute basSubstitute){
        return basSubstituteService.findBasSubstituteByTerm(basSubstitute);
    }

    @PostMapping("/upBasSubstituteStateById")
    public int upBasSubstituteStateById(BasSubstitute basSubstitute){
        basSubstituteService.upBasSubstituteStateById(basSubstitute);
        redisUtil.del("com.xr.boot.controller.BasSubstituteController.findBasSubstitutes");
        return 1;
    }
    @PostMapping("/upBasSubstituteById")
    public int  upBasSubstituteById(BasSubstitute basSubstitute){
        basSubstituteService.upBasSubstituteById(basSubstitute);
        redisUtil.del("com.xr.boot.controller.BasSubstituteController.findBasSubstitutes");
        return 1;
    }
    @PostMapping("/saveBasSubstitute")
    public int saveBasSubstitute(BasSubstitute basSubstitute){
        basSubstituteService.saveBasSubstitute(basSubstitute);
        redisUtil.del("com.xr.boot.controller.BasSubstituteController.findBasSubstitutes");
        return 1;
    }
}
