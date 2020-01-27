package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BasPartition;

import java.util.List;


public interface BasPartitionService {
    /**
     * 查询所有分区管理
     * @param basPartition
     * @return
     */
   Object findBasPartitions(BasPartition basPartition);

    /**
     * 按条件查询
     * @param basPartition
     * @return
     */
    List<BasPartition> findBasPartitionByTerm(BasPartition basPartition);
}
