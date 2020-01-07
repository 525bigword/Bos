package com.xr.boot.entity; /***********************************************************************
 * Module:  IaeTimeInput.java
 * Author:  Administrator
 * Purpose: Defines the Class IaeTimeInput
 ***********************************************************************/

import java.util.*;

/** 到达时间录入表
 * 
 * @pdOid da69e913-d97b-4d1a-a58f-297a0d7e39ae */
public class IaeTimeInput {
   /** 出库交接单号，雪花算法八号数据中心
    * 
    * @pdOid 2192a531-8210-4652-9421-f9a5aee08420 */
   public String id;
   /** 状态
    * 
    * @pdOid b82e673b-b460-4efc-bec4-dc78e0fe7e08 */
   public String inputType;
   /** 到达口岸
    * 
    * @pdOid e7a15ef2-0f7d-4005-b8a4-464d40d769a6 */
   public String port;
   /** 配载方式
    * 
    * @pdOid 45b24d72-26d7-41b7-bd01-9585fb29c618 */
   public long demand;
   /** 航班车次
    * 
    * @pdOid b68abc1d-8f23-4ca5-806e-b1dac78757de */
   public String vehicleInt;
   /** 货票号
    * 
    * @pdOid 3a75a61c-6c11-40f4-bab0-64041ab90d00 */
   public String waybillID;
   /** 预计到港时间
    * 
    * @pdOid 9d62db60-0248-4d44-902a-724a6bfedb01 */
   public Date expectArrivalDate;
   /** 预计离港时间
    * 
    * @pdOid 4568bca1-d98d-40a5-b448-f0c4c68f8c66 */
   public Date expectDepartureDate;
   /** 实际到港时间
    * 
    * @pdOid b9284f0b-2188-4a0d-bd2f-8c9db2809211 */
   public Date actualArrivalDate;
   /** 实际离港时间
    * 
    * @pdOid 5c53d25c-fcc0-4f19-bf2a-4673f617473a */
   public Date actualDepartureDate;
   /** 始发站
    * 
    * @pdOid 497a4c61-9f8f-46a6-aee1-3487ad85558a */
   public String start;
   /** 承运商
    * 
    * @pdOid 8cb7c803-da49-4f38-a42e-9c23befd4ae7 */
   public int carriers;
   /** 备注
    * 
    * @pdOid f37d627a-d304-4a4f-a564-fa7fde5ce33c */
   public String remarks;
   /** 录入时间
    * 
    * @pdOid a8c1d201-b033-4f23-bc7c-609a731e1038 */
   public Date inputDate;

}