package com.xr.boot.controller.PacPackaging;

import com.alibaba.fastjson.JSON;
import com.xr.boot.entity.PacOutType;
import com.xr.boot.entity.PacPackagingMateriarOutBoundFrom;
import com.xr.boot.entity.SyEmp;
import com.xr.boot.entity.SyUnits;
import com.xr.boot.service.PacPackaging.PacPackagingMateriarOutBoundFromService;
import com.xr.boot.service.system.SyEmpService;
import com.xr.boot.service.system.SyUnitsService;
import com.xr.boot.util.SnowflakeIdFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/pacpackaging")
@Api(value = "出库管理", description = "出库管理管理的API")
public class PacPackagingMateriarOutBoundFromController {

    @Autowired
    private PacPackagingMateriarOutBoundFromService pacPackagingMateriarOutBoundFromService;
    @Autowired
    private SyEmpService syEmpService;
    @Autowired
    private SyUnitsService syUnitsService;
    @Autowired
    private PacOutType pacOutType;

    @ApiOperation(value = "查看所有正常运作的单位", notes = "暂时无需参数", httpMethod = "POST")
    @RequestMapping("/findAllSyUnits")
    List<SyUnits> findAllSyUnits() {
        System.out.println("查看所有正常运作的单位");
        List<SyUnits> allSyUnits = syUnitsService.findSyUnitAllByStats(0);

        return allSyUnits;
    }

    @ApiOperation(value = "根据工号查询员工", notes = "需要参数", httpMethod = "POST")
    @RequestMapping("/findSyEmpByEmpNo")
    SyEmp findSyEmpByEmpNo(SyEmp syEmp) {
        System.out.println("根据工号查询员工");
        SyEmp allSyEmp = syEmpService.findSyEmpByEmpNo(syEmp);
        if (allSyEmp == null) {
            return null;
        }
        return allSyEmp;
    }

    @ApiOperation(value = "根据员工编号查询员工", notes = "需要参数", httpMethod = "POST")
    @RequestMapping("/findSyEmpById")
    SyEmp findSyEmpById(String id) {
        int ids = Integer.parseInt(id);
        System.out.println("根据员工编号查询员工");
        SyEmp allSyEmp = syEmpService.findSyEmpById(ids);
        if (allSyEmp == null) {
            return null;
        }
        return allSyEmp;
    }

    @ApiOperation(value = "查看出库管理记录", notes = "暂时无需参数", httpMethod = "POST")
    @RequestMapping("/findAllPacOutBoundFrom")
    List<PacPackagingMateriarOutBoundFrom> findAllPacOutBoundFrom() {
        List<PacPackagingMateriarOutBoundFrom> allPacOutBoundFrom = pacPackagingMateriarOutBoundFromService.findAllPacOutBoundFrom();
        System.out.println(JSON.toJSONString(allPacOutBoundFrom));
        return allPacOutBoundFrom;
    }

    @ApiOperation(value = "新增出库管理记录", notes = "需参数", httpMethod = "POST")
    @RequestMapping("/addPacPackagingOutFrom")
    void insertPacPackagingOutFrom(PacPackagingMateriarOutBoundFrom pacPackagingMateriarOutBoundFrom, String outboundType, String affiliatedUnit, String issuedByTheUnit, String operatorUnit, String clienterid, String operEmpNo) {
        Long a = new SnowflakeIdFactory().generateKey();
        pacPackagingMateriarOutBoundFrom.setOutboundNumber(a.toString());//出库单号
        pacOutType.setId(Integer.parseInt(outboundType));
        pacPackagingMateriarOutBoundFrom.setPacOutType(pacOutType);//设置出库类型
        SyUnits syUnits1 = new SyUnits();
        syUnits1.setId(Integer.parseInt(affiliatedUnit));

        pacPackagingMateriarOutBoundFrom.setSaffiliatedUnit(syUnits1);//设置所属单位
        SyUnits syUnits2 = new SyUnits();
        syUnits2.setId(Integer.parseInt(issuedByTheUnit));
        pacPackagingMateriarOutBoundFrom.setSissuedByTheUnit(syUnits2);//设置下发单位
        SyUnits syUnits3 = new SyUnits();
        syUnits3.setId(Integer.parseInt(operatorUnit));
        SyEmp syEmp1 = new SyEmp();
        syEmp1.setId(Long.parseLong(clienterid.toString()));
        pacPackagingMateriarOutBoundFrom.setSyEmpc(syEmp1);//设置客户编号
        SyEmp syEmp2 = new SyEmp();
        syEmp2.setEmpNo(operEmpNo);
        pacPackagingMateriarOutBoundFrom.setSyEmpno(syEmp2);//设置经办人工号
        pacPackagingMateriarOutBoundFrom.setSosperatorUnit(syUnits3);//设置经办人单位*/


        System.out.println(pacPackagingMateriarOutBoundFrom);
        pacPackagingMateriarOutBoundFromService.insertPacPackagingOutFrom(pacPackagingMateriarOutBoundFrom);
    }
    /**
     * 多条件查询包装材料出库记录
     */
    @RequestMapping("/findWherePacagingMateriar")
    public List<PacPackagingMateriarOutBoundFrom> findWherePacagingMateriar(PacPackagingMateriarOutBoundFrom pacPackagingMateriarOutBoundFrom,String type,String dw,String xfdw,String khid,String khname,String lyrgh,String lyrname) {
if(!("".equals(type))&&type!=null){
        pacOutType.setId(Integer.parseInt(type));
        pacPackagingMateriarOutBoundFrom.setPacOutType(pacOutType);}
        if(!dw.equals("")&& dw!=null){
        SyUnits syUnits1 = new SyUnits();
        syUnits1.setId(Integer.parseInt(dw));
        pacPackagingMateriarOutBoundFrom.setSaffiliatedUnit(syUnits1);//设置所属单位
             }
            if(!xfdw.equals("")&& xfdw!=null){
        SyUnits syUnits2 = new SyUnits();
        syUnits2.setId(Integer.parseInt(xfdw));
        pacPackagingMateriarOutBoundFrom.setSissuedByTheUnit(syUnits2);//设置下发单位
                 }
        SyEmp syEmp1 = new SyEmp();
            syEmp1.setEmpName(khname);
pacPackagingMateriarOutBoundFrom.setSyEmpc(syEmp1);//设置客户编号
   /*     SyEmp syEmp2 = new SyEmp();
        syEmp2.setEmpName(lyrname);
        pacPackagingMateriarOutBoundFrom.setRecipient();*/
        System.out.println(pacPackagingMateriarOutBoundFrom);
        return pacPackagingMateriarOutBoundFromService.findWherePacagingMateriar(pacPackagingMateriarOutBoundFrom);
    }

}
