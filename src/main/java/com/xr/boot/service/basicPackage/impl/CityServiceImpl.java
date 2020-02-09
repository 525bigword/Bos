package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.CityMapper;
import com.xr.boot.entity.City;
import com.xr.boot.service.basicPackage.CityService;
import com.xr.boot.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public List<City> findCities(Integer leveltype) {
        return cityMapper.findCities(leveltype);
    }

    @Override
    public Object findCitiesByName(String name) {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("findCitiesByName", Collections.singletonList(cityMapper.findCitiesByName(name)));
        redisUtil.set("com.xr.boot.controller.CityController.findCitiesByName", maps);
        return redisUtil.get("com.xr.boot.controller.CityController.findCitiesByName");
    }


}
