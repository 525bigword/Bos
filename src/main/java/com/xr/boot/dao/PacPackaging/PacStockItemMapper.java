package com.xr.boot.dao.PacPackaging;

import com.xr.boot.entity.PacStockItem;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacStockItemMapper {
    /*新增入库明细*/
    @Insert("insert into pac_stockItem(WarehouseNo,goodsCode,goodsName,storageNum,actualNum,plannedPrice,specifications,type,status) values(#{warehouseNo},#{goodsCode},#{goodsName},#{storageNum},#{actualNum},#{plannedPrice},#{specifications},#{type},#{status})")
    public void addPacStockItem(PacStockItem pacStockItem);
    /*根据入库单号查询入库明细*/
    @Select("select id,goodsCode,goodsName,storageNum,actualNum,plannedPrice,specifications,type,status from pac_stockItem where WarehouseNo=#{warehouseNo}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "goodsCode", column = "goodsCode"),
            @Result(property = "goodsName", column = "goodsName"),
            @Result(property = "storageNum", column = "storageNum"),
            @Result(property = "actualNum", column = "actualNum"),
            @Result(property = "plannedPrice", column = "plannedPrice"),
            @Result(property = "specifications", column = "specifications"),
            @Result(column = "type", property = "pacOutBoundType",
                    one = @One(select = "com.xr.boot.dao.PacPackaging.PacOutBoundTypeMapper.findPacTypeById", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "status", column = "status")
    })
    public List<PacStockItem> findAllPacStockItem(String warehouseNo);
    /*根据入库明细编号编辑即修改入库明细信息*/
    @Update("update pacstockItem set goodsCode=#{goodsCode},goodsName=#{goodsName},storageNum=#{storageNum},actualNum=#{actualNum},plannedPrice=#{plannedPrice},specifications=#{specifications},type=#{type},status=#{status}")
    public void updatePacStockItem(PacStockItem pacStockItem);
}
