package com.xr.boot.dao.PacPackaging.provider;

import com.xr.boot.entity.PacManegement;
import org.springframework.stereotype.Component;

@Component
public class PacManegementSql {
    public String findPacManegeMentWhere(PacManegement pacManegement) {
        System.out.println(pacManegement.getGoodsCode());
        StringBuffer sql=new StringBuffer("select id,goodscode,storagenum,gunit from pac_manegement where 1=1");
    /*    if (pacPackaging.getItemCode() != null && !pacPackaging.getItemCode().equals("")) {
            sql.append( " and ItemCode =#{itemCode}");
        }
        if (pacPackaging.getStatus() != null) {
            sql.append(" and `Status`=#{status}");
        }
        if (pacPackaging.getItemName()!= null &&! pacPackaging.getItemName().equals("")) {
            sql.append(" and ItemName Like CONCAT('%',#{itemName},'%')");
        }
        if (pacPackaging.getPlannedPrice()!=0.0) {
            sql.append(" and PlannedPrice=#{plannedPrice}");
        }
        if (pacPackaging.getSpecifications() != null && !pacPackaging.getSpecifications().equals("")) {
            sql.append(" and Specifications Like #{specifications}");
        }
        if (pacPackaging.getPacOutBoundType()!= null) {
            sql.append(" and type=#{type}");
        }
        if (pacPackaging.getStatus()!=null) {
            sql.append(" and status=#{status}");
        }*/

        sql.append(" order by id desc");

        return sql.toString();

    }
}
