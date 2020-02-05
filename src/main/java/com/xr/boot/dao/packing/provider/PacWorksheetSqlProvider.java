package com.xr.boot.dao.packing.provider;

import com.xr.boot.entity.PacWorksheet;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class PacWorksheetSqlProvider {
    public String findPacWorksheetbyWhere(PacWorksheet pacWorksheet){
        return new SQL(){
            {
                SELECT("pp.OutboundNumber,po.GoodsName,su.`Name`,ps.DrawerName,ps.DrawerTime,se.EmpName,pp.RecipientsTime");
                FROM("pac_packagingmateriaroutboundfrom pp,pac_outfromitem po,pac_stockitem psi,pac_stock ps,sy_emp se,sy_units su");
                String tj=" pp.OutboundNumber=po.OuthouseNo and psi.WarehouseNo=ps.WarehouseNo and po.GoodsCode=psi.GoodsCode and ps.SubordinateUnit=su.id and pp.OperEmpNo=se.EmpNo";

                try {
                    if(pacWorksheet.getOutboundNumber()!=null&&!pacWorksheet.getOutboundNumber().equals("")){
                        tj+=" and pp.OutboundNumber=#{outboundNumber}";
                    }

                    if (pacWorksheet.getDrawerTime()!=null&&!pacWorksheet.getDrawerTime().equals("")){
                        tj += " and ps.DrawerTime=#{drawerTime}";
                    }

                    if(pacWorksheet.getName()!=null&&!pacWorksheet.getName().equals("")){
                        tj+=" and su.`Name`=#{name}";
                    }

                    if(pacWorksheet.getGoodsName()!=null&&!pacWorksheet.getGoodsName().equals("")){
                        tj+=" and po.GoodsName Like CONCAT('%',#{goodsName},'%')";
                    }

                    if(pacWorksheet.getDrawerName()!=null&&!pacWorksheet.getDrawerName().equals("")){
                        tj+=" and ps.DrawerName Like CONCAT('%',#{drawerName},'%')";
                    }

                    if(pacWorksheet.getEmpName()!=null&&!pacWorksheet.getEmpName().equals("")){
                        tj+=" and se.EmpName Like CONCAT('%',#{empName},'%')";
                    }
                    WHERE(tj);
                }catch (Exception e){
                    WHERE(tj);
                }
            }
        }.toString();
    }
}
