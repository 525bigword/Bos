package com.xr.boot.dao.PacPackaging.provider;

import com.xr.boot.entity.PacManegement;
import org.springframework.stereotype.Component;

@Component
public class PacManegementSql {
    public String findPacManegeMentWhere(PacManegement pacManegement) {
        System.out.println(pacManegement.getGoodsCode());
        StringBuffer sql=new StringBuffer("select pm.id,pm.goodscode,pm.storagenum,pm.gunit from pac_manegement pm,pac_packaging ppag where ppag.Itemcode=pm.goodscode ");
        if (pacManegement.getGcode().getItemCode() != null && !pacManegement.getGcode().getItemCode().equals("")) {
            sql.append( " and pm.GoodsCode =#{goodscode}");
        }
        if (pacManegement.getGunitss().getId() !=0) {
            sql.append( " and pm.gunit =#{gunitss.gunit}");
        }
        if (pacManegement.getGcode().getSpecifications() !=null&& pacManegement.getGcode().getSpecifications().equals("")) {
            sql.append( " and  ppag.Specifications =#{gcode.specifications}");
        }
        if (pacManegement.getGcode().getType() !=0) {
            sql.append( " and ppag.type =#{gcode.type }");
        }
        if (pacManegement.getStorageNum() !=0) {
            sql.append( " and pm.StorageNum #{storageNum }");
        }
        if (pacManegement.getGcode().getType() !=0) {
            sql.append( " and ppag.PlannedPrice*pm.StorageNum #{zje}");
        }

        sql.append(" order by id desc");

        return sql.toString();

    }
}
