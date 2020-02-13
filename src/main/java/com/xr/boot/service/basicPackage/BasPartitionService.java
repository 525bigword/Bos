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

    /**
     * 修改单个分区
     * @param basPartition
     */
    void upBasPartitionById(BasPartition basPartition);

    /**
     * 新增单个分区
     * @param basPartition
     */
    void saveBasPartition(BasPartition basPartition);

    /**
     * 删除单个分区
     * @param id
     */
    void delBasPartition(int id);

    /**
     * 修改所属区域
     * @param basPartition
     */
    void upBasPartitionByZoneCode(BasPartition basPartition);

 /**
  * 查区是否重复
  * @param basPartition
  * @return
  */
 List<String> findBasPartitionBycounty(BasPartition basPartition);
}
