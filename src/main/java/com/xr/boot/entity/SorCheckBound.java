package com.xr.boot.entity; /***********************************************************************
 * Module:  SorCheckBound.java
 * Author:  Administrator
 * Purpose: Defines the Class SorCheckBound
 ***********************************************************************/

import sun.plugin2.message.Serializer;

import java.io.Serializable;
import java.util.*;

/** 盘库表
 * 
 * @pdOid 10880ad6-6b51-408e-b4e3-fca7538867d0 */
public class SorCheckBound implements Serializable {
   private static final long serialVersionUID = -6863869744663692602L;
   /** 盘库单号   雪花算法十五号数据中心
    * 
    * @pdOid 8c72ad24-2e82-426f-b646-8c5d1a2d3d32 */
   private String id;
   /** 总件数
    *
    * @pdOid 674ae4ee-6527-4208-ae83-e6b2225dc959 */
   private int cargoSum;
   /** 总体积
    *
    * @pdOid 674ae4ee-6527-4208-ae83-e6b2225dc959 */
   private int volumeSum;
   /** 盘库人
    *
    * @pdOid c30ac8fa-3b9f-4913-8a2a-1e21140f5e2c */
   private String checkPerson;
   /** 盘库时间
    * 
    * @pdOid c30ac8fa-3b9f-4913-8a2a-1e21140f5e2c */
   private String checkDate;
   /** 操作单位
    * 
    * @pdOid 88c6671b-813c-478f-acbc-58fbaddd897c */
   private String checkCompany;
   /** 合包号，雪花算法1 三
    * 
    * @pdOid 1e33f50e-b453-4ef9-a47a-5caf62e7e0ef */
   private String packging;

   @Override
   public String toString() {
      return "SorCheckBound{" +
              "id='" + id + '\'' +
              ", cargoSum=" + cargoSum +
              ", checkPerson='" + checkPerson + '\'' +
              ", checkDate='" + checkDate + '\'' +
              ", checkCompany='" + checkCompany + '\'' +
              ", packging='" + packging + '\'' +
              '}';
   }

   public int getVolumeSum() {
      return volumeSum;
   }

   public void setVolumeSum(int volumeSum) {
      this.volumeSum = volumeSum;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public int getCargoSum() {
      return cargoSum;
   }

   public void setCargoSum(int cargoSum) {
      this.cargoSum = cargoSum;
   }

   public String getCheckPerson() {
      return checkPerson;
   }

   public void setCheckPerson(String checkPerson) {
      this.checkPerson = checkPerson;
   }

   public String getCheckDate() {
      return checkDate;
   }

   public void setCheckDate(String checkDate) {
      this.checkDate = checkDate;
   }

   public String getCheckCompany() {
      return checkCompany;
   }

   public void setCheckCompany(String checkCompany) {
      this.checkCompany = checkCompany;
   }

   public String getPackging() {
      return packging;
   }

   public void setPackging(String packging) {
      this.packging = packging;
   }
}