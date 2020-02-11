package com.xr.boot.service.basicPackage;

import com.xr.boot.entity.BasAssociateMember;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BasAssociatememberService {
    /**
     * 查询所有关联小件员
     * @param
     * @return
     */
    Object findBasAssociateMember();

    /**
     * 根据id修改
     * @param basAssociateMember
     */
    void upBasAssociateMemberById(BasAssociateMember basAssociateMember);

    /**
     * 新增小件员
     * @param basAssociateMember
     */
    void saveBasAssociateMember(BasAssociateMember basAssociateMember);

    /**
     * 删除小件员
     * @param basAssociateMember
     */
    void delBasAssociateMemberById(BasAssociateMember basAssociateMember);

    /**
     * 查人员是否重复
     * @param basAssociateMember
     * @return
     */
    List<String> findBasAssociateMemberByEmpNo(BasAssociateMember basAssociateMember);

    /**
     * 根据定区编码查找小件员
     * @param zoneCode
     * @return
     */
    List<BasAssociateMember> findBasAssociateMemberByZoneCode(String zoneCode);

    /**
     * 修改小件员所属定区
     * @param basAssociateMember
     */
    void upBasAssociateMemberByZoneCode(BasAssociateMember basAssociateMember);
}
