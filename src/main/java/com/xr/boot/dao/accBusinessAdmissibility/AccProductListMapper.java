package com.xr.boot.dao.accBusinessAdmissibility;

import com.xr.boot.entity.AccProductList;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccProductListMapper {
    /**
     * 查看全部产品信息
     */
    @Select("select id,produceName from acc_productList")
    List<AccProductList> findAllAccProductlist();
    /**
     * 根据id查产品信息
     */
    @Select("select id,produceName from acc_productList where id=#{id}")
    AccProductList findAccProListByid(int id);
}
