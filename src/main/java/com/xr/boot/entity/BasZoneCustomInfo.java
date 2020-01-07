package com.xr.boot.entity; /***********************************************************************
 * Module:  BasZoneCustomInfo.java
 * Author:  Administrator
 * Purpose: Defines the Class BasZoneCustomInfo
 ***********************************************************************/

import java.util.*;

/** 定区客户信息表
 * 
 * @pdOid 51e3a79c-5221-4813-bd70-b4a981227b30 */
public class BasZoneCustomInfo {
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
   private int mobileNo;
   /** 城市
    * 
    * @pdOid b8a48c8e-1f36-4990-bfa5-07316707291b */
   private String cityName;
   /** 客户地址
    * 
    * @pdOid 49b0f777-053a-4a0f-98a8-6960c67a2d68 */
   private String cstomAddress;
   
   /** @pdOid 43cf1cb8-9462-48aa-bc75-0b1a450765f5 */
   public long getCustomCode() {
      return customCode;
   }
   
   /** @param newCustomCode
    * @pdOid 3cb450ca-2307-4c07-aa33-5d615de5eb30 */
   public void setCustomCode(long newCustomCode) {
      customCode = newCustomCode;
   }
   
   /** @pdOid b6e763c5-dc74-42db-bf19-0be468076ea8 */
   public String getCustomName() {
      return customName;
   }
   
   /** @param newCustomName
    * @pdOid 1874b853-fe0d-41a1-9b28-f500895e4db9 */
   public void setCustomName(String newCustomName) {
      customName = newCustomName;
   }
   
   /** @pdOid 4313898f-c64a-4932-a8e5-a520648f386b */
   public int getMobileNo() {
      return mobileNo;
   }
   
   /** @param newMobileNo
    * @pdOid 04e854a5-82af-4efc-b54e-ac6f7830eb51 */
   public void setMobileNo(int newMobileNo) {
      mobileNo = newMobileNo;
   }
   
   /** @pdOid fe537942-78ed-41cf-9a31-b5a64491fdbe */
   public String getCityName() {
      return cityName;
   }
   
   /** @param newCityName
    * @pdOid 4e453055-3b1b-4788-92c2-488e18b7373a */
   public void setCityName(String newCityName) {
      cityName = newCityName;
   }
   
   /** @pdOid 3f37b3b3-d9af-4089-983f-ddbdd30da962 */
   public String getCstomAddress() {
      return cstomAddress;
   }
   
   /** @param newCstomAddress
    * @pdOid bafabbfd-d1b1-439c-aa90-554137f2776e */
   public void setCstomAddress(String newCstomAddress) {
      cstomAddress = newCstomAddress;
   }

}