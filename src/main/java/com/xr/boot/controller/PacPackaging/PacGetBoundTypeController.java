package com.xr.boot.controller.PacPackaging;

import com.xr.boot.entity.PacGetBoundType;
import com.xr.boot.service.PacPackaging.PacGetBoundTypeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
@Api(value="出库类型",description="出库类型的API")
@RequestMapping("/pacpackaging")
public class PacGetBoundTypeController {
    @Autowired
    private PacGetBoundTypeService pacGetBoundTypeService;
    @RequestMapping("/queryAllpacGetBoundtype")
    List<PacGetBoundType> queryAllpacGetBoundtype(){
        return pacGetBoundTypeService.queryAllpacGetBoundtype();
    }
}
