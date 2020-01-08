package com.xr.boot.entity; /***********************************************************************
 * Module:  SyEmp.java
 * Author:  Administrator
 * Purpose: Defines the Class SyEmp
 ***********************************************************************/

import java.io.Serializable;

/** 员工表
 *
 * @pdOid 84cc1890-5ed5-4982-89a4-e581e4cea20e */
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
   /** 备注
    *
    * @pdOid c3d9d00c-3118-4124-9e99-eacf58b281cb */
   private String remark;
   /** 禁用  1可使用 0已禁用
    *
    * @pdOid c277c848-3602-4104-96cb-358b8c0678cd */
   private long disabled;
   public SyEmp(){}

   public SyEmp(long id, String empName, String empNo, String pwd, String queryPwd, String remark, long disabled) {
      this.id = id;
      this.empName = empName;
      this.empNo = empNo;
      this.pwd = pwd;
      this.queryPwd = queryPwd;
      this.remark = remark;
      this.disabled = disabled;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getEmpName() {
      return empName;
   }

   public void setEmpName(String empName) {
      this.empName = empName;
   }

   public String getEmpNo() {
      return empNo;
   }

   public void setEmpNo(String empNo) {
      this.empNo = empNo;
   }

   public String getPwd() {
      return pwd;
   }

   public void setPwd(String pwd) {
      this.pwd = pwd;
   }

   public String getQueryPwd() {
      return queryPwd;
   }

   public void setQueryPwd(String queryPwd) {
      this.queryPwd = queryPwd;
   }

   public String getRemark() {
      return remark;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public long getDisabled() {
      return disabled;
   }

   public void setDisabled(long disabled) {
      this.disabled = disabled;
   }
}