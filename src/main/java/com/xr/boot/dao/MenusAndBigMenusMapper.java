package com.xr.boot.dao;

import com.xr.boot.entity.SyBigMenus;
import com.xr.boot.entity.SyMenus;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenusAndBigMenusMapper {
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
    List<SyMenus> findSyMenusByParentId(@Param("parentid")Integer parentId);
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
    SyBigMenus findSyBigMenusById(@Param("id")Integer id);


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
    int findSyMenusToTipByParentid(@Param("parentid")Integer parentId);
}
