package com.xr.boot.entity; /***********************************************************************
 * Module:  BasBasicArchivesEntry.java
 * Author:  Administrator
 * Purpose: Defines the Class BasBasicArchivesEntry
 ***********************************************************************/

import java.io.Serializable;

/** 基础档案条目表
 * 
 * @pdOid 43656fea-77d7-442f-b0ba-3a64624ccf29 */
public class BasBasicArchivesEntry implements Serializable {
   private static final long serialVersionUID = -1423332239945331920L;
   /** OperationTime
    * 
    * @pdOid 1014c20d-6cf9-4bc6-adf3-ea96a043da26 */
   private long id;
   /** 档案名称	唯一
    * 
    * @pdOid 2720f30e-c112-49db-b7e2-93a7187c8781 */
   private String name;
   /** 上级编码	本表ID
    * 
    * @pdOid c024036e-bbcb-4324-a751-108dc89c7c55 */
   private int parentID;
   /** 助记码	唯一且只可为英文,雪花算法二十四
    * 
    * @pdOid 09baa7d9-21ec-430a-864e-0586b4d54009 */
   private String mnemonicCode;
   /** 是否封存	1：是，0：否
    * 
    * @pdOid ac4ecfed-5909-451d-86fb-2a47ab834f92 */
   private long available;
   /** 备注
    * 
    * @pdOid 1fc60b65-3c40-44f5-b0ac-55f568b4a86e */
   private String remarks;
   private SyEmp syEmp;
   private SyUnits syUnits;
   /** 操作时间	当前操作时间
    * 
    * @pdOid 78b2e29d-4081-4b13-a3cd-8684b40e2b96 */
   private String operationTime;
   public BasBasicArchivesEntry(){}
   public long getempId(){
      return syEmp.getId();
   }
   public  long getunitId(){
      return syUnits.getId();
   }
   public BasBasicArchivesEntry(long id, String name, int parentID, String mnemonicCode, long available, String remarks, SyEmp syEmp, SyUnits syUnits, String operationTime) {
      this.id = id;
      this.name = name;
      this.parentID = parentID;
      this.mnemonicCode = mnemonicCode;
      this.available = available;
      this.remarks = remarks;
      this.syEmp = syEmp;
      this.syUnits = syUnits;
      this.operationTime = operationTime;
   }

   public String getOperationTime() {
      return operationTime;
   }

   public void setOperationTime(String operationTime) {
      this.operationTime = operationTime;
   }

   public static long getSerialVersionUID() {
      return serialVersionUID;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getParentID() {
      return parentID;
   }

   public void setParentID(int parentID) {
      this.parentID = parentID;
   }

   public String getMnemonicCode() {
      return mnemonicCode;
   }

   public void setMnemonicCode(String mnemonicCode) {
      this.mnemonicCode = mnemonicCode;
   }

   public long getAvailable() {
      return available;
   }

   public void setAvailable(long available) {
      this.available = available;
   }

   public String getRemarks() {
      return remarks;
   }

   public void setRemarks(String remarks) {
      this.remarks = remarks;
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
}