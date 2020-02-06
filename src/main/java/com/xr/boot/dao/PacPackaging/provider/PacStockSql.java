package com.xr.boot.dao.PacPackaging.provider;

import com.xr.boot.entity.PacStock;
import org.springframework.stereotype.Component;

@Component
public class PacStockSql {
    public String findPacStockWhere(PacStock pacStock) {
        StringBuffer sql=new StringBuffer("select pso.id,pso.WarehouseNo,pso.ReservoirType,pso.Transport,pso.SubordinateUnit,pso.DrawerNo,pso.DrawerName,pso.DrawerTime,pso.Stats,pso.Remark from PAC_Stock pso,pac_stockitem psoi where pso.warehouseno=psoi.warehouseno");
     if (pacStock.getWarehouseNo() != null && !pacStock.getWarehouseNo().equals("")) {
            sql.append( " and pso.WarehouseNo=#{warehouseNo}");
        }
        if (pacStock.getPacGetBoundType()!=null&&pacStock.getPacGetBoundType().getPacGetid() != null ) {
            sql.append( " and pso.ReservoirType=#{pacGetBoundType.pacGetid}");
        }
        if (pacStock.getTransport() !=null&& !pacStock.getTransport().equals("")) {
            sql.append( "  and pso.Transport=#{transport}");
        }
        if (pacStock.getSyUnits()!=null&&pacStock.getSyUnits().getId() !=0) {
            sql.append( "  and pso.SubordinateUnit=#{syUnits.id}");
        }
        if (pacStock.getDrawerTime()!= null && !pacStock.getDrawerTime().equals("")) {
            sql.append( "  and pso.DrawerTime=#{drawerTime }");
        }
        if (pacStock.getGoodsCode()!= null && !pacStock.getGoodsCode().equals("")) {
            sql.append( "  and psoi.goodsCode=#{goodsCode }");
        }
        if (pacStock.getGoodsName()!= null && !pacStock.getGoodsName().equals("")) {
            sql.append( "  and psoi.goodsname=#{goodsName }");
        }
        if(pacStock.getStats()!=-1){
            sql.append( "  and pso.DrawerTime=#{drawerTime }");
        }
        sql.append(" order by id desc");

        return sql.toString();

    }
}
