package com.xr.boot.controller.PacPackaging;

import com.alibaba.fastjson.JSON;
import com.xr.boot.entity.PacPackagingMateriarOutBoundFrom;
import com.xr.boot.entity.SyUnits;
import com.xr.boot.service.PacPackaging.PacPackagingMateriarOutBoundFromService;
import com.xr.boot.service.system.SyUnitsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

@RestController
@RequestMapping("/pacpackaging")
@Api(value="出库管理",description="出库管理管理的API")
public class pacPackagingMateriarOutBoundFromController {
    @Autowired
    private PacPackagingMateriarOutBoundFromService pacPackagingMateriarOutBoundFromService;
    @Autowired
    private SyUnitsService syUnitsService;
    @ApiOperation(value = "查看所有正常运作的单位",notes="暂时无需参数", httpMethod = "POST")
    @RequestMapping("/findAllSyUnits")
    List<SyUnits> findAllSyUnits(){
        System.out.println("查看所有正常运作的单位");
        List<SyUnits> allSyUnits = syUnitsService.findSyUnitAllByStats(0);

        return allSyUnits;
    }
    @ApiOperation(value = "查看出库管理记录",notes="暂时无需参数", httpMethod = "POST")
@RequestMapping("/findAllPacOutBoundFrom")
List<PacPackagingMateriarOutBoundFrom> findAllPacOutBoundFrom(){
        List<PacPackagingMateriarOutBoundFrom> allPacOutBoundFrom = pacPackagingMateriarOutBoundFromService.findAllPacOutBoundFrom();
        System.out.println(JSON.toJSONString(allPacOutBoundFrom));
        return allPacOutBoundFrom;
}
    @ApiOperation(value = "新增出库管理记录",notes="需参数", httpMethod = "POST")
    @RequestMapping("/insertPacPackagingOutFrom")
    void insertPacPackagingOutFrom(PacPackagingMateriarOutBoundFrom pacPackagingMateriarOutBoundFrom){

pacPackagingMateriarOutBoundFromService.insertPacPackagingOutFrom(pacPackagingMateriarOutBoundFrom);
    }
}
