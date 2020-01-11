package com.xr.boot.dao.PacPackaging;

import com.xr.boot.entity.PacOutBoundType;;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacOutBoundTypeMapper {
    @Select("select id,outBoundType from PAC_outboundtype;")
    List<PacOutBoundType> queryAllpactype();
    @Select("select id,outBoundType from PAC_outboundtype where id=#{id};")
    PacOutBoundType findPacTypeById(int id);
}
