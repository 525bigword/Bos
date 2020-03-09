package com.xr.boot.entity; /***********************************************************************
 * Module:  SorStorageDetails.java
 * Author:  Administrator
 * Purpose: Defines the Class SorStorageDetails
 ***********************************************************************/

import java.util.*;

/** 入库详情表
 * 
 * @pdOid 55520fbf-fa2d-4075-a812-9e675e2a851c */
public class SorStorageDetails {
   /** 单号,雪花算法十一号算法
    * 
    * @pdOid 3f2b529e-6017-4159-bcc2-4a63d4273664 */
   private String id;
   /** 合包号,接入入库表合包号
    * 
    * @pdOid dd5bbfe5-d491-47b1-9bbc-e3773b0e0d02 */
   private String packageID;
   /** 重量
    * 
    * @pdOid f92e6e2d-4821-4222-b36c-ed8dac1ab6fe */
   private double weight;
   /**关联出库表*/
   private String outboundid;

   public String getOutboundid() {
      return outboundid;
   }

   public void setOutboundid(String outboundid) {
      this.outboundid = outboundid;
   }

   /** @pdOid 936cf5b6-6631-44f2-990f-4dcc4e2cdf57 */
   public String getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 399ef5f3-234f-4b04-8495-d65ace5de34d */
   public void setId(String newId) {
      id = newId;
   }
   
   /** @pdOid 2e9b9b73-b89c-4450-a31b-7101ba2fc836 */
   public String getPackageID() {
      return packageID;
   }
   
   /** @param newPackageID
    * @pdOid f0e1f2a5-69fd-4948-b14a-759098685f0c */
   public void setPackageID(String newPackageID) {
      packageID = newPackageID;
   }
   
   /** @pdOid f01fbb15-3041-4ecf-95e7-5284cf850e25 */
   public double getWeight() {
      return weight;
   }
   
   /** @param newWeight
    * @pdOid 624dda31-f390-4259-8003-1a0e9fbbca93 */
   public void setWeight(double newWeight) {
      weight = newWeight;
   }
   public SorStorageDetails(){}
   public SorStorageDetails(String id, String packageID, double weight) {
      this.id = id;
      this.packageID = packageID;
      this.weight = weight;
      this.outboundid = outboundid;
   }
}