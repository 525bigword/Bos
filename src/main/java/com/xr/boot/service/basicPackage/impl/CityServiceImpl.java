package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.CityMapper;
import com.xr.boot.entity.City;
import com.xr.boot.service.basicPackage.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;
    @Override
    public List<City> findCities(Integer leveltype) {
        return cityMapper.findCities(leveltype);
    }
}
