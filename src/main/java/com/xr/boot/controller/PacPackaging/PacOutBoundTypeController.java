package com.xr.boot.controller.PacPackaging;

import com.xr.boot.ienum.Return;
import com.xr.boot.ienum.StausEnum;
import com.xr.boot.service.PacPackaging.PacOutBoundTypeService;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Api(value="包装材料类型",description="包装材料类型接口")
@RestController
@Controller
@Slf4j
public class PacOutBoundTypeController {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private PacOutBoundTypeService pacOutBoundTypeService;
    @RequestMapping("/pacpackaging/queryAllpactype")
    public Return queryAllpactype() {
        Map<String, List<Object>> pacOut = null;
        if (redisUtil.hasKey("com.xr.boot.controller.PacPackagingController.queryAllpactype")) {

            log.debug("从redis中取出值");
            return new Return(StausEnum.SUCCESS, redisUtil.get("com.xr.boot.controller.PacPackagingController.queryAllpactype"));
        } else {
            try {
                pacOut = pacOutBoundTypeService.queryAllpactype();

                return new Return(StausEnum.SUCCESS, pacOut);
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return new Return(StausEnum.NO, null);
            }
        }
    }
}
