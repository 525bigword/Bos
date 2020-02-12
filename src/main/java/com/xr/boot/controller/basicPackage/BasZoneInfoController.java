package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.BasAssociateMember;
import com.xr.boot.entity.BasPartition;
import com.xr.boot.entity.BasZoneInfo;
import com.xr.boot.entity.City;
import com.xr.boot.service.basicPackage.BasAssociatememberService;
import com.xr.boot.service.basicPackage.BasPartitionService;
import com.xr.boot.service.basicPackage.BasZoneInfoService;
import com.xr.boot.service.basicPackage.CityService;
import com.xr.boot.service.basicPackage.impl.CityServiceImpl;
import com.xr.boot.util.RedisUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basZoneInfoController")
@Slf4j
@Api(tags = "管理定区接口")
public class BasZoneInfoController {
    @Autowired
    private BasPartitionService basPartitionService;
    @Autowired
    private BasPartition basPartition;
    @Autowired
    private BasAssociatememberService basAssociatememberService;
    @Autowired
    private BasZoneInfoService basZoneInfoService;
    @Autowired
    private CityService cityService;
    @Autowired
    private BasAssociateMember basAssociateMember;
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/findBasZoneInfos")
    public Object findBasZoneInfos() {
        Object findBasZoneInfos = null;
        if (redisUtil.hasKey("com.xr.boot.controller.BasZoneInfoController.findBasZoneInfos")) {
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.BasZoneInfoController.findBasZoneInfos");
        } else {
            try {
                findBasZoneInfos= basZoneInfoService.findBasZoneInfos(null);
                return findBasZoneInfos;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
    @PostMapping("/findBasZoneInfoTrem")
    public List<BasZoneInfo> findBasZoneInfoTrem(BasZoneInfo basZoneInfo) {
        return basZoneInfoService.findBasZoneInfoTrem(basZoneInfo);
    }
    @PostMapping("/upBasZoneInfoByID")
    public int upBasZoneInfoByID(BasZoneInfo basZoneInfo){
        String delxjy=basZoneInfo.getDelxjy();
        String deldz=basZoneInfo.getDeldz();
        String addxjy=basZoneInfo.getAddxjy();
        String adddz=basZoneInfo.getAdddz();
        if(!delxjy.equals("")){
            int[] xjy=turnStr(delxjy);
            for (int i:xjy ) {
                basAssociateMember.setId(i);
                basAssociatememberService.upBasAssociateMemberByZoneCode(basAssociateMember);
            }
            redisUtil.del("com.xr.boot.controller.BasAssociateMemberController.findBasAssociateMember");
        }
        if(!deldz.equals("")){
            int[] dz=turnStr(deldz);
            for (int i:dz ) {
                basPartition.setId(i);
                basPartitionService.upBasPartitionByZoneCode(basPartition);
            }
            redisUtil.del("com.xr.boot.controller.BasPartitionController.findBasPartitions");
        }

        if(!addxjy.equals("")){
            int[] xjy=turnStr(addxjy);
            for (int i:xjy ) {
                basAssociateMember.setId(i);
                basAssociateMember.setZoneCode(basZoneInfo.getZoneCode());
                basAssociatememberService.upBasAssociateMemberByZoneCode(basAssociateMember);
            }
            redisUtil.del("com.xr.boot.controller.BasAssociateMemberController.findBasAssociateMember");
        }

       if(!adddz.equals("")){
               int[] xjy=turnStr(adddz);
               for (int i:xjy ) {
                   basPartition.setId(i);
                   basPartition.setZoneCode(basZoneInfo.getZoneCode());
                   basPartitionService.upBasPartitionByZoneCode(basPartition);
               }
           redisUtil.del("com.xr.boot.controller.BasPartitionController.findBasPartitions");
       }
        basZoneInfoService.upBasZoneInfoByID(basZoneInfo);
        redisUtil.del("com.xr.boot.controller.BasZoneInfoController.findBasZoneInfos");
        return 1;
    }
    @PostMapping("/saveBasZoneInfo")
    public int saveBasZoneInfo(BasZoneInfo basZoneInfo){
        List<City> city = cityService.findCitiesByCity(basZoneInfo.getZoneName());
        if(city.size()==0){
            return 0;
        }
        List<String> zoneName = basZoneInfoService.findBasZoneInfoByZoneName(basZoneInfo);
        if(zoneName.size()>0){
            return 2;
        }
        basZoneInfoService.saveBasZoneInfo(basZoneInfo);
        redisUtil.del("com.xr.boot.controller.BasZoneInfoController.findBasZoneInfos");
        return 1;
    }
    @PostMapping("/upBasZoneInfoByStats")
    public int upBasZoneInfoByStats(long stats){
        basZoneInfoService.upBasZoneInfoByStats(stats);
        redisUtil.del("com.xr.boot.controller.BasZoneInfoController.findBasZoneInfos");
        return 1;
    }

    private int[] turnStr(String str){
        String[] tmp = str.split(",");
        int[] arr = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            arr[i] = Integer.valueOf(tmp[i]);
        }
        return arr;
    }
}
