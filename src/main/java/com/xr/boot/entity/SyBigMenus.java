package com.xr.boot.entity;

import java.io.Serializable;

/**
 * 大模块表实体类
 */
public class SyBigMenus implements Serializable {
    //基础数据
    private Integer id;
    private String bigmenus;
    private String url;

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
