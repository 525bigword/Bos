package com.xr.boot.entity; /***********************************************************************
 * Module:  SyRolesMenus.java
 * Author:  Administrator
 * Purpose: Defines the Class SyRolesMenus
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** 角色权限表
 * 
 * @pdOid b44d543b-16bc-4751-a5bb-0e65af9d4eb4 */
public class SyRolesMenus implements Serializable {
   private static final long serialVersionUID = 7164587616477181376L;
   /** 编号	自增
    * 
    * @pdOid fcbbdf8e-6764-4900-9795-ec52f8f26f31 */
   private long id;
   /** @pdOid d7cc9786-f9eb-4dd4-848e-3c0dc791244c */
   private Integer roleid;
   private Integer menuid;
   private SyRoles roleNames;
   /** @pdOid 8f66f442-d059-4110-abbd-82597607a23e */
   private List<SyMenus> menuNames;

   private SyMenus syMenus;

   public Integer getMenuid() {
      return menuid;
   }

   public void setMenuid(Integer menuid) {
      this.menuid = menuid;
   }

   public SyMenus getSyMenus() {
      return syMenus;
   }

   public void setSyMenus(SyMenus syMenus) {
      this.syMenus = syMenus;
   }

   public Integer getRoleid() {
      return roleid;
   }

   public void setRoleid(Integer roleid) {
      this.roleid = roleid;
   }


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
   public static long getSerialVersionUID() {
      return serialVersionUID;
   }

   @Override
   public String toString() {
      return "SyRolesMenus{" +
              "id=" + id +
              ", roleid=" + roleid +
              ", menuid=" + menuid +
              '}';
   }

   public SyRoles getRoleNames() {
      return roleNames;
   }

   public void setRoleNames(SyRoles roleNames) {
      this.roleNames = roleNames;
   }

   public List<SyMenus> getMenuNames() {
      return menuNames;
   }

   public void setMenuNames(List<SyMenus> menuNames) {
      this.menuNames = menuNames;
   }
}