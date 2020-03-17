package com.xr.boot.service.sorting;

import com.xr.boot.entity.SorCheckBoundDetails;

import java.util.List;

public interface SorCheckBoundDetailService {
    /**按合包号查询盘库详情*/
    List<SorCheckBoundDetails> findSorCheckBoundDetailsByPacking(String packing) throws Exception;
}
