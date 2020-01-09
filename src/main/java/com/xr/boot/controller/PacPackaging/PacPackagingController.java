package com.xr.boot.controller.PacPackaging;

import com.alibaba.fastjson.JSON;
import com.xr.boot.entity.PacPackaging;
import com.xr.boot.entity.SyEmp;
import com.xr.boot.ienum.Return;
import com.xr.boot.ienum.StausEnum;
import com.xr.boot.service.PacPackaging.PacPackagingService;
import com.xr.boot.util.RedisUtil;
import com.xr.boot.util.SnowflakeIdFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@Api(value="包装材料管理",description="包装材料管理的API")
@RestController
@Controller
@Slf4j
public class PacPackagingController {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private PacPackagingService pacPackagingService;
/**
 * 包装材料物品管理初始查询的方法
 */
@ApiOperation(value="获取包装材料的所有信息",notes="暂时无需参数", httpMethod = "POST")
@RequestMapping("/pacpackaging/queryAllpacpackaging")
public Return queryAllpacpackaging(){
    Map<String, List<Object>> pacPack = null;
    if(redisUtil.hasKey("com.xr.boot.controller.PacPackagingController.queryAllpacpackaging")){

        log.debug("从redis中取出值");
       /* redisUtil.del("com.xr.boot.controller.PacPackagingController.queryAllpacpackaging");
        return null;*/
       return new Return(StausEnum.SUCCESS,redisUtil.get("com.xr.boot.controller.PacPackagingController.queryAllpacpackaging"));
    }else {
        try {
            pacPack = pacPackagingService.queryAllpacpackaging();

            return new Return(StausEnum.SUCCESS,pacPack);
        } catch (Exception e) {
            log.info("获取数据库资源异常。。。。");
            return new Return(StausEnum.NO, null);
        }
    }
 /*   String jsonString = JSON.toJSONString(pacPackagingService.queryAllpacpackaging());

    String jso = "{\"code\":0,\"msg\":\"\",\"count\":"+30+",\"data\":"+jsonString+"}";*/
}
@ApiOperation(value = "新增包装材料",notes="暂时无需参数", httpMethod = "POST")
@RequestMapping("/pacpackaging/addPacpackaging")
public void addPacpackaging(PacPackaging packaging,String empName) {
    System.out.println(packaging+","+empName+"进");
   SyEmp syEmps=pacPackagingService.selectIdbyname(empName);
    System.out.println(syEmps);
    Long id = syEmps.getId();
    packaging.setMeasurementUnit("个");
    packaging.setOperatorId(Integer.parseInt(id.toString()));
    packaging.setOperationUnitid(syEmps.getEmpunit());
 pacPackagingService.addPacpackaging(packaging);
}
@ApiOperation(value = "修改包装材料信息",notes="需要", httpMethod = "POST")
@RequestMapping("/pacpackaging/updatePacpackaging")
public void updatePacpackaging(PacPackaging packaging){
pacPackagingService.updatePacpackaging(packaging);
}
    @ApiOperation(value = "物品编码",notes="无需参数", httpMethod = "POST")
@RequestMapping("/pacpackaging/getPacPackagingma")
    public long getPacPackagingma(){
    System.out.println("取编码");
    long a=new SnowflakeIdFactory().generateKey();
    System.out.println(a);
    return a;
}
}
