package com.xr.boot.service.PacPackaging;

import com.xr.boot.entity.PacManegement;
import java.util.List;

public interface PacManegementService {
    /**
     * 包装材料库存管理新增
     */
    void addPacManegement(PacManegement pacManegement);
    /**
     * 查看包装材料库存管理
     * @return
     */
    List<PacManegement> findAllPacManegement();

    /**
     * 查询库存里是否有该物品
     * @param goodsCode
     * @return
     */
    int findBygoodsCode(String goodsCode);
    /**
     * 根据物品编码查询库存数量
     * @param goodsCode
     * @return
     */
    String findNumBygoodsCode(String goodsCode);
    /**
     * 根据物品编码出库
     */
    void updatePacNum(int storageNum, String goodsCode);
    /**
     * 多条件查询包装材料库存管理
     */
    List<PacManegement> findWherePacManegement(PacManegement pacManegement);
}
