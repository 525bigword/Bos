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

    /**
     * 查市下面的区
     * @param name
     * @return
     */
    Object findCitiesByName(String name);
}
