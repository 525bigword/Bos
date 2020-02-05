package com.xr.boot.service.accBusinessAdmissibility;

import com.xr.boot.entity.AccBusinessAdmissibility;

import java.util.List;

public interface AccBusinessAdmissibilityService {
    /**
     * 业务受理
     * @param accBusinessAdmissibility
     */
    void addAccBusinessAdmissibility(AccBusinessAdmissibility accBusinessAdmissibility);
    /**
     * 业务受理查询
     * @return
     */
    List<AccBusinessAdmissibility> findAllAccBusinessAdmissibility();

    /**
     * 业务受理多条件查询
     * @param accBusinessAdmissibility
     * @return
     */
    List<AccBusinessAdmissibility> findAllWhereAccBusinessAdmissibility(AccBusinessAdmissibility accBusinessAdmissibility);
}
