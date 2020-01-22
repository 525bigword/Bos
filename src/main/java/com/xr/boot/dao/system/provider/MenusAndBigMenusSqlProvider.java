package com.xr.boot.dao.system.provider;

import com.xr.boot.entity.SyMenus;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MenusAndBigMenusSqlProvider {
    /**
     * 批量删除sy_menus表
     * @param ids 需要删除的行
     * @return
     */
    public String delListSyMenus(List<Integer> ids){
        StringBuffer sb=new StringBuffer();
        if(ids.size()>1) {
            sb.append("DELETE from sy_menus  WHERE id IN (");
            for (int i = 0; i < ids.size(); i++) {
                sb.append("'").append(ids.get(i)).append("'");
                if (i < ids.size() - 1)
                    sb.append(",");
            }
            sb.append(")");
        }else{
            sb.append("DELETE from sy_menus  WHERE id ="+ids.get(0));
        }
        return sb.toString();
    }

    public String findselect(SyMenus syMenus){
        //SELECT id,(select text from sy_menus where sy_menus.id=sym.parentid) parentid,type,text,sym.url,tip,bigmenus FROM  sy_menus as sym
        SQL sql=new SQL();
        sql.SELECT("sym.id,sym.parentid,sym.type,sym.text,sym.url,sym.tip," +
                "sym.bigmenus,(select bigmenus from sy_bigmenus where id=sym.bigmenus) bigmenusname");
        sql.FROM("sy_menus sym");
        try{
            if(syMenus.getParentID()!=1){
                sql.WHERE(" sym.parentid=#{parentID} ");
            }if(!syMenus.getText().equals("")){
                sql.WHERE(" sym.text=#{text} ");
            }
        }catch (Exception e){

        }
        //sql.WHERE(where.toString());
        System.out.println(sql.toString());
        return sql.toString()+" order by sym.tip desc";
    }
}
