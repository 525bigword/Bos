package com.xr.boot.entity; /***********************************************************************
 * Module:  BasPartition.java
 * Author:  Administrator
 * Purpose: Defines the Class BasPartition
 ***********************************************************************/

import java.util.*;

/** 分区表
 * 
 * @pdOid 27ba0293-55c0-4619-bad5-7a1527f57904 */
public class BasPartition {
   /** 编号	自增
    * 
    * @pdOid 1242bad9-3752-4d77-9bae-addca84a199f */
   public long id;
   /** 省
    * 
    * @pdOid 886d4c2d-84b9-4307-a3cc-383aafad2a89 */
   public String province;
   /** 城市
    * 
    * @pdOid 76243170-2120-4c88-8c8b-e03656918c9b */
   public String city;
   /** 区（县）
    * 
    * @pdOid e1bb1a39-7f4e-4b6d-a52a-154ae488da78 */
   public String county;
   /** 定区编码   雪花算法二十五号中心
    * 
    * @pdOid c9925760-a16a-4948-91d4-3668718ca61a */
   public String zoneCode;
   /** 关键字
    * 
    * @pdOid 67153f8c-7290-48ca-b953-cfce0b1a8e53 */
   public String keyword;
   /** 起始号
    * 
    * @pdOid b799e30f-ce38-4b06-879d-330228fa325e */
   public int startInt;
   /** 终止号
    * 
    * @pdOid f308c7be-0990-4310-8829-0fb1f98d6ac5 */
   public int terminateInt;
   /** 单双号	1：单，2：双
    * 
    * @pdOid db410051-addd-4285-94f5-bec982556714 */
   public long sDInt;
   /** 状态	0：正常，1：停用
    * 
    * @pdOid fa29828e-ae1f-46c3-8f72-b9fca20e7b00 */
   public long stats;

}