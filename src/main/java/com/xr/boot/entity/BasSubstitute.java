package com.xr.boot.entity; /***********************************************************************
 * Module:  BasSubstitute.java
 * Author:  Administrator
 * Purpose: Defines the Class BasSubstitute
 ***********************************************************************/

import java.util.*;

/** 取派设置表
 * 
 * @pdOid bd214333-6a3d-4d3b-956d-b621cfd13591 */
public class BasSubstitute {
   /** 编号
    * 
    * @pdOid 208c9731-7305-42c2-b89f-f3e4c3210d35 */
   private int id;
   /** 员工工号对应员工表员工工号
    * 
    * @pdOid bfb62d84-7e94-4f36-955d-54672b4534bd */
   private String empNo;
   /** 员工名称对应员工表员姓名
    * 
    * @pdOid d0233040-22ff-48bc-9101-38c44d507e7c */
   private String empName;
   /** 手机号码
    * 
    * @pdOid 3d138a6b-2d54-429d-ae03-565cc734349c */
   private int mobileNo;
   /** 取派员类型	对应“基础档案表”表ID
    * 
    * @pdOid d3cc54e0-9e75-4ad2-963d-0cc756341515 */
   private int type;
   /** 是否使用PDA	1：使用，0：不使用
    * 
    * @pdOid 41580f8a-dca6-406a-9e7c-88702f5dba52 */
   private long pda;
   /** 收派标准（公斤）	保留二位小数使用，0：不使用
    * 
    * @pdOid 61805cd5-8770-41f4-b67e-ddaba05c7385 */
   private double standardKg;
   /** 收派标准（长度）	保留二位小数
    * 
    * @pdOid 809c7741-bc22-49f4-ae1e-6f6e5cd8bb79 */
   private double models;
   /** 车型
    * 
    * @pdOid 51ad5537-1e0f-4082-aade-9154edf72af1 */
   private String plateInt;
   /** 车牌号
    * 
    * @pdOid e556f5e1-d8bf-4228-b66d-0dd4fc13cc95 */
   private String invalidateMark;
   /** 状态，0：正常，1：停用
    * 
    * @pdOid f2ee9f93-51a2-4afe-9688-17b82b7764f2 */
   private long stats;
   
   /** @pdOid 633627b5-0478-421b-ad9d-4ae36ea63de4 */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid f5bbb21f-9913-4f06-aa5c-db364a79dfda */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid a06e5b47-3cf9-4925-80d8-8c95db435d42 */
   public String getEmpNo() {
      return empNo;
   }
   
   /** @param newEmpNo
    * @pdOid dc44dd1c-1973-4b99-b647-5f2b3c9ea2df */
   public void setEmpNo(String newEmpNo) {
      empNo = newEmpNo;
   }
   
   /** @pdOid 07ad5d0c-3f0f-4e10-864a-157cdcf5790a */
   public String getEmpName() {
      return empName;
   }
   
   /** @param newEmpName
    * @pdOid f18af263-e4d9-409f-808e-102d5d7c9088 */
   public void setEmpName(String newEmpName) {
      empName = newEmpName;
   }
   
   /** @pdOid 6dcf6e8e-eff1-4d4b-9bdb-a92704eeab85 */
   public int getMobileNo() {
      return mobileNo;
   }
   
   /** @param newMobileNo
    * @pdOid 4e7b9a44-568a-4a8b-94a2-f07ed9cadf3c */
   public void setMobileNo(int newMobileNo) {
      mobileNo = newMobileNo;
   }
   
   /** @pdOid 11b2a08f-7086-469d-a82b-4be18004f884 */
   public int getType() {
      return type;
   }
   
   /** @param newType
    * @pdOid fdadb607-66aa-4ac2-8af7-23fabf422d37 */
   public void setType(int newType) {
      type = newType;
   }
   
   /** @pdOid 0067e8e0-17d4-4a7b-a439-9e643265cecb */
   public long getPda() {
      return pda;
   }
   
   /** @param newPda
    * @pdOid 3b8abbc3-ddd2-4111-9690-c21b53e90084 */
   public void setPda(long newPda) {
      pda = newPda;
   }
   
   /** @pdOid 7056ee58-623d-493c-832a-55fb2c8a079a */
   public double getStandardKg() {
      return standardKg;
   }
   
   /** @param newStandardKg
    * @pdOid c30003f5-d209-470a-b682-692ce2577d37 */
   public void setStandardKg(double newStandardKg) {
      standardKg = newStandardKg;
   }
   
   /** @pdOid 58a79199-2060-4317-b08f-8cc0e264560d */
   public double getModels() {
      return models;
   }
   
   /** @param newModels
    * @pdOid a8263ce0-68ce-438f-924e-996ec46d0af3 */
   public void setModels(double newModels) {
      models = newModels;
   }
   
   /** @pdOid 6257de63-e39d-4be5-bfed-224a4e2e2302 */
   public String getPlateInt() {
      return plateInt;
   }
   
   /** @param newPlateInt
    * @pdOid 2cd43079-ec25-49f0-a778-c80ba2a5a7ff */
   public void setPlateInt(String newPlateInt) {
      plateInt = newPlateInt;
   }
   
   /** @pdOid 36904a4c-b958-4276-84ea-eb74f9f8d1f4 */
   public String getInvalidateMark() {
      return invalidateMark;
   }
   
   /** @param newInvalidateMark
    * @pdOid cdab6032-fc4d-49b8-947e-ffde558b38de */
   public void setInvalidateMark(String newInvalidateMark) {
      invalidateMark = newInvalidateMark;
   }
   
   /** @pdOid 1288da8a-4f09-47db-8249-c4e7513a1db4 */
   public long getStats() {
      return stats;
   }
   
   /** @param newStats
    * @pdOid 8e410c3e-2355-4012-a304-d0ae333c7315 */
   public void setStats(long newStats) {
      stats = newStats;
   }

}