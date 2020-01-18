package com.xr.boot.dao.PacPackaging;

import com.xr.boot.entity.PacStock;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PacStockMapper {
    @Select("select id,WarehouseNo,ReservoirType,Transport,SubordinateUnit,DrawerNo,DrawerName,DrawerTime,Stats,Remark from PAC_Stock")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "warehouseNo", column = "warehouseNo"),
            @Result(column = "reservoirType", property = "pacGetBoundType",
                    one = @One(select = "com.xr.boot.dao.PacPackaging.PacGetBoundTypeMapper.findPacGetBoundTypeById", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "transport", column = "transport"),
            @Result(column = "subordinateUnit", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "drawerNo", column = "drawerNo"),
            @Result(property = "drawerName", column = "drawerName"),
            @Result(property = "drawerTime", column = "drawerTime"),
            @Result(property = "stats", column = "stats"),
            @Result(property = "remark", column = "remark")
    })
    List<PacStock> queryAllpacStock();
    @Select("select id,WarehouseNo,ReservoirType,Transport,SubordinateUnit,DrawerNo,DrawerName,DrawerTime,Stats,Remark from PAC_Stock where id=#{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "warehouseNo", column = "warehouseNo"),
            @Result(column = "reservoirType", property = "pacGetBoundType",
                    one = @One(select = "com.xr.boot.dao.PacPackaging.PacGetBoundTypeMapper.findPacGetBoundTypeById", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "transport", column = "transport"),
            @Result(column = "subordinateUnit", property = "syUnits",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "drawerNo", column = "drawerNo"),
            @Result(property = "drawerName", column = "drawerName"),

            @Result(property = "stats", column = "stats"),
            @Result(property = "remark", column = "remark")
    })
    PacStock queryOnebyid(int id);
    @Insert("insert into pac_stock(WarehouseNo,ReservoirType,Transport,SubordinateUnit,DrawerNo,DrawerName,DrawerTime,Stats,Remark) values(#{warehouseNo},#{reservoirType},#{transport},#{subordinateUnit},#{drawerNo},#{drawerName},#{drawerTime},#{stats},#{remark});")
    void addpacStock(PacStock pacStock);
    @Update("update pac_stock set reservoirType=#{reservoirType},Transport=#{transport},SubordinateUnit=#{subordinateUnit},DrawerNo=#{drawerNo},DrawerName=#{drawerName},DrawerTime=#{drawerTime},Remark=#{remark} where id=#{id}")
    void updatePacStock(PacStock pacStock);

}