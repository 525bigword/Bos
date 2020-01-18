package com.xr.boot.entity; /***********************************************************************
 * Module:  PacStockMapper.java
 * Author:  Administrator
 * Purpose: Defines the Class PacStockMapper
 ***********************************************************************/

import io.swagger.models.auth.In;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.*;

/** 库存表
 * 
 * @pdOid 691e2f06-dddb-4a06-ba80-e9b9cb80eadf */
@Component
public class PacStock implements Serializable {
   private static final long serialVersionUID = 3575509107770414228L;
   private Integer id;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   /** 入库单号	唯一,雪花算法二十六
    * 
    * @pdOid 93e1decd-bfb6-4336-b264-de3127d0d675 */
   private String warehouseNo;
   /** 入库类型	1.初期库存、2.调拨入库
    * 3.下发入库、4.盘盈调整
    * 
    * @pdOid 9aecc3fb-dda5-40c5-a4ec-e0bb6c5c5c6c */
  /* private long reservoirType;*/
   private PacGetBoundType pacGetBoundType;

   public PacGetBoundType getPacGetBoundType() {
      return pacGetBoundType;
   }

   public void setPacGetBoundType(PacGetBoundType pacGetBoundType) {
      this.pacGetBoundType = pacGetBoundType;
   }

   /** 运输单号
    * 
    * @pdOid 68f6fedd-dc0e-405a-827a-1cc1339d70c0 */
   private String transport;
   /** 所属单位	系统默认登录人所在单位
    * 
    * @pdOid 98d64a9e-48e2-4463-97ab-5cc1b5a14706 */
 private SyUnits syUnits;

   public SyUnits getSyUnits() {
      return syUnits;
   }

   public void setSyUnits(SyUnits syUnits) {
      this.syUnits = syUnits;
   }

   /** 开单人工号	登录人工号
    * 
    * @pdOid dd11e04a-b41a-4da0-b80b-5c233a2de100 */
   private String drawerNo;
   /** 开单人姓名	登录人姓名
    * 
    * @pdOid 3a6c46f8-4570-44f3-a9b9-1e81999864b8 */
   private String drawerName;
   /** 开单时间	服务器时间
    * 
    * @pdOid 493eddae-bf3f-4a6b-9e6d-899c79b2a054 */
   private Date drawerTime;
   /** 状态
    * 
    * @pdOid ac77c80f-5504-4705-8de4-a97f8c47821d */
   private long stats;
   /** 备注
    * 
    * @pdOid 816a4e2d-a751-49ae-9eda-eace5e65f030 */
   private String remark;
   
   /** @pdOid 7943f43b-ec9b-4615-894e-da7cb0356b49 */
   public String getRemark() {
      return remark;
   }
   
   /** @param newRemark
    * @pdOid 8aa64c43-b4b6-415a-ab48-1a1386d2dc0e */
   public void setRemark(String newRemark) {
      remark = newRemark;
   }
   
   /** @pdOid 791bab74-dc63-4ae6-a3cd-c29b69d608dc */
   public String getWarehouseNo() {
      return warehouseNo;
   }
   
   /** @param newWarehouseNo
    * @pdOid 62b260bc-d079-4f22-bfc4-7b4013a79498 */
   public void setWarehouseNo(String newWarehouseNo) {
      warehouseNo = newWarehouseNo;
   }
   
   /** @pdOid a8f6df9f-144b-4f30-b3ab-287c6eec0fda */
   public long getReservoirType() {
      return getPacGetBoundType().getPacGetid();
   }
   
   /** @param newReservoirType
    * @pdOid 132509e1-f4e0-4830-aa99-a35d4c7b3ed8 */

   /** @pdOid c25afbef-de1a-4320-94b5-e70b26fdaa39 */
   public String getTransport() {
      return transport;
   }
   
   /** @param newTransport
    * @pdOid 93edb668-ca95-45aa-9176-69b480355683 */
   public void setTransport(String newTransport) {
      transport = newTransport;
   }
   
   /** @pdOid 74025c7b-084b-446a-9a8c-774bc92df4fd */
   public long getSubordinateUnit() {
       if(getSyUnits()==null){}
      return getSyUnits().getId();
   }
   
   /** @param newSubordinateUnit
    * @pdOid fbe9c161-6d4e-43dc-9204-fbe2314f75e1 */

   /** @pdOid f0d622aa-ecd4-41e0-8dce-d9e7832cdd34 */
   public String getDrawerNo() {
      return drawerNo;
   }
   
   /** @param newDrawerNo
    * @pdOid ec735c5f-0982-483d-b0b5-0266c3f1ff25 */
   public void setDrawerNo(String newDrawerNo) {
      drawerNo = newDrawerNo;
   }
   
   /** @pdOid 2bb5fc2b-c999-4e43-9f01-f58aec07d6e3 */
   public String getDrawerName() {
      return drawerName;
   }
   
   /** @param newDrawerName
    * @pdOid cde565c9-8a9f-4acc-8ca3-e25384e99565 */
   public void setDrawerName(String newDrawerName) {
      drawerName = newDrawerName;
   }
   
   /** @pdOid 199db523-72b6-41ee-9d4f-a4c950640cf8 */
   public Date getDrawerTime() {
      return drawerTime;
   }
   
   /** @param newDrawerTime
    * @pdOid 7d66b6f7-75c8-4b7f-a2e8-acb0ce01b36b */
   public void setDrawerTime(Date newDrawerTime) {
      drawerTime = newDrawerTime;
   }
   
   /** @pdOid 570db42c-0cb1-413f-88b8-c33052682aa6 */
   public long getStats() {
      return stats;
   }
   
   /** @param newStats
    * @pdOid 02b59966-8c7e-4fb6-9d83-713082c458c1 */
   public void setStats(long newStats) {
      stats = newStats;
   }

    @Override
    public String toString() {
        return "PacStock{" +
                "id=" + id +
                ", warehouseNo='" + warehouseNo + '\'' +
                ", transport='" + transport + '\'' +
                ", drawerNo=" + drawerNo +
                ", drawerName='" + drawerName + '\'' +
                ", drawerTime=" + drawerTime +
                ", stats=" + stats +
                ", remark='" + remark + '\'' +
                '}';
    }
}