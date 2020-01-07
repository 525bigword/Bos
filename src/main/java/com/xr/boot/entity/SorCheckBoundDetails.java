package com.xr.boot.entity; /***********************************************************************
 * Module:  SorCheckBoundDetails.java
 * Author:  Administrator
 * Purpose: Defines the Class SorCheckBoundDetails
 ***********************************************************************/

import java.util.*;

/** 盘库详细表
 * 
 * @pdOid 4a57fd58-5586-4ec2-a36f-45674c694204 */
public class SorCheckBoundDetails {
   /** 件数
    * 
    * @pdOid 9128a813-92ac-4fb8-9e2b-5b91654ec073 */
   private int cargoCount;
   /** 重量
    * 
    * @pdOid f237c385-1fc9-4b61-b70f-bb54489c2e07 */
   private double weight;
   /** 体积
    * 
    * @pdOid 616fa925-69ef-4f57-93cd-720b0ae02f45 */
   private double volume;
   /** 类型
    * 
    * @pdOid 1d1a9da2-be8f-4e4c-bf5c-acf545a52137 */
   private long cargoType;
   /** 方向
    * 
    * @pdOid 9d739dd1-8879-43e0-9131-b9de2810ed47 */
   private String direction;
   /** 入库时间
    * 
    * @pdOid 55d08057-d9ef-4fe2-a56b-7c78ab320ad1 */
   private Date storageDate;
   /** 合包号  接入盘库表合包号
    * 
    * @pdOid d7e447e9-8857-41d3-aa47-614655b1c52d */
   private String packging;
   
   /** 工作单号  雪花算法十六号数据中心
    * 
    * @pdOid caaf7951-e977-4b83-94b8-a24db86886a5 */
   public String id;
   
   /** @pdOid 2ce3fbc2-dff0-4539-ac73-7abb53040a4f */
   public String getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 66682421-6829-4f81-8471-62f4016aa5e6 */
   public void setId(String newId) {
      id = newId;
   }
   
   /** @pdOid a229f1f5-f629-4b0e-b56b-d43b2f7125d6 */
   public int getCargoCount() {
      return cargoCount;
   }
   
   /** @param newCargoCount
    * @pdOid f6026c59-ccad-4f05-9255-348cbd9b17e8 */
   public void setCargoCount(int newCargoCount) {
      cargoCount = newCargoCount;
   }
   
   /** @pdOid 80755f20-8e39-4055-b00f-3821cfbbe516 */
   public double getWeight() {
      return weight;
   }
   
   /** @param newWeight
    * @pdOid 1a51c069-1665-4ae9-bdb6-41d7372ccb43 */
   public void setWeight(double newWeight) {
      weight = newWeight;
   }
   
   /** @pdOid 31769387-0ae5-4d2f-a358-c0181efaa0fc */
   public double getVolume() {
      return volume;
   }
   
   /** @param newVolume
    * @pdOid 88645d6d-0780-42fd-9998-46d536faf03b */
   public void setVolume(double newVolume) {
      volume = newVolume;
   }
   
   /** @pdOid 80f79724-b725-42ca-ad02-40e6ce8230b0 */
   public long getCargoType() {
      return cargoType;
   }
   
   /** @param newCargoType
    * @pdOid 37025728-6bfd-452b-b39f-2f8df8dc5c62 */
   public void setCargoType(long newCargoType) {
      cargoType = newCargoType;
   }
   
   /** @pdOid 4687c665-d2ff-43c9-b1ae-01e22d2963c4 */
   public String getDirection() {
      return direction;
   }
   
   /** @param newDirection
    * @pdOid c8351f18-645e-4482-ae2b-ba1605fec484 */
   public void setDirection(String newDirection) {
      direction = newDirection;
   }
   
   /** @pdOid 4ed5fecd-2d2c-4c25-b23a-c2ca0c41b7d6 */
   public Date getStorageDate() {
      return storageDate;
   }
   
   /** @param newStorageDate
    * @pdOid e5ce6299-2167-4bb3-a735-97d45037d114 */
   public void setStorageDate(Date newStorageDate) {
      storageDate = newStorageDate;
   }
   
   /** @pdOid 9e6a13d5-8f5e-4d67-aaa4-05b7a93b945f */
   public String getPackging() {
      return packging;
   }
   
   /** @param newPackging
    * @pdOid d69212b3-abf1-4641-8cb7-f62acd4197b1 */
   public void setPackging(String newPackging) {
      packging = newPackging;
   }

}