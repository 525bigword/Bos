package com.xr.boot.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class PacGetBoundType implements Serializable {
    private static final long serialVersionUID = -971033767384722451L;
    /**
     * 入库类型编号
     */
    private Integer pacGetid;
    /**
     * 入库类型
     */
    private String getBoundType;

    public Integer getPacGetid() {
        return pacGetid;
    }

    public void setPacGetid(Integer pacGetid) {
        this.pacGetid = pacGetid;
    }

    public String getGetBoundType() {
        return getBoundType;
    }

    public void setGetBoundType(String getBoundType) {
        this.getBoundType = getBoundType;
    }

    public PacGetBoundType() {
    }

    @Override
    public String toString() {
        return "PacGetBoundType{" +
                "pacGetid=" + pacGetid +
                ", getBoundType='" + getBoundType + '\'' +
                '}';
    }
}
