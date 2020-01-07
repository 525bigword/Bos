package com.xr.boot.entity; /***********************************************************************
 * Module:  BasBasicArchives.java
 * Author:  Administrator
 * Purpose: Defines the Class BasBasicArchives
 ***********************************************************************/

import java.util.*;

/** 基础档案表（BAS_BasicArchives）
 * 
 * @pdOid 9aa0630c-28a8-4bd2-826a-a6c256c1a71a */
public class BasBasicArchives {
   /** 编号	自增
    * 
    * @pdOid bfac2d38-6536-4d02-9c3f-e54b3b84bd62 */
   private long id;
   /** 基本档案编号	雪花二十三
    * 
    * @pdOid af52a539-02fa-4379-9dc5-4c5b9723579a */
   private String basicFileNumber;
   /** 基本档案名称
    * 
    * @pdOid 3ac7d078-95e3-44a8-b801-942878cf63ef */
   private String name;
   /** 档案是否分级	1：是，0：否
    * 
    * @pdOid e8637092-3e43-4ce5-8ea4-cb7698661933 */
   private long grade;
   /** 备注
    * 
    * @pdOid cfed9ff2-0d19-4fce-a860-bf9d7e2795d3 */
   private String remarks;
   /** 操作时间	当前操作时间
    * 
    * @pdOid f506033f-36fc-4c96-805a-8148cff09a43 */
   private Date operationTime;
   
   /** @pdOid 33bc946f-4188-46ec-ba07-992e2c78b775 */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 2e4ca957-83fa-449f-b981-2d36966123d3 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 16acfc57-3448-4d64-9c4a-fe592d078f20 */
   public String getBasicFileNumber() {
      return basicFileNumber;
   }
   
   /** @param newBasicFileNumber
    * @pdOid 6594f038-6705-478b-a55d-7f9784e27146 */
   public void setBasicFileNumber(String newBasicFileNumber) {
      basicFileNumber = newBasicFileNumber;
   }
   
   /** @pdOid 5aa60d42-1ed4-443b-a008-da355e2b4d0f */
   public String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid fbcfa8c0-7098-4111-9f3c-6e37d069ace7 */
   public void setName(String newName) {
      name = newName;
   }
   
   /** @pdOid 5fc7cd6f-85c2-4cff-af86-21ab5ae5125d */
   public long getGrade() {
      return grade;
   }
   
   /** @param newGrade
    * @pdOid b9dd4610-d0c9-4dec-bced-5d9f54c46dc1 */
   public void setGrade(long newGrade) {
      grade = newGrade;
   }
   
   /** @pdOid 99952441-f203-40e5-ba57-8efb847aa8d6 */
   public String getRemarks() {
      return remarks;
   }
   
   /** @param newRemarks
    * @pdOid 2b600911-2143-4947-a259-b4d5e21328cc */
   public void setRemarks(String newRemarks) {
      remarks = newRemarks;
   }
   
   /** @pdOid c22ec9ad-f081-45ab-972d-c6333d03b9db */
   public Date getOperationTime() {
      return operationTime;
   }
   
   /** @param newOperationTime
    * @pdOid 1fdd337d-5bdc-421b-be89-0d02e14a99b9 */
   public void setOperationTime(Date newOperationTime) {
      operationTime = newOperationTime;
   }

}