package com.xr.boot.controller.log;

import com.xr.boot.entity.LogLogisticsDetails;
import com.xr.boot.service.log.LogLogisticsDetailsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
@Api(value = "物流管理", description = "跟踪表查询物流明细的API")
@RequestMapping("/log")
public class LogLogisticsDetailsController {
    @Autowired
    private LogLogisticsDetailsService logLogisticsDetailsService;
    @ApiOperation(value = "根据物流序号查询跟踪表明细信息", httpMethod = "POST")
    @RequestMapping("/findAllLogLogisticsDetailsByLogisticsInt")
    List<LogLogisticsDetails> findAllLogLogisticsDetailsByLogisticsInt(String logisticsInt){
        return logLogisticsDetailsService.findAllLogLogisticsDetailsByLogisticsInt(logisticsInt);
    }
}
