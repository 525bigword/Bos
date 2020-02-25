package com.xr.boot.entity; /***********************************************************************
 * Module:  SorPackage.java
 * Author:  Administrator
 * Purpose: Defines the Class SorPackage
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** 合包表
 * 
 * @pdOid ba1338c4-202a-4622-9f8a-ca5e251eb266 */
public class SorPackage implements Serializable {
   private static final long serialVersionUID = 6777621691364389743L;
   /** 合包号,雪花算法十七号数据中心
    * 
    * @pdOid 32bfb25f-509e-44fc-a5a1-23e5ea33834f */
   private String id;
   /**
    * 合包人
    * */
   private Integer packageperson;
   /** 封签号（原设备号）   雪花算法十八号数据中心
    * 
    * @pdOid c65d2afc-b9a7-4237-8c78-c5d29ba42374 */
   private String sealInt;
   /** 到达地
    * 
    * @pdOid fa6a565e-cb23-441d-84f9-19c55f4a428a */
   private String destination;
   /** 计算到达地
    * 
    * @pdOid 234e6eaa-f5a4-4f87-a107-2ce5b9e10661 */
   private String reckonDes;
   /** 送达时限
    * 
    * @pdOid e42aa33d-d6dc-4c72-9fc1-776eb741bfeb */
   private String timeLimit;
   /** 总票数
    * 
    * @pdOid d4a545f5-44c3-4230-a1b3-3608bb4a2ea8 */
   private int ticketSum;
   /** 总件数
    * 
    * @pdOid 977ad83a-cba9-427d-b0ce-05b3667011ca */
   private int cargoSum;
   /** 总重量
    * 
    * @pdOid 7b7e502b-684f-4644-9aac-72947ad358af */
   private double weightSum;
   /** 总体积
    * 
    * @pdOid 93e996bb-6bc5-4dc9-bea9-1725cee0d0fc */
   private double volumeSum;
   /** 状态
    * 
    * @pdOid 264959b9-c53c-4c42-9618-77397e1128cd */
   private String state;
   /** 配载要求
    * 
    * @pdOid 5254eeaf-36a0-4052-a8ec-b5dd32aac3cd */
   private String ask;
   /**业务属性*/
   private String packagepersonname;

   public String getPackagepersonname() {
      return packagepersonname;
   }

   public void setPackagepersonname(String packagepersonname) {
      this.packagepersonname = packagepersonname;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public Integer getPackageperson() {
      return packageperson;
   }

   public void setPackageperson(Integer packageperson) {
      this.packageperson = packageperson;
   }

   public String getSealInt() {
      return sealInt;
   }

   public void setSealInt(String sealInt) {
      this.sealInt = sealInt;
   }

   public String getDestination() {
      return destination;
   }

   public void setDestination(String destination) {
      this.destination = destination;
   }

   public String getReckonDes() {
      return reckonDes;
   }

   public void setReckonDes(String reckonDes) {
      this.reckonDes = reckonDes;
   }

   public String getTimeLimit() {
      return timeLimit;
   }

   public void setTimeLimit(String timeLimit) {
      this.timeLimit = timeLimit;
   }

   public int getTicketSum() {
      return ticketSum;
   }

   public void setTicketSum(int ticketSum) {
      this.ticketSum = ticketSum;
   }

   public int getCargoSum() {
      return cargoSum;
   }

   public void setCargoSum(int cargoSum) {
      this.cargoSum = cargoSum;
   }

   public double getWeightSum() {
      return weightSum;
   }

   public void setWeightSum(double weightSum) {
      this.weightSum = weightSum;
   }

   public double getVolumeSum() {
      return volumeSum;
   }

   public void setVolumeSum(double volumeSum) {
      this.volumeSum = volumeSum;
   }

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
   }

   public String getAsk() {
      return ask;
   }

   public void setAsk(String ask) {
      this.ask = ask;
   }
}