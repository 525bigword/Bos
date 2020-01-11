package com.xr.boot.dao.PacPackaging;

import com.xr.boot.entity.PacGetBoundType;
import com.xr.boot.entity.PacOutBoundType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacGetBoundTypeMapper {
    @Select("select pacGetid,getBoundType from pac_getBoundType;")
    List<PacGetBoundType> queryAllpacGetBoundtype();
    @Select("select pacGetid,getBoundType from pac_getBoundType where pacGetid=#{pacGetid};")
    PacGetBoundType findPacGetBoundTypeById(int pacGetid);
}
