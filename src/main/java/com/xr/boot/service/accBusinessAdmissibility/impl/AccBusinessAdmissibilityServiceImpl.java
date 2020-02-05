package com.xr.boot.service.accBusinessAdmissibility.impl;

import com.xr.boot.dao.accBusinessAdmissibility.AccBusinessAdmissibilityMapper;
import com.xr.boot.entity.AccBusinessAdmissibility;
import com.xr.boot.service.accBusinessAdmissibility.AccBusinessAdmissibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    /**
     * 业务受理查询
     * @return
     */
    @Override
    public List<AccBusinessAdmissibility> findAllAccBusinessAdmissibility() {
        return accBusinessAdmissibilityMapper.findAllAccBusinessAdmissibility();
    }
    /**
     * 业务受理多条件查询
     * @param accBusinessAdmissibility
     * @return
     */
    @Override
    public List<AccBusinessAdmissibility> findAllWhereAccBusinessAdmissibility(AccBusinessAdmissibility accBusinessAdmissibility) {
        return accBusinessAdmissibilityMapper.findAllWhereAccBusinessAdmissibility(accBusinessAdmissibility);
    }
}
