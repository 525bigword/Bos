package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.BigLogLogisticsControlTable;
import com.xr.boot.service.basicPackage.BigLogLogisticsControlTableService;
import com.xr.boot.util.RedisUtil;
import com.xr.boot.util.SnowflakeIdFactory;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/bigLogLogisticsControlTableController")
@Slf4j
@Api(tags = "大物流对照接口")
public class BigLogLogisticsControlTableController {
    @Autowired
    private BigLogLogisticsControlTableService bigLogLogisticsControlTableService;
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/findBigLogLogisticsControlTables")
    public Object findBigLogLogisticsControlTables() {
        Object findBigLogLogisticsControlTables = null;
        if (redisUtil.hasKey("com.xr.boot.controller.BigLogLogisticsControlTableController.findBigLogLogisticsControlTables")) {
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.BigLogLogisticsControlTableController.findBigLogLogisticsControlTables");
        } else {
            try {
                findBigLogLogisticsControlTables=bigLogLogisticsControlTableService.findBigLogLogisticsControlTables(null);
                return findBigLogLogisticsControlTables;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
    @PostMapping("/findBigLogLogisticsControlTableByTerm")
    public List<BigLogLogisticsControlTable> findBigLogLogisticsControlTableByTerm(BigLogLogisticsControlTable bigLogLogisticsControlTable) {
        return bigLogLogisticsControlTableService.findBigLogLogisticsControlTableByTerm(bigLogLogisticsControlTable);
    }
    @PostMapping("/upBigLogLogisticsControlTableById")
    public int upBigLogLogisticsControlTableById(BigLogLogisticsControlTable bigLogLogisticsControlTable) {
        bigLogLogisticsControlTableService.upBigLogLogisticsControlTableById(bigLogLogisticsControlTable);
        redisUtil.del("com.xr.boot.controller.BigLogLogisticsControlTableController.findBigLogLogisticsControlTables");
        return 1;
    }
    @PostMapping("/delBigLogLogisticsControlTableByid")
    public int delBigLogLogisticsControlTableByid(int id) {
        bigLogLogisticsControlTableService.delBigLogLogisticsControlTableByWorkSheetNo(id);
        redisUtil.del("com.xr.boot.controller.BigLogLogisticsControlTableController.findBigLogLogisticsControlTables");
        return 1;
    }
    @PostMapping("/saveBigLogLogisticsControlTable")
    public int saveBigLogLogisticsControlTable(BigLogLogisticsControlTable bigLogLogisticsControlTable) {
        bigLogLogisticsControlTableService.saveBigLogLogisticsControlTable(bigLogLogisticsControlTable);
        redisUtil.del("com.xr.boot.controller.BigLogLogisticsControlTableController.findBigLogLogisticsControlTables");
        return 1;
    }
    @PostMapping("/findWorkSheetNoWaybillID")
    public  List<Map<String,String>> findWorkSheetNoWaybillID(){
        List<Map<String,String>> list=new ArrayList<>();
        Map<String,String> map1=new HashMap<>();
        SnowflakeIdFactory snowflakeIdFactory=new SnowflakeIdFactory(1,2);
        String WorkSheetNo = snowflakeIdFactory.generateKey().toString();
        map1.put("WorkSheetNo",WorkSheetNo);
        SnowflakeIdFactory snowflakeIdFactory1=new SnowflakeIdFactory(27);
        String WaybillID = snowflakeIdFactory1.generateKey().toString();
        map1.put("WaybillID",WaybillID);
        list.add(map1);
        return list;
    }

}
