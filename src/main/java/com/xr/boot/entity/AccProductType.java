package com.xr.boot.entity; /***********************************************************************
 * Module:  AccProductType.java
 * Author:  Administrator
 * Purpose: Defines the Class AccProductType
 ***********************************************************************/

import java.util.*;

/** 产品类别表
 * 
 * @pdOid 041c0014-7a03-404f-9b7f-40f38de91569 */
public class AccProductType {
   /** 主键序列
    * 
    * @pdOid a766e1c7-a40c-4d30-8ee8-c0a1bd2e620f */
   private long id;
   /** 产品类别
    * 
    * @pdOid eabf8947-0467-4318-8f1e-aa56de8299f6 */
   private String produceType;
   
   /** @pdOid 24e1b304-20bd-48be-b889-8594db7c7b16 */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 190fcc07-2126-4b9e-88f2-4aceb8487a13 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 68a41494-2539-41b8-bfee-fe2c611b2c22 */
   public String getProduceType() {
      return produceType;
   }
   
   /** @param newProduceType
    * @pdOid 19a2334a-cd8e-4e10-8b4d-d406ae2d54bd */
   public void setProduceType(String newProduceType) {
      produceType = newProduceType;
   }

}