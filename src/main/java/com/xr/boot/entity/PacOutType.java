package com.xr.boot.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class PacOutType implements Serializable {
    private static final long serialVersionUID = -588883721333754471L;
    /**
     * 编号
     */
    private Integer id;
    /**
     * 出库类型
     */
    private String outType;

    public PacOutType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutType() {
        return outType;
    }

    public void setOutType(String outType) {
        this.outType = outType;
    }

    @Override
    public String toString() {
        return "PacOutType{" +
                "id=" + id +
                ", outType='" + outType + '\'' +
                '}';
    }
}
