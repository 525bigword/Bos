package com.xr.boot.service.accBusinessAdmissibility;

import com.xr.boot.entity.AccProductList;

import java.util.List;

public interface AccProductlistService {
    /**
     * 查看全部产品信息
     */
    List<AccProductList> findAllAccProductlist();
}
