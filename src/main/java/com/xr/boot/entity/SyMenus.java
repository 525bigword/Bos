package com.xr.boot.entity; /***********************************************************************
 * Module:  SyMenus.java
 * Author:  Administrator
 * Purpose: Defines the Class SyMenus
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** 角色栏目表(权限表)
 * 
 * @pdOid 84ae4f40-c0f2-4ac1-8dd1-66235eef0a70 */
public class SyMenus implements Serializable {
   /** 编号  自增
    * 
    * @pdOid efffef50-3bd0-4f46-b632-956359a81631 */
   private long id;
   /** 上级栏目编号	Menus表ID
    * 
    * @pdOid 98189cb0-0713-44a8-b99b-a2f88cbd308c */
   private String parentID;
   /** 栏目类型
    * 
    * @pdOid 0a543198-04fa-4c72-b5a4-d97d816b812f */
   private String type;
   /** 栏目名称
    * 
    * @pdOid 012aba1f-0da1-438c-9235-0847a4c6e14e */
   private String text;
   /** 栏目地址
    * 
    * @pdOid 5e7a560d-fbdb-4aa2-be6f-976ba3ad9cab */
   private String url;
   /** 栏目提示语
    * 
    * @pdOid 300cc816-f66b-4ebd-aaf5-fdec490c14ce */
   private String tip;
   
   /** @pdOid 4203d2f1-7c3a-45a4-b27d-2c6e1e1821dc */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 5a5dd93c-f811-4a80-8da8-2503dbe9b9c1 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid ace3344c-0a11-480c-8d13-6824761aca03 */
   public String getParentID() {
      return parentID;
   }
   
   /** @param newParentID
    * @pdOid 94aed87b-5fae-4375-8b77-ae89c6ab4b4e */
   public void setParentID(String newParentID) {
      parentID = newParentID;
   }
   
   /** @pdOid 071868db-a403-49c3-8c90-d3ba44a3dc69 */
   public String getType() {
      return type;
   }
   
   /** @param newType
    * @pdOid af595e69-3c4b-4a37-af04-810626b05308 */
   public void setType(String newType) {
      type = newType;
   }
   
   /** @pdOid 071d8343-c706-4364-80ee-ed1ad1c22075 */
   public String getText() {
      return text;
   }
   
   /** @param newText
    * @pdOid c0d4844c-723e-40ed-ae99-f49f00547d49 */
   public void setText(String newText) {
      text = newText;
   }
   
   /** @pdOid 6bc1e440-5249-4d07-a3f6-b6e2fa1703d5 */
   public String getUrl() {
      return url;
   }
   
   /** @param newUrl
    * @pdOid 7abbac7e-55e3-430d-829e-79e5787acac8 */
   public void setUrl(String newUrl) {
      url = newUrl;
   }
   
   /** @pdOid 277d6239-d196-4909-b0f0-8b2833ceddd9 */
   public String getTip() {
      return tip;
   }
   
   /** @param newTip
    * @pdOid e10fd546-ce5c-4134-913d-59cbd9773ca1 */
   public void setTip(String newTip) {
      tip = newTip;
   }

}