package com.xr.boot.dao.basicPackage;

import com.xr.boot.entity.BasArea;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BasAreaMapper {
    List<BasArea> findBasSubstitutes(BasArea basArea);
}
