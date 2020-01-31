package com.xr.boot.entity; /***********************************************************************
 * Module:  BigLogLogisticsControlTable.java
 * Author:  Administrator
 * Purpose: Defines the Class BigLogLogisticsControlTable
 ***********************************************************************/

/** 物流对照表
 * 
 * @pdOid 9555913f-89eb-465b-8eb0-75ebf3c24fb9 */
public class BigLogLogisticsControlTable {
   /** 编号	自增
    * 
    * @pdOid 99251da2-e319-423a-9e6c-839f31b847a8 */
   private int id;
   /** 工作单号
    * 
    * @pdOid 92d51937-9cd8-4af1-b5d3-ec78b4cb7ef6 */
   private String workSheetNo;
   /** 类型
    * 
    * @pdOid 6f7e5ee7-40ae-463c-8163-2f231aedf099 */
   private String cType;
   /** 代理公司
    * 
    * @pdOid 792af467-611e-4b45-8202-4b8d6ad35703 */
   private String corporation;
   /** 货票号   雪花算法二十七
    * 
    * @pdOid cc7a5513-3a1e-438e-8ab7-14fb870d1553 */
   private String waybillID;
   /** 备注
    * 
    * @pdOid c5c12468-895d-44a7-8561-fe3ad2d6dc5a */
   private String remarks;
   /** 录入时间
    * 
    * @pdOid 69a30c81-d32f-4b9d-ada9-cf60b2f56265 */
   private String inputDate;
   /** 状态	0：正常，1：停用
    * 
    * @pdOid 5f9523c2-2ba2-46d5-af7c-455c8c40fa29 */
   private long stats;
   private SyEmp syEmp;
   private SyUnits syUnits;
   public long getempId(){
      return syEmp.getId();
   }
   public  long getunitId(){
      return syUnits.getId();
   }
   public String getempName(){return syEmp.getEmpName();}
   public BigLogLogisticsControlTable(){}

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getWorkSheetNo() {
      return workSheetNo;
   }

   public void setWorkSheetNo(String workSheetNo) {
      this.workSheetNo = workSheetNo;
   }

   public String getcType() {
      return cType;
   }

   public void setcType(String cType) {
      this.cType = cType;
   }

   public String getCorporation() {
      return corporation;
   }

   public void setCorporation(String corporation) {
      this.corporation = corporation;
   }

   public String getWaybillID() {
      return waybillID;
   }

   public void setWaybillID(String waybillID) {
      this.waybillID = waybillID;
   }

   public String getRemarks() {
      return remarks;
   }

   public void setRemarks(String remarks) {
      this.remarks = remarks;
   }

   public String getInputDate() {
      return inputDate;
   }

   public void setInputDate(String inputDate) {
      this.inputDate = inputDate;
   }

   public long getStats() {
      return stats;
   }

   public void setStats(long stats) {
      this.stats = stats;
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