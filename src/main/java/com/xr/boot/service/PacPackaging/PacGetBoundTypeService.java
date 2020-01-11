package com.xr.boot.service.PacPackaging;

import com.xr.boot.entity.PacGetBoundType;

import java.util.List;

public interface PacGetBoundTypeService {
    /**
     * 查询所有入库类型
     * @return
     */
    List<PacGetBoundType> queryAllpacGetBoundtype();
}
