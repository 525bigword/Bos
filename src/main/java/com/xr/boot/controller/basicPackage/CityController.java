package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.City;
import com.xr.boot.service.basicPackage.CityService;
import com.xr.boot.util.RedisUtil;
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
@RequestMapping("/cityController")
@Slf4j
public class CityController {
    @Autowired
    private CityService cityService;
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/findCities")
    public Object findCities(Integer parentid){
        List<Map<String,Object>> list=new ArrayList<>();
        if (redisUtil.hasKey("com.xr.boot.controller.basicPackage.CityController.findCities")) {
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.basicPackage.CityController.findCities");
        } else {
            try {
                List<City> cities1 = cityService.findCities(1);
                List<City> cities2 = cityService.findCities(2);
                List<City> cities3 = cityService.findCities(3);
                for (City c1:cities1) {
                    Map<String,Object> shen=new HashMap<>();
                    List<Map<String,Object>> list1=new ArrayList<>();
                    for (City c2:cities2) {
                        if(c1.getId()==c2.getParentid()) {
                            Map<String, Object> map = new HashMap<>();
                            List<City> list2 = new ArrayList<>();
                            for (City c3 : cities3) {
                                if (c2.getId() == c3.getParentid()) {
                                    list2.add(c3);
                                }
                            }
                            map.put("name",c2.getName());
                            map.put("shi", list2);
                            list1.add(map);
                        }
                    }
                    shen.put("name",c1.getName());
                    shen.put("shen",list1);
                    list.add(shen);
                }
                redisUtil.set("com.xr.boot.controller.basicPackage.CityController.findCities",list);
            } catch (Exception e) {
        log.info("获取数据库资源异常。。。。");
        return null;
    }
}
        return list;
    }
}
