package com.xr.boot.entity; /***********************************************************************
 * Module:  SorStorage.java
 * Author:  Administrator
 * Purpose: Defines the Class SorStorage
 ***********************************************************************/

import java.util.*;

/** 入库表
 * 
 * @pdOid b3d6ad1e-5ef0-41d3-8bd5-e36175177a3d */
public class SorStorage {
   /** 入库交接单号,雪花算法九号数据中心
    * 
    * @pdOid 8001da4b-2eff-41ea-85ae-baa5809b683d */
   private String id;
   /** 接货时间
    * 
    * @pdOid b379d304-bdfa-44cb-b7a1-203fd19171f3 */
   private Date acceptDate;
   /** 接收单位
    * 
    * @pdOid 66b893c4-c884-4aaa-9949-87aa786cd43c */
   private String acceptCompany;
   /** 发货单位
    * 
    * @pdOid 6e6d9803-001c-4ca4-890c-fc276f95bebd */
   private String deliveryCompany;
   /** 合包号   接入合包表
    * 
    * @pdOid 14c3760a-0924-442f-abcf-e1325840974d */
   private String packageID;
   
   /** @pdOid f8e452d7-49b5-49bc-8f88-debb8c4cf341 */
   public String getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 77e43078-29e0-4f53-a023-54f0a2034e30 */
   public void setId(String newId) {
      id = newId;
   }
   
   /** @pdOid 592c3e07-8c4c-4deb-b276-91deb155c739 */
   public Date getAcceptDate() {
      return acceptDate;
   }
   
   /** @param newAcceptDate
    * @pdOid a48fbaa9-5c25-4524-b49a-d56c33d9f175 */
   public void setAcceptDate(Date newAcceptDate) {
      acceptDate = newAcceptDate;
   }
   
   /** @pdOid 398c5946-b4a9-4bd9-9e4e-0919acd7bf9f */
   public String getAcceptCompany() {
      return acceptCompany;
   }
   
   /** @param newAcceptCompany
    * @pdOid 98168154-b18b-4b77-bf8a-06c402cff3b4 */
   public void setAcceptCompany(String newAcceptCompany) {
      acceptCompany = newAcceptCompany;
   }
   
   /** @pdOid e30d8050-7d83-481d-a0b9-bc427858b09c */
   public String getDeliveryCompany() {
      return deliveryCompany;
   }
   
   /** @param newDeliveryCompany
    * @pdOid e289a6d9-3d08-44cb-ad08-533cebe65775 */
   public void setDeliveryCompany(String newDeliveryCompany) {
      deliveryCompany = newDeliveryCompany;
   }
   
   /** @pdOid cde396c4-cb29-4015-9c39-6f38538d7be8 */
   public String getPackageID() {
      return packageID;
   }
   
   /** @param newPackageID
    * @pdOid e24199b8-f9da-4476-93ae-1da44791dca3 */
   public void setPackageID(String newPackageID) {
      packageID = newPackageID;
   }

}