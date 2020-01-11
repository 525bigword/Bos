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
}
