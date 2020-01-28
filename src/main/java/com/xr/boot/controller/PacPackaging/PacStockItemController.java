package com.xr.boot.controller.PacPackaging;

import com.xr.boot.entity.PacStockItem;
import com.xr.boot.service.PacPackaging.PacStockItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pacpackaging")
@Api(value="入库明细",description="入库明细的API")
public class PacStockItemController {
    @Autowired
    private PacStockItemService pacStockItemService;
    @ApiOperation(value = "新增入库明细",notes="需参数", httpMethod = "POST")
    @RequestMapping("/addPacStockItem")
    public void addPacStockItem(PacStockItem pacStockItem){
pacStockItemService.addPacStockItem(pacStockItem);
    }
    @ApiOperation(value = "查询入库明细",notes="需参数", httpMethod = "POST")
    @RequestMapping("/findAllPacStockItem")
    public List<PacStockItem> findAllPacStockItem(String warehouseNo){
       return pacStockItemService.findAllPacStockItem(warehouseNo);
    }
    @ApiOperation(value = "编辑入库明细",notes="需参数", httpMethod = "POST")
    @RequestMapping("/updatePacStockItem")
    public void updatePacStockItem(PacStockItem pacStockItem){
        pacStockItemService.updatePacStockItem(pacStockItem);
    }
}
