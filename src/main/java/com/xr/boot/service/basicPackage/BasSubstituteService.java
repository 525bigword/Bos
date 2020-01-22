package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BasSubstitute;

import java.util.List;


public interface BasSubstituteService {
    /**
     * 查询全部
     * @param basSubstitute
     * @return
     */
    Object findBasSubstitutes(BasSubstitute basSubstitute);

    /**
     * 按条件查询
     * @param basSubstitute
     * @return
     */
    List<BasSubstitute> findBasSubstituteByTerm(BasSubstitute basSubstitute);

    /**
     * 根据Id修改取派设置状态
     * @param basSubstitute
     */
    void upBasSubstituteStateById(BasSubstitute basSubstitute);

    /**
     * 修改取派设置 id
     * @param basSubstitute
     */
    void upBasSubstituteById(BasSubstitute basSubstitute);

    /**
     * 新增
     * @param basSubstitute
     */
    void saveBasSubstitute(BasSubstitute basSubstitute);
}
