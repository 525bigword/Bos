package com.xr.boot.controller.accBusinessAdmissibility;

import com.xr.boot.entity.AccBusinessAdmissibility;
import com.xr.boot.service.accBusinessAdmissibility.AccBusinessAdmissibilityService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @RequestMapping("/saveAccBusinessAdmissibility")
    public void addAccBusinessAdmissibility(AccBusinessAdmissibility accBusinessAdmissibility) {
        accBusinessAdmissibilityService.addAccBusinessAdmissibility(accBusinessAdmissibility);
    }
    /**
     * 业务受理查询
     * @return
     */
    @RequestMapping("/findAllAccBusinessAdmissibility")
    public List<AccBusinessAdmissibility> findAllAccBusinessAdmissibility() {
        return accBusinessAdmissibilityService.findAllAccBusinessAdmissibility();
    }
    /**
     * 业务受理多条件查询
     * @param accBusinessAdmissibility
     * @return
     */
    @RequestMapping("/findAllWhereAccBusinessAdmissibility")
    public List<AccBusinessAdmissibility> findAllWhereAccBusinessAdmissibility(AccBusinessAdmissibility accBusinessAdmissibility) {
        return accBusinessAdmissibilityService.findAllWhereAccBusinessAdmissibility(accBusinessAdmissibility);
    }
}
