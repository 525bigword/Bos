package com.xr.boot.controller.log;

import com.xr.boot.entity.LogLogistics;
import com.xr.boot.service.log.LogLogisticssService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
@Api(value = "物流管理", description = "跟踪表查询的API")
@RequestMapping("/log")
public class LogLogisticssController {
    @Autowired
    private LogLogisticssService logLogisticssService;
    /**
     * 跟踪表查询
     */
    @ApiOperation(value = "查询全部跟踪表信息", httpMethod = "POST")
    @RequestMapping("/findAllLogLogistics")
    List<LogLogistics> findAllLogLogistics(){
return logLogisticssService.findAllLogLogistics();
    }
    /**
     * 跟踪表多条件查询
     */
    @ApiOperation(value = "多条件查询跟踪表信息", notes = "暂时无需参数", httpMethod = "POST")
    @RequestMapping("/findAllWhereLogLogistics")
    List<LogLogistics> findAllWhereLogLogistics(LogLogistics logLogistics){
        return logLogisticssService.findAllWhereLogLogistics(logLogistics);
    }
}
