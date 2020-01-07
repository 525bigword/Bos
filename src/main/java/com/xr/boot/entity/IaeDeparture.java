package com.xr.boot.entity; /***********************************************************************
 * Module:  IaeDeparture.java
 * Author:  Administrator
 * Purpose: Defines the Class IaeDeparture
 ***********************************************************************/

import java.util.*;

/** 单货异常监控表
 * 
 * @pdOid 8c0f1375-11bb-48a5-b36a-0c26c854b665 */
public class IaeDeparture {
   /** 工作单号
    * 
    * @pdOid 180696e7-4709-4a97-aa3a-46b3aa222f9e */
   public String id;
   /** 合包号
    * 
    * @pdOid 5e808474-f31e-4b39-9048-14f806948ea2 */
   public String packingID;
   /** 中转
    * 
    * @pdOid 4a4eb028-34c3-4c75-bea1-154f3aa0c074 */
   public long transfer;
   /** 实际数量
    * 
    * @pdOid 0de5a837-4e96-4eae-96aa-e1938433958d */
   public int actualCount;
   /** 到达地
    * 
    * @pdOid 29060cda-d2d1-4022-8111-e58dc0dd4313 */
   public String destination;
   /** 商品名
    * 
    * @pdOid 3f00e5c9-2fdb-473e-97b2-d8f1070ed239 */
   public int wareName;
   /** 件数
    * 
    * @pdOid 249d4dea-2ebf-4f89-ae1d-afb5001325aa */
   public int cargoCount;
   /** 重量
    * 
    * @pdOid b416ae69-3c71-4a95-bc4d-b98ce7edb3ce */
   public double weight;
   /** 体积
    * 
    * @pdOid 6b3385d0-c732-412d-bde2-1f07e5327c9b */
   public double volume;
   /** 实际体积
    * 
    * @pdOid e857939d-01ab-419b-b480-1766e8eacb93 */
   public double actualVolume;
   /** 送达时限
    * 
    * @pdOid 940ce3ef-2931-41e0-903d-0717ee8cf85e */
   public Date timeLimit;
   /** 配置要求
    * 
    * @pdOid b674203b-6287-406c-8f1a-e707d100eb89 */
   public String ask;
   /** 收货人
    * 
    * @pdOid 2d0b440f-099a-43d6-8685-a26ac560b3d6 */
   public String takeCargoPerson;
   /** 收货地址
    * 
    * @pdOid ed37ef41-6de9-418e-8004-d6b55b5d5954 */
   public String tackCargoAddress;
   /** 到付款
    * 
    * @pdOid 5f5306a8-703f-4a36-a0de-2c8c4857ffe6 */
   public int payment;
   /** 重要提示
    * 
    * @pdOid e3d44121-7d8d-49f1-a397-8221a0ee353f */
   public String importantHints;
   /** 剩余时间
    * 
    * @pdOid 49275516-19f0-44f1-96ef-a4d70af30a07 */
   public Date surplusTime;
   /** 委托单位
    * 
    * @pdOid 8c32957e-4bb4-467b-827d-183da2ddc1c6 */
   public String entrustCompany;

}