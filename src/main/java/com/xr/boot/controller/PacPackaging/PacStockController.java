package com.xr.boot.controller.PacPackaging;

import com.xr.boot.entity.PacStock;
import com.xr.boot.service.PacPackaging.PacStockService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
@Api(value="入库管理",description="入库管理管理的API")
@RequestMapping("/pacpackaging")
public class PacStockController {
    @Autowired
    private PacStockService pacStockService;
    @RequestMapping("/queryAllpacStock")
  public List<PacStock> queryAllpacStock(){
      return pacStockService.queryAllpacStock();
  }
}
