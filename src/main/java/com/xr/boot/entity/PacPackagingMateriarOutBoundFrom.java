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
   public Integer setOutboundType(Integer outboundType){
      return outboundType;
   }
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
   private SyUnits saffiliatedUnit;

   public SyUnits getSaffiliatedUnit() {
      return saffiliatedUnit;
   }

   public void setSaffiliatedUnit(SyUnits saffiliatedUnit) {
      this.saffiliatedUnit = saffiliatedUnit;
   }

   public Integer getAffiliatedUnit() {

      return (int)saffiliatedUnit.getId();
   }

   /**
    * 下发单位
    */
   private SyUnits sissuedByTheUnit;

   public SyUnits getSissuedByTheUnit() {
      return sissuedByTheUnit;
   }

   public void setSissuedByTheUnit(SyUnits sissuedByTheUnit) {
      this.sissuedByTheUnit = sissuedByTheUnit;
   }

   public Integer getIssuedByTheUnit() {

      return (int)sissuedByTheUnit.getId();
   }


   /**
    * 经办人单位
    */
   private SyUnits sosperatorUnit;

   public SyUnits getSosperatorUnit() {
      return sosperatorUnit;
   }

   public void setSosperatorUnit(SyUnits sosperatorUnit) {
      this.sosperatorUnit = sosperatorUnit;
   }

   public Integer getOperatorUnit() {

      return (int)sosperatorUnit.getId();
   }

   /**
    * 经办人工号
    */
    private SyEmp syEmpno;

    public SyEmp getSyEmpno() {
        return syEmpno;
    }

    public void setSyEmpno(SyEmp syEmpno) {
        this.syEmpno = syEmpno;
    }

    public String getOperEmpNo() {
      return syEmpno.getEmpNo();
   }


/**
 * 客户编号
 */
private SyEmp syEmpc;

    public SyEmp getSyEmpc() {
        return syEmpc;
    }

    public void setSyEmpc(SyEmp syEmpc) {
        this.syEmpc = syEmpc;
    }

    public Integer getClienterid() {
      return (int)syEmpc.getId();
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
   private String recipientsTime;

   public String getRecipientsTime() {
      return recipientsTime;
   }

   public void setRecipientsTime(String recipientsTime) {
      this.recipientsTime = recipientsTime;
   }
/**
 * 开单人工号
 */
private String single;

   public String getSingle() {
      return single;
   }

   public void setSingle(String single) {
      this.single = single;
   }

   /** 开单时间
    * 
    * @pdOid cfc284fc-5135-4b2d-b558-3bceefa67a1b */
   private String orderTime;

   public String getOrderTime() {
      return orderTime;
   }

   public void setOrderTime(String orderTime) {
      this.orderTime = orderTime;
   }

    @Override
    public String toString() {
        return "PacPackagingMateriarOutBoundFrom{" +
                "id=" + id +
                ", outboundNumber='" + outboundNumber + '\'' +
                ", pacOutType=" + pacOutType +
                ", transportSlip='" + transportSlip + '\'' +
                ", syUnits=" + syUnits +
                ", saffiliatedUnit=" + saffiliatedUnit +
                ", sissuedByTheUnit=" + sissuedByTheUnit +
                ", sosperatorUnit=" + sosperatorUnit +
                ", syEmpno=" + syEmpno +
                ", syEmpc=" + syEmpc +
                ", recipient='" + recipient + '\'' +
                ", recipientsTime=" + recipientsTime +
                ", single='" + single + '\'' +
                ", orderTime=" + orderTime +
                '}';
    }
}