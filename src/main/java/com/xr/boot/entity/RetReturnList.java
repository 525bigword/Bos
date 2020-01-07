package com.xr.boot.entity; /***********************************************************************
 * Module:  RetReturnList.java
 * Author:  Administrator
 * Purpose: Defines the Class RetReturnList
 ***********************************************************************/

import java.util.*;

/** 返货单表
 * 
 * @pdOid 7ca15a77-c4aa-4bfd-bfa5-72b8efc9e7e5 */
public class RetReturnList {
   /** 申请单号	唯一   雪花三十
    * 
    * @pdOid 93782e7c-c0d6-4329-a9f9-7ab0ea385a4f */
   private String applicationNo;
   /** 工作单号	唯一   雪花三十一
    * 
    * @pdOid a47ed41b-963b-434a-a88f-f91a7fa89199 */
   private String workSheetNo;
   /** 返货类型	1、选择项为“基础设置中对应的返货原因” 2、只能选择未封存的
    * 
    * @pdOid 2a4d6a95-61ce-40d5-9534-0a58be3fcce6 */
   private long returnType;
   /** 申请备注
    * 
    * @pdOid 55ad2c93-ab06-4a5f-8a44-fea39d19adbb */
   private String apRemark;
   /** 破损丢失件数	默认为“0”
    * 
    * @pdOid 470d018c-314f-4b25-9d11-bcd4ffe279d6 */
   private int apLoss;
   /** 进港时间	默认为本单位的最早入库时间
    * 
    * @pdOid 593c10cc-b747-40a4-938f-14a8b9d9fe5f */
   private Date entryTime;
   /** 接收单位	默认为取件单位
    * 
    * @pdOid 1123b0b0-31e7-4ce7-aebe-f7f6ec9f6173 */
   private int receivegUnit;
   /** 作废标志	新增单据为“否”不可修改
    * 作废操作时状态为“是”
    * 
    * @pdOid 685cad53-4375-43dd-bbc8-b652ddcc73b7 */
   private long invalidateSign;
   /** 返货单位	默认为录入单位，可修改
    * 
    * @pdOid c00b18af-faf0-45ec-b78d-e7b945b94975 */
   private int returnUnit;
   /** 录入时间	默认为系统录入时间
    * 
    * @pdOid a067115a-61df-4603-bd7e-42777af6062a */
   private Date recordingTime;
   /** 录入单位	默认为录入人所在单位
    * 
    * @pdOid 8e8f022c-f0e1-49a9-986c-e1de7774be08 */
   private int entryUnit;
   /** 录入人	默认为登录人
    * 
    * @pdOid 17f6359d-a89f-4cae-8585-dc161d7fdf87 */
   private String personName;
   /** 确认时间	默认为申请处理时间
    * 
    * @pdOid 95bfab86-c60e-4c99-a457-f74a17f387a8 */
   private Date confirmationTime;
   /** 确认单位	默认为申请处理登录人所在单位
    * 
    * @pdOid 08aecb33-85f7-4e83-915b-2faafc44d9e8 */
   private int confirmationUnit;
   /** 确认人	默认为申请处理操作人
    * 
    * @pdOid acdb28c4-c16f-497a-a7ea-85c64d221869 */
   private String confirmationPersonName;
   /** 返货处理状态	1=未确认，2=同意返货
    * 3=拒绝，4=同意转发
    * 
    * @pdOid b819ca7c-0f73-4bd6-b6e6-ea993c76bb6c */
   private long treatmentState;
   /** 返货执行状态	1=无，2=已转发，3=已返货
    * 
    * @pdOid b90bb9f7-effe-4441-a74f-888ae24f764b */
   private long apReturnStatus;
   /** 系统自动确认标志	默认为否，七天自动确认默认为“是”
    * 
    * @pdOid caa52949-bbd3-40af-b7df-87808ea736b3 */
   private long identificationSign;
   /** 处理意见	返货申请处理需要填写
    * 拒绝时必须要填写
    * 
    * @pdOid 26354976-b62f-41e2-9c58-d6f7676418f1 */
   private String handlingOpinions;
   /** 拒绝类型
    * 
    * @pdOid ccfd5f60-e595-418e-90c0-a49ce5a6bd26 */
   private String denialType;
   
   /** 编号	自增
    * 
    * @pdOid 6834aca0-8d7f-4e87-bc9d-20f21e179351 */
   public long id;
   
   /** @pdOid 3e2ed49f-796d-46b0-92b8-5c0a89373c9a */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 50d79922-d617-4c9f-883f-69a76719b6f9 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 5b263d06-201b-4f95-ac05-1475d3ae32f3 */
   public String getApplicationNo() {
      return applicationNo;
   }
   
   /** @param newApplicationNo
    * @pdOid abbf645c-3ce0-49d6-be22-5e0939fcf0ac */
   public void setApplicationNo(String newApplicationNo) {
      applicationNo = newApplicationNo;
   }
   
   /** @pdOid 608d3203-033e-492f-b11d-3ec24e026f5c */
   public String getWorkSheetNo() {
      return workSheetNo;
   }
   
   /** @param newWorkSheetNo
    * @pdOid 165f5aad-78e1-468d-b0a9-c90beccc875d */
   public void setWorkSheetNo(String newWorkSheetNo) {
      workSheetNo = newWorkSheetNo;
   }
   
   /** @pdOid 6356021c-7967-4703-8f7e-bf73c9b67c80 */
   public long getReturnType() {
      return returnType;
   }
   
   /** @param newReturnType
    * @pdOid 3898b351-c690-4e40-82af-6c93c8d88486 */
   public void setReturnType(long newReturnType) {
      returnType = newReturnType;
   }
   
   /** @pdOid 12063d76-a455-44c6-9615-28c5597ed23a */
   public String getApRemark() {
      return apRemark;
   }
   
   /** @param newApRemark
    * @pdOid b45801ac-90c3-46f3-a3ef-ff5403ad06ca */
   public void setApRemark(String newApRemark) {
      apRemark = newApRemark;
   }
   
   /** @pdOid c0bfee17-0c4b-4f37-86fe-44c5653cd2de */
   public int getApLoss() {
      return apLoss;
   }
   
   /** @param newApLoss
    * @pdOid 40ed5af2-db6d-486e-87d3-ae8fcdcf4e00 */
   public void setApLoss(int newApLoss) {
      apLoss = newApLoss;
   }
   
   /** @pdOid c3da424d-4576-4788-b1e2-8151427af426 */
   public Date getEntryTime() {
      return entryTime;
   }
   
   /** @param newEntryTime
    * @pdOid ed624178-9626-4d1d-a0d6-6329645e3b01 */
   public void setEntryTime(Date newEntryTime) {
      entryTime = newEntryTime;
   }
   
   /** @pdOid 15f5d285-a773-407d-9f64-a0cb4937a99b */
   public int getReceivegUnit() {
      return receivegUnit;
   }
   
   /** @param newReceivegUnit
    * @pdOid b8bf6d32-550e-4d5d-9c07-b198d9e4fbe8 */
   public void setReceivegUnit(int newReceivegUnit) {
      receivegUnit = newReceivegUnit;
   }
   
   /** @pdOid d7153d5a-4485-4362-a983-b422fe088405 */
   public long getInvalidateSign() {
      return invalidateSign;
   }
   
   /** @param newInvalidateSign
    * @pdOid 07d145c1-cb02-4a4f-84d4-89086af4e382 */
   public void setInvalidateSign(long newInvalidateSign) {
      invalidateSign = newInvalidateSign;
   }
   
   /** @pdOid 6a7ce992-a644-4034-a4f5-816a3d1c3948 */
   public int getReturnUnit() {
      return returnUnit;
   }
   
   /** @param newReturnUnit
    * @pdOid a8046c47-91d5-462d-9676-4f9598761986 */
   public void setReturnUnit(int newReturnUnit) {
      returnUnit = newReturnUnit;
   }
   
   /** @pdOid 0c55eb14-8f10-4f91-b0a2-d8d1c0fc41ea */
   public Date getRecordingTime() {
      return recordingTime;
   }
   
   /** @param newRecordingTime
    * @pdOid b851fec8-f44f-4b0a-afc9-2ae27b6d3618 */
   public void setRecordingTime(Date newRecordingTime) {
      recordingTime = newRecordingTime;
   }
   
   /** @pdOid ab7bd5a3-2f60-462b-9123-8c1f1322bedd */
   public int getEntryUnit() {
      return entryUnit;
   }
   
   /** @param newEntryUnit
    * @pdOid 02fe80f1-1e64-4a4e-a9f0-cf22df761eca */
   public void setEntryUnit(int newEntryUnit) {
      entryUnit = newEntryUnit;
   }
   
   /** @pdOid 80bdf6e0-9304-4131-84c0-bba3294a437c */
   public String getPersonName() {
      return personName;
   }
   
   /** @param newPersonName
    * @pdOid c0d4fb33-8210-442b-9a1d-d37e5707462a */
   public void setPersonName(String newPersonName) {
      personName = newPersonName;
   }
   
   /** @pdOid 17a8db2b-8080-4676-8ca1-f5ce42eee9b9 */
   public Date getConfirmationTime() {
      return confirmationTime;
   }
   
   /** @param newConfirmationTime
    * @pdOid 4573e245-c347-4efc-9dce-fa2d413e9109 */
   public void setConfirmationTime(Date newConfirmationTime) {
      confirmationTime = newConfirmationTime;
   }
   
   /** @pdOid d370b49a-e124-4910-8664-de6dfbc2eb91 */
   public int getConfirmationUnit() {
      return confirmationUnit;
   }
   
   /** @param newConfirmationUnit
    * @pdOid b98b108f-f2d6-4ade-867d-2948f5689865 */
   public void setConfirmationUnit(int newConfirmationUnit) {
      confirmationUnit = newConfirmationUnit;
   }
   
   /** @pdOid 3613e9cf-47c4-438d-ad00-094ff7603234 */
   public String getConfirmationPersonName() {
      return confirmationPersonName;
   }
   
   /** @param newConfirmationPersonName
    * @pdOid 895463e0-5ad3-4fb7-953a-098661f66348 */
   public void setConfirmationPersonName(String newConfirmationPersonName) {
      confirmationPersonName = newConfirmationPersonName;
   }
   
   /** @pdOid 5a1ddb66-7c11-4686-b735-8bfc796850ac */
   public long getTreatmentState() {
      return treatmentState;
   }
   
   /** @param newTreatmentState
    * @pdOid 329852bc-6a54-4272-9bcd-b78b5455f209 */
   public void setTreatmentState(long newTreatmentState) {
      treatmentState = newTreatmentState;
   }
   
   /** @pdOid af34ec85-5ab5-475b-a9a8-8a9be847134a */
   public long getApReturnStatus() {
      return apReturnStatus;
   }
   
   /** @param newApReturnStatus
    * @pdOid 621d4f33-ba81-4f76-a30c-4009f8f17a90 */
   public void setApReturnStatus(long newApReturnStatus) {
      apReturnStatus = newApReturnStatus;
   }
   
   /** @pdOid 7125f2bc-14c9-4836-b82e-1a1729c61e28 */
   public long getIdentificationSign() {
      return identificationSign;
   }
   
   /** @param newIdentificationSign
    * @pdOid 01195379-f9a4-4f13-9bc5-7a399cc79ea8 */
   public void setIdentificationSign(long newIdentificationSign) {
      identificationSign = newIdentificationSign;
   }
   
   /** @pdOid 469fbcff-bfe2-4787-8db5-e46c0450846f */
   public String getHandlingOpinions() {
      return handlingOpinions;
   }
   
   /** @param newHandlingOpinions
    * @pdOid 9319e2f9-05f1-4c68-9149-7d68b8e9e82d */
   public void setHandlingOpinions(String newHandlingOpinions) {
      handlingOpinions = newHandlingOpinions;
   }
   
   /** @pdOid 604d335e-e052-4f82-9c7f-e212044867dc */
   public String getDenialType() {
      return denialType;
   }
   
   /** @param newDenialType
    * @pdOid 89af41ff-a1d4-44d2-bd14-9fd41ac3e1c7 */
   public void setDenialType(String newDenialType) {
      denialType = newDenialType;
   }

}