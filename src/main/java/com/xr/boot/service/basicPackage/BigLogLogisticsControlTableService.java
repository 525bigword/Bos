package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BigLogLogisticsControlTable;

import java.util.List;

public interface BigLogLogisticsControlTableService {
    /**
     * 查询全部大物流对照
     * @param bigLogLogisticsControlTable
     * @return
     */
    Object findBigLogLogisticsControlTables(BigLogLogisticsControlTable bigLogLogisticsControlTable);

    /**
     * 按条件查询全部大物流对照
     * @param bigLogLogisticsControlTable
     * @return
     */
    List<BigLogLogisticsControlTable> findBigLogLogisticsControlTableByTerm(BigLogLogisticsControlTable bigLogLogisticsControlTable);

    /**
     * 按ID修改大物流对照
     * @param bigLogLogisticsControlTable
     */
    void upBigLogLogisticsControlTableById(BigLogLogisticsControlTable bigLogLogisticsControlTable);

    /**
     * 新增大物流对照
     * @param bigLogLogisticsControlTable
     */
    void saveBigLogLogisticsControlTable(BigLogLogisticsControlTable bigLogLogisticsControlTable);

    /**
     * 按工号删除大物流对照
     * @param workSheetNo
     */
    void delBigLogLogisticsControlTableByWorkSheetNo(String workSheetNo);
}
