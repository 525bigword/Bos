package com.xr.boot.entity; /***********************************************************************
 * Module:  AccWorkOrder.java
 * Author:  Administrator
 * Purpose: Defines the Class AccWorkOrder
 ***********************************************************************/

import java.util.*;

/** 工单表
 * 
 * @pdOid 950ae4f8-998f-4db7-927c-6146ab27464c */
public class AccWorkOrder {
   /** 编号	自增
    * 
    * @pdOid 8f5c9ca3-87b2-4396-af96-a085284b2fdc */
   private int id;
   /** 工单号
    * 
    * @pdOid dee7f8e8-2fb1-4dd5-ac2f-1f0b0e4248d6 */
   private String jobNo;
   /** 工单类型	1:新,2:追,3:销
    * 
    * @pdOid a02349ad-3c58-4aa9-bc7c-af8d71d1b7ab */
   private long jobType;
   /** 取件状态	1:新单,2:已通知,3:已确认
    * 4:已取件,5:已取消
    * 
    * @pdOid 2ecc46e0-b144-475e-b70a-7f987f20389d */
   private long pickupStatus;
   /** 短信序号
    * 
    * @pdOid 6227d698-6e56-4664-97cc-cb4d07bf78e1 */
   private int shortMessageInt;
   /** 工单生成时间
    * 
    * @pdOid 71240359-669f-4898-83a0-3c6322e53121 */
   private Date workGenerationTime;
   /** 追单次数	新单默认为0
    * 
    * @pdOid f6111de5-f633-4611-9339-7de7eaf4ce88 */
   private int afterSingleNum;
   /** 小件员编号
    * 
    * @pdOid 39ed78d5-4226-4a16-8ca5-6aa8112b477e */
   private int smallMemberNum;
   /** 取件时间
    * 
    * @pdOid 07376c3a-83f8-4df4-8fa9-1e6b39dda36d */
   private Date pickupTime;
   /** 分拣编码
    * 
    * @pdOid 07125430-983b-4eba-a9fb-e02ae922dfff */
   private String sortingCode;
   
   /** @pdOid ddd77537-0c27-46b0-9657-a8a8100f2acb */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 06bbb60f-e5f0-4ca6-98a0-6d2d62d9d6cc */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid 6c70bdcb-e7f0-459c-9c22-a5da80272b61 */
   public String getJobNo() {
      return jobNo;
   }
   
   /** @param newJobNo
    * @pdOid beba97ff-b894-414e-ac8a-65b966f30e93 */
   public void setJobNo(String newJobNo) {
      jobNo = newJobNo;
   }
   
   /** @pdOid f2dca0e0-479b-4d25-9d93-c44520076c9b */
   public long getJobType() {
      return jobType;
   }
   
   /** @param newJobType
    * @pdOid fefe82e4-be7b-4f21-ac0e-778b4c669c0c */
   public void setJobType(long newJobType) {
      jobType = newJobType;
   }
   
   /** @pdOid 806a7a4e-e401-4961-a0bb-a90534077f1d */
   public long getPickupStatus() {
      return pickupStatus;
   }
   
   /** @param newPickupStatus
    * @pdOid ad833a20-6c1e-41c7-8abf-1972e8e0c0fe */
   public void setPickupStatus(long newPickupStatus) {
      pickupStatus = newPickupStatus;
   }
   
   /** @pdOid 580c205b-9834-4d65-b7e7-428fba02e5aa */
   public int getShortMessageInt() {
      return shortMessageInt;
   }
   
   /** @param newShortMessageInt
    * @pdOid 020b7a8d-b661-41d7-96eb-8a9b9b55a420 */
   public void setShortMessageInt(int newShortMessageInt) {
      shortMessageInt = newShortMessageInt;
   }
   
   /** @pdOid e74b0dd4-642d-4934-91bd-047db739aedb */
   public Date getWorkGenerationTime() {
      return workGenerationTime;
   }
   
   /** @param newWorkGenerationTime
    * @pdOid 4bd5ab8e-8012-4796-bb89-5ab6bed6734a */
   public void setWorkGenerationTime(Date newWorkGenerationTime) {
      workGenerationTime = newWorkGenerationTime;
   }
   
   /** @pdOid ae71e634-fd04-4fcc-9b65-1b3d5155b1e7 */
   public int getAfterSingleNum() {
      return afterSingleNum;
   }
   
   /** @param newAfterSingleNum
    * @pdOid 44506db9-95ff-464b-b8f3-30f48ec93d2d */
   public void setAfterSingleNum(int newAfterSingleNum) {
      afterSingleNum = newAfterSingleNum;
   }
   
   /** @pdOid 8ffbfe07-a114-4beb-aad1-921bd03e9ac9 */
   public int getSmallMemberNum() {
      return smallMemberNum;
   }
   
   /** @param newSmallMemberNum
    * @pdOid 75e9212f-2337-4762-aa04-e9b3b3b70f1b */
   public void setSmallMemberNum(int newSmallMemberNum) {
      smallMemberNum = newSmallMemberNum;
   }
   
   /** @pdOid 6f7bb474-4c09-45bc-898c-92c939bfb078 */
   public Date getPickupTime() {
      return pickupTime;
   }
   
   /** @param newPickupTime
    * @pdOid 97ece88d-bee6-4259-832e-025687d300da */
   public void setPickupTime(Date newPickupTime) {
      pickupTime = newPickupTime;
   }
   
   /** @pdOid 29ba4751-4fbf-4e11-859f-847d5debb318 */
   public String getSortingCode() {
      return sortingCode;
   }
   
   /** @param newSortingCode
    * @pdOid 79da45e3-803a-4bba-b47d-de12bcd47650 */
   public void setSortingCode(String newSortingCode) {
      sortingCode = newSortingCode;
   }

}