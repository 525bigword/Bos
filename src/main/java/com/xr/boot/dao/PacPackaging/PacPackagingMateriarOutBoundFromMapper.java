package com.xr.boot.dao.PacPackaging;

import com.xr.boot.entity.PacPackagingMateriarOutBoundFrom;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PacPackagingMateriarOutBoundFromMapper {
    @Select("select id,outboundNumber,transportSlip,recipientsTime,orderTime, from Pac_PackagingMateriarOutBoundFrom")
    public List <PacPackagingMateriarOutBoundFrom> findAllPacOutBoundFrom ();
}
