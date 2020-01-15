package com.xr.boot.entity;

import java.io.Serializable;

/**
 * 大模块表实体类
 */
public class SyBigMenus implements Serializable {

    private static final long serialVersionUID = -8879585974869390036L;
    //基础数据
    private Integer id;
    private String bigmenus;
    private String url;
    private String icon;
    //业务属性
    private SyMenus syMenus;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public SyMenus getSyMenus() {
        return syMenus;
    }

    public void setSyMenus(SyMenus syMenus) {
        this.syMenus = syMenus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBigmenus() {
        return bigmenus;
    }

    public void setBigmenus(String bigmenus) {
        this.bigmenus = bigmenus;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
