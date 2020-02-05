package com.xr.boot.entity; /***********************************************************************
 * Module:  AccWorkSheet.java
 * Author:  Administrator
 * Purpose: Defines the Class AccWorkSheet
 ***********************************************************************/

import org.springframework.stereotype.Component;

import java.util.*;

/** 工作单表
 * 
 * @pdOid 32423179-6120-4a44-9818-6bd5dc6b4acf */
@Component
public class AccWorkSheet {
   /** 编号
    * 
    * @pdOid c5a8918e-ac41-43be-a275-29066256d264 */
   private int id;
   /** 工作单号    雪花二十八
    * 
    * @pdOid 573dac98-aaec-4c0f-a557-cc05e05e627c */
   private String workSheetNo;
   /** 到达地
    * 
    * @pdOid 279c4f7d-ae38-4aab-8e07-381f093a2f46 */
   private String destination;
   /** 产品时限
    * 
    * @pdOid a3479df6-045d-4b9b-88c1-e64edd8ccc94 */
   private String productTime;
   private AccProductList chanpings;

   public AccProductList getChanpings() {
      return chanpings;
   }

   public void setChanpings(AccProductList chanpings) {
      this.chanpings = chanpings;
   }

   public Long getProduct() {
      return chanpings.getId();
   }

   /** 总件数
    * 
    * @pdOid 354522cb-aa9e-4419-a327-746278b29d9f */
   private int total;
   /** 重量
    * 
    * @pdOid 9ffc3d33-29d0-4191-a985-fae42945bb34 */
   private double weight;
   /** 配载要求
    * 
    * @pdOid 5505e1ed-991c-4d25-8b1f-5735f637791f */
   private String stowageRequirements;
   /** 受理时间
    * 
    * @pdOid 14cce49a-8e48-4263-8521-9fe9ec4c25c4 */
   private Date subordinateDate;

   private int documentsStateId;

   public int getDocumentsStateId() {
      return documentsStateId;
   }

   public void setDocumentsStateId(int documentsStateId) {
      this.documentsStateId = documentsStateId;
   }
   private int dataStateId;

   public int getDataStateId() {
      return dataStateId;
   }

   public void setDataStateId(int dataStateId) {
      this.dataStateId = dataStateId;
   }

   /** @pdOid cc8fb8ba-aa92-4d90-aa32-73c7b3c1f666 */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 675d7ab8-c6d3-4cc8-b169-d4115f8696e2 */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid 79d016d8-a081-4a62-865b-590afda10ce7 */
   public String getWorkSheetNo() {
      return workSheetNo;
   }
   
   /** @param newWorkSheetNo
    * @pdOid 7c260a35-ab0a-40c8-932f-9b4dab9c0461 */
   public void setWorkSheetNo(String newWorkSheetNo) {
      workSheetNo = newWorkSheetNo;
   }
   
   /** @pdOid 28556016-9bf8-4ad8-a118-f34b8327e70c */
   public String getDestination() {
      return destination;
   }
   
   /** @param newDestination
    * @pdOid 617e8531-300f-4fa4-a3ac-d2db6ea91520 */
   public void setDestination(String newDestination) {
      destination = newDestination;
   }
   
   /** @pdOid 0322c86b-5310-4617-9bb8-bed8ae7ffc30 */
   public String getProductTime() {
      return productTime;
   }
   
   /** @param newProductTime
    * @pdOid 22a1abbb-1fb1-4249-969f-94c0b7cd9b94 */
   public void setProductTime(String newProductTime) {
      productTime = newProductTime;
   }
   
   /** @pdOid 736ee852-01a4-4533-b1a4-a810c5faea36 */
   public int getTotal() {
      return total;
   }
   
   /** @param newTotal
    * @pdOid 6f5cc3dc-b022-4311-a482-e40d8843247c */
   public void setTotal(int newTotal) {
      total = newTotal;
   }
   
   /** @pdOid 35436289-34ed-4cc2-b526-548358050131 */
   public double getWeight() {
      return weight;
   }
   
   /** @param newWeight
    * @pdOid ca6477bd-127e-4ec3-8457-8c496404b87d */
   public void setWeight(double newWeight) {
      weight = newWeight;
   }
   
   /** @pdOid cef0067d-7489-4e0c-bfba-01115fd23063 */
   public String getStowageRequirements() {
      return stowageRequirements;
   }
   
   /** @param newStowageRequirements
    * @pdOid 282de1a4-a76b-4f48-842b-f71f0fa7d7bd */
   public void setStowageRequirements(String newStowageRequirements) {
      stowageRequirements = newStowageRequirements;
   }
   
   /** @pdOid d9a1af54-ef4b-4b3c-a212-a3e0a051d9df */
   public Date getSubordinateDate() {
      return subordinateDate;
   }
   
   /** @param newSubordinateDate
    * @pdOid 122f506a-59b8-4e4e-b4f4-9c09d24c8299 */
   public void setSubordinateDate(Date newSubordinateDate) {
      subordinateDate = newSubordinateDate;
   }

}