package com.xr.boot.entity; /***********************************************************************
 * Module:  LogLogistics.java
 * Author:  Administrator
 * Purpose: Defines the Class LogLogistics
 ***********************************************************************/

import java.util.*;

/** 物流详情表
 * 
 * @pdOid 2a84d12c-e036-49d7-be00-aec5e09af4bc */
public class LogLogistics {
   /** 编号
    * 
    * @pdOid 1ffe4f98-775d-4827-b08f-42422e2c13a1 */
   private int id;
   /** 编物流序号，雪花算法六号数据中心
    * 
    * @pdOid 3c134f06-a806-4bcb-96b0-651c45b642bc */
   private String logisticsInt;
   /** 线路名称
    * 
    * @pdOid 96dafc68-aa1a-4e71-bed6-2e66245c7516 */
   private String lineName;
   /** 发车单位
    * 
    * @pdOid 24729c95-43cf-4bb5-b774-3ebe2f068299 */
   private String startCompany;
   /** 生成人
    * 
    * @pdOid 3aabd3bc-7f20-46de-af55-2f33647de036 */
   private String generatePerson;
   /** 车牌号
    * 
    * @pdOid 2d717583-305e-4320-af4b-415c12a25faa */
   private String carInt;
   /** 司机
    * 
    * @pdOid 76bc877b-b46d-4c70-b48b-f6013a7694e5 */
   private String driver;
   /** 司机电话
    * 
    * @pdOid 1267f643-2bb6-45e2-827c-09cf0f9d4f9d */
   private String driverPhone;
   /** 车型
    * 
    * @pdOid 23c9b521-840d-47b7-96f2-9a86b55da8e9 */
   private String carType;
   /** 物流状态
    * 
    * @pdOid 3e1d7eed-28ed-4073-b652-f287278d6be0 */
   private long logisticsState;
   /** 作废
    * 
    * @pdOid c0949739-cef1-47c1-a0d5-86a268f9d598 */
   private long isCancel;
   
   /** @pdOid 23bf7bfd-c975-40a1-9097-1172107d348f */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 402b24f1-2b86-4cf9-b163-a7f8b9addc6e */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid 6d0413b6-5b42-452f-9bc5-2c54492ab3bf */
   public String getLogisticsInt() {
      return logisticsInt;
   }
   
   /** @param newLogisticsInt
    * @pdOid 8e4bacfb-0c08-4602-9d1d-20523fc3e934 */
   public void setLogisticsInt(String newLogisticsInt) {
      logisticsInt = newLogisticsInt;
   }
   
   /** @pdOid 7a86ff91-44d6-4f75-a8b7-ebfb647318df */
   public String getLineName() {
      return lineName;
   }
   
   /** @param newLineName
    * @pdOid 05922741-a328-4335-b786-6785caac3a75 */
   public void setLineName(String newLineName) {
      lineName = newLineName;
   }
   
   /** @pdOid 1e26c913-3b8d-4163-a7ac-aa64c9d14dc9 */
   public String getStartCompany() {
      return startCompany;
   }
   
   /** @param newStartCompany
    * @pdOid 23add603-0f27-4621-b2c0-32186bab8460 */
   public void setStartCompany(String newStartCompany) {
      startCompany = newStartCompany;
   }
   
   /** @pdOid ceb69fe7-8620-44c0-9df3-43616496fff3 */
   public String getGeneratePerson() {
      return generatePerson;
   }
   
   /** @param newGeneratePerson
    * @pdOid bedc2294-1ac6-4bbb-9336-147feaea001a */
   public void setGeneratePerson(String newGeneratePerson) {
      generatePerson = newGeneratePerson;
   }
   
   /** @pdOid 1017e29a-83f5-4af3-b2ae-006e359df4e7 */
   public String getCarInt() {
      return carInt;
   }
   
   /** @param newCarInt
    * @pdOid 171f5f98-5a96-4348-8467-c161e3d3260c */
   public void setCarInt(String newCarInt) {
      carInt = newCarInt;
   }
   
   /** @pdOid 25b70e43-54b0-498a-bc44-f60e0843b223 */
   public String getDriver() {
      return driver;
   }
   
   /** @param newDriver
    * @pdOid cfa721fe-b29e-4195-9808-7fc0f670f713 */
   public void setDriver(String newDriver) {
      driver = newDriver;
   }
   
   /** @pdOid 3254aa23-900c-41e9-b6dc-1b070e809e90 */
   public String getDriverPhone() {
      return driverPhone;
   }
   
   /** @param newDriverPhone
    * @pdOid 2200bd76-016a-452d-b229-e2acb43ab6fa */
   public void setDriverPhone(String newDriverPhone) {
      driverPhone = newDriverPhone;
   }
   
   /** @pdOid 8b58d565-9e7f-41a3-90cc-b0981bb2c2d9 */
   public String getCarType() {
      return carType;
   }
   
   /** @param newCarType
    * @pdOid f0e944b1-d922-4669-8e48-def0b6a9e1a1 */
   public void setCarType(String newCarType) {
      carType = newCarType;
   }
   
   /** @pdOid 1adf6170-f2cb-4fd0-8742-88d8e49b210a */
   public long getLogisticsState() {
      return logisticsState;
   }
   
   /** @param newLogisticsState
    * @pdOid 4611b5c2-400c-4b4e-9a11-d06b967d28e2 */
   public void setLogisticsState(long newLogisticsState) {
      logisticsState = newLogisticsState;
   }
   
   /** @pdOid 737555cc-3c02-41ae-ad80-eb7ecb53a58b */
   public long getIsCancel() {
      return isCancel;
   }
   
   /** @param newIsCancel
    * @pdOid 6b7df8b5-735e-4d6b-a5fb-f42a0fd7bb59 */
   public void setIsCancel(long newIsCancel) {
      isCancel = newIsCancel;
   }

}