package com.xr.boot.dao.system.provider;

import com.xr.boot.entity.SyMenus;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class MenusAndBigMenusSqlProvider {
    public String findselect(SyMenus syMenus){
        SQL sql=new SQL();
        sql.SELECT("id,parentid,type,text,url,tip,bigmenus");
        sql.FROM("sy_menus");
        /*if(syMenus.getParentID())*/
        return null;
    }
}
