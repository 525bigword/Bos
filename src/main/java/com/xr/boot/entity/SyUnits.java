package com.xr.boot.entity; /***********************************************************************
 * Module:  SyUnits.java
 * Author:  Administrator
 * Purpose: Defines the Class SyUnits
 ***********************************************************************/

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

/** 员工单位表 用户单位表
 *
 * @pdOid d2aebf06-aa88-4cdc-b0ca-53e9044fcb04 */
@Component
public class SyUnits implements Serializable {
   private static final long serialVersionUID = -4695670349422002294L;
   /** 编号	自增
    *
    * @pdOid bc8c3015-7113-4a13-983e-25e87b613cb0 */
   private long id;
   /** 单位名称
    *
    * @pdOid 7e07b0ec-433f-4012-b8f1-d60d4bda25b2 */
      private String name;
   private Integer operatorid;
   private Integer parentid;
   /** 备注
    *
    * @pdOid 2e216151-f182-4c9b-bb4a-3b58c05116ee */
   private String remarks;
   /** 操作时间	当前操作时间
    *
    * @pdOid cd32d194-c726-4c58-ab11-16fd1b9e74f5 */
   private String operationTime;
   /** 状态	0：正常，1：停用
    *
    * @pdOid 6dcd1ed3-c25f-4989-a9ac-3f6114989fe3 */
   private Integer stats;
   private String operatorname;
   public  SyUnits(){}

   public String getoperatorname() {
      return operatorname;
   }

   public void setOperatorName(String operatorname) {
      this.operatorname = operatorname;
   }

   /** @pdRoleInfo migr=no name=PacPackagingMateriarOutBoundFrom assc=reference65 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public Collection<PacPackagingMateriarOutBoundFrom> pacPackagingMateriarOutBoundFrom;

   /** @pdOid 10220544-0d27-4996-bd64-bd960169e464 */
   public long getId() {
      return id;
   }

   public Integer getOperatorid() {
      return operatorid;
   }

   public void setOperatorid(Integer operatorid) {
      this.operatorid = operatorid;
   }

   /** @param newId
    * @pdOid a485fa1e-d832-4d1d-b62c-677809ca4a0c */
   public void setId(long newId) {
      id = newId;
   }

   /** @pdOid 73da11a1-9cce-43ef-a2f9-f8fbaa86a422 */
   public String getName() {
      return name;
   }

   public Integer getParentid() {
      return parentid;
   }

   public void setParentid(Integer parentid) {
      this.parentid = parentid;
   }

   /** @param newName
    * @pdOid 0ff6e675-215c-42b5-9903-aa8235988f1c */
   public void setName(String newName) {
      name = newName;
   }

   /** @pdOid 448f7673-abe8-44e5-81d3-c6501a2356aa */
   public String getRemarks() {
      return remarks;
   }

   /** @param newRemarks
    * @pdOid 78b6a187-0863-4c9f-99cd-37d392a84cba */
   public void setRemarks(String newRemarks) {
      remarks = newRemarks;
   }

   /** @pdOid 2675d95a-73ec-4e7d-a685-3fc56b4c1edf */
   public String getOperationTime() {
      return operationTime;
   }

   /** @param newOperationTime
    * @pdOid c66bccf9-d555-4d0f-be0a-9e8f734c8370 */
   public void setOperationTime(String newOperationTime) {
      operationTime = newOperationTime;
   }

   /** @pdOid 51188031-f3c4-4fc5-a954-652a7aecf58d */
   public Integer getStats() {
      return stats;
   }

   /** @param newStats
    * @pdOid d722c222-74f6-417f-a127-f688dd97a7cd */
   public void setStats(Integer newStats) {
      stats = newStats;
   }


   /** @pdGenerated default getter */
   public Collection<PacPackagingMateriarOutBoundFrom> getPacPackagingMateriarOutBoundFrom() {
      if (pacPackagingMateriarOutBoundFrom == null)
         pacPackagingMateriarOutBoundFrom = new HashSet<PacPackagingMateriarOutBoundFrom>();
      return pacPackagingMateriarOutBoundFrom;
   }

   /** @pdGenerated default iterator getter */
   public Iterator getIteratorPacPackagingMateriarOutBoundFrom() {
      if (pacPackagingMateriarOutBoundFrom == null)
         pacPackagingMateriarOutBoundFrom = new HashSet<PacPackagingMateriarOutBoundFrom>();
      return pacPackagingMateriarOutBoundFrom.iterator();
   }

   /** @pdGenerated default setter
    * @param newPacPackagingMateriarOutBoundFrom */
   public void setPacPackagingMateriarOutBoundFrom(Collection<PacPackagingMateriarOutBoundFrom> newPacPackagingMateriarOutBoundFrom) {
      removeAllPacPackagingMateriarOutBoundFrom();
      for (Iterator iter = newPacPackagingMateriarOutBoundFrom.iterator(); iter.hasNext();)
         addPacPackagingMateriarOutBoundFrom((PacPackagingMateriarOutBoundFrom)iter.next());
   }

   /** @pdGenerated default add
    * @param newPacPackagingMateriarOutBoundFrom */
   public void addPacPackagingMateriarOutBoundFrom(PacPackagingMateriarOutBoundFrom newPacPackagingMateriarOutBoundFrom) {
      if (newPacPackagingMateriarOutBoundFrom == null)
         return;
      if (this.pacPackagingMateriarOutBoundFrom == null)
         this.pacPackagingMateriarOutBoundFrom = new HashSet<PacPackagingMateriarOutBoundFrom>();
      if (!this.pacPackagingMateriarOutBoundFrom.contains(newPacPackagingMateriarOutBoundFrom))
      {
         this.pacPackagingMateriarOutBoundFrom.add(newPacPackagingMateriarOutBoundFrom);
         newPacPackagingMateriarOutBoundFrom.setSyUnits(this);
      }
   }

   /** @pdGenerated default remove
    * @param oldPacPackagingMateriarOutBoundFrom */
   public void removePacPackagingMateriarOutBoundFrom(PacPackagingMateriarOutBoundFrom oldPacPackagingMateriarOutBoundFrom) {
      if (oldPacPackagingMateriarOutBoundFrom == null)
         return;
      if (this.pacPackagingMateriarOutBoundFrom != null)
         if (this.pacPackagingMateriarOutBoundFrom.contains(oldPacPackagingMateriarOutBoundFrom))
         {
            this.pacPackagingMateriarOutBoundFrom.remove(oldPacPackagingMateriarOutBoundFrom);
            oldPacPackagingMateriarOutBoundFrom.setSyUnits((SyUnits)null);
         }
   }

   /** @pdGenerated default removeAll */
   public void removeAllPacPackagingMateriarOutBoundFrom() {
      if (pacPackagingMateriarOutBoundFrom != null)
      {
         PacPackagingMateriarOutBoundFrom oldPacPackagingMateriarOutBoundFrom;
         for (Iterator iter = getIteratorPacPackagingMateriarOutBoundFrom(); iter.hasNext();)
         {
            oldPacPackagingMateriarOutBoundFrom = (PacPackagingMateriarOutBoundFrom)iter.next();
            iter.remove();
            oldPacPackagingMateriarOutBoundFrom.setSyUnits((SyUnits)null);
         }
      }
   }

}