package com.xr.boot.dao.PacPackaging;

import com.xr.boot.entity.PacOutFromItem;
import com.xr.boot.entity.PacStockItem;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacOutFromItemMapper {
    /*新增出库明细*/
    @Insert("insert into pac_OutFromItem(outhouseNo,goodsCode,goodsName,storageNum,actualNum,plannedPrice,specifications,type,status,OUnit,oPrice) values(#{outhouseNo},#{goodsCode},#{goodsName},#{storageNum},#{actualNum},#{plannedPrice},#{specifications},#{type},#{status},#{OUnit},#{oPrice})")
    public void addPacOutFromItem(PacOutFromItem pacOutFromItem);
    /*根据出库单号查询入库明细*/
    @Select("select id,goodsCode,goodsName,storageNum,actualNum,plannedPrice,specifications,type,OUnit,oPrice from pac_OutFromItem where outhouseNo=#{outhouseNo}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "goodsCode", column = "goodsCode"),
            @Result(property = "goodsName", column = "goodsName"),
            @Result(property = "storageNum", column = "storageNum"),
            @Result(property = "actualNum", column = "actualNum"),
            @Result(property = "plannedPrice", column = "plannedPrice"),
            @Result(property = "specifications", column = "specifications"),
            @Result(column = "type", property = "pacGetBoundType",
                    one = @One(select = "com.xr.boot.dao.PacPackaging.PacGetBoundTypeMapper.findPacGetBoundTypeById", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "OUnit", column = "OUnit"),
            @Result(property = "oPrice", column = "oPrice")
    })
    public List<PacOutFromItem> findAllPacOutFromItem(String outhouseNo);
    /*根据出库明细编号编辑即修改入库明细信息*/
    @Update("update pac_OutFromItem set goodsCode=#{goodsCode},goodsName=#{goodsName},storageNum=#{storageNum},actualNum=#{actualNum},plannedPrice=#{plannedPrice},specifications=#{specifications},type=#{type},status=#{status}")
    public void updatePacOutFromItem(PacOutFromItem pacOutFromItem);
}
