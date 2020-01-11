package com.xr.boot.controller.PacPackaging;

import com.xr.boot.entity.PacOutType;
import com.xr.boot.service.PacPackaging.PacOutTypeService;
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
public class PacOutTypeContrller {
    @Autowired
    private PacOutTypeService pacOutTypeService;
    @RequestMapping("/queryAllpacOutType")
    List<PacOutType> queryAllpacOutType(){
        return pacOutTypeService.queryAllpacOutType();
    }
}
