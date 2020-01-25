package com.xr.boot.dao.system.provider;

import com.xr.boot.entity.SyMenus;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MenusAndBigMenusSqlProvider {
    public String saveListSyRoleAndSyMenus(List<Integer> menus,Integer roleid){
        StringBuffer sb=new StringBuffer();
        if(menus.size()==1) {
            Integer menuid=menus.get(0);
            sb.append("insert into  sy_rolesmenus  values(null,#{roleid},#{"+menuid+"})");

        }else{
            sb.append("insert into  sy_rolesmenus values");
            for(int i=0;i<menus.size();i++){
                sb.append("(null,"+roleid+","+menus.get(i)+"),");
            }
           if(sb.charAt(sb.length()-1)==','){
               sb.deleteCharAt(sb.length() - 1);
           }
        }
        return sb.toString();
    }

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
        sql.SELECT("sym.id,sym.parentid,(select text from sy_menus where sy_menus.id=sym.parentid) parentname,sym.type,sym.text," +
                "sym.url,sym" +
                ".tip," +
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
