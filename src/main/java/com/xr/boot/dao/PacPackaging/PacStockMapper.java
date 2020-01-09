package com.xr.boot.dao.PacPackaging;

import com.xr.boot.entity.PacStock;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PacStockMapper {
    @Select("select id,WarehouseNo,ReservoirType,Transport,SubordinateUnit,DrawerNo,DrawerName,DrawerTime,Stats,Remark from PAC_Stock")
    List<PacStock> queryAllpacStock();
    @Select("select id,WarehouseNo,ReservoirType,Transport,SubordinateUnit,DrawerNo,DrawerName,DrawerTime,Stats,Remark from PAC_Stock where id=#{id}")
    PacStock queryOnebyid(int id);

}