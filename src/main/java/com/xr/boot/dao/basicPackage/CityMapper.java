package com.xr.boot.dao.basicPackage;

import com.xr.boot.entity.City;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CityMapper {
    @Select("select * from city where leveltype=#{leveltype}")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "parentid",property = "parentid"),
            @Result(column = "citycode",property = "citycode"),
            @Result(column = "zipcode",property = "zipcode"),
            @Result(column = "pinyin",property = "pinyin")
    })
    List<City> findCities(Integer leveltype);
    @Select("select * from city where parentid=(select id from city where `name`=#{name})")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "parentid",property = "parentid"),
            @Result(column = "citycode",property = "citycode"),
            @Result(column = "zipcode",property = "zipcode"),
            @Result(column = "pinyin",property = "pinyin")
    })
    List<City> findCitiesByName(String name);

    @Select("select * from city where `name`=#{name}")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "parentid",property = "parentid"),
            @Result(column = "citycode",property = "citycode"),
            @Result(column = "zipcode",property = "zipcode"),
            @Result(column = "pinyin",property = "pinyin")
    })
    List<City> findCitiesByCity(String name);
}
