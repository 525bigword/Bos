package com.xr.boot.controller.PacPackaging;

import com.xr.boot.entity.PacManegement;
import com.xr.boot.entity.PacOutBoundType;
import com.xr.boot.entity.PacPackaging;
import com.xr.boot.entity.SyUnits;
import com.xr.boot.service.PacPackaging.PacManegementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
@Api(value = "包装材料库存管理", description = "关于库存管理的API")
@RequestMapping("/pacpackaging")
public class PacManegementController {
    @Autowired
    private PacManegementService pacManegementService;
    @Autowired
    private PacPackaging pacPackaging;
    @Autowired
    private SyUnits syUnits;
    @Autowired
    private PacOutBoundType pacOutBoundType;

    /**
     * 包装材料库存管理新增
     *
     * @param pacManegement
     */
    @RequestMapping("/addPacManegement")
    public void addPacManegement(PacManegement pacManegement, String goodsCode, String gunit) {
        pacPackaging.setItemCode(goodsCode);
        pacManegement.setGcode(pacPackaging);//设置货物编码
        syUnits.setId(Long.parseLong(gunit));
        pacManegement.setGunitss(syUnits);//设置所属单位
        System.out.println(pacManegement);
        pacManegementService.addPacManegement(pacManegement);
    }

    @ApiOperation(value = "包装材料库存管理信息API", notes = "暂时无需参数", httpMethod = "POST")
    @RequestMapping("/findAllPacManegement")
    public List<PacManegement> findAllPacManegement() {
        return pacManegementService.findAllPacManegement();
    }

    /**
     * 查询库存里是否有该物品
     *
     * @param goodsCode
     * @return
     */
    @RequestMapping("/findBygoodsCode")
    public int findBygoodsCode(String goodsCode) {
        return pacManegementService.findBygoodsCode(goodsCode);
    }

    /**
     * 根据物品编码查询库存数量
     *
     * @param goodsCode
     * @return
     */
    @RequestMapping("/findNumBygoodsCode")
    public String findNumBygoodsCode(String goodsCode) {
        return pacManegementService.findNumBygoodsCode(goodsCode);
    }

    /**
     * 多条件查询包装材料库存管理
     */
    @RequestMapping("/findWherePacManegement")
    public List<PacManegement> findWherePacManegement(PacManegement pacManegement, String itemCode, String type, String dw, String specifications) {
        pacPackaging.setItemCode(itemCode);
        pacPackaging.setSpecifications(specifications);
        if (!("".equals(type))) {
            pacOutBoundType.setId(Long.parseLong(type));
        }
        pacPackaging.setPacOutBoundType(pacOutBoundType);
        pacManegement.setGcode(pacPackaging);
        if (!("".equals(dw))) {
            syUnits.setId(Long.parseLong(dw));
        }
        pacManegement.setGunitss(syUnits);
        System.out.println(pacManegement);

        return pacManegementService.findWherePacManegement(pacManegement);
    }
}
