package com.xr.boot.entity; /***********************************************************************
 * Module:  SyEmp.java
 * Author:  Administrator
 * Purpose: Defines the Class SyEmp
 ***********************************************************************/

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.*;

/** 员工表
 * 
 * @pdOid 84cc1890-5ed5-4982-89a4-e581e4cea20e */
@Component
public class SyEmp implements Serializable {
   private static final long serialVersionUID = -3262474656539416214L;
   /** 编号 自增
    * 
    * @pdOid 813b9d26-d334-4a16-aecd-b9cd38a8112b */
   private long id;
   /** 员工姓名
    * 
    * @pdOid 0527082b-9426-4f34-bdb6-089082350ee4 */
   private String empName;
   /** 工号
    * 
    * @pdOid cd972f43-1b65-4e01-92ee-ba24cd6bb5c2 */
   private String empNo;
   /** 密码
    * 
    * @pdOid 0ee7ae80-fc38-4c50-8857-b3f427c771b7 */
   private String pwd;
   /** 查台密码   小件员查询时需要用到此密码
    * 
    * @pdOid 625f2e69-9b96-408b-993c-45eb749fb5e4 */
   private String queryPwd;
   private Integer roleid;
   //员工单位
   private Integer empunit;

   /** 备注
    * 
    * @pdOid c3d9d00c-3118-4124-9e99-eacf58b281cb */
   private String remark;
   /** 禁用  1可使用 0已禁用
    * 
    * @pdOid c277c848-3602-4104-96cb-358b8c0678cd */
   private Integer disabled;
   /**
    * 业务属性
    */
   private List<SyRolesMenus> syRolesMenus;
   private SyUnits syUnits;
   private SyRoles syRoles;
   private String rolename;
   public SyRoles getSyRoles() {
      return syRoles;
   }

   public void setSyRoles(SyRoles syRoles) {
      this.syRoles = syRoles;
   }


   public void setRolename(String rolename) {
      this.rolename = rolename;
   }

   public String getRolename() {
      return rolename;
   }

   public SyUnits getSyUnits() {
      return syUnits;
   }

   public void setSyUnits(SyUnits syUnits) {
      this.syUnits = syUnits;
   }

   @Override
   public String toString() {
      return "SyEmp{" +
              "id=" + id +
              ", empName='" + empName + '\'' +
              ", empNo='" + empNo + '\'' +
              ", pwd='" + pwd + '\'' +
              ", queryPwd='" + queryPwd + '\'' +
              ", roleid=" + roleid +
              ", empunit=" + empunit +
              ", remark='" + remark + '\'' +
              ", disabled=" + disabled +
              ", syRolesMenus=" + syRolesMenus +
              '}';
   }

   public Integer getRoleid() {
      return roleid;
   }

   public void setRoleid(Integer roleid) {
      this.roleid = roleid;
   }

   public Integer getEmpunit() {
      return empunit;
   }

   public void setEmpunit(Integer empunit) {
      this.empunit = empunit;
   }

   public List<SyRolesMenus> getSyRolesMenus() {
      return syRolesMenus;
   }

   public void setSyRolesMenus(List<SyRolesMenus> syRolesMenus) {
      this.syRolesMenus = syRolesMenus;
   }

   /** @pdOid 35ebd555-c558-49fc-9dd0-20f4c14cd9d4 */
   public long getId() {
      return id;
   }

   /** @param newId
    * @pdOid 94e92383-9ffa-44b8-af1b-630e7b1095c2 */
   public void setId(long newId) {
      id = newId;
   }

   /** @pdOid ecafae4f-23ea-412e-9d1a-b783caf17f3c */
   public String getEmpName() {
      return empName;
   }

   /** @param newEmpName
    * @pdOid fa3a1ee9-2e96-4274-9dc3-982c2116c929 */
   public void setEmpName(String newEmpName) {
      empName = newEmpName;
   }

   /** @pdOid f511dd7c-2ee0-4b50-809e-8c469f4dd9a8 */
   public String getEmpNo() {
      return empNo;
   }

   /** @param newEmpNo
    * @pdOid c772061e-28ab-40e6-bc30-c9bee18de0ad */
   public void setEmpNo(String newEmpNo) {
      empNo = newEmpNo;
   }

   /** @pdOid cb463957-1223-4c57-9a70-4819982eab57 */
   public String getPwd() {
      return pwd;
   }

   /** @param newPwd
    * @pdOid 5c880029-2e8c-4192-a41a-441bf3c41745 */
   public void setPwd(String newPwd) {
      pwd = newPwd;
   }

   /** @pdOid 3f2dda59-cf89-4e2a-a37b-7dae72a0987c */
   public String getQueryPwd() {
      return queryPwd;
   }

   /** @param newQueryPwd
    * @pdOid bcc4f85c-2c3b-4f4d-b2b6-d85d4c86fcdf */
   public void setQueryPwd(String newQueryPwd) {
      queryPwd = newQueryPwd;
   }
   
   /** @pdOid 7f9fcf81-f335-4705-a4bf-682625d3087e */
   public String getRemark() {
      return remark;
   }
   
   /** @param newRemark
    * @pdOid 43b771d8-768a-40f7-af25-977640e5848e */
   public void setRemark(String newRemark) {
      remark = newRemark;
   }
   
   /** @pdOid 272937f5-35dc-4cd2-9502-10cf0505fe2d */
   public Integer getDisabled() {
      return disabled;
   }

   /** @param newDisabled
    * @pdOid 08227057-08b7-4b47-88ef-fad95be8866c */
   public void setDisabled(Integer newDisabled) {
      disabled = newDisabled;
   }

}