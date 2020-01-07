package com.xr.boot.entity; /***********************************************************************
 * Module:  SorOutBound.java
 * Author:  Administrator
 * Purpose: Defines the Class SorOutBound
 ***********************************************************************/

import java.util.*;

/** 出库表
 * 
 * @pdOid 9496affb-1ef5-4f40-9348-439b20c7d3c2 */
public class SorOutBound {
   /** 雪花算法十二号仓库
    * 
    * @pdOid 98100997-7c79-49df-b569-d3616680a404 */
   private String outBoundID;
   /** @pdOid 93084410-24ba-4442-b678-aed058dca997 */
   private long handoverType;
   /** @pdOid 2f74f028-8abe-4417-b083-a059343c7687 */
   private String line;
   /** @pdOid 4d06c09a-afdc-42a7-9aa0-8a1a122f45cb */
   private int direction;
   /** @pdOid bc24cb5a-297e-4fed-81f9-539aff7d82bd */
   private int carriers;
   /** @pdOid 4d98c00b-c4b6-47f1-a2e6-b66aadbc5cff */
   private Date deliveryDate;
   /** @pdOid 70727697-042d-43da-82b1-ab46c3b36a9f */
   private String deliveryCompany;
   /** @pdOid 5366dbc0-86f2-438a-b050-517eba6d7d0e */
   private Date enterDate;
   /** 合包号	接入合包表
    * 
    * @pdOid a3672c9d-b9d3-41a2-bce5-1b8961879a76 */
   private String packageID;
   
   /** @pdOid cc6922d9-27e6-4005-b71e-10a42d86879b */
   public String getOutBoundID() {
      return outBoundID;
   }
   
   /** @param newOutBoundID
    * @pdOid 41911ba2-9790-4135-870b-eb738ca32f47 */
   public void setOutBoundID(String newOutBoundID) {
      outBoundID = newOutBoundID;
   }
   
   /** @pdOid 50c47bad-677c-487d-a48b-ad6607f7ef4c */
   public long getHandoverType() {
      return handoverType;
   }
   
   /** @param newHandoverType
    * @pdOid 9bb0d798-61fe-4adf-9a37-7f5de767eebd */
   public void setHandoverType(long newHandoverType) {
      handoverType = newHandoverType;
   }
   
   /** @pdOid 4e9c38bd-e5d3-4e7b-975d-4292a5295f82 */
   public String getLine() {
      return line;
   }
   
   /** @param newLine
    * @pdOid 8583ea4e-db94-4b85-9db5-2be320d72c5c */
   public void setLine(String newLine) {
      line = newLine;
   }
   
   /** @pdOid 5c720777-4dae-49f9-b4a2-effbe0d04f59 */
   public int getDirection() {
      return direction;
   }
   
   /** @param newDirection
    * @pdOid b52af9b6-d987-45c0-b241-372c7ad990aa */
   public void setDirection(int newDirection) {
      direction = newDirection;
   }
   
   /** @pdOid a33c6d63-9da8-4146-83b4-cbb63bac9245 */
   public int getCarriers() {
      return carriers;
   }
   
   /** @param newCarriers
    * @pdOid 05eee7a1-3cd6-4b4f-b6b0-4aed7f4d3f14 */
   public void setCarriers(int newCarriers) {
      carriers = newCarriers;
   }
   
   /** @pdOid 5524be1a-473c-40d4-ade4-b1b21752eaf7 */
   public Date getDeliveryDate() {
      return deliveryDate;
   }
   
   /** @param newDeliveryDate
    * @pdOid 07bc3c0c-818c-475b-8044-72871a5a2d99 */
   public void setDeliveryDate(Date newDeliveryDate) {
      deliveryDate = newDeliveryDate;
   }
   
   /** @pdOid d07d0e9a-a8fa-4cca-b7f8-f06261c3f7cd */
   public String getDeliveryCompany() {
      return deliveryCompany;
   }
   
   /** @param newDeliveryCompany
    * @pdOid 8c495e4d-a790-4d2e-8496-38ed42b59f62 */
   public void setDeliveryCompany(String newDeliveryCompany) {
      deliveryCompany = newDeliveryCompany;
   }
   
   /** @pdOid 3e039de4-7c10-4558-a878-664780e43e45 */
   public Date getEnterDate() {
      return enterDate;
   }
   
   /** @param newEnterDate
    * @pdOid bddeac22-1103-4c6d-977a-97cfab7023ed */
   public void setEnterDate(Date newEnterDate) {
      enterDate = newEnterDate;
   }
   
   /** @pdOid 20d30b2a-f3cd-43ab-ab6d-448b99f91c35 */
   public String getPackageID() {
      return packageID;
   }
   
   /** @param newPackageID
    * @pdOid 9cab1014-ee1b-4e66-9a69-045a026017d9 */
   public void setPackageID(String newPackageID) {
      packageID = newPackageID;
   }

}