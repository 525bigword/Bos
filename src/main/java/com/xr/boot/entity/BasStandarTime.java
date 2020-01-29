package com.xr.boot.entity; /***********************************************************************
 * Module:  BasStandarTime.java
 * Author:  Administrator
 * Purpose: Defines the Class BasStandarTime
 ***********************************************************************/

import java.io.Serializable;

/** 收派时间表
 * 
 * @pdOid 883fde5c-2bd2-4fd3-83ac-adc90f40dff1 */
public class BasStandarTime implements Serializable {
   /** 编号	自增
    * 
    * @pdOid 5fa06b47-0937-4e04-9a6f-b9eddf547a14 */
   private int id;
   /** 时间名称	唯一
    * 
    * @pdOid e525109e-9614-4528-b3c9-09cd707d567b */
   private String timeName;
   private SyUnits syUnits;
   /** 平时上班时间	只需要时分，不需要日期
    * 
    * @pdOid e3306cf4-d94a-4836-83db-6b04060894c7 */
   private String workingTime;
   /** 平时下班时间	只需要时分，不需要日期
    * 
    * @pdOid adc5d414-f75a-4fd4-bf26-a21ceb74c9d7 */
   private String closingTime;
   /** 周六上班时间	只需要时分，不需要日期
    * 
    * @pdOid e54b5a07-3b4a-4afd-8829-a77cbc02762c */
   private String saturdayWorkingTime;
   /** 周六下班时间	只需要时分，不需要日期
    * 
    * @pdOid e6966d0a-1942-448b-b3b8-fa5848aef39a */
   private String saturdayClosingTime;
   /** 周日上班时间	只需要时分，不需要日期
    * 
    * @pdOid 181b5254-354a-48c3-b1c2-f71cff817b25 */
   private String sundayWorkingTime;
   /** 周日下班时间	只需要时分，不需要日期
    * 
    * @pdOid a9401b90-f15e-44e2-91ee-8d3a2ded317c */
   private String sundayClosingTime;
   /** 状态	0：正常，1：停用
    * 
    * @pdOid 0151a5a1-0d1d-4248-93cb-f67ca65a64ac */
   private long stats;
   public  long getunitId(){
      return syUnits.getId();
   }
   public BasStandarTime(){}

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getTimeName() {
      return timeName;
   }

   public void setTimeName(String timeName) {
      this.timeName = timeName;
   }

   public SyUnits getSyUnits() {
      return syUnits;
   }

   public void setSyUnits(SyUnits syUnits) {
      this.syUnits = syUnits;
   }

   public String getWorkingTime() {
      return workingTime;
   }

   public void setWorkingTime(String workingTime) {
      this.workingTime = workingTime;
   }

   public String getClosingTime() {
      return closingTime;
   }

   public void setClosingTime(String closingTime) {
      this.closingTime = closingTime;
   }

   public String getSaturdayWorkingTime() {
      return saturdayWorkingTime;
   }

   public void setSaturdayWorkingTime(String saturdayWorkingTime) {
      this.saturdayWorkingTime = saturdayWorkingTime;
   }

   public String getSaturdayClosingTime() {
      return saturdayClosingTime;
   }

   public void setSaturdayClosingTime(String saturdayClosingTime) {
      this.saturdayClosingTime = saturdayClosingTime;
   }

   public String getSundayWorkingTime() {
      return sundayWorkingTime;
   }

   public void setSundayWorkingTime(String sundayWorkingTime) {
      this.sundayWorkingTime = sundayWorkingTime;
   }

   public String getSundayClosingTime() {
      return sundayClosingTime;
   }

   public void setSundayClosingTime(String sundayClosingTime) {
      this.sundayClosingTime = sundayClosingTime;
   }

   public long getStats() {
      return stats;
   }

   public void setStats(long stats) {
      this.stats = stats;
   }
}