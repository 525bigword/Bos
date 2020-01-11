package com.xr.boot.service.PacPackaging;

import com.xr.boot.entity.PacOutType;

import java.util.List;

public interface PacOutTypeService {
    /**
     * 查询所有出库类型
     * @return
     */
    List<PacOutType> queryAllpacOutType();
}
