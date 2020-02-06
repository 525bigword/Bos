package com.xr.boot.controller.accBusinessAdmissibility;

import com.xr.boot.entity.AccProductList;
import com.xr.boot.service.accBusinessAdmissibility.AccProductlistService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
@Api(value="产品",description="受理产品的API")
@RequestMapping("/pacpackaging")
public class AccProductlistController {
    @Autowired
    private AccProductlistService accProductlistService;
    /**
     * 查看全部产品信息
     */
    @RequestMapping("/findAllAccProductlist")
    List<AccProductList> findAllAccProductlist(){
        return accProductlistService.findAllAccProductlist();
    }
}
