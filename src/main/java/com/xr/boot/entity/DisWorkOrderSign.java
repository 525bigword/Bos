package com.xr.boot.entity; /***********************************************************************
 * Module:  DisWorkOrderSign.java
 * Author:  Administrator
 * Purpose: Defines the Class DisWorkOrderSign
 ***********************************************************************/

import java.util.*;

/** 工作单签收表
 * 
 * @pdOid 24232718-7e61-49d1-88d8-2321bc0d88e2 */
public class DisWorkOrderSign {
   /** 编号	自增
    * 
    * @pdOid bbd0e8c7-824c-4dcc-a68a-4fabb541f714 */
   private int id;
   /** 工作单ID
    * 
    * @pdOid 89b8ea97-3aef-46f7-8500-de7879f3666c */
   private int workOrderID;
   /** 工作单号   雪花二十九
    * 
    * @pdOid d76f8919-a4d8-46c4-af5c-1a80f401656a */
   private String workSheetNo;
   /** 工作单类型
    * 
    * @pdOid 07f58f4a-f60c-4b9f-9131-d373ec860019 */
   private long workOrderType;
   /** 签收类型	1.正常签收,2.反向签收
    * 
    * @pdOid 455c1595-59ac-4db0-a9ed-ec8ed84cc982 */
   private long signType;
   /** 派送员工号
    * 
    * @pdOid 336e26b8-f0a6-4cf7-b09b-5014cdbd15ec */
   private int courierInt;
   /** 派送员工姓名
    * 
    * @pdOid 41d0bae5-375f-4d3f-913c-11b41ad07019 */
   private String courierName;
   /** 签收人
    * 
    * @pdOid 8bb2acc4-5e64-41d0-aa7e-e2b9874669b2 */
   private String recipient;
   /** 签收单位
    * 
    * @pdOid f7a864c9-4969-4838-8cbd-88e0cffeea0c */
   private int signUnit;
   /** 签收时间
    * 
    * @pdOid 3c4adca7-6be9-4a75-be78-71d2630d9548 */
   private Date signTime;
   /** 作废标记	1=是 2=否
    * 
    * @pdOid 245f5b01-4044-40c2-823f-e5793d32450f */
   private long invalidateMark;
   /** 异常备注
    * 
    * @pdOid 7d15e4c9-7927-4d4a-aec3-4b27e1cfe5da */
   private String abnormalMark;
   /** 录入人编码
    * 
    * @pdOid 5098e042-3436-43ab-8e64-659bc2faeeef */
   private int inputPersonCode;
   /** 录入时间	当前操作时间
    * 
    * @pdOid 61800e35-11fd-4b8e-b6cb-74c118a7739e */
   private Date inputTime;
   
   /** @pdOid 5f68f9c6-8240-4099-9c63-fa7768ec9297 */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 71420d66-5ff8-4ff2-8ecf-d8c98ae4d3ef */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid 760d0318-9008-4cda-b9b3-b8a216c79a03 */
   public int getWorkOrderID() {
      return workOrderID;
   }
   
   /** @param newWorkOrderID
    * @pdOid 72a138a3-8072-45bd-a00b-ae9643d1129d */
   public void setWorkOrderID(int newWorkOrderID) {
      workOrderID = newWorkOrderID;
   }
   
   /** @pdOid f32de03f-0211-4b86-b009-d5c7b7b2b4ce */
   public String getWorkSheetNo() {
      return workSheetNo;
   }
   
   /** @param newWorkSheetNo
    * @pdOid 90ae7ad0-098c-4b9f-b48e-1a19fd683009 */
   public void setWorkSheetNo(String newWorkSheetNo) {
      workSheetNo = newWorkSheetNo;
   }
   
   /** @pdOid fe51e799-96e2-4b09-aef5-9a4ca50513ad */
   public long getWorkOrderType() {
      return workOrderType;
   }
   
   /** @param newWorkOrderType
    * @pdOid bf5e7428-b7d9-46a3-9435-aa1396e29717 */
   public void setWorkOrderType(long newWorkOrderType) {
      workOrderType = newWorkOrderType;
   }
   
   /** @pdOid 7e19f15d-bccd-4725-9d0b-b1fb91b3c70b */
   public long getSignType() {
      return signType;
   }
   
   /** @param newSignType
    * @pdOid 19efa862-81cc-4438-971a-aca51655f61e */
   public void setSignType(long newSignType) {
      signType = newSignType;
   }
   
   /** @pdOid 1064314d-50b6-4b04-b94c-5424111ed923 */
   public int getCourierInt() {
      return courierInt;
   }
   
   /** @param newCourierInt
    * @pdOid 0fe87ec6-c139-4c7e-b0f7-36012ba533f5 */
   public void setCourierInt(int newCourierInt) {
      courierInt = newCourierInt;
   }
   
   /** @pdOid ac53998a-2cef-4857-bcce-0ee4636b04d6 */
   public String getCourierName() {
      return courierName;
   }
   
   /** @param newCourierName
    * @pdOid 81d46b2f-d9fa-4e2a-b3c3-3ade7fe6f09b */
   public void setCourierName(String newCourierName) {
      courierName = newCourierName;
   }
   
   /** @pdOid 40f33668-0165-43e0-bca4-cc184f66c9f2 */
   public String getRecipient() {
      return recipient;
   }
   
   /** @param newRecipient
    * @pdOid c7722479-2ee9-41a4-8a8d-f2735861bcd0 */
   public void setRecipient(String newRecipient) {
      recipient = newRecipient;
   }
   
   /** @pdOid e7c63c82-b421-46b7-9cd9-e7132f85e0f9 */
   public int getSignUnit() {
      return signUnit;
   }
   
   /** @param newSignUnit
    * @pdOid c1eb7c61-ff84-413b-8834-3e9d8866e98d */
   public void setSignUnit(int newSignUnit) {
      signUnit = newSignUnit;
   }
   
   /** @pdOid e27d11d2-4605-4486-b351-19d69f772942 */
   public Date getSignTime() {
      return signTime;
   }
   
   /** @param newSignTime
    * @pdOid 7ec9d84b-8055-4745-bc43-14469ca109f0 */
   public void setSignTime(Date newSignTime) {
      signTime = newSignTime;
   }
   
   /** @pdOid 927a4c88-9ab6-4944-b310-cd9c4fc05e56 */
   public long getInvalidateMark() {
      return invalidateMark;
   }
   
   /** @param newInvalidateMark
    * @pdOid 819773dd-4f4a-4a0a-b776-e95cd5d2f965 */
   public void setInvalidateMark(long newInvalidateMark) {
      invalidateMark = newInvalidateMark;
   }
   
   /** @pdOid 7e3caae2-cc95-49d9-895f-b4812db05379 */
   public String getAbnormalMark() {
      return abnormalMark;
   }
   
   /** @param newAbnormalMark
    * @pdOid 87f9f782-e2df-4784-9024-5dca1bf4d821 */
   public void setAbnormalMark(String newAbnormalMark) {
      abnormalMark = newAbnormalMark;
   }
   
   /** @pdOid 731af755-e01e-4ed7-b9f2-4c1441525844 */
   public int getInputPersonCode() {
      return inputPersonCode;
   }
   
   /** @param newInputPersonCode
    * @pdOid 23673b93-4e14-4892-99ca-370e25dd050b */
   public void setInputPersonCode(int newInputPersonCode) {
      inputPersonCode = newInputPersonCode;
   }
   
   /** @pdOid f6823483-1ee2-43ce-8718-f639562c55e4 */
   public Date getInputTime() {
      return inputTime;
   }
   
   /** @param newInputTime
    * @pdOid 093b8252-17ee-46f5-98f4-1f745f0cf706 */
   public void setInputTime(Date newInputTime) {
      inputTime = newInputTime;
   }

}