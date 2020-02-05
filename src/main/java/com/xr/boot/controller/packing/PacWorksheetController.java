package com.xr.boot.controller.packing;

import com.xr.boot.entity.PacWorksheet;
import com.xr.boot.service.packing.PacWorksheetService;
import com.xr.boot.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pacWorksheetController")
@Slf4j
public class PacWorksheetController {
    @Autowired
    private PacWorksheetService pacWorksheetService;
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/findPacWorksheetsByTrem")
    public List<PacWorksheet> findPacWorksheetsByTrem(PacWorksheet pacWorksheet) {
        return pacWorksheetService.findPacWorksheetsByTrem(pacWorksheet);
    }
}
