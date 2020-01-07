package com.xr.boot.entity;
/***********************************************************************
 * Module:  AccBusinessAdmissibility.java
 * Author:  Administrator
 * Purpose: Defines the Class AccBusinessAdmissibility
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** 业务受理表
 * 
 * @pdOid 0d116458-3e8f-4061-b3c0-b5703e8acee8 */
public class AccBusinessAdmissibility implements Serializable {
   /** 预约收件时间
    * 
    * @pdOid 0429c69d-3f7f-4cb0-8b33-6db8810a02d7 */
   private Date reservationTime;
   /** 客户名称
    * 
    * @pdOid d3081630-de9b-489b-9759-ac39586e4136 */
   private String customName;
   /** 取件地址
    * 
    * @pdOid a3a11866-4ad8-4fc4-b9c0-a34ca38d9128 */
   private String pickupAddress;
   /** 客户编号
    * 
    * @pdOid 327571d6-28d8-4983-9343-f75829271044 */
   private String customCode;
   /** 联系人
    * 
    * @pdOid 4ff4afd6-8595-458d-b1b4-b060a68b15ac */
   private String linkman;
   /** 电话
    * 
    * @pdOid 17069f6e-a993-4e37-8350-990b9cc597e1 */
   private String telPhone;
   /** 重量
    * 
    * @pdOid 9c108101-d916-41fe-a83d-fece85df2bab */
   private double weight;
   /** 体积
    * 
    * @pdOid 0ff60f08-5bca-47e6-8a5f-79779f449b71 */
   private double volume;
   /** 重要提示
    * 
    * @pdOid 2b84e0ab-e398-48a9-ad3a-d80561f2b01f */
   private String importantHints;
   /** 到达城市
    * 
    * @pdOid 34eb4d5e-012c-447a-9e5b-8be61693e56c */
   private String arriveCity;
   /** 派送地址
    * 
    * @pdOid c2ee6046-4e5e-422f-a5b2-c5d609f69aeb */
   private String sendAddress;
   /** 通知单来源
    * 
    * @pdOid 814d9dc6-ad06-432d-b030-fdf58f0ee9f3 */
   private long notificationSource;
   /** 客户单号修改标志
    * 
    * @pdOid 37376a14-e471-4a45-915f-fa788dc2f8e4 */
   private long customNoModifyFlag;
   /** 分单类型
    * 
    * @pdOid 3999e254-3e48-4801-8272-8fdbc2ac567d */
   private String singleType;
   /** 件数
    * 
    * @pdOid 68895f22-fc8b-477b-80dc-a2c1db0c708c */
   private int packagesNum;
   /** 实际重量
    * 
    * @pdOid f2f2095c-79f1-46b8-b5ca-91352c66da74 */
   private double actualWeight;
   /** 计费重量
    * 
    * @pdOid 84f18863-d39e-49f8-b114-6a8ebc0b20c3 */
   private double billingWeight;
   /** 包装费
    * 
    * @pdOid 3552bf36-4877-4607-86bc-a7d2d9755531 */
   private double packingFee;
   /** 实际包装	1.木箱、2.纸箱
    * 
    * @pdOid 2d3215e8-aca5-4567-8442-a29d9ca00d37 */
   private long actualPacking;
   /** 备用字段
    * 
    * @pdOid d0575b9a-b7f9-482c-8d3c-aad8646a8c90 */
   private String comment;
   
   /** 业务通知单号    雪花算法一号数据中心
    * 
    * @pdOid 18142c0f-9e35-4bb4-8e7a-9aa227732662 */
   public String businessNoticeNo;
   
   /** @pdOid a2f86074-9815-484f-ae0b-f366f75b89b9 */
   public String getBusinessNoticeNo() {
      return businessNoticeNo;
   }
   
   /** @param newBusinessNoticeNo
    * @pdOid 23b58cbe-384d-4646-b63e-dfdf8eb63f7c */
   public void setBusinessNoticeNo(String newBusinessNoticeNo) {
      businessNoticeNo = newBusinessNoticeNo;
   }
   
   /** @pdOid 7d45ce42-cb61-42a0-9e97-4984ca3d9880 */
   public Date getReservationTime() {
      return reservationTime;
   }
   
   /** @param newReservationTime
    * @pdOid 11561ff9-1e2e-41dc-a37a-773a234cbdbd */
   public void setReservationTime(Date newReservationTime) {
      reservationTime = newReservationTime;
   }
   
   /** @pdOid 5b8558cb-4f48-40fc-b47f-775f52872a1f */
   public String getCustomName() {
      return customName;
   }
   
   /** @param newCustomName
    * @pdOid 2915f8cd-27f9-4efe-8d55-b09b6c92eae2 */
   public void setCustomName(String newCustomName) {
      customName = newCustomName;
   }
   
   /** @pdOid 5150273c-2902-4a0d-acc3-869f199b5bb7 */
   public String getPickupAddress() {
      return pickupAddress;
   }
   
   /** @param newPickupAddress
    * @pdOid 88cb8112-058d-4939-872d-ac6e2d39d49a */
   public void setPickupAddress(String newPickupAddress) {
      pickupAddress = newPickupAddress;
   }
   
   /** @pdOid b8fe8a5d-d52e-4ac9-9f1d-f27354fd7d01 */
   public String getCustomCode() {
      return customCode;
   }
   
   /** @param newCustomCode
    * @pdOid ded6e503-26c6-485d-935c-6b2f6f84bdb1 */
   public void setCustomCode(String newCustomCode) {
      customCode = newCustomCode;
   }
   
   /** @pdOid 83ba90b0-5bc0-46ac-8782-b389e7619d30 */
   public String getLinkman() {
      return linkman;
   }
   
   /** @param newLinkman
    * @pdOid bf5a22b0-34d9-488f-b910-94235d653fea */
   public void setLinkman(String newLinkman) {
      linkman = newLinkman;
   }
   
   /** @pdOid 88a9ff20-a083-4975-9aa3-1317dd7b953c */
   public String getTelPhone() {
      return telPhone;
   }
   
   /** @param newTelPhone
    * @pdOid 993e2f64-70c3-4ba9-9348-dcd841a2ed62 */
   public void setTelPhone(String newTelPhone) {
      telPhone = newTelPhone;
   }
   
   /** @pdOid 8cfdede5-b482-42e5-ae18-a66094a0ac36 */
   public double getWeight() {
      return weight;
   }
   
   /** @param newWeight
    * @pdOid 0819efc2-67c0-4c03-aa23-899474b65d8d */
   public void setWeight(double newWeight) {
      weight = newWeight;
   }
   
   /** @pdOid 09a65451-9af7-4952-b8ad-bc3487984f5e */
   public double getVolume() {
      return volume;
   }
   
   /** @param newVolume
    * @pdOid cbd6dc77-7f8b-43fe-9e9a-4d4d3a9f2332 */
   public void setVolume(double newVolume) {
      volume = newVolume;
   }
   
   /** @pdOid 7c681647-c9c7-4a5e-958f-a97b02617bbd */
   public String getImportantHints() {
      return importantHints;
   }
   
   /** @param newImportantHints
    * @pdOid f21d647a-97a5-41c7-994b-1a0fe4497c47 */
   public void setImportantHints(String newImportantHints) {
      importantHints = newImportantHints;
   }
   
   /** @pdOid af611e54-9e6a-4845-8455-bacf0d38e821 */
   public String getArriveCity() {
      return arriveCity;
   }
   
   /** @param newArriveCity
    * @pdOid dacbd25f-21f1-47c8-9173-330fff8fbbfa */
   public void setArriveCity(String newArriveCity) {
      arriveCity = newArriveCity;
   }
   
   /** @pdOid ba2d1279-62e2-4cba-8e5d-9ac2d8055fc4 */
   public String getSendAddress() {
      return sendAddress;
   }
   
   /** @param newSendAddress
    * @pdOid c9677f32-dc11-42b7-a903-2825d5e22ab0 */
   public void setSendAddress(String newSendAddress) {
      sendAddress = newSendAddress;
   }
   
   /** @pdOid 143b3ceb-ad01-4d3e-bbaa-62d9f1ee2505 */
   public long getNotificationSource() {
      return notificationSource;
   }
   
   /** @param newNotificationSource
    * @pdOid 0849c395-4069-45ea-87b0-15580032e3ce */
   public void setNotificationSource(long newNotificationSource) {
      notificationSource = newNotificationSource;
   }
   
   /** @pdOid 273d9f9b-56c7-4e49-8177-d2a05554edbc */
   public long getCustomNoModifyFlag() {
      return customNoModifyFlag;
   }
   
   /** @param newCustomNoModifyFlag
    * @pdOid 43fa5054-ae60-4c04-8a51-12e185b37af6 */
   public void setCustomNoModifyFlag(long newCustomNoModifyFlag) {
      customNoModifyFlag = newCustomNoModifyFlag;
   }
   
   /** @pdOid c4e4d9e5-e8d2-4870-8cea-c6a2eebe763c */
   public String getSingleType() {
      return singleType;
   }
   
   /** @param newSingleType
    * @pdOid 2e996b35-b1c0-4975-b9f8-d3ef7a99ea84 */
   public void setSingleType(String newSingleType) {
      singleType = newSingleType;
   }
   
   /** @pdOid bc44eb70-3394-4993-b85a-e25218751ccd */
   public int getPackagesNum() {
      return packagesNum;
   }
   
   /** @param newPackagesNum
    * @pdOid 4692523a-26e1-4021-83f8-398370558400 */
   public void setPackagesNum(int newPackagesNum) {
      packagesNum = newPackagesNum;
   }
   
   /** @pdOid c0c59a97-7881-4f53-8c98-d35cf7fb9a13 */
   public double getActualWeight() {
      return actualWeight;
   }
   
   /** @param newActualWeight
    * @pdOid 68965994-0fa1-43ee-906f-7595a9081db0 */
   public void setActualWeight(double newActualWeight) {
      actualWeight = newActualWeight;
   }
   
   /** @pdOid 92d718ed-2c88-47d7-a10d-54c6e1f6feaa */
   public double getBillingWeight() {
      return billingWeight;
   }
   
   /** @param newBillingWeight
    * @pdOid 0ac30d0e-9883-454d-a290-c4816719f128 */
   public void setBillingWeight(double newBillingWeight) {
      billingWeight = newBillingWeight;
   }
   
   /** @pdOid a9d4555f-cb8a-408a-aabb-bf454000cf32 */
   public double getPackingFee() {
      return packingFee;
   }
   
   /** @param newPackingFee
    * @pdOid eb19eb7a-71b2-484d-a6a9-5348237a8ac3 */
   public void setPackingFee(double newPackingFee) {
      packingFee = newPackingFee;
   }
   
   /** @pdOid 8db3ce63-5fe5-4aae-8ce2-513c49b5048f */
   public long getActualPacking() {
      return actualPacking;
   }
   
   /** @param newActualPacking
    * @pdOid 24b2811e-d61d-494d-b06d-e486a5b90a86 */
   public void setActualPacking(long newActualPacking) {
      actualPacking = newActualPacking;
   }
   
   /** @pdOid d68d3b6d-ce9e-4e0c-aa9b-65164b798663 */
   public String getComment() {
      return comment;
   }
   
   /** @param newComment
    * @pdOid 3a7bcde7-a5f3-4fac-830a-bd34261f817b */
   public void setComment(String newComment) {
      comment = newComment;
   }

}