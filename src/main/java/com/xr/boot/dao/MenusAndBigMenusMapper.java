package com.xr.boot.dao;

import com.xr.boot.entity.SyBigMenus;
import com.xr.boot.entity.SyMenus;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenusAndBigMenusMapper {
    //根据ParentId查
    @Select("select id,parentid,type,text,url,tip,bigmenus from sy_menus where parentid=#{parentid}")
    List<SyMenus> findSyMenusByParentId(@Param("parentid")Integer parentId);

    @Select("select id,bigmenus,url from sy_bigmenus")
    List<SyBigMenus> findSyBigMenusAll();

}