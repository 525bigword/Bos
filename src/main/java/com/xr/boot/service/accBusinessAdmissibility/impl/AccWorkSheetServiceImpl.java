package com.xr.boot.service.accBusinessAdmissibility.impl;

import com.xr.boot.dao.accBusinessAdmissibility.AccWorkSheetMapper;
import com.xr.boot.entity.AccWorkSheet;
import com.xr.boot.service.accBusinessAdmissibility.AccWorkSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccWorkSheetServiceImpl implements AccWorkSheetService {
    /**
     * 快速录入工作单
     * @param accWorkSheet
     */
    @Autowired
    private AccWorkSheetMapper accWorkSheetMapper;

    @Override
    public void addAccWorkSheet(AccWorkSheet accWorkSheet) {
accWorkSheetMapper.addAccWorkSheet(accWorkSheet);
    }
}
