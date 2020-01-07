package com.xr.boot.entity; /***********************************************************************
 * Module:  DisDispatchHistory.java
 * Author:  Administrator
 * Purpose: Defines the Class DisDispatchHistory
 ***********************************************************************/

import java.util.*;

/** 调度表
 * 
 * @pdOid cbc25046-41eb-4803-a8f3-da57a0ecaa34 */
public class DisDispatchHistory {
   /** 编号	自增
    * 
    * @pdOid 9c416f06-2aba-4b78-8453-4b994a6ca6a3 */
   private int id;
   /** 调度序号
    * 
    * @pdOid 658cbae3-0d80-44dc-a2bb-2e0db38163ec */
   private int dispatchSequence;
   /** 调入单位
    * 
    * @pdOid 3f76db07-b7e9-4733-9c96-dd11092ac59f */
   private int transferredUnit;
   /** 操作时间
    * 
    * @pdOid c56ea767-db31-4e60-a05e-20437beb289b */
   private Date operationTime;
   /** 备注
    * 
    * @pdOid 066606a7-adff-4363-9328-f81af854e383 */
   private String remark;
   /** 状态
    * 
    * @pdOid ecae81e5-c8ac-4dae-9a22-a1f742378f79 */
   private long status;
   /** 退回原因
    * 
    * @pdOid 2b52acd6-694e-4ce8-a2f1-0e04bc7c5594 */
   private String reason;
   
   /** @pdOid ca4e3fe3-7dbb-4afa-a8a8-d8ec70a56cf1 */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid a030bd64-d43b-42c3-ae55-4af26553cada */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid 36b960e4-8335-40fe-b6ab-8bf14eed3d7f */
   public int getDispatchSequence() {
      return dispatchSequence;
   }
   
   /** @param newDispatchSequence
    * @pdOid 0dc931ed-c3d8-455d-9f15-270bb27dfe8c */
   public void setDispatchSequence(int newDispatchSequence) {
      dispatchSequence = newDispatchSequence;
   }
   
   /** @pdOid c87cee6e-67f9-483a-8413-43feb2242a8d */
   public int getTransferredUnit() {
      return transferredUnit;
   }
   
   /** @param newTransferredUnit
    * @pdOid d7d246bc-82f2-4ce6-8bfc-9b6b865cc622 */
   public void setTransferredUnit(int newTransferredUnit) {
      transferredUnit = newTransferredUnit;
   }
   
   /** @pdOid 0123067d-3e89-4428-bd9e-f9464dd7a824 */
   public Date getOperationTime() {
      return operationTime;
   }
   
   /** @param newOperationTime
    * @pdOid 66694754-2bb7-4c1e-90e1-513432a53ce4 */
   public void setOperationTime(Date newOperationTime) {
      operationTime = newOperationTime;
   }
   
   /** @pdOid 3b0e6c73-250a-4bb0-9578-1ad14cfd3e1e */
   public String getRemark() {
      return remark;
   }
   
   /** @param newRemark
    * @pdOid 8a44bf9c-34da-40ce-81ef-97ea9480d234 */
   public void setRemark(String newRemark) {
      remark = newRemark;
   }
   
   /** @pdOid 032471ba-762a-4a7a-a483-a1085ba7d0e9 */
   public long getStatus() {
      return status;
   }
   
   /** @param newStatus
    * @pdOid b14b48a6-5099-4672-99c4-e248ed82ed10 */
   public void setStatus(long newStatus) {
      status = newStatus;
   }
   
   /** @pdOid 648e9c92-2ad0-41df-a3ab-e5afd8e7de9d */
   public String getReason() {
      return reason;
   }
   
   /** @param newReason
    * @pdOid d051e536-51fe-4aa5-891b-0ce7e2ccb537 */
   public void setReason(String newReason) {
      reason = newReason;
   }

}