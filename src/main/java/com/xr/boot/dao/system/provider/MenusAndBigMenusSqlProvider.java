package com.xr.boot.dao.system.provider;

import com.xr.boot.entity.SyMenus;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class MenusAndBigMenusSqlProvider {
    public String findselect(SyMenus syMenus){
        //SELECT id,(select text from sy_menus where sy_menus.id=sym.parentid) parentid,type,text,sym.url,tip,bigmenus FROM  sy_menus as sym
        SQL sql=new SQL();
        sql.SELECT("sym.id,(select text from sy_menus where sy_menus.id=sym.parentid) parentname,sym.type,sym.text," +
                "sym" +
                ".url," +
                "sym.tip," +
                "sym.bigmenus");
        sql.FROM("sy_menus sym");
        try{
            if(syMenus.getParentID()!=1||null!=syMenus.getParentID()||!syMenus.getParentID().equals("")){
                sql.WHERE(" sym.parentid=#{parentID} ");
            }if(null!=syMenus.getText()||!syMenus.getText().equals("")){
                sql.WHERE(" sym.text=#{text} ");
            }
        }catch (Exception e){

        }

        //sql.WHERE(where.toString());
        return sql.toString()+" order by sym.tip desc";
    }
}
