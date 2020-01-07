package com.xr.boot.entity; /***********************************************************************
 * Module:  BasDeliveryStandard.java
 * Author:  Administrator
 * Purpose: Defines the Class BasDeliveryStandard
 ***********************************************************************/

import java.util.*;

/** 收派标准表
 * 
 * @pdOid b03c4861-46d7-46c4-be12-e20fb970057d */
public class BasDeliveryStandard {
   /** 基本档案编号
    * 
    * @pdOid d684cae4-93c6-45cd-9a51-51b4643f7263 */
   private String basicFileNumber;
   /** 收派标准名称	唯一
    * 
    * @pdOid 267efd5b-8805-4afe-9398-6be680588f5b */
   private String name;
   /** 最小重量	非负数
    * 
    * @pdOid 67ca885b-75d7-4289-9292-0d0068ca8a96 */
   private double minWeight;
   /** 最大重量	非负数且必须大于最小重量
    * 
    * @pdOid d0af09d2-b834-4d32-a653-105fc811575c */
   private double maxWeight;
   /** 操作时间	当前操作时间
    * 
    * @pdOid 4551bfd0-37ee-4926-a5dc-0513aa4351c8 */
   private Date operationTime;
   /** 状态	0正常，1停用
    * 
    * @pdOid 92d2390d-40ab-448e-b92b-5ff0b9cb0857 */
   private long stats;
   
   /** @pdOid 61715f4e-f237-43d9-87a0-f5540daaa47b */
   public String getBasicFileNumber() {
      return basicFileNumber;
   }
   
   /** @param newBasicFileNumber
    * @pdOid f99ea116-7e63-4e89-b498-96c963e51a84 */
   public void setBasicFileNumber(String newBasicFileNumber) {
      basicFileNumber = newBasicFileNumber;
   }
   
   /** @pdOid f404810a-a07f-4a51-963d-4872d878ca79 */
   public String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid afd9619b-6ed1-494a-ba92-468995b6626a */
   public void setName(String newName) {
      name = newName;
   }
   
   /** @pdOid 5fe1f06d-d51a-42e8-bda6-cd20298a9a91 */
   public double getMinWeight() {
      return minWeight;
   }
   
   /** @param newMinWeight
    * @pdOid f732777f-8276-4231-9b15-dc66507de493 */
   public void setMinWeight(double newMinWeight) {
      minWeight = newMinWeight;
   }
   
   /** @pdOid d3488dd7-8a65-4fec-860a-a8332cfff3f4 */
   public double getMaxWeight() {
      return maxWeight;
   }
   
   /** @param newMaxWeight
    * @pdOid 0413d574-478b-4dff-9344-7c5fdbd57c66 */
   public void setMaxWeight(double newMaxWeight) {
      maxWeight = newMaxWeight;
   }
   
   /** @pdOid 55a36d5b-61f3-4450-a10c-77ba3dd9f5f3 */
   public Date getOperationTime() {
      return operationTime;
   }
   
   /** @param newOperationTime
    * @pdOid f76b83db-9215-4a80-8653-0780eca219f9 */
   public void setOperationTime(Date newOperationTime) {
      operationTime = newOperationTime;
   }
   
   /** @pdOid 7d98bcad-0781-4820-bc73-d5f6a8cf954e */
   public long getStats() {
      return stats;
   }
   
   /** @param newStats
    * @pdOid b9ad0764-921c-4385-9863-cf0e677731fc */
   public void setStats(long newStats) {
      stats = newStats;
   }

}