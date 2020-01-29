package com.xr.boot.controller.PacPackaging;

import com.xr.boot.entity.PacOutFromItem;
import com.xr.boot.service.PacPackaging.PacOutFromItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pacpackaging")
@Api(value="出库明细",description="出库明细的API")
public class PacOutFromItemController {
        @Autowired
        private PacOutFromItemService pacOutFromItemService;
        @ApiOperation(value = "新增出库明细",notes="需参数", httpMethod = "POST")
        @RequestMapping("/addPacOutFromItem")
        public void addPacOutFromItem(PacOutFromItem pacOutFromItem){
            pacOutFromItemService.addPacOutFromItem(pacOutFromItem);
        }
        @ApiOperation(value = "查询出库明细",notes="需参数", httpMethod = "POST")
        @RequestMapping("/findAllPacOutFromItem")
        public List<PacOutFromItem> findAllPacOutFromItem(String outhouseNo){
            return pacOutFromItemService.findAllPacOutFromItem(outhouseNo);
        }
        @ApiOperation(value = "编辑出库明细",notes="需参数", httpMethod = "POST")
        @RequestMapping("/updatePacOutFromItem")
        public void updatePacOutFromItem(PacOutFromItem pacOutFromItem){
           pacOutFromItemService.updatePacOutFromItem(pacOutFromItem);
        }
}
