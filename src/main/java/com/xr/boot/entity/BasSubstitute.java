package com.xr.boot.entity; /***********************************************************************
 * Module:  BasSubstitute.java
 * Author:  Administrator
 * Purpose: Defines the Class BasSubstitute
 ***********************************************************************/

import java.io.Serializable;

/** 取派设置表
 * 
 * @pdOid bd214333-6a3d-4d3b-956d-b621cfd13591 */
public class BasSubstitute implements Serializable {
   /** 编号
    * 
    * @pdOid 208c9731-7305-42c2-b89f-f3e4c3210d35 */
   private int id;
   /** 员工工号对应员工表员工工号
    * 
    * @pdOid bfb62d84-7e94-4f36-955d-54672b4534bd */
   private String empNo;
   /** 员工名称对应员工表员姓名
    * 
    * @pdOid d0233040-22ff-48bc-9101-38c44d507e7c */
   private String empName;
   /** 手机号码
    * 
    * @pdOid 3d138a6b-2d54-429d-ae03-565cc734349c */
   private String mobileNo;
   /** 取派员类型	对应“基础档案表”表ID
    * 
    * @pdOid d3cc54e0-9e75-4ad2-963d-0cc756341515 */
   private BasBasicArchivesEntry basBasicArchivesEntry;
   /** 是否使用PDA	1：使用，0：不使用
    * 
    * @pdOid 41580f8a-dca6-406a-9e7c-88702f5dba52 */
   private Long pda;
   /** 收派标准（公斤）	保留二位小数使用，0：不使用
    * 
    * @pdOid 61805cd5-8770-41f4-b67e-ddaba05c7385 */
   private String standardKg;

   private double standardLength;
   /** 收派标准（长度）	保留二位小数
    * 
    * @pdOid 809c7741-bc22-49f4-ae1e-6f6e5cd8bb79 */
   private String models;
   /** 车型
    * 
    * @pdOid 51ad5537-1e0f-4082-aade-9154edf72af1 */
   private String plateInt;
   /** 车牌号
    * 
    * @pdOid e556f5e1-d8bf-4228-b66d-0dd4fc13cc95 */
   private int invalidateMark;

   public SyEmp getSyEmp() {
      return syEmp;
   }

   public void setSyEmp(SyEmp syEmp) {
      this.syEmp = syEmp;
   }

   /** 状态，0：正常，1：停用
    * 
    * @pdOid f2ee9f93-51a2-4afe-9688-17b82b7764f2 */
   private SyEmp syEmp;
   private SyUnits syUnits;
   private String operationTime;
   
   public BasSubstitute(){}
   public  long gettype(){return basBasicArchivesEntry.getId();}
   public long getempId(){
      return syEmp.getId();
   }
   public  long getunitId(){
      return syUnits.getId();
   }

   public int getId() {
      return id;
   }

   public String getOperationTime() {
      return operationTime;
   }

   public void setOperationTime(String operationTime) {
      this.operationTime = operationTime;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getEmpNo() {
      return empNo;
   }

   public void setEmpNo(String empNo) {
      this.empNo = empNo;
   }

   public String getEmpName() {
      return empName;
   }

   public void setEmpName(String empName) {
      this.empName = empName;
   }

   public String getMobileNo() {
      return mobileNo;
   }

   public void setMobileNo(String mobileNo) {
      this.mobileNo = mobileNo;
   }

   public BasBasicArchivesEntry getBasBasicArchivesEntry() {
      return basBasicArchivesEntry;
   }

   public void setBasBasicArchivesEntry(BasBasicArchivesEntry basBasicArchivesEntry) {
      this.basBasicArchivesEntry = basBasicArchivesEntry;
   }

   public Long getPda() {
      return pda;
   }

   public void setPda(Long pda) {
      this.pda = pda;
   }

   public String getStandardKg() {
      return standardKg;
   }

   public void setStandardKg(String standardKg) {
      this.standardKg = standardKg;
   }

   public double getStandardLength() {
      return standardLength;
   }

   public void setStandardLength(double standardLength) {
      this.standardLength = standardLength;
   }

   public String getModels() {
      return models;
   }

   public void setModels(String models) {
      this.models = models;
   }

   public String getPlateInt() {
      return plateInt;
   }

   public void setPlateInt(String plateInt) {
      this.plateInt = plateInt;
   }

   public int getInvalidateMark() {
      return invalidateMark;
   }

   public void setInvalidateMark(int invalidateMark) {
      this.invalidateMark = invalidateMark;
   }

   public SyUnits getSyUnits() {
      return syUnits;
   }

   public void setSyUnits(SyUnits syUnits) {
      this.syUnits = syUnits;
   }
}