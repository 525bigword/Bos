package com.xr.boot.entity; /***********************************************************************
 * Module:  BasZoneCustomInfo.java
 * Author:  Administrator
 * Purpose: Defines the Class BasZoneCustomInfo
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** 定区客户信息表
 * 
 * @pdOid 51e3a79c-5221-4813-bd70-b4a981227b30 */
public class BasZoneCustomInfo implements Serializable {
   /** 客户编号	自增
    * 
    * @pdOid 9d338b8a-a466-4b3a-a30b-24ef56045251 */
   private long customCode;
   /** 客户姓名	唯一
    * 
    * @pdOid c818b2d6-20f2-46c2-98f1-92af8cc6e4a5 */
   private String customName;
   /** 手机号码
    * 
    * @pdOid 428bf320-058f-4f1d-82ed-61e675045656 */
   private String mobileNo;
   /** 城市
    * 
    * @pdOid b8a48c8e-1f36-4990-bfa5-07316707291b */
   private String cityName;
   /** 客户地址
    * 
    * @pdOid 49b0f777-053a-4a0f-98a8-6960c67a2d68 */
   private String cstomAddress;
   
   private String zoneCode;
   private SyEmp syEmp;
   private SyUnits syUnits;
   /** 操作时间	当前操作时间
    *
    * @pdOid 78b2e29d-4081-4b13-a3cd-8684b40e2b96 */
   private String operationTime;
   public long getunitId(){return syUnits.getId();}
   public long getempId(){return syEmp.getId();}

   public long getCustomCode() {
      return customCode;
   }

   public void setCustomCode(long customCode) {
      this.customCode = customCode;
   }

   public String getCustomName() {
      return customName;
   }

   public void setCustomName(String customName) {
      this.customName = customName;
   }

   public String getMobileNo() {
      return mobileNo;
   }

   public void setMobileNo(String mobileNo) {
      this.mobileNo = mobileNo;
   }

   public String getCityName() {
      return cityName;
   }

   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   public String getCstomAddress() {
      return cstomAddress;
   }

   public void setCstomAddress(String cstomAddress) {
      this.cstomAddress = cstomAddress;
   }

   public String getZoneCode() {
      return zoneCode;
   }

   public void setZoneCode(String zoneCode) {
      this.zoneCode = zoneCode;
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