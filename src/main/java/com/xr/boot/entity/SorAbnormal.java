package com.xr.boot.entity; /***********************************************************************
 * Module:  SorAbnormal.java
 * Author:  Administrator
 * Purpose: Defines the Class SorAbnormal
 ***********************************************************************/

import java.util.*;

/** 单货异常监控表
 * 
 * @pdOid 03bc6075-4a44-4a84-b08b-5708e6086f1c */
public class SorAbnormal {
   /** 异常编号   雪花算法二十号中心
    * 
    * @pdOid f16afe1e-39fd-42ff-8eaa-13c752e04992 */
   private String id;
   /** 发起时间
    * 
    * @pdOid c48be667-c536-487e-865f-bf083fc936ed */
   private Date launchDate;
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
   private long abnormalType;
   /** 交接单号   雪花算法二十一号中心
    * 
    * @pdOid f1628912-c0eb-4567-97f9-221dc917f960 */
   private String transferInt;
   /** 单号
    * 
    * @pdOid 861c1674-294b-4e38-b4c3-25017361f835 */
   private String cargoInt;
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
   private long aboState;
   /** 处理时间
    * 
    * @pdOid 7769b1ac-1d07-49fc-9de3-ee2ffbe2484b */
   private Date handleDate;
   
   /** @pdOid 87f498cf-c8c9-4515-bf3e-a373bf70fd16 */
   public String getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 6c0ea434-0d67-48c4-afa4-0334537b52be */
   public void setId(String newId) {
      id = newId;
   }
   
   /** @pdOid 0c4ccbc7-1ad6-457b-bf25-da3246d48109 */
   public Date getLaunchDate() {
      return launchDate;
   }
   
   /** @param newLaunchDate
    * @pdOid faaef3ba-a5cf-45f9-90d0-afe798c42ee8 */
   public void setLaunchDate(Date newLaunchDate) {
      launchDate = newLaunchDate;
   }
   
   /** @pdOid 0f56ee2e-3e71-4847-9e5c-ce2b52f60199 */
   public String getLaunchPerson() {
      return launchPerson;
   }
   
   /** @param newLaunchPerson
    * @pdOid c575ffec-a16a-447b-9c15-b06698052d75 */
   public void setLaunchPerson(String newLaunchPerson) {
      launchPerson = newLaunchPerson;
   }
   
   /** @pdOid e29c6106-3e02-4a5d-a16a-4dc4ab8b675c */
   public String getLaunchCompany() {
      return launchCompany;
   }
   
   /** @param newLaunchCompany
    * @pdOid 8d5a38c2-f9dc-4f5f-9212-880407e6061f */
   public void setLaunchCompany(String newLaunchCompany) {
      launchCompany = newLaunchCompany;
   }
   
   /** @pdOid efc2572d-3675-436b-8bf9-c1143a1932de */
   public long getAbnormalType() {
      return abnormalType;
   }
   
   /** @param newAbnormalType
    * @pdOid 2e3bba73-65ec-409a-972b-97f7e12f4ebf */
   public void setAbnormalType(long newAbnormalType) {
      abnormalType = newAbnormalType;
   }
   
   /** @pdOid f0b3763a-32f4-4d7b-911a-9d6ac378a96a */
   public String getTransferInt() {
      return transferInt;
   }
   
   /** @param newTransferInt
    * @pdOid a8fd0db2-1935-479a-b633-9ea3b1cef940 */
   public void setTransferInt(String newTransferInt) {
      transferInt = newTransferInt;
   }
   
   /** @pdOid 6229d34d-9359-4c40-9ff0-38229e43ea48 */
   public String getCargoInt() {
      return cargoInt;
   }
   
   /** @param newCargoInt
    * @pdOid c6593df4-edea-43c1-9e35-61fe4aba29a9 */
   public void setCargoInt(String newCargoInt) {
      cargoInt = newCargoInt;
   }
   
   /** @pdOid 47c5e525-719d-40f9-8170-a52ecb58293d */
   public String getPackageInt() {
      return packageInt;
   }
   
   /** @param newPackageInt
    * @pdOid ab56e944-917b-4cbc-8b84-4d9d5ade1e1c */
   public void setPackageInt(String newPackageInt) {
      packageInt = newPackageInt;
   }
   
   /** @pdOid 89c9ae41-0fea-421b-8eb9-6f905621a719 */
   public String getHedgeAbnInt() {
      return hedgeAbnInt;
   }
   
   /** @param newHedgeAbnInt
    * @pdOid aa1d8aab-357a-48f6-8b5e-3e045e344966 */
   public void setHedgeAbnInt(String newHedgeAbnInt) {
      hedgeAbnInt = newHedgeAbnInt;
   }
   
   /** @pdOid 8f10dd3b-f5d0-442c-bf54-a66e77dfd58b */
   public long getAboState() {
      return aboState;
   }
   
   /** @param newAboState
    * @pdOid 6ad2cce6-37f7-462a-a57a-df703c5bb288 */
   public void setAboState(long newAboState) {
      aboState = newAboState;
   }
   
   /** @pdOid 4d413caf-c0ad-45e7-8bf8-062ec4047921 */
   public Date getHandleDate() {
      return handleDate;
   }
   
   /** @param newHandleDate
    * @pdOid b38ce8b2-7c91-4376-8b13-39a92e46e97b */
   public void setHandleDate(Date newHandleDate) {
      handleDate = newHandleDate;
   }

}