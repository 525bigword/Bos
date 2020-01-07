package com.xr.boot.entity; /***********************************************************************
 * Module:  IaeArrival.java
 * Author:  Administrator
 * Purpose: Defines the Class IaeArrival
 ***********************************************************************/

import java.util.*;

/** 进港表
 * 
 * @pdOid 7caaa736-0def-4f82-8f3d-aa996b933611 */
public class IaeArrival {
   /** 工作单号    雪花算法十
    * 
    * @pdOid 3fcaf63e-3df7-4275-9a1e-6758e18cf37f */
   public String id;
   /** 派送单位
    * 
    * @pdOid cd4283dc-4050-4b8e-a008-84a0c6e2b6ea */
   public String sendCompany;
   /** 货物地址
    * 
    * @pdOid 954d80c0-27e2-4ea7-a465-76aa655bfa2e */
   public String cargoAddress;
   /** 分单人
    * 
    * @pdOid 3d57c5be-2022-440c-9cff-493c31b26a53 */
   public String issuePerson;
   /** 分单时间
    * 
    * @pdOid 27b0ad9d-d7db-4fe2-a459-99847f17dff9 */
   public Date issueDate;
   /** 入库运转中心
    * 
    * @pdOid 7bb578ec-5334-40c3-b49e-77e51ee2cd66 */
   public String workAddress;
   /** 入库时间
    * 
    * @pdOid 820f08e1-025e-4306-a0e8-c97f7726e38d */
   public Date storageDate;
   /** 出库时间
    * 
    * @pdOid cf97738b-a755-4fb7-887f-a22fe590fab9 */
   public Date outBoundDate;
   /** 送达时限
    * 
    * @pdOid 874a2148-a21f-42ef-8f50-edf5371db2b1 */
   public Date timeLimit;
   /** 进港分拨批次
    * 
    * @pdOid 06faaaec-27d2-41fb-bafc-3bc2f707e8e4 */
   public Date batch;

}