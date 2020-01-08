package com.xr.boot.entity; /***********************************************************************
 * Module:  BasDeliveryStandard.java
 * Author:  Administrator
 * Purpose: Defines the Class BasDeliveryStandard
 ***********************************************************************/

import java.io.Serializable;

/** 收派标准表
 *
 * @pdOid b03c4861-46d7-46c4-be12-e20fb970057d */
public class BasDeliveryStandard implements Serializable {
    private static final long serialVersionUID = -5374620413709551888L;
    /** 基本档案编号
     *
     * @pdOid d684cae4-93c6-45cd-9a51-51b4643f7263 */
    private String basicFileNumber;
    /** 收派标准名称	唯一
     *
     * @pdOid 267efd5b-8805-4afe-9398-6be680588f5b */
    private String name;
    /** 最小重量	非负数
     *
     * @pdOid 67ca885b-75d7-4289-9292-0d0068ca8a96 */
    private Double minWeight;
    /** 最大重量	非负数且必须大于最小重量
     *
     * @pdOid d0af09d2-b834-4d32-a653-105fc811575c */
    private Double maxWeight;
    private SyEmp syEmp;
    private SyUnits syUnits;
    /** 操作时间	当前操作时间
     *
     * @pdOid 4551bfd0-37ee-4926-a5dc-0513aa4351c8 */
    private String operationTime;
    /** 状态	0正常，1停用
     *
     * @pdOid 92d2390d-40ab-448e-b92b-5ff0b9cb0857 */
    private Integer status;
    public BasDeliveryStandard(){}
    public BasDeliveryStandard(String basicFileNumber, String name, Double minWeight, Double maxWeight, SyEmp syEmp, SyUnits syUnits, String operationTime, Integer status) {
        this.basicFileNumber = basicFileNumber;
        this.name = name;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.syEmp = syEmp;
        this.syUnits = syUnits;
        this.operationTime = operationTime;
        this.status = status;
    }

    public String getBasicFileNumber() {
        return basicFileNumber;
    }

    public void setBasicFileNumber(String basicFileNumber) {
        this.basicFileNumber = basicFileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(Double minWeight) {
        this.minWeight = minWeight;
    }

    public Double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public SyEmp getSyEmp() {
        return syEmp;
    }

    public void setSyEmp(SyEmp syEmp) {
        this.syEmp = syEmp;
    }

    public SyUnits getSyUnits() {
        return syUnits;
    }

    public void setSyUnits(SyUnits syUnits) {
        this.syUnits = syUnits;
    }

    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}