package com.xr.boot.controller.accBusinessAdmissibility;

import com.xr.boot.entity.AccWorkSheet;
import com.xr.boot.service.accBusinessAdmissibility.AccWorkSheetService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@Api(value="受理",description="受理的API")
@RequestMapping("/pacpackaging")
public class AccWorkSheetController {
    @Autowired
    private AccWorkSheetService accWorkSheetService;
    /**
     * 快速录入工作单
     * @param accWorkSheet
     */
    public void addAccWorkSheet(AccWorkSheet accWorkSheet) {
        accWorkSheetService.addAccWorkSheet(accWorkSheet);
    }
}
