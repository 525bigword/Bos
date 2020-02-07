package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.SyEmp;
import com.xr.boot.entity.SyUnits;
import com.xr.boot.service.system.SyUnitsService;
import com.xr.boot.util.DateUtil;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/syUnitsController")
@Slf4j
@Api(tags = "公司接口")
public class SyUnitsController {
    @Autowired
    private SyUnitsService syUnitsService;
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/findSyUnits")
    public Object findSyUnits() {
        Object fSyUnits = null;
        if (redisUtil.hasKey("com.xr.boot.controller.basicPackage.SyUnitsController.findSyUnits")) {
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.basicPackage.SyUnitsController.findSyUnits");
        } else {
            try {
                fSyUnits= syUnitsService.findSyUnits();
                return fSyUnits;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
    @GetMapping("/findsyunitsbyparentid")
    public Object findSyUnitsByparentid(SyUnits syUnits) {
        System.out.println(syUnits);
        String key=
                "com.xr.boot.controller.basicPackage.SyUnitsController.findSyUnitsByParentid"+syUnits.getParentid()+syUnits.getName();
        if(redisUtil.hasKey(key)){
            return redisUtil.get(key);
        }
        return syUnitsService.findSyUnitByParentId(syUnits);

    }
    @PostMapping("/add")
    public ResponseEntity saveSyUnit(SyUnits syUnits) {
        syUnits.setOperationTime(DateUtil.getTime());
        try {
            syUnitsService.saveSyUnit(syUnits);
            return new ResponseEntity("",HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.NOT_MODIFIED);
        }
    }
    @PostMapping("/edit")
    public void upSyUnit(SyUnits syUnits) {
        syUnits.setOperationTime(DateUtil.getTime());
        try {
            syUnitsService.upSyUnit(syUnits);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/del")
    public ResponseEntity upSyUnit(@RequestParam("ids[]") List<Integer> ids) {
        try {
            if(ids.size()>0) {
                syUnitsService.delSyUnit(ids);
                return new ResponseEntity(HttpStatus.OK);
            }
            return new ResponseEntity(HttpStatus.NOT_MODIFIED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.NOT_MODIFIED);
        }
    }

}
