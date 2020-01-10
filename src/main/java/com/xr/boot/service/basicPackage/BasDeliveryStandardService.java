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

    /**
     * 查询是否重复 0:修改 1:有重复
     * @param name
     * @return
     */
    List<String> findBasDeliveryStandardByName(String name);
    /**
     * 修改收派标准
     * @param basDeliveryStandard
     */
    void upBasDeliveryStandardByBasicFileNumber(BasDeliveryStandard basDeliveryStandard);

    /**
     * 修改派送标准的状态 0:正常 1:已作废
     * @param basDeliveryStandard
     */
    void upBasDeliveryStandardStatus(BasDeliveryStandard basDeliveryStandard);
}
