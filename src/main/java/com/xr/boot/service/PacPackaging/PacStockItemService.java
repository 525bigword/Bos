package com.xr.boot.service.PacPackaging;

import com.xr.boot.entity.PacStockItem;

import java.util.List;

public interface PacStockItemService {
    /*新增入库明细*/
    public void addPacStockItem(PacStockItem pacStockItem);
    /*根据入库单号查询入库明细*/
    public List<PacStockItem> findAllPacStockItem(String warehouseNo);
    /*根据入库明细编号编辑即修改入库明细信息*/
    public void updatePacStockItem(PacStockItem pacStockItem);
}
