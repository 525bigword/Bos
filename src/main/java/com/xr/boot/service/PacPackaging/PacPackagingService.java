package com.xr.boot.service.PacPackaging;

import com.xr.boot.entity.PacPackaging;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface PacPackagingService {
    /**
     * 获取包装材料的所有信息
     * @return
     */
    Map<String,List<Object>> queryAllpacpackaging();

    /**
     * 新增包装材料
     * @param pacPackaging
     */
    public void addPacpackaging(PacPackaging pacPackaging);

    /**
     * 修改包装材料信息
     * @param pacPackaging
     */
    public void updatePacpackaging(PacPackaging pacPackaging);
}
