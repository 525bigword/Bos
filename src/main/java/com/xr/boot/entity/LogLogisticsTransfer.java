package com.xr.boot.entity; /***********************************************************************
 * Module:  LogLogisticsTransfer.java
 * Author:  Administrator
 * Purpose: Defines the Class LogLogisticsTransfer
 ***********************************************************************/

import java.util.*;

/** 物流（交接单）查询
 * 
 * @pdOid ca219140-1f24-4fe4-ba0a-d81c7124a4aa */
public class LogLogisticsTransfer {
   /** 编号
    * 
    * @pdOid 6eca2a0b-ddb9-4075-a013-8895e28431fe */
   private int id;
   /** 交接单号，雪花算法四号数据中心
    * 
    * @pdOid 601f52b9-d1d9-4203-b6d5-fb70ce24c0ec */
   private String transferInt;
   /** 发站
    * 
    * @pdOid beea277d-f44a-422b-8b22-21f855291f80 */
   private String startStation;
   /** 到站
    * 
    * @pdOid 3e4f47d9-97eb-4e5d-bfb0-ca16801f0951 */
   private String endStation;
   /** 调度人员
    * 
    * @pdOid 7f6c9f5b-e6ec-4f1e-b1bf-6afd5c68928d */
   private String dispatcher;
   /** 司机
    * 
    * @pdOid 7d212e93-27cf-4b66-a462-e7a6dcba5030 */
   private String driver;
   /** 发货时间
    * 
    * @pdOid 5db9b1b5-7f9a-4841-847c-34648166ca07 */
   private Date deliveryDate;
   
   /** @pdOid d119446f-a592-421e-bb3b-e75479bc7c9e */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 59c43897-25b7-4434-8479-06ce45881a79 */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid 4bc51cc4-778d-460a-b7ca-2962bba4f84e */
   public String getTransferInt() {
      return transferInt;
   }
   
   /** @param newTransferInt
    * @pdOid 7fccc229-6522-4e98-9165-2c1bcbae843d */
   public void setTransferInt(String newTransferInt) {
      transferInt = newTransferInt;
   }
   
   /** @pdOid 63adb2d0-92e9-4094-9aae-461c99bda790 */
   public String getStartStation() {
      return startStation;
   }
   
   /** @param newStartStation
    * @pdOid a2a8e552-6c37-4718-b7c2-35ebe533337d */
   public void setStartStation(String newStartStation) {
      startStation = newStartStation;
   }
   
   /** @pdOid 7c2abfa8-c457-4ee6-8f95-796e4a8ac113 */
   public String getEndStation() {
      return endStation;
   }
   
   /** @param newEndStation
    * @pdOid 0d5e238a-49fb-4dce-9863-c7195e1b0a5a */
   public void setEndStation(String newEndStation) {
      endStation = newEndStation;
   }
   
   /** @pdOid c609f8e7-77e5-4b75-8d08-288303c4bbec */
   public String getDispatcher() {
      return dispatcher;
   }
   
   /** @param newDispatcher
    * @pdOid 93ba6c2f-e8c7-4e63-aad9-3fe56d9041ea */
   public void setDispatcher(String newDispatcher) {
      dispatcher = newDispatcher;
   }
   
   /** @pdOid f5a855bd-ac7f-4a3d-9dd3-504bf1c6db3a */
   public String getDriver() {
      return driver;
   }
   
   /** @param newDriver
    * @pdOid fa215ac3-73cd-4803-8c50-f7d0078bf382 */
   public void setDriver(String newDriver) {
      driver = newDriver;
   }
   
   /** @pdOid 5cd7a8b5-2a39-4669-baaf-b13c84afd107 */
   public Date getDeliveryDate() {
      return deliveryDate;
   }
   
   /** @param newDeliveryDate
    * @pdOid e6e9c3e1-685a-4c11-840b-e5ca144d9dc2 */
   public void setDeliveryDate(Date newDeliveryDate) {
      deliveryDate = newDeliveryDate;
   }

}