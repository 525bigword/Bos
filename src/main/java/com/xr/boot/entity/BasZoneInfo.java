package com.xr.boot.entity; /***********************************************************************
 * Module:  BasZoneInfo.java
 * Author:  Administrator
 * Purpose: Defines the Class BasZoneInfo
 ***********************************************************************/

import java.io.Serializable;

/** 定区信息表
 * 
 * @pdOid 741a55bc-bcb6-492d-8cd8-fd4ccc5fddef */
public class BasZoneInfo implements Serializable {
   /** 定区名称
    * 
    * @pdOid a1bebce6-4a3a-4b62-9ba6-895e380cd59d */
   private String zoneName;
   /** 定区编码	唯一
    * 
    * @pdOid a27af513-c9c1-47f9-9108-18170c24ced9 */
   private String zoneCode;
   /** 联系电话
    * 
    * @pdOid 2c3d7195-fec2-4887-9b7a-772db7986af4 */
   private String telPhone;
   private SyEmp syEmp;
   private SyUnits syUnits;

   public long getempId(){
      return syEmp.getId();
   }
   public  long getunitId(){
      return syUnits.getId();
   }
   public String getempNo(){return syEmp.getEmpNo();}
   public SyEmp getSyEmp() {
      return syEmp;
   }

   public void setSyEmp(SyEmp syEmp) {
      this.syEmp = syEmp;
   }
   public BasZoneInfo(){

   }
   public SyUnits getSyUnits() {
      return syUnits;
   }

   public void setSyUnits(SyUnits syUnits) {
      this.syUnits = syUnits;
   }

   /** 状态	0：正常，1：停用
    * 
    * @pdOid e6d558f6-19c4-4dee-9b11-ae30aea98461 */
   private long stats;
   
   /** @pdOid e1e09bcc-1f44-4ec8-9be0-baebde36d1cb */
   public String getZoneName() {
      return zoneName;
   }
   
   /** @param newZoneName
    * @pdOid 9c9661a5-3fed-43cc-a92b-6aab5ae2d028 */
   public void setZoneName(String newZoneName) {
      zoneName = newZoneName;
   }
   
   /** @pdOid c1ca2d94-ab2d-4039-b3f5-f96263671da2 */
   public String getZoneCode() {
      return zoneCode;
   }
   
   /** @param newZoneCode
    * @pdOid 7e6a1475-65c4-41c4-ae5a-f8216b902b20 */
   public void setZoneCode(String newZoneCode) {
      zoneCode = newZoneCode;
   }
   
   /** @pdOid 82a6da7b-6431-40d1-94f8-173bec15b765 */
   public String getTelPhone() {
      return telPhone;
   }
   
   /** @param newTelPhone
    * @pdOid d38ce005-89a9-4f29-9000-03fe7d493c33 */
   public void setTelPhone(String newTelPhone) {
      telPhone = newTelPhone;
   }
   
   /** @pdOid f9d7ef44-19cf-4177-8b59-ed568ca9c5b1 */
   public long getStats() {
      return stats;
   }
   
   /** @param newStats
    * @pdOid d069a2dc-0c0c-4b3a-b19c-6ce261400f17 */
   public void setStats(long newStats) {
      stats = newStats;
   }

}