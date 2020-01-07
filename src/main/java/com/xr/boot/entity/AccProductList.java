package com.xr.boot.entity; /***********************************************************************
 * Module:  AccProductList.java
 * Author:  Administrator
 * Purpose: Defines the Class AccProductList
 ***********************************************************************/

import java.util.*;

/** 产品表
 * 
 * @pdOid 882f4f89-7cdf-4cd0-accc-e4b3f86cc9de */
public class AccProductList {
   /** 主键序列
    * 
    * @pdOid 7477350d-733e-4d2b-9eeb-b65628bf5b49 */
   private long id;
   /** 产品名
    * 
    * @pdOid b8b14c95-3cd9-4ebf-9a71-0ef2719923fd */
   private String produceName;
   
   /** @pdOid 9b83cdca-571b-4fbb-9e41-8035213787bc */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 5a33a42c-1716-406c-8ae3-5ea221b2b9e3 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 0d2b1e88-4c8d-473e-9d9a-3e389afdb0eb */
   public String getProduceName() {
      return produceName;
   }
   
   /** @param newProduceName
    * @pdOid 1ff55033-8205-4285-8a1b-0ed552c428d4 */
   public void setProduceName(String newProduceName) {
      produceName = newProduceName;
   }

}