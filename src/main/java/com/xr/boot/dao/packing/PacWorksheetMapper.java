package com.xr.boot.dao.packing;

import com.xr.boot.dao.packing.provider.PacWorksheetSqlProvider;
import com.xr.boot.entity.PacWorksheet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface PacWorksheetMapper {
    @SelectProvider(type = PacWorksheetSqlProvider.class,method = "findPacWorksheetbyWhere")
    @Results({
            @Result(column = "OutboundNumber",property = "outboundNumber"),
            @Result(column = "GoodsName",property = "goodsName"),
            @Result(column = "Name",property = "name"),
            @Result(column = "DrawerName",property = "drawerName"),
            @Result(column = "DrawerTime",property = "drawerTime"),
            @Result(column = "EmpName",property = "empName"),
            @Result(column = "RecipientsTime",property = "recipientsTime")
    })
    List<PacWorksheet> findPacWorksheetsByTrem(PacWorksheet pacWorksheet);
}
