package com.xr.boot.entity; /***********************************************************************
 * Module:  DidPropagandaTask.java
 * Author:  Administrator
 * Purpose: Defines the Class DidPropagandaTask
 ***********************************************************************/

import java.util.*;

/** 宣传表
 * 
 * @pdOid 8caf5a55-c582-4e9d-97a6-4865ad5aa824 */
public class DidPropagandaTask {
   /** 编号	自增
    * 
    * @pdOid ac236a77-3b0b-42a2-8f51-4b463e633369 */
   private long id;
   /** 宣传概要
    * 
    * @pdOid a9e1f222-f437-425c-a6f7-01db6f87565c */
   private String outline;
   /** 发布时间
    * 
    * @pdOid 91af0732-3101-4cb0-bf39-4d19df137283 */
   private Date releaseTime;
   /** 失效时间
    * 
    * @pdOid 882d01fd-47dd-4591-9d12-ae5d834ad3e0 */
   private Date failureTime;
   /** 状态	1.开启，2.关闭
    * 
    * @pdOid ae157d8a-3c57-4832-89f7-4aa647dc1b53 */
   private long status;
   /** 宣传内容
    * 
    * @pdOid 4d081f56-1668-47b4-b1f6-28b1d58b11bd */
   private String content;
   
   /** @pdOid 838bb4c9-ccf8-4a2a-a0d9-78ee20c3d9df */
   public long getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 9d559b20-e866-4f44-9e21-12acb091a2bc */
   public void setId(long newId) {
      id = newId;
   }
   
   /** @pdOid 86e7c016-f283-41ab-b959-6f2100772c8c */
   public String getOutline() {
      return outline;
   }
   
   /** @param newOutline
    * @pdOid e510fc28-a8a1-45b2-a77f-7d75128a322a */
   public void setOutline(String newOutline) {
      outline = newOutline;
   }
   
   /** @pdOid b1a831df-c5b5-42a9-8ff1-5923b36afdcd */
   public Date getReleaseTime() {
      return releaseTime;
   }
   
   /** @param newReleaseTime
    * @pdOid 2dedcc72-266f-46b5-8d54-3b4a54504013 */
   public void setReleaseTime(Date newReleaseTime) {
      releaseTime = newReleaseTime;
   }
   
   /** @pdOid 3f5ffe33-5c62-4880-8544-5710e7fe0d5e */
   public Date getFailureTime() {
      return failureTime;
   }
   
   /** @param newFailureTime
    * @pdOid 9549ae16-e9d2-4a4f-91a2-0059680bbe59 */
   public void setFailureTime(Date newFailureTime) {
      failureTime = newFailureTime;
   }
   
   /** @pdOid 11892c55-51e6-404d-ad69-51db93f4f5dc */
   public long getStatus() {
      return status;
   }
   
   /** @param newStatus
    * @pdOid a506e09c-3b78-44db-ae91-3bf5432ed9b7 */
   public void setStatus(long newStatus) {
      status = newStatus;
   }
   
   /** @pdOid ec0ea97d-edfd-4c8e-942d-7d89221f73fe */
   public String getContent() {
      return content;
   }
   
   /** @param newContent
    * @pdOid 269cd9bc-9c95-4101-bba3-33564c4d6de3 */
   public void setContent(String newContent) {
      content = newContent;
   }

}