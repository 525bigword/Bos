package com.xr.boot.service.packing;

import com.xr.boot.entity.PacWorksheet;

import java.util.List;

public interface PacWorksheetService {
    /**
     * 查询包装信息
     * @param pacWorksheet
     * @return
     */
    List<PacWorksheet> findPacWorksheetsByTrem(PacWorksheet pacWorksheet);
}
