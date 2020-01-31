package com.xr.boot.controller.accBusinessAdmissibility;

import com.xr.boot.entity.AccBusinessAdmissibility;
import com.xr.boot.service.accBusinessAdmissibility.AccBusinessAdmissibilityService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@Api(value="业务受理",description="关于业务受理信息的API")
@RequestMapping("/pacpackaging")
public class AccBusinessAdmissibilityController {
    @Autowired
    private AccBusinessAdmissibilityService accBusinessAdmissibilityService;
    /**
     * 业务受理
     * @param accBusinessAdmissibility
     */
    public void addAccBusinessAdmissibility(AccBusinessAdmissibility accBusinessAdmissibility) {
        accBusinessAdmissibilityService.addAccBusinessAdmissibility(accBusinessAdmissibility);
    }
}
