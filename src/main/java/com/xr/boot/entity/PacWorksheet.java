package com.xr.boot.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class PacWorksheet implements Serializable {
    private String outboundNumber;
    private String goodsName;
    private String name;
    private String empName;
    private String drawerName;
    private String drawerTime;
    private String recipientsTime;
    public PacWorksheet(){}
    public String getOutboundNumber() {
        return outboundNumber;
    }

    public void setOutboundNumber(String outboundNumber) {
        this.outboundNumber = outboundNumber;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDrawerName() {
        return drawerName;
    }

    public void setDrawerName(String drawerName) {
        this.drawerName = drawerName;
    }

    public String getDrawerTime() {
        return drawerTime;
    }

    public void setDrawerTime(String drawerTime) {
        this.drawerTime = drawerTime;
    }

    public String getRecipientsTime() {
        return recipientsTime;
    }

    public void setRecipientsTime(String recipientsTime) {
        this.recipientsTime = recipientsTime;
    }
}
