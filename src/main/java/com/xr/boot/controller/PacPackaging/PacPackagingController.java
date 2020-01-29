package com.xr.boot.controller.PacPackaging;

import com.alibaba.fastjson.JSON;
import com.xr.boot.entity.PacOutBoundType;
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
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
    @Autowired
    private SyEmp syEmp;
    @Autowired
    private PacPackaging pacPackaging;
/**
 * 包装材料物品管理初始查询的方法
 */
@ApiOperation(value="获取包装材料的所有信息",notes="暂时无需参数", httpMethod = "POST")
@RequestMapping("/pacpackaging/queryAllpacpackaging")
public Return queryAllpacpackaging(){
    System.out.println("刷新");
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
public void addPacpackaging(PacPackaging packaging,String empName,String type) {
    System.out.println(packaging+","+empName+"进");
   SyEmp syEmps=pacPackagingService.selectIdbyname(empName);
    System.out.println(syEmps);
    Long id = syEmps.getId();
    long types=Long.parseLong(type);
    packaging.setPacOutBoundType(new PacOutBoundType(types,""));
    packaging.setMeasurementUnit("个");
/*    packaging.setOperatorId(Integer.parseInt(id.toString()));*/
    syEmp.setId(Integer.parseInt(id.toString()));
    packaging.setSyEmp(syEmp);
    packaging.setOperationUnitid(syEmps.getEmpunit());
 pacPackagingService.addPacpackaging(packaging);
 //清理缓存
    redisUtil.del("com.xr.boot.controller.PacPackagingController.queryAllpacpackaging");
    System.out.println("清理缓存");
}
@ApiOperation(value = "修改包装材料信息",notes="需要", httpMethod = "POST")
@RequestMapping("/pacpackaging/updatePacpackaging")
public void updatePacpackaging(PacPackaging packaging,String type){
    long types=Long.parseLong(type);
    packaging.setPacOutBoundType(new PacOutBoundType(types,""));
pacPackagingService.updatePacpackaging(packaging);
//清理缓存
    redisUtil.del("com.xr.boot.controller.PacPackagingController.queryAllpacpackaging");
    System.out.println("清理缓存");
}
    @ApiOperation(value = "物品编码",notes="无需参数", httpMethod = "POST")
@RequestMapping("/pacpackaging/getPacPackagingma")
    public long getPacPackagingma(){
    System.out.println("取编码");
    long a=new SnowflakeIdFactory().generateKey();
    System.out.println(a);
    return a;
}
    @ApiOperation(value = "根据id查一种",notes="需要参数", httpMethod = "POST")
    @RequestMapping(value="/pacpackaging/findOnebyid",produces = {"application/text;charset=UTF-8"})//加此中文乱码解除)
    public String findOnebyid(String id) {

        PacPackaging onebyid = pacPackagingService.findOnebyid(Integer.parseInt(id));
        String jsonString = JSON.toJSONString(onebyid);
        System.out.println(jsonString);
        return jsonString;
    }

    @ApiOperation(value = "作废",notes="需要参数", httpMethod = "POST")
    @RequestMapping("/pacpackaging/updatePaczuofei")
    public String updatePaczuofei(String test){
        String s = test.substring(1, test.length() - 1);
        System.out.println(s);
      /*  List<PacPackaging> packagingList = JSON.parseArray(test, PacPackaging.class);
        // Exception
        for(PacPackaging pacPackaging : packagingList){
            pacPackagingService.updatePaczuofei(pacPackaging);}*/
    if(!s.contains(",")){
          pacPackaging.setId(Integer.parseInt(s.substring(1, s.length() - 1)));
          pacPackagingService.updatePaczuofei(pacPackaging);

      }else {


        String[] split = s.split(",");
        for(int i=0;i<split.length;i++){
            System.out.println(split[i]);
            pacPackaging.setId(Integer.parseInt(split[i].substring(1, split[i].length() - 1)));
            pacPackagingService.updatePaczuofei(pacPackaging);

        }}
        //清理缓存
        redisUtil.del("com.xr.boot.controller.PacPackagingController.queryAllpacpackaging");
        System.out.println("清理缓存");
        return "success";

    }
    @ApiOperation(value = "多条件查询",notes="需要参数", httpMethod = "POST")
    @RequestMapping("/pacpackaging/findWherepacpackaging")
    public List<PacPackaging> findWherepacpackaging(PacPackaging packaging,String types,String oper,String plannedPrices){
        System.out.println("多条件查询"+types+""+plannedPrices);

        if(!types.equals("")){
        long type=Long.parseLong(types);
            packaging.setPacOutBoundType(new PacOutBoundType(type,""));

        }
        if(!plannedPrices.equals("")){
        double plannedPrice=Double.parseDouble(plannedPrices);
            System.out.println(plannedPrice);
        packaging.setPlannedPrice(plannedPrice);

        }
        if(packaging==null){
            return null;
        }
        System.out.println(packaging);
        List<PacPackaging> wherepacpackaging = pacPackagingService.findWherepacpackaging(packaging);
        if(wherepacpackaging==null){
            return null;
        }
      /*  String jsonString = JSON.toJSONString(wherepacpackaging);
        System.out.println(jsonString);*/
        return wherepacpackaging;

    }
}
