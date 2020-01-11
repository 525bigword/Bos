package com.xr.boot.dao.PacPackaging;

import com.xr.boot.entity.PacOutBoundType;
import com.xr.boot.entity.PacOutType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacOutTypeMapper {
    @Select("select id,outType from Pac_OutType;")
    List<PacOutType> queryAllpacOutType();
    @Select("select id,outType from Pac_OutType where id=#{id};")
    PacOutType findpacOutTypeById(int id);
}
