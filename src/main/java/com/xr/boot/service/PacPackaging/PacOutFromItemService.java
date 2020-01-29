package com.xr.boot.service.PacPackaging;

import com.xr.boot.entity.PacOutFromItem;

import java.util.List;

public interface PacOutFromItemService {
    /*新增出库明细*/
    public void addPacOutFromItem(PacOutFromItem pacOutFromItem);
    /*根据出库单号查询入库明细*/
    public List<PacOutFromItem> findAllPacOutFromItem(String outhouseNo);
    /*根据出库明细编号编辑即修改入库明细信息*/
    public void updatePacOutFromItem(PacOutFromItem pacOutFromItem);
}
