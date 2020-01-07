package com.xr.boot.entity; /***********************************************************************
 * Module:  SyRolesMenus.java
 * Author:  Administrator
 * Purpose: Defines the Class SyRolesMenus
 ***********************************************************************/

import java.util.*;

/** 角色权限表
 * 
 * @pdOid b44d543b-16bc-4751-a5bb-0e65af9d4eb4 */
public class SyRolesMenus {
   /** 编号	自增
    * 
    * @pdOid fcbbdf8e-6764-4900-9795-ec52f8f26f31 */
   private long id;
   /** @pdOid d7cc9786-f9eb-4dd4-848e-3c0dc791244c */
   private SyRoles roleNames;
   /** @pdOid 8f66f442-d059-4110-abbd-82597607a23e */
   private SyMenus menuNames;
   
   /** @pdOid c31537a1-63a9-4fc8-942a-e7b41f58aa14 */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 4a37915d-92da-44e5-9507-3a14cb9e7f08 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 561fe296-8df1-40a1-be33-45db80cc2bd6 */
   public SyRoles getRoleNames() {
      return roleNames;
   }
   
   /** @param newRoleNames
    * @pdOid 51c0ef49-0435-46de-8574-097d25dfd3f2 */
   public void setRoleNames(SyRoles newRoleNames) {
      roleNames = newRoleNames;
   }
   
   /** @pdOid 4b5ea540-7777-4436-8eac-c68409d1dc73 */
   public SyMenus getMenuNames() {
      return menuNames;
   }
   
   /** @param newMenuNames
    * @pdOid af5392c6-a8c5-47e7-9b46-7d6cd361b568 */
   public void setMenuNames(SyMenus newMenuNames) {
      menuNames = newMenuNames;
   }

}