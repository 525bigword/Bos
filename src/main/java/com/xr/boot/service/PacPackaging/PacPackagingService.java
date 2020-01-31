package com.xr.boot.service.PacPackaging;

import com.xr.boot.entity.PacPackaging;
import com.xr.boot.entity.SyEmp;
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
     * 根据id查询材料信息
     */
    PacPackaging findOnebyid(int id);

    /**
     * 多条件查询材料信息
     * @param pacPackaging
     * @return
     */
    List<PacPackaging> findWherepacpackaging(PacPackaging pacPackaging);
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
    /**
     * 包装材料作废登记
     */
    void updatePaczuofei(PacPackaging pacPackaging);
    SyEmp selectIdbyname(String empName);

    /**
     * 根据物品编码查询物品信息
     * @param itemCode
     * @return
     */
   PacPackaging findPacPackagingByitemcode(String itemCode);
}
