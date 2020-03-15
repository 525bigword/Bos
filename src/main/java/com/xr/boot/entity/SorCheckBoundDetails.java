package com.xr.boot.entity; /***********************************************************************
 * Module:  SorCheckBoundDetails.java
 * Author:  Administrator
 * Purpose: Defines the Class SorCheckBoundDetails
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** 盘库详细表
 * 
 * @pdOid 4a57fd58-5586-4ec2-a36f-45674c694204 */
public class SorCheckBoundDetails implements Serializable {
   private static final long serialVersionUID = 2538903651064423755L;
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

   /** 方向
    * 
    * @pdOid 9d739dd1-8879-43e0-9131-b9de2810ed47 */
   private String direction;
   /** 入库时间
    * 
    * @pdOid 55d08057-d9ef-4fe2-a56b-7c78ab320ad1 */
   private String storageDate;
   /** 合包号  接入盘库表合包号
    * 
    * @pdOid d7e447e9-8857-41d3-aa47-614655b1c52d */
   private String packging;
   
   /** 工作单号  雪花算法十六号数据中心
    * 
    * @pdOid caaf7951-e977-4b83-94b8-a24db86886a5 */
   private  String id;
   private String storagePerson;

   @Override
   public String toString() {
      return "SorCheckBoundDetails{" +
              "cargoCount=" + cargoCount +
              ", weight=" + weight +
              ", volume=" + volume +
              ", direction='" + direction + '\'' +
              ", storageDate='" + storageDate + '\'' +
              ", packging='" + packging + '\'' +
              ", id='" + id + '\'' +
              ", storagePerson='" + storagePerson + '\'' +
              '}';
   }

   /** @pdOid 2ce3fbc2-dff0-4539-ac73-7abb53040a4f */
   public int getCargoCount() {
      return cargoCount;
   }

   public void setCargoCount(int cargoCount) {
      this.cargoCount = cargoCount;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      this.weight = weight;
   }

   public double getVolume() {
      return volume;
   }

   public void setVolume(double volume) {
      this.volume = volume;
   }

   public String getDirection() {
      return direction;
   }

   public void setDirection(String direction) {
      this.direction = direction;
   }

   public String getStorageDate() {
      return storageDate;
   }

   public void setStorageDate(String storageDate) {
      this.storageDate = storageDate;
   }

   public String getPackging() {
      return packging;
   }

   public void setPackging(String packging) {
      this.packging = packging;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getStoragePerson() {
      return storagePerson;
   }

   public void setStoragePerson(String storagePerson) {
      this.storagePerson = storagePerson;
   }
}