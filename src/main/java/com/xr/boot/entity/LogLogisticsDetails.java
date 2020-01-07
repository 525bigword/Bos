package com.xr.boot.entity; /***********************************************************************
 * Module:  LogLogisticsDetails.java
 * Author:  Administrator
 * Purpose: Defines the Class LogLogisticsDetails
 ***********************************************************************/

import java.util.*;

/** 物流详情表
 * 
 * @pdOid 43fe0fbc-185b-41c2-8693-2d2333d8c6b1 */
public class LogLogisticsDetails {
   /** 编号
    * 
    * @pdOid d8eed199-59c5-41d3-a08d-f15b6e9f53c1 */
   private int id;
   /** 物流序号
    * 
    * @pdOid ed0c9b6e-f334-4a92-ad71-282a5923b6f3 */
   private String logisticsInt;
   /** 单位名称
    * 
    * @pdOid f8ee2311-f4df-4c69-aa19-daf44c54ffbe */
   private String companyName;
   /** 预计到达时间
    * 
    * @pdOid 838e8dee-0fda-4d0e-b3a2-cdc77eab64fa */
   private Date expectArrivalDate;
   /** 实际到达时间
    * 
    * @pdOid a521a57d-dd55-40cd-8308-118abcf9774e */
   private Date actualArrivalDate;
   /** 预计离开时间
    * 
    * @pdOid 4340cf26-8f47-47bb-8882-8c66fa6ba941 */
   private Date expectDepartureDate;
   /** 实际离开时间
    * 
    * @pdOid f44c2b29-fd85-4d6d-a256-cb04869ccfe4 */
   private Date actualDepartureDate;
   /** 操作人
    * 
    * @pdOid 522f5754-f2c8-4dab-85d6-162e6fb3c190 */
   private String operationPerson;
   /** 类型 
    * 
    * @pdOid 3337855c-c8f7-4dac-9b00-e305b282be7d */
   private String logisticsType;
   
   /** @pdOid e3772aed-83ca-407e-bce7-41c907335c85 */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid e6a8b0fa-ecf3-42f3-8b69-aa883de1b3cd */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid c21509a6-e3ba-45d0-af32-21b642489fc3 */
   public String getLogisticsInt() {
      return logisticsInt;
   }
   
   /** @param newLogisticsInt
    * @pdOid b279747e-a485-4601-9f78-78597a20b7aa */
   public void setLogisticsInt(String newLogisticsInt) {
      logisticsInt = newLogisticsInt;
   }
   
   /** @pdOid 0b5a1f4e-56c4-4ae8-8a02-2cbb9dbe0863 */
   public String getCompanyName() {
      return companyName;
   }
   
   /** @param newCompanyName
    * @pdOid 51965e39-cfb8-4c42-9263-1371f5346eb0 */
   public void setCompanyName(String newCompanyName) {
      companyName = newCompanyName;
   }
   
   /** @pdOid 6068068e-6f7e-42b1-8015-4c141e7dfbbd */
   public Date getExpectArrivalDate() {
      return expectArrivalDate;
   }
   
   /** @param newExpectArrivalDate
    * @pdOid 861db09f-550e-48bc-8994-587e50340037 */
   public void setExpectArrivalDate(Date newExpectArrivalDate) {
      expectArrivalDate = newExpectArrivalDate;
   }
   
   /** @pdOid ff39d065-edc1-43ed-9f8f-6352cf9ce745 */
   public Date getActualArrivalDate() {
      return actualArrivalDate;
   }
   
   /** @param newActualArrivalDate
    * @pdOid dc9362d8-3a37-49b8-9034-a151329ef5b7 */
   public void setActualArrivalDate(Date newActualArrivalDate) {
      actualArrivalDate = newActualArrivalDate;
   }
   
   /** @pdOid 5b5960fa-f2b5-46e8-ac18-815c099eef39 */
   public Date getExpectDepartureDate() {
      return expectDepartureDate;
   }
   
   /** @param newExpectDepartureDate
    * @pdOid 593b16a8-f0ed-4046-b299-2c3d0878668e */
   public void setExpectDepartureDate(Date newExpectDepartureDate) {
      expectDepartureDate = newExpectDepartureDate;
   }
   
   /** @pdOid 76ecfed0-1a62-442b-8f04-0ec2fe5bb964 */
   public Date getActualDepartureDate() {
      return actualDepartureDate;
   }
   
   /** @param newActualDepartureDate
    * @pdOid 75431494-dcc4-4d17-9128-189bf1dd5ef8 */
   public void setActualDepartureDate(Date newActualDepartureDate) {
      actualDepartureDate = newActualDepartureDate;
   }
   
   /** @pdOid 0dca0484-f922-41f9-a9f6-d4c8db3de48d */
   public String getOperationPerson() {
      return operationPerson;
   }
   
   /** @param newOperationPerson
    * @pdOid dac42875-a426-45e1-9f03-54fc1d69a2d1 */
   public void setOperationPerson(String newOperationPerson) {
      operationPerson = newOperationPerson;
   }
   
   /** @pdOid da6ba9bd-a624-4046-9c38-37562540747b */
   public String getLogisticsType() {
      return logisticsType;
   }
   
   /** @param newLogisticsType
    * @pdOid 2f84662c-d0bb-4be4-a0eb-999e810aca2a */
   public void setLogisticsType(String newLogisticsType) {
      logisticsType = newLogisticsType;
   }

}