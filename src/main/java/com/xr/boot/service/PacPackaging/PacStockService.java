package com.xr.boot.service.PacPackaging;

import com.xr.boot.entity.PacStock;

import java.util.List;

public interface PacStockService {
    /**
     * 查看入库管理
     * @return
     */
    List<PacStock> queryAllpacStock();

    /**
     * 根据id查询入库管理
     * @param id
     * @return
     */
    PacStock queryOnebyid(int id);

    /**
     * 入库管理新增记录
     * @param pacStock
     */
    void addpacStock(PacStock pacStock);

    /**
     * 入库记录修改
     * @param pacStock
     */
    void updatePacStock(PacStock pacStock);
    /**
     * 多条件查询包装材料入库记录
     */
    List<PacStock> findWherePacStock(PacStock pacStock);
}
