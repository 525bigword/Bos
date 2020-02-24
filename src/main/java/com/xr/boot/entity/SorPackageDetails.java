package com.xr.boot.entity; /***********************************************************************
 * Module:  SorPackageDetails.java
 * Author:  Administrator
 * Purpose: Defines the Class SorPackageDetails
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** 合包明细表
 * 
 * @pdOid c5782a39-7456-4672-a721-941a37741703 */
public class SorPackageDetails implements Serializable {
   private static final long serialVersionUID = 2743851278599306796L;
   /** 单号    雪花算法十九号数据中心
    * 
    * @pdOid b51cb286-f052-4068-b44e-44c9ad189c67 */
   private String id;
   /** 商品名
    * 
    * @pdOid bf379d62-2469-47d2-9651-bfc5ba3d13c8 */
   private String wareName;
   /** 到达地
    * 
    * @pdOid 724c6e81-423a-44af-a5df-4e4f6e6effbe */
   private String destination;
   /** 票数
    * 
    * @pdOid 67b30d56-af85-400a-b4f1-d6f1df674414 */
   private int ticket;
   /** 实际件数
    * 
    * @pdOid 941b4d10-08df-4570-bdae-1fc0438e977c */
   private int actualCargoInt;
   /** 件数
    * 
    * @pdOid 8aaf6d10-cda3-4c60-a7e7-92e9af6b45dc */
   private int cargoInt;
   /** 重量
    * 
    * @pdOid 9325c62c-12e1-4796-8729-02a796dae394 */
   private double weight;
   /** 体积
    * 
    * @pdOid 6807378f-5cd4-482a-add0-f20596265487 */
   private double volume;
   /** 到达时限
    * 
    * @pdOid 80e93870-0feb-4d36-a092-ab9c3f1916da */
   private String service;
   /** 重要提示
    * 
    * @pdOid 3d58e56d-6317-4cf6-a61a-3611f07f4c32 */
   private String importantHints;
   /** 配置要求
    * 
    * @pdOid 7207101f-cb74-4599-99bb-10e13fd7729c */
   private String ask;
   /** 输入类型
    * 
    * @pdOid e5e8c1d1-980a-4142-b0a2-efcd5a503593 */
   private String inputType;
   /** 合包号	接入合包表
    * 
    * @pdOid 6f85bbb5-efcc-41a8-a786-46fcc4c422c3 */
   private String packging;

   @Override
   public String toString() {
      return "SorPackageDetails{" +
              "id='" + id + '\'' +
              ", wareName=" + wareName +
              ", destination='" + destination + '\'' +
              ", ticket=" + ticket +
              ", actualCargoInt=" + actualCargoInt +
              ", cargoInt=" + cargoInt +
              ", weight=" + weight +
              ", volume=" + volume +
              ", service=" + service +
              ", importantHints='" + importantHints + '\'' +
              ", ask='" + ask + '\'' +
              ", inputType='" + inputType + '\'' +
              ", packging='" + packging + '\'' +
              '}';
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getWareName() {
      return wareName;
   }

   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   public String getDestination() {
      return destination;
   }

   public void setDestination(String destination) {
      this.destination = destination;
   }

   public int getTicket() {
      return ticket;
   }

   public void setTicket(int ticket) {
      this.ticket = ticket;
   }

   public int getActualCargoInt() {
      return actualCargoInt;
   }

   public void setActualCargoInt(int actualCargoInt) {
      this.actualCargoInt = actualCargoInt;
   }

   public int getCargoInt() {
      return cargoInt;
   }

   public void setCargoInt(int cargoInt) {
      this.cargoInt = cargoInt;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      this.weight = weight;
   }

   public double getVolume() {
      return volume;
   }

   public void setVolume(double volume) {
      this.volume = volume;
   }

   public String getService() {
      return service;
   }

   public void setService(String service) {
      this.service = service;
   }

   public String getImportantHints() {
      return importantHints;
   }

   public void setImportantHints(String importantHints) {
      this.importantHints = importantHints;
   }

   public String getAsk() {
      return ask;
   }

   public void setAsk(String ask) {
      this.ask = ask;
   }

   public String getInputType() {
      return inputType;
   }

   public void setInputType(String inputType) {
      this.inputType = inputType;
   }

   public String getPackging() {
      return packging;
   }

   public void setPackging(String packging) {
      this.packging = packging;
   }
}