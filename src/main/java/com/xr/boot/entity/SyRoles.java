package com.xr.boot.entity; /***********************************************************************
 * Module:  SyRoles.java
 * Author:  Administrator
 * Purpose: Defines the Class SyRoles
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** 角色表
 * 
 * @pdOid 2f52fd7d-6069-4211-97ae-727bbb216ae4 */
public class SyRoles implements Serializable {
   private static final long serialVersionUID = -4397073850859386604L;
   /** 编号 自增
    * 
    * @pdOid 19a73d9e-524d-4190-be97-e72dc28e469f */
   private long id;
   /** 角色名称
    * 
    * @pdOid 2b6d8365-46f2-4727-bc04-6c77d427972f */
   private String roleName;
   /** 角色描述
    * 
    * @pdOid 96afdd25-d9c3-4593-8809-b16e35c0d838 */
   private String roleDesc;
   /** 禁用   1可使用 0已禁用
    * 
    * @pdOid 48ea153e-be2a-44ca-8a56-35ab0524a0cb */
   private Integer disabled;
   /**
    * 业务属性
    */
   private SyMenus syMenus;

   public SyMenus getSyMenus() {
      return syMenus;
   }

   public void setSyMenus(SyMenus syMenus) {
      this.syMenus = syMenus;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getRoleName() {
      return roleName;
   }

   public void setRoleName(String roleName) {
      this.roleName = roleName;
   }

   public String getRoleDesc() {
      return roleDesc;
   }

   public void setRoleDesc(String roleDesc) {
      this.roleDesc = roleDesc;
   }

   public Integer getDisabled() {
      return disabled;
   }

   public void setDisabled(Integer disabled) {
      this.disabled = disabled;
   }

   @Override
   public String toString() {
      return "SyRoles{" +
              "id=" + id +
              ", roleName='" + roleName + '\'' +
              ", roleDesc='" + roleDesc + '\'' +
              ", disabled=" + disabled +
              '}';
   }
}