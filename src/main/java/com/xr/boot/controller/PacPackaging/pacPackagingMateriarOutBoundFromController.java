package com.xr.boot.controller.PacPackaging;

import com.xr.boot.entity.PacPackagingMateriarOutBoundFrom;
import com.xr.boot.service.PacPackaging.PacPackagingMateriarOutBoundFromService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pacpackaging")
@Api(value="出库管理",description="出库管理管理的API")
public class pacPackagingMateriarOutBoundFromController {
    @Autowired
    private PacPackagingMateriarOutBoundFromService pacPackagingMateriarOutBoundFromService;
    @ApiOperation(value = "查看出库管理记录",notes="暂时无需参数", httpMethod = "POST")
@RequestMapping("/findAllPacOutBoundFrom")
List<PacPackagingMateriarOutBoundFrom> findAllPacOutBoundFrom(){
        List<PacPackagingMateriarOutBoundFrom> allPacOutBoundFrom = pacPackagingMateriarOutBoundFromService.findAllPacOutBoundFrom();
        return allPacOutBoundFrom;
}

}
