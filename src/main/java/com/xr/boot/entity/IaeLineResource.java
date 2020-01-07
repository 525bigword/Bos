package com.xr.boot.entity; /***********************************************************************
 * Module:  IaeLineResource.java
 * Author:  Administrator
 * Purpose: Defines the Class IaeLineResource
 ***********************************************************************/

import java.util.*;

/** 配载线路资源表
 * 
 * @pdOid f8733199-10c9-462b-8d91-2bb0d767a5ef */
public class IaeLineResource {
   /** 工作单号，雪花算法五
    * 
    * @pdOid dbbb013e-c705-4eeb-822d-db680a07bff8 */
   public String id;
   /** 状态
    * 
    * @pdOid 0866c690-81ca-4789-bf48-746c88f8f6bb */
   public String resourceType;
   /** 到达口岸
    * 
    * @pdOid 8c21f19c-888e-4caf-bd90-a75907c25265 */
   public String port;
   /** 配载方式
    * 
    * @pdOid bab9b7c4-9779-489e-9688-25464932bc03 */
   public long demand;
   /** 航班车次
    * 
    * @pdOid 86a96d96-df1a-4681-bcb4-8357b40b5caf */
   public String vehicleInt;
   /** 运力
    * 
    * @pdOid 9e616230-8efb-4880-ad0e-6ed4b3bfb458 */
   public String capacity;
   /** 货票号，雪花算法零
    * 
    * @pdOid bcaf3874-2dfd-429b-985d-49e9e8a0fecd */
   public String waybillID;
   /** 承运商
    * 
    * @pdOid 5a910e62-423e-49ac-b673-b9c87bb68888 */
   public String carrier;
   /** 预计到港时间
    * 
    * @pdOid 325b1d3b-9199-4851-bbc3-e70227056457 */
   public Date expectArrivalDate;
   /** 预计离港时间
    * 
    * @pdOid 97c43c7b-81ac-42cf-a9b3-edcc9e9160a6 */
   public Date expectDepartureDate;
   /** 票数
    * 
    * @pdOid 0d2f20c8-9185-4a1f-94b6-6f8da6d48f7a */
   public int ticket;
   /** 件数
    * 
    * @pdOid f2495f36-c83c-4ff0-828c-6d76f8a10860 */
   public int cargo;
   /** 重量
    * 
    * @pdOid a700500e-1acf-448c-ace2-a5ce6ecacbcf */
   public double weight;
   /** 体积
    * 
    * @pdOid 5dc27daa-e38a-4814-87bb-1742454ff350 */
   public double volume;
   /** 处理人
    * 
    * @pdOid 3e7c4503-8c04-4a21-8ee4-0c51e4ec244d */
   public String handlePerson;
   /** 处理时间
    * 
    * @pdOid 42a16b56-c832-4ce6-bc80-7723001ad265 */
   public Date handleDate;
   /** 确认时间
    * 
    * @pdOid d2213acf-787b-4004-bb34-5a80207da935 */
   public Date enterDate;
   /** 确认单位
    * 
    * @pdOid 3ab412b2-c098-4a56-a981-e3fee2c183b6 */
   public String enterCompany;
   /** 接收时间
    * 
    * @pdOid 950adfa9-3923-43fb-9c95-b19c2f9df0fa */
   public Date acceptDate;
   /** 接收单位
    * 
    * @pdOid e2ae5116-c34f-41ea-959c-573e0893b30d */
   public String acceptCompany;
   /** 异常备注
    * 
    * @pdOid c2872885-b222-47cc-bf6f-4c27bf5de2a2 */
   public String abnormalRemarks;
   /** 异常备注
    * 
    * @pdOid 4de9a8aa-d690-4d7e-8b73-9b9d4ffb5ed6 */
   public String workInt;
   /** 中转
    * 
    * @pdOid ddaaf125-1f40-42b4-937b-dab808276cf9 */
   public long transfer;
   /** 实际数量
    * 
    * @pdOid c5c84b02-eb35-4400-a064-860d0b136ed4 */
   public int actualCount;
   /** 到达地
    * 
    * @pdOid ad6769c7-83ca-4adc-99f2-1ddb249bcec8 */
   public String destination;
   /** 品名
    * 
    * @pdOid 2696a7c2-3f3d-4ab3-bcb1-a709b51c5a5d */
   public String wareName;
   /** 实际体积
    * 
    * @pdOid 5fe59e6d-4e2b-4602-a504-0e82a3a39f66 */
   public double actualVolume;
   /** 送达时限
    * 
    * @pdOid d812a07c-20bf-415a-86bb-c01ff98d750d */
   public Date timeLimit;
   /** 配置要求
    * 
    * @pdOid 7b21b0e1-ef71-4ae8-bf59-0ba45602af21 */
   public String ask;
   /** 收货人
    * 
    * @pdOid 8d51c278-105c-407d-a95c-7a6e50470d23 */
   public String takeCargoPerson;
   /** 收货地址
    * 
    * @pdOid 01d14ec0-573b-48aa-bb94-d0a5e2efaca1 */
   public String tackCargoAddress;
   /** 到付款
    * 
    * @pdOid 65f40885-bd7d-4908-a16d-262d6503ee15 */
   public int payment;
   /** 特殊保障
    * 
    * @pdOid aa6752e7-aac4-491a-8216-fdaa1abb73ca */
   public String specialEnsure;
   /** 发货类型
    * 
    * @pdOid c633691b-2e2b-4a6f-9197-23edbcd15899 */
   public long deliveryType;
   /** 重要提示
    * 
    * @pdOid 81553733-f843-4a12-854e-46a6072f491d */
   public String importantHints;
   /** 剩余时间
    * 
    * @pdOid e21e861a-7538-416a-9bd2-facf8049bfcc */
   public Date surplusTime;

}