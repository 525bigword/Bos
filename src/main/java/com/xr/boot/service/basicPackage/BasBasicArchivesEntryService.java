package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BasBasicArchivesEntry;

import java.util.List;

public interface BasBasicArchivesEntryService {
    /**
     * 按父id查询基础档案条目
     * @param parentID
     * @return
     */
    Object findBasBasicArchivesEntryByParentID(int parentID);

    /**
     * 修改
     * @param basBasicArchivesEntry
     */
    void upBasBasicArchivesEntryById(BasBasicArchivesEntry basBasicArchivesEntry);

    /**
     * 作废
     * @param basBasicArchivesEntry
     */
    void upBasBasicArchivesEntryAvailable(BasBasicArchivesEntry basBasicArchivesEntry);

    /**
     * 新增基本档案条目
     * @param basBasicArchivesEntry
     */
    void saveBasBasicArchivesEntry(BasBasicArchivesEntry basBasicArchivesEntry);

    /**
     * 查询名称是否有重复
     * @param basBasicArchivesEntry
     * @return
     */
    List<String> findBasBasicArchivesEntryByName(BasBasicArchivesEntry basBasicArchivesEntry);
}
