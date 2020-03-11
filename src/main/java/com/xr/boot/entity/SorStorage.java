package com.xr.boot.entity; /***********************************************************************
 * Module:  SorStorage.java
 * Author:  Administrator
 * Purpose: Defines the Class SorStorage
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** 入库表
 * 
 * @pdOid b3d6ad1e-5ef0-41d3-8bd5-e36175177a3d */
public class SorStorage implements Serializable {
   private static final long serialVersionUID = -8370764339183510206L;
   /** 入库交接单号,雪花算法九号数据中心
    * 
    * @pdOid 8001da4b-2eff-41ea-85ae-baa5809b683d */
   private String id;
   /** 接货时间
    * 
    * @pdOid b379d304-bdfa-44cb-b7a1-203fd19171f3 */
   private String acceptDate;
   /**接货人*/
   private Integer acceptperson;
   /**接货人名字*/
   private String acceptpersonname;
   /** 接收单位
    * 
    * @pdOid 66b893c4-c884-4aaa-9949-87aa786cd43c */
   private String acceptCompany;
   /** 合包号   接入合包表
    * 
    * @pdOid 14c3760a-0924-442f-abcf-e1325840974d */
   private String packageID;
   
   /** @pdOid f8e452d7-49b5-49bc-8f88-debb8c4cf341 */
   public String getId() {
      return id;
   }
   /**业务属性*/


   /** @param newId
    * @pdOid 77e43078-29e0-4f53-a023-54f0a2034e30 */
   public void setId(String newId) {
      id = newId;
   }

   public String getAcceptpersonname() {
      return acceptpersonname;
   }

   public void setAcceptpersonname(String acceptpersonname) {
      this.acceptpersonname = acceptpersonname;
   }

   /** @pdOid 592c3e07-8c4c-4deb-b276-91deb155c739 */
   public String getAcceptDate() {
      return acceptDate;
   }
   
   /** @param newAcceptDate
    * @pdOid a48fbaa9-5c25-4524-b49a-d56c33d9f175 */
   public void setAcceptDate(String newAcceptDate) {
      acceptDate = newAcceptDate;
   }

   public String getAcceptCompany() {
      return acceptCompany;
   }

   public void setAcceptCompany(String acceptCompany) {
      this.acceptCompany = acceptCompany;
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

   public Integer getAcceptperson() {
      return acceptperson;
   }

   public void setAcceptperson(Integer acceptperson) {
      this.acceptperson = acceptperson;
   }

   public SorStorage(String id, String acceptDate, Integer acceptperson, String acceptCompany, String packageID) {
      this.id = id;
      this.acceptDate = acceptDate;
      this.acceptperson = acceptperson;
      this.acceptCompany = acceptCompany;
      this.packageID = packageID;
   }
}