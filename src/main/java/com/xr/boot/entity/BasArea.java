package com.xr.boot.entity; /***********************************************************************
 * Module:  BasArea.java
 * Author:  Administrator
 * Purpose: Defines the Class BasArea
 ***********************************************************************/

import java.io.Serializable;

/** 区域设置表
 * 
 * @pdOid baa56d1f-0733-42dc-a28e-e72909197d65 */
public class BasArea implements Serializable {
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
   private String postalCode;
   /** 简码
    * 
    * @pdOid 8efd49d8-5524-4268-b2de-326467c8b9be */
   private String simpleCode;
   /** 城市编码
    * 
    * @pdOid cc01aeb1-b6a6-46ee-b06e-7d9227a60eea */
   private String cityCode;
   private SyUnits entryUnit;
   private SyUnits complementUnit;
   /** 性质	1.省级 2.市辖市 3.直辖市 
    * 4.县级5.地级 6.省会
    * 
    * @pdOid c5e38eac-179f-4b53-ba67-a032da61871f */
   private Integer nature;
   /** 所属区域	1.东北区2.华东区 3.华南区 
    * 4.西北区 5华中区 6西南区 7华北区
    * 
    * @pdOid e4e53092-6095-43c4-a094-6e2a6daa0866 */
   private Integer theArea;
   /** 状态	0：正常，1：停用
    * 
    * @pdOid bc20f5dc-d562-4bb2-9344-1ac8cd3c80c1 */
   private Integer stats;
   
   public BasArea(){}
   public long getentryUnitID(){return entryUnit.getId();}
   public long getcomplementUnitID(){return complementUnit.getId();}
   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getProvince() {
      return province;
   }

   public void setProvince(String province) {
      this.province = province;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getCounty() {
      return county;
   }

   public void setCounty(String county) {
      this.county = county;
   }

   public String getPostalCode() {
      return postalCode;
   }

   public void setPostalCode(String postalCode) {
      this.postalCode = postalCode;
   }

   public String getSimpleCode() {
      return simpleCode;
   }

   public void setSimpleCode(String simpleCode) {
      this.simpleCode = simpleCode;
   }

   public String getCityCode() {
      return cityCode;
   }

   public void setCityCode(String cityCode) {
      this.cityCode = cityCode;
   }

   public SyUnits getEntryUnit() {
      return entryUnit;
   }

   public void setEntryUnit(SyUnits entryUnit) {
      this.entryUnit = entryUnit;
   }

   public SyUnits getComplementUnit() {
      return complementUnit;
   }

   public void setComplementUnit(SyUnits complementUnit) {
      this.complementUnit = complementUnit;
   }

   public Integer getNature() {
      return nature;
   }

   public void setNature(Integer nature) {
      this.nature = nature;
   }

   public Integer getTheArea() {
      return theArea;
   }

   public void setTheArea(Integer theArea) {
      this.theArea = theArea;
   }

   public Integer getStats() {
      return stats;
   }

   public void setStats(Integer stats) {
      this.stats = stats;
   }
}