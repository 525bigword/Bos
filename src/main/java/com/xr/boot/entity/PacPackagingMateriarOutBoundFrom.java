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

   public Integer getAffiliatedUnit() {
      return syUnits.getOperatorid();
   }
   public Integer getAssuedByTheUnit() {
      return syUnits.getOperatorid();
   }
public Integer getOperatorUnit() {
      return syUnits.getOperatorid();
   }

   /** 领用时间
    * 
    * @pdOid 1215c1da-f430-496d-9f71-6ed3aca2017f */
   private Date recipientsTime;
   /** 开单时间
    * 
    * @pdOid cfc284fc-5135-4b2d-b558-3bceefa67a1b */
   private Date orderTime;
   
   /** @pdRoleInfo migr=no name=SyUnits assc=reference65 mult=0..1 side=A */
   public SyUnits syUnits;
   
   /** @pdOid 2d8c4fe0-762b-49c4-9f8b-e50aa2a11cb0 */
   public long getId() {
      return id;
   }

   /** @param newId
    * @pdOid e7791c8e-c484-41a1-a637-b13ba31b873b */
   public void setId(long newId) {
      id = newId;
   }
   public String getOperatorName() {
      return syEmp.getEmpName();
   }
   public String getClienterName() {
      return syEmp.getEmpName();
   }

   private SyEmp syEmp;

   public SyEmp getSyEmp() {
      return syEmp;
   }

   public void setSyEmp(SyEmp syEmp) {
      this.syEmp = syEmp;
   }

   /** @pdOid b7e3a560-c030-4ad6-b620-24473ed0cfb4 */
   public String getOutboundNumber() {
      return outboundNumber;
   }
   
   /** @param newOutboundNumber
    * @pdOid 60bca278-8081-42ba-a81c-aa4d9e7e1a28 */
   public void setOutboundNumber(String newOutboundNumber) {
      outboundNumber = newOutboundNumber;
   }
   
   /** @pdOid caa5e449-9eff-405e-9931-ce5471115b35 */
   public String getTransportSlip() {
      return transportSlip;
   }
   
   /** @param newTransportSlip
    * @pdOid 4941841b-c7a0-4e46-ba32-3d994f82e9c3 */
   public void setTransportSlip(String newTransportSlip) {
      transportSlip = newTransportSlip;
   }
   
   /** @pdOid 742f97f1-e77c-4f76-a8d3-ce0c88de749f */
   public Date getRecipientsTime() {
      return recipientsTime;
   }
   
   /** @param newRecipientsTime
    * @pdOid f7c7f94d-8cec-4624-b9a1-1095906b82f0 */
   public void setRecipientsTime(Date newRecipientsTime) {
      recipientsTime = newRecipientsTime;
   }
   
   /** @pdOid b9d628e8-5225-466d-9e43-549f43a4c51d */
   public Date getOrderTime() {
      return orderTime;
   }
   
   /** @param newOrderTime
    * @pdOid b2e391c6-a3cb-4d92-98b6-c12a55e27588 */
   public void setOrderTime(Date newOrderTime) {
      orderTime = newOrderTime;
   }
   
   
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

}