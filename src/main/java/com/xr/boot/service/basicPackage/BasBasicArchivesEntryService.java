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
}
