package com.xr.boot.entity; /***********************************************************************
 * Module:  PacPackagingMateriarOutBoundFrom.java
 * Author:  Administrator
 * Purpose: Defines the Class PacPackagingMateriarOutBoundFrom
 ***********************************************************************/

import java.util.*;

/** 包装材料出库表
 * 
 * @pdOid 22761040-b87b-4e47-bfb1-e8ea21ef6c99 */
public class PacPackagingMateriarOutBoundFrom {
   /** 编号,自增
    * 
    * @pdOid bbaed620-30de-45dc-8f97-23b17b1254f8 */
   private long id;

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getOutboundNumber() {
      return outboundNumber;
   }

   public void setOutboundNumber(String outboundNumber) {
      this.outboundNumber = outboundNumber;
   }

   /** 出库单号，雪花算法二号数据中心
    * 
    * @pdOid 9aa7df9b-f0d3-4871-aebe-f8779f9ac482 */
   private String outboundNumber;
   /**
    * 出库类型
    */
   private PacOutType pacOutType;

   public PacOutType getPacOutType() {
      return pacOutType;
   }

   public void setPacOutType(PacOutType pacOutType) {
      this.pacOutType = pacOutType;
   }
//取出库类型
   public Integer getOutboundType() {
      return pacOutType.getId();
   }

   /** 运输单号，出库单号，雪花算法三号数据中心
    * 
    * @pdOid c21a5970-f4dd-4629-a843-65152614b326 */

   private String transportSlip;

   /** @pdOid caa5e449-9eff-405e-9931-ce5471115b35 */
   public String getTransportSlip() {
      return transportSlip;
   }

   /** @param newTransportSlip
    * @pdOid 4941841b-c7a0-4e46-ba32-3d994f82e9c3 */
   public void setTransportSlip(String newTransportSlip) {
      transportSlip = newTransportSlip;
   }

   /** @pdRoleInfo migr=no name=SyUnits assc=reference65 mult=0..1 side=A */
   public SyUnits syUnits;


   /** @pdGenerated default parent getter */
   public SyUnits getSyUnits() {
      return syUnits;
   }

   /** @pdGenerated default parent setter
    * @param newSyUnits */
   public void setSyUnits(SyUnits newSyUnits) {
      if (this.syUnits == null || !this.syUnits.equals(newSyUnits))
      {
         if (this.syUnits != null)
         {
            SyUnits oldSyUnits = this.syUnits;
            this.syUnits = null;
            oldSyUnits.removePacPackagingMateriarOutBoundFrom(this);
         }
         if (newSyUnits != null)
         {
            this.syUnits = newSyUnits;
            this.syUnits.addPacPackagingMateriarOutBoundFrom(this);
         }
      }
   }

   /**
    * 所属单位
    */
   private Integer affiliatedUnit;

   public Integer getAffiliatedUnit() {
      return affiliatedUnit;
   }

   public void setAffiliatedUnit(Integer affiliatedUnit) {
      this.affiliatedUnit = affiliatedUnit;
   }

   /**
    * 下发单位
    */
   private Integer issuedByTheUnit;

   public Integer getIssuedByTheUnit() {
      return issuedByTheUnit;
   }

   public void setIssuedByTheUnit(Integer issuedByTheUnit) {
      this.issuedByTheUnit = issuedByTheUnit;
   }

   /**
    * 经办人单位
    */
   private Integer operatorUnit;

   public Integer getOperatorUnit() {
      return operatorUnit;
   }

   public void setOperatorUnit(Integer operatorUnit) {
      this.operatorUnit = operatorUnit;
   }
   /**
    * 经办人工号
    */
   private String operEmpNo;

   public String getOperEmpNo() {
      return operEmpNo;
   }

   public void setOperEmpNo(String operEmpNo) {
      this.operEmpNo = operEmpNo;
   }
/**
 * 客户编号
 */
private Integer clienterid;

   public Integer getClienterid() {
      return clienterid;
   }

   public void setClienterid(Integer clienterid) {
      this.clienterid = clienterid;
   }
/**
 * 领用人工号
 */
private String recipient;

   public String getRecipient() {
      return recipient;
   }

   public void setRecipient(String recipient) {
      this.recipient = recipient;
   }


   /** 领用时间
    * 
    * @pdOid 1215c1da-f430-496d-9f71-6ed3aca2017f */
   private Date recipientsTime;

   public Date getRecipientsTime() {
      return recipientsTime;
   }

   public void setRecipientsTime(Date recipientsTime) {
      this.recipientsTime = recipientsTime;
   }
/**
 * 开单人工号
 */
private Integer single;

   public Integer getSingle() {
      return single;
   }

   public void setSingle(Integer single) {
      this.single = single;
   }

   /** 开单时间
    * 
    * @pdOid cfc284fc-5135-4b2d-b558-3bceefa67a1b */
   private Date orderTime;

   public Date getOrderTime() {
      return orderTime;
   }

   public void setOrderTime(Date orderTime) {
      this.orderTime = orderTime;
   }

   private SyEmp syEmp;

   public SyEmp getSyEmp() {
      return syEmp;
   }

   public void setSyEmp(SyEmp syEmp) {
      this.syEmp = syEmp;
   }


}