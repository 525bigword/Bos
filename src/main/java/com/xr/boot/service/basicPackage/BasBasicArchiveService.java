package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BasBasicArchives;
import com.xr.boot.entity.BasDeliveryStandard;

import java.util.List;


public interface BasBasicArchiveService {
    /**
     * 查询基础档案(查询全部)
     * @param basBasicArchive
     * @return
     */
    Object findBasicArchives(BasBasicArchives basBasicArchive);
    /**
     * 按条件查询收派标准
     */
    List<BasBasicArchives> findBasBasicArchivesByTerm(BasBasicArchives BasBasicArchive);

    /**
     * 查询是否有重复
     * @param name
     * @return
     */
    List<String> findBasBasicArchivesByName(String name);

    /**
     * 按id修改
     * @param basBasicArchive
     */
    void upBasBasicArchivesById(BasBasicArchives basBasicArchive);

    /**
     * 取消基础档案  (删除)
     * @param basBasicArchive
     */
    void delBasBasicArchivesById(BasBasicArchives basBasicArchive);

    /**
     * 基础档案添加
     * @param basBasicArchive
     */
    void saveBasBasicArchives(BasBasicArchives basBasicArchive);
}
