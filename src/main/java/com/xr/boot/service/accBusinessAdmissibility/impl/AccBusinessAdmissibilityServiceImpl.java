package com.xr.boot.service.accBusinessAdmissibility.impl;

import com.xr.boot.dao.accBusinessAdmissibility.AccBusinessAdmissibilityMapper;
import com.xr.boot.entity.AccBusinessAdmissibility;
import com.xr.boot.service.accBusinessAdmissibility.AccBusinessAdmissibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccBusinessAdmissibilityServiceImpl implements AccBusinessAdmissibilityService {
@Autowired
private AccBusinessAdmissibilityMapper accBusinessAdmissibilityMapper;
    /**
     * 业务受理
     * @param accBusinessAdmissibility
     */
    @Override
    public void addAccBusinessAdmissibility(AccBusinessAdmissibility accBusinessAdmissibility) {
        accBusinessAdmissibilityMapper.addAccBusinessAdmissibility(accBusinessAdmissibility);
    }
}
