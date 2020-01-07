package com.xr.boot.entity; /***********************************************************************
 * Module:  SorCheckBound.java
 * Author:  Administrator
 * Purpose: Defines the Class SorCheckBound
 ***********************************************************************/

import java.util.*;

/** 盘库表
 * 
 * @pdOid 10880ad6-6b51-408e-b4e3-fca7538867d0 */
public class SorCheckBound {
   /** 盘库单号   雪花算法十五号数据中心
    * 
    * @pdOid 8c72ad24-2e82-426f-b646-8c5d1a2d3d32 */
   private String id;
   /** 扫描设备号	外键
    * 
    * @pdOid 556b4a5c-21f6-429c-86a8-c6a1fb79cc7c */
   private int scanID;
   /** 总件数
    * 
    * @pdOid 674ae4ee-6527-4208-ae83-e6b2225dc959 */
   private int cargoSum;
   /** 盘库时间
    * 
    * @pdOid c30ac8fa-3b9f-4913-8a2a-1e21140f5e2c */
   private Date checkDate;
   /** 操作单位
    * 
    * @pdOid 88c6671b-813c-478f-acbc-58fbaddd897c */
   private String checkCompany;
   /** 合包号，雪花算法1 三
    * 
    * @pdOid 1e33f50e-b453-4ef9-a47a-5caf62e7e0ef */
   private String packging;
   
   /** @pdOid cdce4f0b-68e6-4e66-bb21-b4a160c4bffa */
   public String getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid bd6992b5-e6b1-4660-9b09-8786aa8bed3d */
   public void setId(String newId) {
      id = newId;
   }
   
   /** @pdOid 5a94d938-5605-4b1f-a589-48c6e4e71464 */
   public int getScanID() {
      return scanID;
   }
   
   /** @param newScanID
    * @pdOid fe34e512-f909-4e3f-92c0-9e61b96abfbb */
   public void setScanID(int newScanID) {
      scanID = newScanID;
   }
   
   /** @pdOid fcd0e4b1-f4b0-4ad9-a2bb-5564afc1dba0 */
   public int getCargoSum() {
      return cargoSum;
   }
   
   /** @param newCargoSum
    * @pdOid 747dd780-81ae-4a0e-9db7-81ef36da0da4 */
   public void setCargoSum(int newCargoSum) {
      cargoSum = newCargoSum;
   }
   
   /** @pdOid 4f2bfd75-f6c0-4807-abb7-d93eafe6abab */
   public Date getCheckDate() {
      return checkDate;
   }
   
   /** @param newCheckDate
    * @pdOid 706687a7-6641-465f-8232-846b00faa503 */
   public void setCheckDate(Date newCheckDate) {
      checkDate = newCheckDate;
   }
   
   /** @pdOid c13d4019-13cc-442a-9ea9-e0d8abf523f4 */
   public String getCheckCompany() {
      return checkCompany;
   }
   
   /** @param newCheckCompany
    * @pdOid 79047334-1092-4665-a871-61a767c73899 */
   public void setCheckCompany(String newCheckCompany) {
      checkCompany = newCheckCompany;
   }
   
   /** @pdOid 8f0ac995-cc55-4438-b44e-1b97abcfbae4 */
   public String getPackging() {
      return packging;
   }
   
   /** @param newPackging
    * @pdOid d2ac0886-85eb-4978-9c79-b1e69471f8e7 */
   public void setPackging(String newPackging) {
      packging = newPackging;
   }

}