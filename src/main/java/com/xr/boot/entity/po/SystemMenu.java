package com.xr.boot.entity.po;

import java.io.Serializable;

/**
 * 页面菜单对应实体
 */
public class SystemMenu implements Serializable {
    private static final long serialVersionUID = 8321182190575039133L;
    private String title;
    private String icon;
    private Boolean isCurrent;
    private Menu menu;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getCurrent() {
        return isCurrent;
    }

    public void setCurrent(Boolean current) {
        isCurrent = current;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
