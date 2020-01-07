package com.xr.boot.entity; /***********************************************************************
 * Module:  BasAssociatedAddress.java
 * Author:  Administrator
 * Purpose: Defines the Class BasAssociatedAddress
 ***********************************************************************/

import java.util.*;

/** 关联地址表
 * 
 * @pdOid f8da3956-d726-4b0e-8930-8010854dcda1 */
public class BasAssociatedAddress {
   /** 编号	自增
    * 
    * @pdOid 9449db86-20e7-4453-a32c-dbd721f1cb50 */
   private long id;
   /** 城市
    * 
    * @pdOid b6c8b600-8e40-4e55-819b-0b50d572e1c8 */
   private String city;
   /** 客户地址
    * 
    * @pdOid 715b1b96-b9c6-4177-8696-05f9351a0cf1 */
   private String customAddress;
   
   /** @pdOid 64bbb1d7-86ce-4e49-8a4f-7168eb3bb35a */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 241afe09-e7fc-45cf-9f98-bf986c882b09 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 8276b6cd-c824-428b-abcb-7c9d82767c3f */
   public String getCity() {
      return city;
   }
   
   /** @param newCity
    * @pdOid f08cf017-a880-4fc7-b59f-ea20e006c581 */
   public void setCity(String newCity) {
      city = newCity;
   }
   
   /** @pdOid 1ed9f48e-9716-49a6-8221-f908480feb5a */
   public String getCustomAddress() {
      return customAddress;
   }
   
   /** @param newCustomAddress
    * @pdOid a7289842-0eec-48b3-9d21-d2b84981c25f */
   public void setCustomAddress(String newCustomAddress) {
      customAddress = newCustomAddress;
   }

}