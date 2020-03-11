package com.xr.boot.entity; /***********************************************************************
 * Module:  SorAbnormal.java
 * Author:  Administrator
 * Purpose: Defines the Class SorAbnormal
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** 单货异常监控表
 * 
 * @pdOid 03bc6075-4a44-4a84-b08b-5708e6086f1c */
public class SorAbnormal implements Serializable {
   private static final long serialVersionUID = 9119385647664603184L;
   /** 异常编号   雪花算法二十号中心
    * 
    * @pdOid f16afe1e-39fd-42ff-8eaa-13c752e04992 */
   private String id;
   /** 发起时间
    * 
    * @pdOid c48be667-c536-487e-865f-bf083fc936ed */
   private String launchDate;
   /** 发起人
    * 
    * @pdOid 3800eaa4-b424-4581-ba32-1f11ff503494 */
   private String launchPerson;
   /** 发起单位
    * 
    * @pdOid a55698ac-413d-4293-94f5-7fd6ffb37204 */
   private String launchCompany;
   /** 异常类型	1.有单无货 2.有货无单
    * 
    * @pdOid 8d078416-6bbe-4254-8205-da7cff2dc410 */
   private String abnormalType;
   /** 交接单号   雪花算法二十一号中心
    * 
    * @pdOid f1628912-c0eb-4567-97f9-221dc917f960 */
   private String transferInt;

   /** 合包号
    * 
    * @pdOid 0a256b92-571a-4211-826a-b7d814d093de */
   private String packageInt;
   /** 对冲异常编号   雪花算法二十二号中心
    * 
    * @pdOid 589600e7-92b9-49c7-91f8-90082f59068b */
   private String hedgeAbnInt;
   /** 状态	1.已处理2.未处理3.全部
    * 
    * @pdOid 0dc5cd01-3558-4481-8093-8eb3e056d444 */
   private String aboState;
   /** 处理时间
    * 
    * @pdOid 7769b1ac-1d07-49fc-9de3-ee2ffbe2484b */
   private String handleDate;
   /**异常描述*/
   private String textare;

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getLaunchDate() {
      return launchDate;
   }

   public void setLaunchDate(String launchDate) {
      this.launchDate = launchDate;
   }

   public String getLaunchPerson() {
      return launchPerson;
   }

   public void setLaunchPerson(String launchPerson) {
      this.launchPerson = launchPerson;
   }

   public String getLaunchCompany() {
      return launchCompany;
   }

   public void setLaunchCompany(String launchCompany) {
      this.launchCompany = launchCompany;
   }

   public String getAbnormalType() {
      return abnormalType;
   }

   public void setAbnormalType(String abnormalType) {
      this.abnormalType = abnormalType;
   }

   public String getTransferInt() {
      return transferInt;
   }

   public void setTransferInt(String transferInt) {
      this.transferInt = transferInt;
   }

   public String getPackageInt() {
      return packageInt;
   }

   public void setPackageInt(String packageInt) {
      this.packageInt = packageInt;
   }

   public String getHedgeAbnInt() {
      return hedgeAbnInt;
   }

   public void setHedgeAbnInt(String hedgeAbnInt) {
      this.hedgeAbnInt = hedgeAbnInt;
   }

   public String getAboState() {
      return aboState;
   }

   public void setAboState(String aboState) {
      this.aboState = aboState;
   }

   public String getHandleDate() {
      return handleDate;
   }

   public void setHandleDate(String handleDate) {
      this.handleDate = handleDate;
   }

   public String getTextare() {
      return textare;
   }

   public void setTextare(String textare) {
      this.textare = textare;
   }

   @Override
   public String toString() {
      return "SorAbnormal{" +
              "id='" + id + '\'' +
              ", launchDate=" + launchDate +
              ", launchPerson='" + launchPerson + '\'' +
              ", launchCompany='" + launchCompany + '\'' +
              ", abnormalType=" + abnormalType +
              ", transferInt='" + transferInt + '\'' +
              ", packageInt='" + packageInt + '\'' +
              ", hedgeAbnInt='" + hedgeAbnInt + '\'' +
              ", aboState=" + aboState +
              ", handleDate=" + handleDate +
              ", textare='" + textare + '\'' +
              '}';
   }
}