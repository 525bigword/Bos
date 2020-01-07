package com.xr.boot.entity; /***********************************************************************
 * Module:  BigLogLogisticsControlTable.java
 * Author:  Administrator
 * Purpose: Defines the Class BigLogLogisticsControlTable
 ***********************************************************************/

import java.util.*;

/** 物流对照表
 * 
 * @pdOid 9555913f-89eb-465b-8eb0-75ebf3c24fb9 */
public class BigLogLogisticsControlTable {
   /** 编号	自增
    * 
    * @pdOid 99251da2-e319-423a-9e6c-839f31b847a8 */
   private int id;
   /** 工作单号
    * 
    * @pdOid 92d51937-9cd8-4af1-b5d3-ec78b4cb7ef6 */
   private String workSheetNo;
   /** 类型
    * 
    * @pdOid 6f7e5ee7-40ae-463c-8163-2f231aedf099 */
   private long cType;
   /** 代理公司
    * 
    * @pdOid 792af467-611e-4b45-8202-4b8d6ad35703 */
   private String corporation;
   /** 货票号   雪花算法二十七
    * 
    * @pdOid cc7a5513-3a1e-438e-8ab7-14fb870d1553 */
   private String waybillID;
   /** 备注
    * 
    * @pdOid c5c12468-895d-44a7-8561-fe3ad2d6dc5a */
   private String remarks;
   /** 录入时间
    * 
    * @pdOid 69a30c81-d32f-4b9d-ada9-cf60b2f56265 */
   private Date inputDate;
   /** 状态	0：正常，1：停用
    * 
    * @pdOid 5f9523c2-2ba2-46d5-af7c-455c8c40fa29 */
   private long stats;
   
   /** @pdOid 5b599e95-113a-40d0-b73f-d290bc9a8dd9 */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 624776cb-44a4-42be-9407-706fccfb9d8b */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid 2ab6be1a-6a3c-4613-97ea-01f86549e83c */
   public String getWorkSheetNo() {
      return workSheetNo;
   }
   
   /** @param newWorkSheetNo
    * @pdOid ab030de3-2073-47a0-8b23-fd364926e622 */
   public void setWorkSheetNo(String newWorkSheetNo) {
      workSheetNo = newWorkSheetNo;
   }
   
   /** @pdOid 11c3118f-797e-49df-a2c1-b985a5de40ed */
   public long getCType() {
      return cType;
   }
   
   /** @param newCType
    * @pdOid 9a64dace-ee73-4bd1-b897-b7920e9c9b1c */
   public void setCType(long newCType) {
      cType = newCType;
   }
   
   /** @pdOid 96d4d203-a1a8-4419-8c6f-a377be88ec62 */
   public String getCorporation() {
      return corporation;
   }
   
   /** @param newCorporation
    * @pdOid f4c23e44-585e-4d80-a2db-880bd22c59d1 */
   public void setCorporation(String newCorporation) {
      corporation = newCorporation;
   }
   
   /** @pdOid 34ed80ee-d717-4f8b-a246-4838619eada4 */
   public String getWaybillID() {
      return waybillID;
   }
   
   /** @param newWaybillID
    * @pdOid dee5ba74-1f2f-4e7d-ba13-a98b3c6ef1b6 */
   public void setWaybillID(String newWaybillID) {
      waybillID = newWaybillID;
   }
   
   /** @pdOid 3f641273-9662-4d82-814e-9352ef21efee */
   public String getRemarks() {
      return remarks;
   }
   
   /** @param newRemarks
    * @pdOid 4ddc56f5-801f-448c-afbe-7d2d7e29b0a4 */
   public void setRemarks(String newRemarks) {
      remarks = newRemarks;
   }
   
   /** @pdOid eb53a984-49fa-40b6-87ad-11759dc29618 */
   public Date getInputDate() {
      return inputDate;
   }
   
   /** @param newInputDate
    * @pdOid 1f0dd09d-5ade-4bcb-a31a-288bad245146 */
   public void setInputDate(Date newInputDate) {
      inputDate = newInputDate;
   }
   
   /** @pdOid c610e9ae-a496-43ef-bb99-51df762cb36d */
   public long getStats() {
      return stats;
   }
   
   /** @param newStats
    * @pdOid 64d78f69-784e-481d-b3a7-d96465d04465 */
   public void setStats(long newStats) {
      stats = newStats;
   }

}