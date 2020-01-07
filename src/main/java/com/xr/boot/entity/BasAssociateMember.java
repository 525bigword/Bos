package com.xr.boot.entity; /***********************************************************************
 * Module:  BasAssociateMember.java
 * Author:  Administrator
 * Purpose: Defines the Class BasAssociateMember
 ***********************************************************************/

import java.util.*;

/** 关联小件员表
 * 
 * @pdOid 4883f6b8-3431-4cb9-84d6-7b2e601c6c3a */
public class BasAssociateMember {
   /** @pdOid 3f133139-df02-43e1-a233-60732eded09d */
   private int id;
   /** 取派人工号	对应员工表员工工号
    * 
    * @pdOid 20d8ac07-e74a-4136-953c-676373f1ffef */
   private String empNo;
   /** 取派人名称	对应员工表员姓名
    * 
    * @pdOid 902cac5f-7f76-4e0c-9c5e-1d9deada2ffe */
   private String empName;
   /** 收派标准（公斤）	保留二位小数
    * 
    * @pdOid 0b334660-9678-4c51-a7ae-01d84da158cf */
   private double standardKg;
   /** 收派标准（长度）	保留二位小数
    * 
    * @pdOid 2154f546-a0dd-4040-9b55-a57bf2ce071d */
   private double standardLength;
   /** 收派时间
    * 
    * @pdOid a4212a8e-09bd-4226-a8a7-223b67d9cea6 */
   private Date standardTime;
   /** 类型
    * 
    * @pdOid e6dc87ca-354f-41d4-a075-8889b2dc8878 */
   private String type;
   
   /** @pdOid 89b32888-8e48-4c40-a6e9-a2f4b8dc08d8 */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid b5419fea-c340-4cf9-b0c3-c26e9d1b1519 */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid c355fd63-838a-4ed7-a4fe-f66fe0719875 */
   public String getEmpNo() {
      return empNo;
   }
   
   /** @param newEmpNo
    * @pdOid 5df417db-4f37-4f5e-8711-a3b4f3583c78 */
   public void setEmpNo(String newEmpNo) {
      empNo = newEmpNo;
   }
   
   /** @pdOid ced6eecd-203a-4c5f-ba79-d428c051de24 */
   public String getEmpName() {
      return empName;
   }
   
   /** @param newEmpName
    * @pdOid bd4fcd6d-04e7-4b10-ac2e-7c00165b9003 */
   public void setEmpName(String newEmpName) {
      empName = newEmpName;
   }
   
   /** @pdOid 00596c7e-3287-450f-88ba-e38a688562a3 */
   public double getStandardKg() {
      return standardKg;
   }
   
   /** @param newStandardKg
    * @pdOid e33d4749-17f9-46f2-9d08-3091de6d616f */
   public void setStandardKg(double newStandardKg) {
      standardKg = newStandardKg;
   }
   
   /** @pdOid 3ea788e3-c6c4-4fc7-984c-c5707db82a4f */
   public double getStandardLength() {
      return standardLength;
   }
   
   /** @param newStandardLength
    * @pdOid 0f481661-d068-4814-9b14-7dccb6ec25fb */
   public void setStandardLength(double newStandardLength) {
      standardLength = newStandardLength;
   }
   
   /** @pdOid 62720cd8-e42a-4413-97c3-810311f08a1e */
   public Date getStandardTime() {
      return standardTime;
   }
   
   /** @param newStandardTime
    * @pdOid 9bdeb1c6-2731-4586-89f0-0f33ae07ea99 */
   public void setStandardTime(Date newStandardTime) {
      standardTime = newStandardTime;
   }
   
   /** @pdOid 8066bfd6-1819-4159-adec-26b119f89bfb */
   public String getType() {
      return type;
   }
   
   /** @param newType
    * @pdOid cfe2d736-d906-479e-ba2e-7dc620eac0fe */
   public void setType(String newType) {
      type = newType;
   }

}