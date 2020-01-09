package com.xr.boot.service.basicPackage;


import com.xr.boot.entity.BasDeliveryStandard;

import java.util.List;

public interface BasDeliveryStandardService {
    /**
     * 查询收派标准
     * @param basDeliveryStandard
     * @return
     */
    Object findBasDeliveryStandardAll(BasDeliveryStandard basDeliveryStandard);
    /**
     * 按条件查询收派标准
     */
    List<BasDeliveryStandard> findBasDeliveryStandardByTerm(BasDeliveryStandard basDeliveryStandard);
}
