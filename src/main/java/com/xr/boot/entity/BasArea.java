package com.xr.boot.entity; /***********************************************************************
 * Module:  BasArea.java
 * Author:  Administrator
 * Purpose: Defines the Class BasArea
 ***********************************************************************/

import java.util.*;

/** 区域设置表
 * 
 * @pdOid baa56d1f-0733-42dc-a28e-e72909197d65 */
public class BasArea {
   /** 编号	自增
    * 
    * @pdOid 07dc3245-6285-455c-80bf-63a87a4fd38e */
   private long id;
   /** 省
    * 
    * @pdOid 38302b27-1aa2-49bb-9e80-7a817099f4a2 */
   private String province;
   /** 城市
    * 
    * @pdOid bef47470-ef29-4a2a-8734-e49221f9f62b */
   private String city;
   /** 区（县）
    * 
    * @pdOid 8611660f-0f95-4f89-a8ad-b3aecb117aef */
   private String county;
   /** 邮政编码
    * 
    * @pdOid 74d74dc1-93f9-40fc-9c84-eb1eca17bb66 */
   private int postalCode;
   /** 简码
    * 
    * @pdOid 8efd49d8-5524-4268-b2de-326467c8b9be */
   private String simpleCode;
   /** 城市编码
    * 
    * @pdOid cc01aeb1-b6a6-46ee-b06e-7d9227a60eea */
   private int cityCode;
   /** 性质	1.省级 2.市辖市 3.直辖市 
    * 4.县级5.地级 6.省会
    * 
    * @pdOid c5e38eac-179f-4b53-ba67-a032da61871f */
   private long nature;
   /** 所属区域	1.东北区2.华东区 3.华南区 
    * 4.西北区 5华中区 6西南区 7华北区
    * 
    * @pdOid e4e53092-6095-43c4-a094-6e2a6daa0866 */
   private long theArea;
   /** 状态	0：正常，1：停用
    * 
    * @pdOid bc20f5dc-d562-4bb2-9344-1ac8cd3c80c1 */
   private long stats;
   
   /** @pdOid 54b159c7-5694-414b-82f9-62d4052b127f */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 692303bf-cdd5-4f4f-88f7-86373a1196c4 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 50061197-9415-483e-b680-abb0e360e60b */
   public String getProvince() {
      return province;
   }
   
   /** @param newProvince
    * @pdOid 1ac787a0-b9aa-4a6b-895e-663b307c3c70 */
   public void setProvince(String newProvince) {
      province = newProvince;
   }
   
   /** @pdOid c644329b-f66f-4f4c-8c1b-01593c60c57f */
   public String getCity() {
      return city;
   }
   
   /** @param newCity
    * @pdOid 79ec4bed-4203-4249-b22e-cf1dc10610b4 */
   public void setCity(String newCity) {
      city = newCity;
   }
   
   /** @pdOid 135a3819-eab7-4e89-b0df-c94436e070e5 */
   public String getCounty() {
      return county;
   }
   
   /** @param newCounty
    * @pdOid 91da0117-7b5b-47ad-9194-f46d46f4ab1a */
   public void setCounty(String newCounty) {
      county = newCounty;
   }
   
   /** @pdOid 12826a46-7f41-427f-83c4-1c8ea9ead8c8 */
   public int getPostalCode() {
      return postalCode;
   }
   
   /** @param newPostalCode
    * @pdOid d551ddd4-be5e-4415-b2e3-a91dc10f0990 */
   public void setPostalCode(int newPostalCode) {
      postalCode = newPostalCode;
   }
   
   /** @pdOid 800f3a25-4cec-4370-bd79-ec2cd030d470 */
   public String getSimpleCode() {
      return simpleCode;
   }
   
   /** @param newSimpleCode
    * @pdOid c2f4542b-d30f-4df9-8eb9-c6487b7775e5 */
   public void setSimpleCode(String newSimpleCode) {
      simpleCode = newSimpleCode;
   }
   
   /** @pdOid 20eb4828-304e-4e7e-aa3d-8b1752419854 */
   public int getCityCode() {
      return cityCode;
   }
   
   /** @param newCityCode
    * @pdOid 991bca30-d82c-42fa-87fd-370dd70a3a89 */
   public void setCityCode(int newCityCode) {
      cityCode = newCityCode;
   }
   
   /** @pdOid 4cab1db6-d423-4e1f-a6d0-5325820aca51 */
   public long getNature() {
      return nature;
   }
   
   /** @param newNature
    * @pdOid b384daf7-6b26-4fbb-b54b-7f8281f52338 */
   public void setNature(long newNature) {
      nature = newNature;
   }
   
   /** @pdOid cbccdeac-bea8-4181-a069-05fcbaec67e5 */
   public long getTheArea() {
      return theArea;
   }
   
   /** @param newTheArea
    * @pdOid 445a12e4-801b-4e52-866d-67fa71c70287 */
   public void setTheArea(long newTheArea) {
      theArea = newTheArea;
   }
   
   /** @pdOid 8675d774-1eb5-46b6-894e-4a034d4230a9 */
   public long getStats() {
      return stats;
   }
   
   /** @param newStats
    * @pdOid d45b9e14-4b64-4f0a-ab26-e2a8b6fa1c49 */
   public void setStats(long newStats) {
      stats = newStats;
   }

}