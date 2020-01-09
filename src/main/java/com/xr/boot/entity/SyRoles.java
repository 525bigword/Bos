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

   
   /** @pdOid f300bf9b-31ef-402f-8d96-166c82b4f805 */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid f58f39f3-15ac-42af-a210-ab35dca61ee0 */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 979e714d-c986-4c22-a0f8-a0aad2c1bcd6 */
   public String getRoleName() {
      return roleName;
   }
   
   /** @param newRoleName
    * @pdOid 2ba37f33-26c0-4784-aee6-b8db1a998755 */
   public void setRoleName(String newRoleName) {
      roleName = newRoleName;
   }
   
   /** @pdOid 86ff4f18-c61b-4b4e-a0af-4cf5a0df65c4 */
   public String getRoleDesc() {
      return roleDesc;
   }
   
   /** @param newRoleDesc
    * @pdOid 0d625ae7-e81e-468c-b4fd-a1eaa796e3cd */
   public void setRoleDesc(String newRoleDesc) {
      roleDesc = newRoleDesc;
   }
   
   /** @pdOid 8284feb3-2e74-4196-8d3d-1bf70bfb208c */
   public Integer getDisabled() {
      return disabled;
   }
   
   /** @param newDisabled
    * @pdOid 67246a3b-ca5f-4649-a181-5d4bb5b251dd */
   public void setDisabled(Integer newDisabled) {
      disabled = newDisabled;
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