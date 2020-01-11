package com.xr.boot.dao.system;

import com.xr.boot.dao.basicPackage.provider.BasDeliveryStandardSqlProvider;
import com.xr.boot.dao.system.provider.MenusAndBigMenusSqlProvider;
import com.xr.boot.entity.SyBigMenus;
import com.xr.boot.entity.SyMenus;
import com.xr.boot.entity.SyRolesMenus;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenusAndBigMenusMapper {


    //查询所有栏目信息
    /*@Select("SELECT id,(select text from sy_menus where sy_menus.id=sym.parentid) parentid,type,text,sym.url,tip,bigmenus FROM  sy_menus as sym")*/
    @SelectProvider(type = MenusAndBigMenusSqlProvider.class,method ="findselect" )
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "parentname",property = "parentname"),
            @Result(column = "type",property = "type"),
            @Result(column = "text",property = "text"),
            @Result(column = "url",property = "url"),
            @Result(column = "tip",property = "tip"),
            @Result(column = "bigmenus",property = "bigmenus")
    })
    List<SyMenus> findSyMenusAll(SyMenus syMenus);


    //根据Id查sy_menus
    @Select("select id,parentid,type,text,url,tip,bigmenus from sy_menus where id=#{id}")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="parentID",property="parentID"),
            @Result(column="type",property="type"),
            @Result(column="text",property="text"),
            @Result(column = "url",property = "url"),
            @Result(column="tip",property="tip"),
            @Result(column="bigmenus",property="bigmenus")
    })
    List<SyMenus> findSyMenusById(@Param("id") Integer id);

    //根据ParentId查sy_menus
    @Select("select id,parentid,type,text,url,tip,bigmenus from sy_menus where parentid=#{parentid}")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="parentID",property="parentID"),
            @Result(column="type",property="type"),
            @Result(column="text",property="text"),
            @Result(column = "url",property = "url"),
            @Result(column="tip",property="tip"),
            @Result(column="bigmenus",property="bigmenus")
    })
    List<SyMenus> findSyMenusByParentId(@Param("parentid") Integer parentId);
    //根据Id查sy_bigmenus
    @Select("select * from sy_bigmenus where id=#{id}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "bigmenus",property = "bigmenus"),
            @Result(column = "url",property = "url"),
            @Result(column = "id",property = "syMenus",
                many = @Many(
                    select = "com.xr.boot.dao.MenusAndBigMenusMapper.findSyMenusByParentId",
                    fetchType = FetchType.LAZY
                )
            )
    })
    SyBigMenus findSyBigMenusById(@Param("id") Integer id);


    //查询所有sy_bigmenus
    @Select("select id,bigmenus,url from sy_bigmenus")
    List<SyBigMenus> findSyBigMenusAll();
    //新增sy_bigmenus
    @Insert("insert into sy_bigmenus values(null,#{bigmenus},#{url})")
    void saveSyBigMenus(SyBigMenus syBigMenus);
    //新增sy_menus
    @Insert("insert into sy_menus values(null,#{parentID},#{type},#{text},#{url},#{tip},#{bigmenus})")
    void saveSyMenus(SyMenus syMenus);
    //根据partid查询sy_menus最后tip
    @Select("select max(tip) from sy_menus where parentid=#{parentid}")
    int findSyMenusToTipByParentid(@Param("parentid") Integer parentId);
    //查功能模块下子模块数量
    @Select("select count(*) from sy_menus where parentid=#{parentid}")
    int findSyMenusTochildcount(@Param("parentid") Integer parentId);
}
