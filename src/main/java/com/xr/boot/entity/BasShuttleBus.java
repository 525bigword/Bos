package com.xr.boot.entity; /***********************************************************************
 * Module:  BasShuttleBus.java
 * Author:  Administrator
 * Purpose: Defines the Class BasShuttleBus
 ***********************************************************************/

import java.util.*;

/** 班车设置表
 * 
 * @pdOid 29c25b80-8bb5-4100-80f0-a9e7cf5c5bd3 */
public class BasShuttleBus {
   /** 编号	自增
    * 
    * @pdOid 89123771-d603-4947-ad1b-b03340c39233 */
   private long id;
   /** 线路类型	1．全部 2．干线 3．周边 
    * 4．省内 5．临时 6．市内
    * 
    * @pdOid d39be4f7-3896-4b59-812a-6aa4c03fd878 */
   private long lineType;
   /** 线路	外键，线路ID
    * 
    * @pdOid ace9d472-c238-44f0-a7d6-2ee683dd1fb4 */
   private int lineID;
   /** 车牌号
    * 
    * @pdOid 19ddc8a4-d007-4761-bd35-9f910f8ad544 */
   private String licensePlateInt;
   /** 承运商
    * 
    * @pdOid c5bca259-67f6-4ad1-a5fe-2f7419d3af80 */
   private String carrier;
   /** 车型
    * 
    * @pdOid 643d526e-0b4b-48cc-9a12-6f0077c05d2b */
   private String models;
   /** 司机
    * 
    * @pdOid fbe9c213-cdac-41d4-91d5-1c71b5c51d83 */
   private String driver;
   /** 电话
    * 
    * @pdOid b53b1ae6-29c8-44c7-8beb-0d9900d8bb9f */
   private String telephone;
   /** 吨控
    * 
    * @pdOid 241dbf10-9c09-4588-8fe0-71e9cda25891 */
   private int ton;
   /** 备注
    * 
    * @pdOid cc8a619e-1f62-49d2-a3b6-441f055002c5 */
   private String remarks;
   /** 操作时间	当前操作时间
    * 
    * @pdOid ff2acc1f-11d0-4703-a145-22200d30490b */
   private Date operationTime;
   /** 状态，0正常，1停用
    * 
    * @pdOid e33b1ed3-2189-4615-821d-77ce7b8eb392 */
   private long stats;
   
   /** @pdOid b19be185-da07-4275-95af-bed12a3af4f0 */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 3a831e4d-2f0d-4d56-9eea-7080ad6be128 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid f365ac70-deaf-4355-9503-61030f1d968b */
   public long getLineType() {
      return lineType;
   }
   
   /** @param newLineType
    * @pdOid 09a24b23-50f0-45ac-8d12-83262dbe7919 */
   public void setLineType(long newLineType) {
      lineType = newLineType;
   }
   
   /** @pdOid 5052082c-1b9d-44e2-906c-4d949943e77f */
   public int getLineID() {
      return lineID;
   }
   
   /** @param newLineID
    * @pdOid 2ec45949-61c5-45c9-8d02-ff003472c2f3 */
   public void setLineID(int newLineID) {
      lineID = newLineID;
   }
   
   /** @pdOid 1e02d4c9-d450-4354-b3a7-fe4c885928f3 */
   public String getLicensePlateInt() {
      return licensePlateInt;
   }
   
   /** @param newLicensePlateInt
    * @pdOid 37f4d7aa-3e14-49e1-bec2-2a62ce0fbd46 */
   public void setLicensePlateInt(String newLicensePlateInt) {
      licensePlateInt = newLicensePlateInt;
   }
   
   /** @pdOid 7e3a80a3-acc7-43e9-afe2-e51f848d379b */
   public String getCarrier() {
      return carrier;
   }
   
   /** @param newCarrier
    * @pdOid 1179559c-6054-47fe-9e71-0afb2d498717 */
   public void setCarrier(String newCarrier) {
      carrier = newCarrier;
   }
   
   /** @pdOid 2533b439-ca78-41b8-bc05-c8d623dc67f1 */
   public String getModels() {
      return models;
   }
   
   /** @param newModels
    * @pdOid fd897481-c45c-4dc3-8ce9-00da5da66ee8 */
   public void setModels(String newModels) {
      models = newModels;
   }
   
   /** @pdOid 5e8cb0b3-44ab-461c-a80e-2ba90690902e */
   public String getDriver() {
      return driver;
   }
   
   /** @param newDriver
    * @pdOid c9de7b55-5956-4ffb-856f-e080255a1875 */
   public void setDriver(String newDriver) {
      driver = newDriver;
   }
   
   /** @pdOid c90b12c9-423a-4480-9bc4-a047db63b852 */
   public String getTelephone() {
      return telephone;
   }
   
   /** @param newTelephone
    * @pdOid 926ab1f8-8997-4b96-9b52-8c4ba0f213e6 */
   public void setTelephone(String newTelephone) {
      telephone = newTelephone;
   }
   
   /** @pdOid c20331dd-286b-4229-8af6-fb393b62972c */
   public int getTon() {
      return ton;
   }
   
   /** @param newTon
    * @pdOid 51cb464c-e0f1-4042-8efa-a4300779d95f */
   public void setTon(int newTon) {
      ton = newTon;
   }
   
   /** @pdOid d940e87e-fecb-4a2f-8aef-8483e74e2ec5 */
   public String getRemarks() {
      return remarks;
   }
   
   /** @param newRemarks
    * @pdOid c8d6c301-fa46-41c9-9928-2a8aec94ad79 */
   public void setRemarks(String newRemarks) {
      remarks = newRemarks;
   }
   
   /** @pdOid 302423dd-49a4-471f-b305-b0465ed5369f */
   public Date getOperationTime() {
      return operationTime;
   }
   
   /** @param newOperationTime
    * @pdOid b481dee2-fcee-4435-be75-bc9659551ac8 */
   public void setOperationTime(Date newOperationTime) {
      operationTime = newOperationTime;
   }
   
   /** @pdOid e80dffdb-c936-43cd-8066-524289b849df */
   public long getStats() {
      return stats;
   }
   
   /** @param newStats
    * @pdOid 0acaf1fc-7dee-4f7b-a2bd-fb508b470f30 */
   public void setStats(long newStats) {
      stats = newStats;
   }

}