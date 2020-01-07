package com.xr.boot.entity; /***********************************************************************
 * Module:  SorOutBoundDetails.java
 * Author:  Administrator
 * Purpose: Defines the Class SorOutBoundDetails
 ***********************************************************************/

import java.util.*;

/** 出库详情表
 * 
 * @pdOid 73272bc7-f4bc-4d17-89df-eac3e1107bcd */
public class SorOutBoundDetails {
   /** 单号    雪花算法十三号仓库
    * 
    * @pdOid 723b2ee1-895d-4d4a-93e8-5650a048d6f0 */
   private String id;
   /** 合包号   接入出库表合包号
    * 
    * @pdOid 5a942d31-c688-408e-b7ab-27164044ca34 */
   private String packageID;
   /** 重量
    * 
    * @pdOid 8c263d84-0ef4-4e97-ad03-95d3abb0a784 */
   private double weight;
   /** 体积
    * 
    * @pdOid 93233b96-2ebc-485d-a27b-510f2ad2b723 */
   private double volume;
   /** 状态
    * 
    * @pdOid b5e697ab-c31c-4e3f-a676-8fe06c00787b */
   private Date scanDate;
   /** 是否扫描	1：是   0：否
    * 
    * @pdOid c739aedc-8111-4166-9352-accae0e95b8f */
   private long isScan;
   /** 是否下环节入库	1：是   0：否
    * 
    * @pdOid 1948078c-f9fb-49a2-b214-649445e624b3 */
   private long isNextStorage;
   /** 是否二次入库	1：是   0：否
    * 
    * @pdOid b5eee961-61ab-4304-a0ed-c5f308534e6e */
   private long isDoubleStorage;
   
   /** @pdOid b9294cf2-c154-4967-a1c6-44a5da259acc */
   public String getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid b2974355-c5e5-40d0-b787-4d92dac88cdb */
   public void setId(String newId) {
      id = newId;
   }
   
   /** @pdOid 6b73895f-62b8-4dca-9738-b2ff16f6820b */
   public String getPackageID() {
      return packageID;
   }
   
   /** @param newPackageID
    * @pdOid a30b74d7-bb0f-4db6-bcba-3e003037b139 */
   public void setPackageID(String newPackageID) {
      packageID = newPackageID;
   }
   
   /** @pdOid 64a69cc4-0815-4f33-a099-edf0965f845f */
   public double getWeight() {
      return weight;
   }
   
   /** @param newWeight
    * @pdOid 6ae78160-b546-4ba0-bad8-1fa872a19322 */
   public void setWeight(double newWeight) {
      weight = newWeight;
   }
   
   /** @pdOid 230df498-a4be-4275-a187-90337ec2a5bf */
   public double getVolume() {
      return volume;
   }
   
   /** @param newVolume
    * @pdOid 55761b82-d593-43f5-a557-403d85bbe49c */
   public void setVolume(double newVolume) {
      volume = newVolume;
   }
   
   /** @pdOid 728d00ad-0c2d-4622-83ba-b94825cf6d9e */
   public Date getScanDate() {
      return scanDate;
   }
   
   /** @param newScanDate
    * @pdOid c5f701d2-9a38-4cb1-9d82-3fb009d28b44 */
   public void setScanDate(Date newScanDate) {
      scanDate = newScanDate;
   }
   
   /** @pdOid 6175934e-ff09-4b60-bfb1-73e99fdc84d2 */
   public long getIsScan() {
      return isScan;
   }
   
   /** @param newIsScan
    * @pdOid 5cc83a6c-b058-434b-80c4-1a39cd2ea704 */
   public void setIsScan(long newIsScan) {
      isScan = newIsScan;
   }
   
   /** @pdOid 72b17d85-11f6-4fcd-9238-4b5223577728 */
   public long getIsNextStorage() {
      return isNextStorage;
   }
   
   /** @param newIsNextStorage
    * @pdOid 945830fa-55fb-4100-9758-89f80b751839 */
   public void setIsNextStorage(long newIsNextStorage) {
      isNextStorage = newIsNextStorage;
   }
   
   /** @pdOid a8a3c766-b627-4b36-aed5-effb624d742f */
   public long getIsDoubleStorage() {
      return isDoubleStorage;
   }
   
   /** @param newIsDoubleStorage
    * @pdOid af3d27ba-32cc-4a50-a860-4d586012c2d5 */
   public void setIsDoubleStorage(long newIsDoubleStorage) {
      isDoubleStorage = newIsDoubleStorage;
   }

}