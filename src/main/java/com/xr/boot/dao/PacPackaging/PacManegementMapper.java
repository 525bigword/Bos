package com.xr.boot.dao.PacPackaging;

import com.xr.boot.dao.PacPackaging.provider.PacManegementSql;
import com.xr.boot.entity.PacManegement;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacManegementMapper {
    /**
     * 包装材料库存管理新增
     */
    @Insert("insert into Pac_Manegement(GoodsCode,StorageNum,Gunit) values(#{goodsCode},#{storageNum},#{gunit})")
    void addPacManegement(PacManegement pacManegement);

    /**
     * 查看包装材料库存管理
     * @return
     */
    @Select("select id,goodscode,storagenum,gunit from pac_manegement")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(column = "goodsCode", property = "gcode",
                    one = @One(select = "com.xr.boot.dao.PacPackaging.PacPackagingMapper.findPacPackagingByitemcode", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "storageNum", column = "storageNum"),
            @Result(column = "gunit", property = "gunitss",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            )
    })
    List<PacManegement> findAllPacManegement();

    /**
     * 查询库存里是否有该物品
     * @param goodsCode
     * @return
     */
    @Select("select count(*) from pac_manegement where goodsCode=#{goodsCode}")
    int findBygoodsCode(String goodsCode);

    /**
     * 根据物品编码查询库存数量
     * @param goodsCode
     * @return
     */
    @Select("select storageNum from pac_manegement where goodsCode=#{goodsCode}")
    String findNumBygoodsCode(String goodsCode);
    /**
     * 根据物品编码出库
     */
    @Update("update pac_manegement set storageNum=storageNum-#{storageNum} where goodsCode=#{goodsCode} ")
    void updatePacNum(int storageNum, String goodsCode);
    /**
     * 多条件查询包装材料库存管理
     */
    @SelectProvider(type = PacManegementSql.class,method = "findPacManegeMentWhere")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(column = "goodsCode", property = "gcode",
                    one = @One(select = "com.xr.boot.dao.PacPackaging.PacPackagingMapper.findPacPackagingByitemcode", fetchType = FetchType.DEFAULT)
            ),
            @Result(property = "storageNum", column = "storageNum"),
            @Result(column = "gunit", property = "gunitss",
                    one = @One(select = "com.xr.boot.dao.system.SyUnitsMapper.findSyUnitById", fetchType = FetchType.DEFAULT)
            )
    })
    List<PacManegement> findWherePacManegement(PacManegement pacManegement);

}
