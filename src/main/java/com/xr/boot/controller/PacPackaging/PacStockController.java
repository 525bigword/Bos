package com.xr.boot.controller.PacPackaging;

import com.xr.boot.entity.PacGetBoundType;
import com.xr.boot.entity.PacStock;
import com.xr.boot.entity.SyUnits;
import com.xr.boot.service.PacPackaging.PacStockService;
import com.xr.boot.util.SnowflakeIdFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
    @Autowired
    private SyUnits syUnits;
    @ApiOperation(value = "查看入库管理记录",notes="暂时无需参数", httpMethod = "POST")
    @RequestMapping("/queryAllpacStock")
  public List<PacStock> queryAllpacStock(){
      return pacStockService.queryAllpacStock();
  }
    @ApiOperation(value = "入库管理记录新增",notes="需参数", httpMethod = "POST")
  @RequestMapping("/addpacStock")
    public void addpacStock(PacStock pacStock,String reservoirType){
        System.out.println(reservoirType);
        syUnits.setId(2);
        pacStock.setSyUnits(syUnits);
        pacStock.setPacGetBoundType(new PacGetBoundType(Integer.parseInt(reservoirType),""));
        pacStock.setStats(0);
        Long a=new SnowflakeIdFactory().generateKey();
        pacStock.setWarehouseNo(a.toString());
        pacStockService.addpacStock(pacStock);
  }
    @ApiOperation(value = "根据id查入库记录",notes="需参数", httpMethod = "POST")
    @RequestMapping("/queryOnebyid")
   public PacStock queryOnebyid(int id){
        System.out.println("进根据id查询");
        PacStock pacStock = pacStockService.queryOnebyid(id);
        System.out.println(pacStock);

        return pacStock;
    }
    @ApiOperation(value = "入库管理记录修改",notes="需参数", httpMethod = "POST")
    @RequestMapping("/updatePacStock")
    public void updatePacStock(PacStock pacStock,String reservoirType){
        System.out.println(reservoirType);
        syUnits.setId(2);
        pacStock.setSyUnits(syUnits);
        pacStock.setPacGetBoundType(new PacGetBoundType(Integer.parseInt(reservoirType),""));
        pacStockService.updatePacStock(pacStock);
    }
    /**
     * 多条件查询包装材料入库记录
     */
    @RequestMapping("/findWherePacStock")
    public List<PacStock> findWherePacStock(PacStock pacStock,String rklx,String dw) {
        System.out.println(pacStock+".."+rklx+".."+dw+"..");
if(!("".equals(dw))){
        syUnits.setId(Long.parseLong(dw));
        pacStock.setSyUnits(syUnits);
}
if(!("".equals(rklx))){
        pacStock.setPacGetBoundType(new PacGetBoundType(Integer.parseInt(rklx),""));}
       return pacStockService.findWherePacStock(pacStock);
    }
}
