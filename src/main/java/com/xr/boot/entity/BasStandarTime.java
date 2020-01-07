package com.xr.boot.entity; /***********************************************************************
 * Module:  BasStandarTime.java
 * Author:  Administrator
 * Purpose: Defines the Class BasStandarTime
 ***********************************************************************/

import java.util.*;

/** 收派时间表
 * 
 * @pdOid 883fde5c-2bd2-4fd3-83ac-adc90f40dff1 */
public class BasStandarTime {
   /** 编号	自增
    * 
    * @pdOid 5fa06b47-0937-4e04-9a6f-b9eddf547a14 */
   private int id;
   /** 时间名称	唯一
    * 
    * @pdOid e525109e-9614-4528-b3c9-09cd707d567b */
   private String timeName;
   /** 平时上班时间	只需要时分，不需要日期
    * 
    * @pdOid e3306cf4-d94a-4836-83db-6b04060894c7 */
   private Date workingTime;
   /** 平时下班时间	只需要时分，不需要日期
    * 
    * @pdOid adc5d414-f75a-4fd4-bf26-a21ceb74c9d7 */
   private Date closingTime;
   /** 周六上班时间	只需要时分，不需要日期
    * 
    * @pdOid e54b5a07-3b4a-4afd-8829-a77cbc02762c */
   private Date saturdayWorkingTime;
   /** 周六下班时间	只需要时分，不需要日期
    * 
    * @pdOid e6966d0a-1942-448b-b3b8-fa5848aef39a */
   private Date saturdayClosingTime;
   /** 周日上班时间	只需要时分，不需要日期
    * 
    * @pdOid 181b5254-354a-48c3-b1c2-f71cff817b25 */
   private Date sundayWorkingTime;
   /** 周日下班时间	只需要时分，不需要日期
    * 
    * @pdOid a9401b90-f15e-44e2-91ee-8d3a2ded317c */
   private Date sundayClosingTime;
   /** 状态	0：正常，1：停用
    * 
    * @pdOid 0151a5a1-0d1d-4248-93cb-f67ca65a64ac */
   private long stats;
   
   /** @pdOid 6203b5e8-e2c9-4592-8356-1ade2bd882f6 */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 8a7fe55d-b461-4bc4-84d9-3050c8a7dcb2 */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid 2f40bb98-b445-415e-83b4-a94080da5697 */
   public String getTimeName() {
      return timeName;
   }
   
   /** @param newTimeName
    * @pdOid 01de0e06-b88c-4d08-966c-d6e613fc642a */
   public void setTimeName(String newTimeName) {
      timeName = newTimeName;
   }
   
   /** @pdOid 58ebbb1a-8764-429a-ae4e-cba18f646f82 */
   public Date getWorkingTime() {
      return workingTime;
   }
   
   /** @param newWorkingTime
    * @pdOid e6cff02f-ca75-41a1-8475-2380aa94d8ba */
   public void setWorkingTime(Date newWorkingTime) {
      workingTime = newWorkingTime;
   }
   
   /** @pdOid c7418044-1400-4e39-8efe-2b95b371152d */
   public Date getClosingTime() {
      return closingTime;
   }
   
   /** @param newClosingTime
    * @pdOid 115a971f-dc8d-407f-84c1-129aec05268b */
   public void setClosingTime(Date newClosingTime) {
      closingTime = newClosingTime;
   }
   
   /** @pdOid 1acc5c27-876e-489d-9a35-3509d1ff8272 */
   public Date getSaturdayWorkingTime() {
      return saturdayWorkingTime;
   }
   
   /** @param newSaturdayWorkingTime
    * @pdOid 2ec9be94-3598-4f4f-82b4-7b69190bd0e7 */
   public void setSaturdayWorkingTime(Date newSaturdayWorkingTime) {
      saturdayWorkingTime = newSaturdayWorkingTime;
   }
   
   /** @pdOid 43af38e9-ebcd-45a9-8160-329119ffe94f */
   public Date getSaturdayClosingTime() {
      return saturdayClosingTime;
   }
   
   /** @param newSaturdayClosingTime
    * @pdOid 2311f546-f254-4d89-a615-f6a415d86275 */
   public void setSaturdayClosingTime(Date newSaturdayClosingTime) {
      saturdayClosingTime = newSaturdayClosingTime;
   }
   
   /** @pdOid 93fdfe81-b4b5-4a76-a864-2298f6c1d0a3 */
   public Date getSundayWorkingTime() {
      return sundayWorkingTime;
   }
   
   /** @param newSundayWorkingTime
    * @pdOid 5b212e06-ddf9-47a1-bba5-2a62e224b95d */
   public void setSundayWorkingTime(Date newSundayWorkingTime) {
      sundayWorkingTime = newSundayWorkingTime;
   }
   
   /** @pdOid 2b21e2fd-3c8e-4109-b26b-c877ed081a04 */
   public Date getSundayClosingTime() {
      return sundayClosingTime;
   }
   
   /** @param newSundayClosingTime
    * @pdOid 40c91777-1fec-404a-8d72-e3882fb784d7 */
   public void setSundayClosingTime(Date newSundayClosingTime) {
      sundayClosingTime = newSundayClosingTime;
   }
   
   /** @pdOid 02b179e4-0cba-40e6-9e96-899c51a2bf7d */
   public long getStats() {
      return stats;
   }
   
   /** @param newStats
    * @pdOid d8b617c1-8630-4ab2-8bc6-3c60cc3d875f */
   public void setStats(long newStats) {
      stats = newStats;
   }

}