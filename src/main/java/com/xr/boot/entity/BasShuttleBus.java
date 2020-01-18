package com.xr.boot.entity; /***********************************************************************
 * Module:  BasShuttleBus.java
 * Author:  Administrator
 * Purpose: Defines the Class BasShuttleBus
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** 班车设置表
 * 
 * @pdOid 29c25b80-8bb5-4100-80f0-a9e7cf5c5bd3 */
public class BasShuttleBus implements Serializable {
   /** 编号	自增
    * 
    * @pdOid 89123771-d603-4947-ad1b-b03340c39233 */
   private long id;
   /** 线路类型	1．干线 2．周边
    * 3．省内 4．临时 5．市内
    * 
    * @pdOid d39be4f7-3896-4b59-812a-6aa4c03fd878 */
   private Integer lineType;
   /** 线路	外键，线路ID
    * 
    * @pdOid ace9d472-c238-44f0-a7d6-2ee683dd1fb4 */
   private LogLogistics logLogistics;
   /** 车牌号
    * 
    * @pdOid 19ddc8a4-d007-4761-bd35-9f910f8ad544 */
   private String licensePlateInt;
   /** 承运商
    * 
    * @pdOid c5bca259-67f6-4ad1-a5fe-2f7419d3af80 */
   private String carrier;
   /** 车型
    * 
    * @pdOid 643d526e-0b4b-48cc-9a12-6f0077c05d2b */
   private String models;
   /** 司机
    * 
    * @pdOid fbe9c213-cdac-41d4-91d5-1c71b5c51d83 */
   private String driver;
   /** 电话
    * 
    * @pdOid b53b1ae6-29c8-44c7-8beb-0d9900d8bb9f */
   private String telephone;
   /** 吨控
    * 
    * @pdOid 241dbf10-9c09-4588-8fe0-71e9cda25891 */
   private double ton;
   /** 备注
    * 
    * @pdOid cc8a619e-1f62-49d2-a3b6-441f055002c5 */
   private String remarks;

   private SyEmp syEmp;
   private SyUnits syUnits;
   /** 操作时间	当前操作时间
    * 
    * @pdOid ff2acc1f-11d0-4703-a145-22200d30490b */
   private String operationTime;

   public BasShuttleBus(){}
   public long getlineID(){return logLogistics.getId();}
   public long getempId(){
      return syEmp.getId();
   }
   public  long getunitId(){
      return syUnits.getId();
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public Integer getLineType() {
      return lineType;
   }

   public void setLineType(Integer lineType) {
      this.lineType = lineType;
   }

   public LogLogistics getLogLogistics() {
      return logLogistics;
   }

   public void setLogLogistics(LogLogistics logLogistics) {
      this.logLogistics = logLogistics;
   }

   public String getLicensePlateInt() {
      return licensePlateInt;
   }

   public void setLicensePlateInt(String licensePlateInt) {
      this.licensePlateInt = licensePlateInt;
   }

   public String getCarrier() {
      return carrier;
   }

   public void setCarrier(String carrier) {
      this.carrier = carrier;
   }

   public String getModels() {
      return models;
   }

   public void setModels(String models) {
      this.models = models;
   }

   public String getDriver() {
      return driver;
   }

   public void setDriver(String driver) {
      this.driver = driver;
   }

   public String getTelephone() {
      return telephone;
   }

   public void setTelephone(String telephone) {
      this.telephone = telephone;
   }

   public double getTon() {
      return ton;
   }

   public void setTon(double ton) {
      this.ton = ton;
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

   public String getOperationTime() {
      return operationTime;
   }

   public void setOperationTime(String operationTime) {
      this.operationTime = operationTime;
   }
}