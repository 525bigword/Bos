package com.xr.boot.entity; /***********************************************************************
 * Module:  AccDocumentsState.java
 * Author:  Administrator
 * Purpose: Defines the Class AccDocumentsState
 ***********************************************************************/

import java.util.*;

/** 单据状态表
 * 
 * @pdOid 7c4b17ba-ce93-4180-9083-a6fbd0e15dc9 */
public class AccDocumentsState {
   /** 主键序列
    * 
    * @pdOid 5b768b84-13c5-46d0-a357-b99932c28ea8 */
   private long id;
   /** 单据状态
    * 
    * @pdOid 20852242-2935-442c-8b68-18711f3d98da */
   private String documentsState;
   
   /** @pdOid 649357a4-3bd9-407e-ba23-4ccaf363bf84 */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid cb7e383d-dbff-48dd-8831-c106f0c492db */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 2e5b95c0-ab1d-44ce-94ab-24c185966035 */
   public String getDocumentsState() {
      return documentsState;
   }
   
   /** @param newDocumentsState
    * @pdOid 46cbb791-dfd1-4036-be21-d02db841ec4b */
   public void setDocumentsState(String newDocumentsState) {
      documentsState = newDocumentsState;
   }

}