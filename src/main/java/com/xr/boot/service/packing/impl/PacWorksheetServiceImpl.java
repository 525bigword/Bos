package com.xr.boot.service.packing.impl;

import com.xr.boot.dao.packing.PacWorksheetMapper;
import com.xr.boot.entity.PacWorksheet;
import com.xr.boot.service.packing.PacWorksheetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class PacWorksheetServiceImpl implements PacWorksheetService {
    @Autowired
    private PacWorksheetMapper pacWorksheetMapper;
    @Transactional
    @Override
    public List<PacWorksheet> findPacWorksheetsByTrem(PacWorksheet pacWorksheet) {
        return pacWorksheetMapper.findPacWorksheetsByTrem(pacWorksheet);
    }
}
