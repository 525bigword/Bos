package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.City;

import java.util.List;

public interface CityService {
    /**
     * 查询所有省市区
     * @param leveltype
     * @return
     */
    List<City> findCities(Integer leveltype);
}
