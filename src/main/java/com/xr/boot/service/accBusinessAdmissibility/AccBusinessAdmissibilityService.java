package com.xr.boot.service.accBusinessAdmissibility;

import com.xr.boot.entity.AccBusinessAdmissibility;
import org.springframework.stereotype.Service;

public interface AccBusinessAdmissibilityService {
    /**
     * 业务受理
     * @param accBusinessAdmissibility
     */
    void addAccBusinessAdmissibility(AccBusinessAdmissibility accBusinessAdmissibility);
}
