package com.xr.boot.entity.po;

import java.io.Serializable;

public class Children implements Serializable {
    private static final long serialVersionUID = -8434108910035398767L;
    private String title;
    private String href;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
