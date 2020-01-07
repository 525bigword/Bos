package com.xr.boot.entity; /***********************************************************************
 * Module:  BasBasicArchivesEntry.java
 * Author:  Administrator
 * Purpose: Defines the Class BasBasicArchivesEntry
 ***********************************************************************/

import java.util.*;

/** 基础档案条目表
 * 
 * @pdOid 43656fea-77d7-442f-b0ba-3a64624ccf29 */
public class BasBasicArchivesEntry {
   /** OperationTime
    * 
    * @pdOid 1014c20d-6cf9-4bc6-adf3-ea96a043da26 */
   private long id;
   /** 档案名称	唯一
    * 
    * @pdOid 2720f30e-c112-49db-b7e2-93a7187c8781 */
   private String name;
   /** 上级编码	本表ID
    * 
    * @pdOid c024036e-bbcb-4324-a751-108dc89c7c55 */
   private int parentID;
   /** 助记码	唯一且只可为英文,雪花算法二十四
    * 
    * @pdOid 09baa7d9-21ec-430a-864e-0586b4d54009 */
   private String mnemonicCode;
   /** 是否封存	1：是，0：否
    * 
    * @pdOid ac4ecfed-5909-451d-86fb-2a47ab834f92 */
   private long available;
   /** 备注
    * 
    * @pdOid 1fc60b65-3c40-44f5-b0ac-55f568b4a86e */
   private String remarks;
   /** 操作时间	当前操作时间
    * 
    * @pdOid 78b2e29d-4081-4b13-a3cd-8684b40e2b96 */
   private Date operationTime;
   /** 状态	0：正常，1：停用
    * 
    * @pdOid cb7f5d90-d5e5-468d-a11f-d32ab0179bdc */
   private long stats;
   
   /** @pdOid edc1b77d-5c63-4bd3-b828-a85b8cc047b1 */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 61ab5358-1431-453b-b8d3-a8b53de78bd5 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid e64419ae-e920-4d60-b835-85c808cf8ef3 */
   public String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid 7887a0b5-cdf9-4dbe-ba57-6f9070672b09 */
   public void setName(String newName) {
      name = newName;
   }
   
   /** @pdOid 83783cc7-e10c-4d99-bdc1-9b05d301712e */
   public int getParentID() {
      return parentID;
   }
   
   /** @param newParentID
    * @pdOid 758b355a-2231-4811-877f-cd4d12717388 */
   public void setParentID(int newParentID) {
      parentID = newParentID;
   }
   
   /** @pdOid 57e5b7ac-a322-4c6d-a54f-0a39cc77f45a */
   public String getMnemonicCode() {
      return mnemonicCode;
   }
   
   /** @param newMnemonicCode
    * @pdOid d9d70cae-db4b-4c7f-9b85-539bed52c42d */
   public void setMnemonicCode(String newMnemonicCode) {
      mnemonicCode = newMnemonicCode;
   }
   
   /** @pdOid a37f4587-5113-4f78-9c52-1c531ba3d962 */
   public long getAvailable() {
      return available;
   }
   
   /** @param newAvailable
    * @pdOid ea612181-1fda-4962-a6fa-64e4c4792439 */
   public void setAvailable(long newAvailable) {
      available = newAvailable;
   }
   
   /** @pdOid 75986fc8-c1ea-4977-b335-aaafe83cb474 */
   public String getRemarks() {
      return remarks;
   }
   
   /** @param newRemarks
    * @pdOid 98c32f92-c45b-4828-aafe-475d8d4b485e */
   public void setRemarks(String newRemarks) {
      remarks = newRemarks;
   }
   
   /** @pdOid 25907d74-8e4c-4394-a4b7-529993455e4e */
   public Date getOperationTime() {
      return operationTime;
   }
   
   /** @param newOperationTime
    * @pdOid 531d36b4-aac8-4223-9085-71f8f65927e9 */
   public void setOperationTime(Date newOperationTime) {
      operationTime = newOperationTime;
   }
   
   /** @pdOid 35e094c1-06dc-405d-90cd-55d558e72774 */
   public long getStats() {
      return stats;
   }
   
   /** @param newStats
    * @pdOid 0d09c8d8-9bf4-443c-9e21-da550da7b23b */
   public void setStats(long newStats) {
      stats = newStats;
   }

}