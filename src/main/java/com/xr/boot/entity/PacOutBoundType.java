package com.xr.boot.entity; /***********************************************************************
 * Module:  PacOutBoundTypeMapper.java
 * Author:  Administrator
 * Purpose: Defines the Class PacOutBoundTypeMapper
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** 包装材料出库类型表
 * 
 * @pdOid bcfc9295-ca95-4c7f-84bc-0c0791b02947 */
public class PacOutBoundType implements Serializable {
   private static final long serialVersionUID = 4327398225527680809L;
   /** @pdOid 5729ffbe-f67c-4b34-947c-519a352741d2 */
   private long id;
   /** @pdOid eb8be6d9-fd0f-4363-9d03-6d7387b2b75f */
   private String outBoundType;
   
   /** @pdOid d1d4a6fc-7699-4edc-808b-2068a2afdd91 */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid ada93985-f89a-445a-af14-39d0264ab9b5 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid ef1d39d3-7e6a-4b1f-b87f-ab32ce67935c */
   public String getOutBoundType() {
      return outBoundType;
   }
   
   /** @param newOutBoundType
    * @pdOid ce19dc96-21c5-40e5-9d91-bf1c1bc67d1c */
   public void setOutBoundType(String newOutBoundType) {
      outBoundType = newOutBoundType;
   }

}