package com.xr.boot.entity; /***********************************************************************
 * Module:  AccDataState.java
 * Author:  Administrator
 * Purpose: Defines the Class AccDataState
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** 数据状态表
 * 
 * @pdOid 3c343d01-0a96-424f-a7f7-52ea7b10d211 */
public class AccDataState implements Serializable {
   /** 主键序列
    * 
    * @pdOid 558d2696-5a24-49ba-86d0-f045b405262e */
   private long id;
   /** 数据状态
    * 
    * @pdOid aae49cca-16d4-4c48-b6e7-6583c375f57f */
   private String dataState;
   
   /** @pdOid 363c4dea-2a04-40ca-b6cd-02d586785e5c */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid ca894078-3950-4913-96f7-c77c86eddaa9 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 2bbebb2f-4c7b-43f5-9bfd-245d5d8dcc5d */
   public String getDataState() {
      return dataState;
   }
   
   /** @param newDataState
    * @pdOid f8dbf880-c8bd-45f6-b42c-c063129a8667 */
   public void setDataState(String newDataState) {
      dataState = newDataState;
   }

}