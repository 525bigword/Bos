package com.xr.boot.entity; /***********************************************************************
 * Module:  LogTrack.java
 * Author:  Administrator
 * Purpose: Defines the Class LogTrack
 ***********************************************************************/

import java.util.*;

/** 跟踪表
 * 
 * @pdOid c1a54fea-6092-486c-adb2-c44377238d83 */
public class LogTrack {
   /** 跟踪表编号，雪花算法七号数据中心
    * 
    * @pdOid e345084e-3739-466f-bd43-f367b2d649a2 */
   private String id;
   /** 线路类型
    * 
    * @pdOid b52ad8fa-40cb-4317-8e22-1da18c88db41 */
   private String lineType;
   /** 线路名称
    * 
    * @pdOid 7fc3cf0c-5dd2-4dfc-98b7-e642ba46e880 */
   private String lineName;
   /** 线路名称
    * 
    * @pdOid bee9212d-0d47-4fa2-92a0-166cc2b66ed1 */
   private String logisticsCar;
   /** 状态
    * 
    * @pdOid 9f4befa7-e139-45d5-86e4-ad882866c709 */
   private long lineState;
   /** 节点名称
    * 
    * @pdOid c6bdac94-0a24-4e45-a284-b0d422f607a8 */
   private String nodeName;
   /** 发车时间
    * 
    * @pdOid 64adf2ed-41a7-4913-a299-c441d947bf3b */
   private Date startTime;
   /** 到达时间
    * 
    * @pdOid 5aaa93b3-f226-4c29-9cfb-f78389c288b0 */
   private Date arrivalTime;
   /** 车号
    * 
    * @pdOid ac075a8b-c652-4316-8cf0-c914d6006736 */
   private String carInt;
   /** 下一节点可装载量
    * 
    * @pdOid 38af1e0d-79b3-4763-a1c0-943bbb7bd2c0 */
   private String nextNodeLoad;
   /** 描述
    * 
    * @pdOid 53501cca-d3f5-480c-96e7-5eca72a03721 */
   private String describes;
   
   /** @pdOid 1bd139c8-fab4-44ff-905f-c9b80a3e41cf */
   public String getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 005f1f25-fef6-4785-bb93-cdc0db172fa7 */
   public void setId(String newId) {
      id = newId;
   }
   
   /** @pdOid 7f729168-c132-4d60-99c0-aeeb07710283 */
   public String getLineType() {
      return lineType;
   }
   
   /** @param newLineType
    * @pdOid 037ec977-7afe-4328-a990-95597cbc22a4 */
   public void setLineType(String newLineType) {
      lineType = newLineType;
   }
   
   /** @pdOid 5e86b808-9294-4b13-a058-b004c7299e41 */
   public String getLineName() {
      return lineName;
   }
   
   /** @param newLineName
    * @pdOid 0bc29392-f54a-4e07-859c-07e8281b1952 */
   public void setLineName(String newLineName) {
      lineName = newLineName;
   }
   
   /** @pdOid f2a386f0-223e-4357-a43a-d18b07652248 */
   public String getLogisticsCar() {
      return logisticsCar;
   }
   
   /** @param newLogisticsCar
    * @pdOid ff3086bd-6546-49bf-865f-0286efbc935b */
   public void setLogisticsCar(String newLogisticsCar) {
      logisticsCar = newLogisticsCar;
   }
   
   /** @pdOid 8a162f61-9838-4ec5-82b9-3acbc664af30 */
   public long getLineState() {
      return lineState;
   }
   
   /** @param newLineState
    * @pdOid 5d977f0d-bc48-4e48-87a0-a8fe0b1778e8 */
   public void setLineState(long newLineState) {
      lineState = newLineState;
   }
   
   /** @pdOid c6ae6d99-e5f5-4ce0-a222-0e3bb30e2aee */
   public String getNodeName() {
      return nodeName;
   }
   
   /** @param newNodeName
    * @pdOid dc68e51c-b6c1-4879-9c10-183b518bf657 */
   public void setNodeName(String newNodeName) {
      nodeName = newNodeName;
   }
   
   /** @pdOid a318e83f-641a-4f3e-bb52-3c58af4a87d0 */
   public Date getStartTime() {
      return startTime;
   }
   
   /** @param newStartTime
    * @pdOid ecc4ce93-3505-46bd-b164-b7868da78d0a */
   public void setStartTime(Date newStartTime) {
      startTime = newStartTime;
   }
   
   /** @pdOid 6b48b0ff-1c5d-44b5-9d0f-d1b70738b540 */
   public Date getArrivalTime() {
      return arrivalTime;
   }
   
   /** @param newArrivalTime
    * @pdOid d68083d0-c96f-4e5a-8c55-4540c32d54d8 */
   public void setArrivalTime(Date newArrivalTime) {
      arrivalTime = newArrivalTime;
   }
   
   /** @pdOid 340b93d7-6413-42a2-b0e8-0de954b65f78 */
   public String getCarInt() {
      return carInt;
   }
   
   /** @param newCarInt
    * @pdOid 1494a151-dd78-443a-8faf-7ad0c1c61f39 */
   public void setCarInt(String newCarInt) {
      carInt = newCarInt;
   }
   
   /** @pdOid 34aaa031-8b38-4d0f-a5fe-71bbaaeaabc5 */
   public String getNextNodeLoad() {
      return nextNodeLoad;
   }
   
   /** @param newNextNodeLoad
    * @pdOid b88fc8a8-91c5-40a0-a049-4cc173a8e6cb */
   public void setNextNodeLoad(String newNextNodeLoad) {
      nextNodeLoad = newNextNodeLoad;
   }
   
   /** @pdOid 612dee38-6000-48b3-aef0-dcee0a52d4de */
   public String getDescribes() {
      return describes;
   }
   
   /** @param newDescribes
    * @pdOid 077c019a-734e-4c5a-af7f-8296b31ff005 */
   public void setDescribes(String newDescribes) {
      describes = newDescribes;
   }

}