package com.xr.boot.entity; /***********************************************************************
 * Module:  PacPackaging.java
 * Author:  Administrator
 * Purpose: Defines the Class PacPackaging
 ***********************************************************************/

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.*;

/** 包装材料表
 * 
 * @pdOid 7037389d-06b1-4b74-8d29-70f423c90659 */
@Component
public class PacPackaging implements Serializable {
   private static final long serialVersionUID = 7369162756369003896L;
   /** 编号	自增
    *
    * @pdOid 9da94590-e9c7-4875-a477-3607028fa78b */
   private int id;
   /** 物品编码   雪花十四
    *
    * @pdOid 92a88cf7-0f4c-4ba8-9d5c-01fd7adb4459 */
   private String itemCode;
   /** 物品名称
    *
    * @pdOid 423b5e78-0bcc-4570-bcea-17ff68496b1c */
   private String itemName;
   /** 计划价格	默认0
    *
    * @pdOid 9d8f9ad9-1100-451f-8b6f-4b89d3cade7e */
   private double plannedPrice;
   /** 规格
    *
    * @pdOid 666403ce-96f7-4b54-888f-aa671d060675 */
   private String specifications;
   /** 类型
    *
    * @pdOid c78210cd-64c9-43ed-8cb7-14ac5d7a45a9 */
 /*  private Integer type;*/
   private PacOutBoundType pacOutBoundType;
   /** 计量单位	张、箱、大箱、小箱、个、包、袋等
    *
    * @pdOid 88c19e53-b511-4313-be43-ed1bc508f294 */
   private String measurementUnit;
   /** 状态	默认：正常状态1（作废状态-1）
    *
    * @pdOid f8593afc-ddfc-4701-99aa-105409d03b2d */
   private Integer status;
   /**
    *
    * 操作人id
    */
private SyEmp syEmp;

   public SyEmp getSyEmp() {
      return syEmp;
   }

   public void setSyEmp(SyEmp syEmp) {
      this.syEmp = syEmp;
   }

   /**
 * 操作人单位id
 */
private Integer operationUnitid;
   /** 操作时间
    *
    * @pdOid b832bb4b-33df-4048-bf73-ddd44501c8bb */
   @JsonFormat(pattern="yyyy/MM/dd HH:mm:ss",timezone="GMT+8")
   private Date operationTime;
   /**
    * 作废人id即工号
    */
   private Integer invalidateJobInt;
   /**
    * 作废人单位id
    */
   private Integer invalidateName;
   /** 作废时间
    *
    * @pdOid 8120b166-2412-4c5a-be2e-731883a2b18b */
   private Date invalidateTime;

   public long getOperatorId() {
      return getSyEmp().getId();
   }
   public Integer getOperationUnitid() {
      return operationUnitid;
   }

   public void setOperationUnitid(Integer operationUnitid) {
      this.operationUnitid = operationUnitid;
   }

   public Integer getInvalidateJobInt() {
      return invalidateJobInt;
   }

   public void setInvalidateJobInt(Integer invalidateJobInt) {
      this.invalidateJobInt = invalidateJobInt;
   }

   public Integer getInvalidateName() {
      return invalidateName;
   }

   public void setInvalidateName(Integer invalidateName) {
      this.invalidateName = invalidateName;
   }

   /** @pdOid 4548f3ef-c447-4bfc-9f22-cfaf69965060 */
   public int getId() {
      return id;
   }

   /** @param newId
    * @pdOid 2f4fc1c7-b0b2-4e8e-9beb-436d5c09e5fb */
   public void setId(int newId) {
      id = newId;
   }

   /** @pdOid f78cc00f-a929-4363-959c-8abe3a698bdd */
   public String getItemCode() {
      return itemCode;
   }

   /** @param newItemCode
    * @pdOid 8b351920-8952-456a-b685-735013ccd6f7 */
   public void setItemCode(String newItemCode) {
      itemCode = newItemCode;
   }

   /** @pdOid 1ce62a1a-7981-4f0d-9418-7850f1c372db */
   public String getItemName() {
      return itemName;
   }

   /** @param newItemName
    * @pdOid 14b62318-a948-4e9c-8127-fa936b020499 */
   public void setItemName(String newItemName) {
      itemName = newItemName;
   }

   /** @pdOid 2089bc2d-951f-497b-8f55-456e5d186afc */
   public double getPlannedPrice() {
      return plannedPrice;
   }

   /** @param newPlannedPrice
    * @pdOid 196c3beb-9e17-4ca2-9ff5-dfbeef9fe34d */
   public void setPlannedPrice(double newPlannedPrice) {
      plannedPrice = newPlannedPrice;
   }

   /** @pdOid 4ebafb6c-a2c1-4321-9142-18053fd291a4 */
   public String getSpecifications() {
      return specifications;
   }

   /** @param newSpecifications
    * @pdOid d54d3464-b725-4138-9999-023b9a89df51 */
   public void setSpecifications(String newSpecifications) {
      specifications = newSpecifications;
   }

   /** @pdOid 0e989670-7561-491a-b875-d8dc9ad61e4b */
   public PacOutBoundType getPacOutBoundType() {
      return pacOutBoundType;
   }
   public long getType() {
      if(getPacOutBoundType()==null) {
      return -1;
      }else {
      return getPacOutBoundType().getId();}
   }
   public void setPacOutBoundType(PacOutBoundType pacOutBoundType) {
      this.pacOutBoundType = pacOutBoundType;
   }

   /** @pdOid 2fd3f77b-2624-4c87-ae67-36303a6e76e9 */
   public String getMeasurementUnit() {
      return measurementUnit;
   }

   /** @param newMeasurementUnit
    * @pdOid aebec4fd-4a63-4014-837c-b5025978ce57 */
   public void setMeasurementUnit(String newMeasurementUnit) {
      measurementUnit = newMeasurementUnit;
   }

   /** @pdOid 37fa450a-2913-42c0-af48-b402f0604cad */
   public Integer getStatus() {
      return status;
   }

   /** @param newStatus
    * @pdOid 41676ca0-001c-4620-9495-9b9ea236b275 */
   public void setStatus(Integer newStatus) {
      status = newStatus;
   }

   /** @pdOid 45c479b3-6736-458e-b197-85cfdb41287c */
   public Date getOperationTime() {
      return operationTime;
   }

   /** @param newOperationTime
    * @pdOid 153f4396-38ad-4b74-834f-f63bf6287ecc */
   public void setOperationTime(Date newOperationTime) {
      operationTime = newOperationTime;
   }

   /** @pdOid 036dd1d9-dd8d-49cc-ba65-2c1e55d9788e */
   public Date getInvalidateTime() {
      return invalidateTime;
   }

   /** @param newInvalidateTime
    * @pdOid 475f18ee-d012-4ad0-8dd7-7f5474624de1 */
   public void setInvalidateTime(Date newInvalidateTime) {
      invalidateTime = newInvalidateTime;
   }

   public PacPackaging() {
   }

   @Override
   public String toString() {
      return "PacPackaging{" +
              "id=" + id +
              ", itemCode='" + itemCode + '\'' +
              ", itemName='" + itemName + '\'' +
              ", plannedPrice=" + plannedPrice +
              ", specifications='" + specifications + '\'' +
              ", measurementUnit='" + measurementUnit + '\'' +
              ", status=" + status +
              ", operationUnitid=" + operationUnitid +
              ", operationTime=" + operationTime +
              ", invalidateJobInt=" + invalidateJobInt +
              ", invalidateName=" + invalidateName +
              ", invalidateTime=" + invalidateTime +
              '}';
   }
}