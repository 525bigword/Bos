package com.xr.boot.controller.PacPackaging;

import com.xr.boot.entity.PacGetBoundType;
import com.xr.boot.service.PacPackaging.PacGetBoundTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
@Api(value="入库类型",description="入库类型的API")
@RequestMapping("/pacpackaging")
public class PacGetBoundTypeController {
    @Autowired
    private PacGetBoundTypeService pacGetBoundTypeService;
    @ApiOperation(value = "查看入库类型的接口",notes="暂时无需参数", httpMethod = "POST")
    @RequestMapping("/queryAllpacGetBoundtype")
    List<PacGetBoundType> queryAllpacGetBoundtype(){
        return pacGetBoundTypeService.queryAllpacGetBoundtype();
    }
}
