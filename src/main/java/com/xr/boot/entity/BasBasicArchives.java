package com.xr.boot.entity; /***********************************************************************
 * Module:  BasBasicArchives.java
 * Author:  Administrator
 * Purpose: Defines the Class BasBasicArchives
 ***********************************************************************/

import java.io.Serializable;

/** 基础档案表（BAS_BasicArchives）
 * 
 * @pdOid 9aa0630c-28a8-4bd2-826a-a6c256c1a71a */
public class BasBasicArchives implements Serializable {
   private static final long serialVersionUID =-6210759141288004477L;
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
   private SyEmp syEmp;
   private SyUnits syUnits;
   /** 备注
    * 
    * @pdOid cfed9ff2-0d19-4fce-a860-bf9d7e2795d3 */
   private String remarks;
   /** 操作时间	当前操作时间
    * 
    * @pdOid f506033f-36fc-4c96-805a-8148cff09a43 */
   private String operationTime;
   
   public BasBasicArchives(){}
   public long getempId(){
      return syEmp.getId();
   }
   public  long getunitId(){
      return syUnits.getId();
   }
   public BasBasicArchives(long id, String basicFileNumber, String name, long grade, SyEmp syEmp, SyUnits syUnits, String remarks, String operationTime) {
      this.id = id;
      this.basicFileNumber = basicFileNumber;
      this.name = name;
      this.grade = grade;
      this.syEmp = syEmp;
      this.syUnits = syUnits;
      this.remarks = remarks;
      this.operationTime = operationTime;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getBasicFileNumber() {
      return basicFileNumber;
   }

   public void setBasicFileNumber(String basicFileNumber) {
      this.basicFileNumber = basicFileNumber;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public long getGrade() {
      return grade;
   }

   public void setGrade(long grade) {
      this.grade = grade;
   }

   public SyEmp getSyEmp() {
      return syEmp;
   }

   public void setSyEmp(SyEmp syEmp) {
      this.syEmp = syEmp;
   }

   public SyUnits getSyUnits() {
      return syUnits;
   }

   public void setSyUnits(SyUnits syUnits) {
      this.syUnits = syUnits;
   }

   public String getRemarks() {
      return remarks;
   }

   public void setRemarks(String remarks) {
      this.remarks = remarks;
   }

   public String getOperationTime() {
      return operationTime;
   }

   public void setOperationTime(String operationTime) {
      this.operationTime = operationTime;
   }
}