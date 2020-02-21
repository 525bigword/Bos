package com.xr.boot.entity; /***********************************************************************
 * Module:  SorPackageDetails.java
 * Author:  Administrator
 * Purpose: Defines the Class SorPackageDetails
 ***********************************************************************/

import java.util.*;

/** 合包明细表
 * 
 * @pdOid c5782a39-7456-4672-a721-941a37741703 */
public class SorPackageDetails {
   /** 单号    雪花算法十九号数据中心
    * 
    * @pdOid b51cb286-f052-4068-b44e-44c9ad189c67 */
   private String id;
   /** 商品名
    * 
    * @pdOid bf379d62-2469-47d2-9651-bfc5ba3d13c8 */
   private int wareName;
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
   private Date service;
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

   /** @pdOid 308ee207-487e-424d-aa85-4b4ea56e39f8 */
   public String getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid e75cac6d-f437-4a76-8c2f-2bb0616bddfe */
   public void setId(String newId) {
      id = newId;
   }
   
   /** @pdOid b497ec1c-92ac-434f-ba89-bfab681c0b63 */
   public int getWareName() {
      return wareName;
   }
   
   /** @param newWareName
    * @pdOid 906df763-bbca-4116-b878-03f129cba639 */
   public void setWareName(int newWareName) {
      wareName = newWareName;
   }
   
   /** @pdOid dc76b354-1b86-4998-907b-f0828df864d5 */
   public String getDestination() {
      return destination;
   }
   
   /** @param newDestination
    * @pdOid a867772a-d2f0-410b-a242-5df81e51c79a */
   public void setDestination(String newDestination) {
      destination = newDestination;
   }
   
   /** @pdOid d0d707ab-b0ff-4039-a9c3-6dc23b4bc72d */
   public int getTicket() {
      return ticket;
   }
   
   /** @param newTicket
    * @pdOid d4425c2d-2e85-4ffe-919b-45c0579055a8 */
   public void setTicket(int newTicket) {
      ticket = newTicket;
   }
   
   /** @pdOid 3b670f64-d73e-41d2-8415-be99f3ac461f */
   public int getActualCargoInt() {
      return actualCargoInt;
   }
   
   /** @param newActualCargoInt
    * @pdOid 0ed47648-4820-4828-b5ca-f9f4639b503c */
   public void setActualCargoInt(int newActualCargoInt) {
      actualCargoInt = newActualCargoInt;
   }
   
   /** @pdOid 478bf07f-a21d-4af8-9ebd-104ba6c5ccf1 */
   public int getCargoInt() {
      return cargoInt;
   }
   
   /** @param newCargoInt
    * @pdOid 5f607e12-2bf4-4af7-9af6-332e89e601bd */
   public void setCargoInt(int newCargoInt) {
      cargoInt = newCargoInt;
   }
   
   /** @pdOid fb2f57fa-7117-484a-adc1-ff9885afe227 */
   public double getWeight() {
      return weight;
   }
   
   /** @param newWeight
    * @pdOid 0c3ec13e-0bce-4046-835e-8c3121e26229 */
   public void setWeight(double newWeight) {
      weight = newWeight;
   }
   
   /** @pdOid 57f29b4e-10e6-4c9c-82d3-cd561e82ec64 */
   public double getVolume() {
      return volume;
   }
   
   /** @param newVolume
    * @pdOid 9834ce6c-fc09-4fa7-88e3-035cfd9cb8eb */
   public void setVolume(double newVolume) {
      volume = newVolume;
   }
   
   /** @pdOid 961a0b9f-d960-4845-846f-c82a6fe9624c */
   public Date getService() {
      return service;
   }
   
   /** @param newService
    * @pdOid 667d6b09-a6ec-4813-b383-d17ede8d7b92 */
   public void setService(Date newService) {
      service = newService;
   }
   
   /** @pdOid f0309f0d-5cb6-42d8-bd04-061a43befe14 */
   public String getImportantHints() {
      return importantHints;
   }
   
   /** @param newImportantHints
    * @pdOid 97267aa2-d60c-4682-81f8-c3162952e490 */
   public void setImportantHints(String newImportantHints) {
      importantHints = newImportantHints;
   }
   
   /** @pdOid 838bfbf6-f801-4cbf-a262-74acb63b98fd */
   public String getAsk() {
      return ask;
   }
   
   /** @param newAsk
    * @pdOid 4da883da-7d53-4ea6-91ab-4d1fb5fdc5f1 */
   public void setAsk(String newAsk) {
      ask = newAsk;
   }
   
   /** @pdOid 705c10b1-e7fe-4eaa-aeef-357b278ca6ca */
   public String getInputType() {
      return inputType;
   }
   
   /** @param newInputType
    * @pdOid 86aaf06a-71de-4016-8a3b-5bfd20e6711e */
   public void setInputType(String newInputType) {
      inputType = newInputType;
   }
   
   /** @pdOid da8d1e3e-3faf-4582-a5d2-ef9a01af87d3 */
   public String getPackging() {
      return packging;
   }
   
   /** @param newPackging
    * @pdOid 8ad9838b-8acb-4880-87bd-eade55345dde */
   public void setPackging(String newPackging) {
      packging = newPackging;
   }

}