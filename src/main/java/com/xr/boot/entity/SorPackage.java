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
   private Date timeLimit;
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

   @Override
   public String toString() {
      return "SorPackage{" +
              "id='" + id + '\'' +
              ", sealInt='" + sealInt + '\'' +
              ", destination='" + destination + '\'' +
              ", reckonDes='" + reckonDes + '\'' +
              ", timeLimit=" + timeLimit +
              ", ticketSum=" + ticketSum +
              ", cargoSum=" + cargoSum +
              ", weightSum=" + weightSum +
              ", volumeSum=" + volumeSum +
              ", state=" + state +
              ", ask=" + ask +
              '}';
   }

   /** @pdOid f7ffbc78-b68e-43ab-9f1e-3768bde36f1a */
   public String getAsk() {
      return ask;
   }
   
   /** @param newAsk
    * @pdOid 435832be-c090-4d99-adc7-72d53efc45f7 */
   public void setAsk(String newAsk) {
      ask = newAsk;
   }

   public Integer getPackageperson() {
      return packageperson;
   }

   public void setPackageperson(Integer packageperson) {
      this.packageperson = packageperson;
   }

   /** @pdOid ec9ad752-230c-4531-b5c5-24eed5292292 */
   public String getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 1bf3be11-327e-4c68-a1bd-dfec131c624c */
   public void setId(String newId) {
      id = newId;
   }
   
   /** @pdOid 885fa2df-4e9b-4297-87a0-dce037326e44 */
   public String getSealInt() {
      return sealInt;
   }
   
   /** @param newSealInt
    * @pdOid 189e5d0c-8a5f-41de-ba09-211b41b92987 */
   public void setSealInt(String newSealInt) {
      sealInt = newSealInt;
   }
   
   /** @pdOid 2b78977a-bc07-487f-baca-93b8b0abd1f6 */
   public String getDestination() {
      return destination;
   }
   
   /** @param newDestination
    * @pdOid a1b8a237-831e-400f-9f0b-e116a8f9975b */
   public void setDestination(String newDestination) {
      destination = newDestination;
   }
   
   /** @pdOid 73a4b2f0-d08f-4223-8dbe-e6818d66ff73 */
   public String getReckonDes() {
      return reckonDes;
   }
   
   /** @param newReckonDes
    * @pdOid beeafa92-0a06-4fbc-965c-5838b56c9ee5 */
   public void setReckonDes(String newReckonDes) {
      reckonDes = newReckonDes;
   }
   
   /** @pdOid 575d0d92-7b58-4341-8a24-3adc5a21628d */
   public Date getTimeLimit() {
      return timeLimit;
   }
   
   /** @param newTimeLimit
    * @pdOid 3e4f8501-9c80-45f2-b84a-ccc382edd776 */
   public void setTimeLimit(Date newTimeLimit) {
      timeLimit = newTimeLimit;
   }
   
   /** @pdOid 4fb6a246-320d-4d3c-9fd0-be7e917d0ab4 */
   public int getTicketSum() {
      return ticketSum;
   }
   
   /** @param newTicketSum
    * @pdOid 5ee88d99-ed18-490e-afd0-46aeb676136d */
   public void setTicketSum(int newTicketSum) {
      ticketSum = newTicketSum;
   }
   
   /** @pdOid fa8bbf88-43b8-4b60-a2a9-c830b799e86a */
   public int getCargoSum() {
      return cargoSum;
   }
   
   /** @param newCargoSum
    * @pdOid 6edf3e48-25d6-4ca6-99c6-aaac6821751b */
   public void setCargoSum(int newCargoSum) {
      cargoSum = newCargoSum;
   }
   
   /** @pdOid 581df8f8-abcc-48c4-8342-45bf2ee1525f */
   public double getWeightSum() {
      return weightSum;
   }
   
   /** @param newWeightSum
    * @pdOid 9c93555c-80a8-4056-9c2c-00641b89e46f */
   public void setWeightSum(double newWeightSum) {
      weightSum = newWeightSum;
   }
   
   /** @pdOid 4d1ca817-e75d-4608-9c30-c4460efabbac */
   public double getVolumeSum() {
      return volumeSum;
   }
   
   /** @param newVolumeSum
    * @pdOid 1d87a6dc-2b68-4c12-8fe0-76387d5e1b74 */
   public void setVolumeSum(double newVolumeSum) {
      volumeSum = newVolumeSum;
   }
   
   /** @pdOid f2f07bad-4095-451a-ad8f-252c3e2f3ee9 */
   public String getState() {
      return state;
   }

   /** @param newState
    * @pdOid 8152d59a-f1f6-4747-810e-7fe1277e3670 */
   public void setState(String newState) {
      state = newState;
   }

}