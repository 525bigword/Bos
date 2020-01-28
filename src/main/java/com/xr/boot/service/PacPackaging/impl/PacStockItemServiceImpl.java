package com.xr.boot.service.PacPackaging.impl;

import com.xr.boot.dao.PacPackaging.PacStockItemMapper;
import com.xr.boot.entity.PacStockItem;
import com.xr.boot.service.PacPackaging.PacStockItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacStockItemServiceImpl implements PacStockItemService {
    @Autowired
    private PacStockItemMapper pacStockItemMapper;

    /**
     * 新增入库明细
     * @param pacStockItem
     */
    @Override
    public void addPacStockItem(PacStockItem pacStockItem) {
        pacStockItemMapper.addPacStockItem(pacStockItem);
    }

    /**
     *根据入库单号查询入库明细
     * @param warehouseNo
     * @return
     */
    @Override
    public List<PacStockItem> findAllPacStockItem(String warehouseNo) {
        return pacStockItemMapper.findAllPacStockItem(warehouseNo);
    }
    /**
     * 根据入库明细编号编辑即修改入库明细信息
     */
    @Override
    public void updatePacStockItem(PacStockItem pacStockItem) {
pacStockItemMapper.updatePacStockItem(pacStockItem);
    }
}
