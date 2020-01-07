package com.xr.boot.entity; /***********************************************************************
 * Module:  IaeExtract.java
 * Author:  Administrator
 * Purpose: Defines the Class IaeExtract
 ***********************************************************************/

import java.util.*;

/** 提货表
 * 
 * @pdOid 4502b6a0-aa41-4ced-ba08-8fdf859b0070 */
public class IaeExtract {
   /** 出港单位
    * 
    * @pdOid 12fdd2c7-796e-486e-b759-696eb1232878 */
   public String id;
   /** 航班车次
    * 
    * @pdOid 903d06c0-3ae6-4122-90ec-11bcf6a751fa */
   public String vehicleInt;
   /** 运输方式
    * 
    * @pdOid 077657d0-ea31-47e4-84f3-211cc1b3c042 */
   public String transportWay;
   /** 货票号
    * 
    * @pdOid b2ac1242-101f-4ab7-b25b-509fd75037a4 */
   public String waybillID;
   /** 预计到港时间
    * 
    * @pdOid 8404e89a-0973-4a68-b461-2532c7ca8845 */
   public Date estimateDate;
   /** 件数
    * 
    * @pdOid 672e7a64-9227-42af-ace9-0c9c0e23536b */
   public int cargoN;
   /** 重要提示
    * 
    * @pdOid 95ec6e68-0097-4aa6-8ce1-cd7fd2a45eb8 */
   public String importantHints;

}