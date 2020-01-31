package com.xr.boot.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class PacOutFromItem implements Serializable {
    private static final long serialVersionUID = 5110643398149148219L;
    /** 编号	自增
     *
     * @pdOid e7b541ce-c4a7-408a-9980-bee0d6d90bfe */
    private int id;
    /**
     * 入库单号
     */
    private String outhouseNo;

    /** 货物编码	正常物品
     *
     * @pdOid 4480eaf3-8935-4c66-93f3-4d89ac221d11 */
    private String goodsCode;
    /** 货物名称
     *
     * @pdOid 26283138-a0f4-4615-89f3-5b538b23c653 */
    private String goodsName;
    /** 出库数量
     *
     * @pdOid f8d2523a-a90c-4cab-90d9-403973442637 */
    private int storageNum;
    /** 实际数量	默认与出库数量一致
     *
     * @pdOid c527f6ae-84af-42a2-8d1c-419843d61593 */
    private int actualNum;
    /** 计划价格
     *
     * @pdOid e501e948-efb9-47ee-9ccd-5d3b3a7fa6a5 */
    private double plannedPrice;
    /** 规格
     *
     * @pdOid f56fe831-983e-4932-883f-f1889551a2f0 */
    private String specifications;
    /** 类型
     *
     * @pdOid e5ee50e2-4159-4f5e-81ed-d92f6c0646a4 */
    private PacOutBoundType pacOutBoundType;

    public PacOutBoundType getPacOutBoundType() {
        return pacOutBoundType;
    }

    public void setPacOutBoundType(PacOutBoundType pacOutBoundType) {
        this.pacOutBoundType = pacOutBoundType;
    }

    /** 状态	1.正常、2.作废
     *
     * @pdOid f7114960-52be-47a1-afa0-d3ff8d410126 */
    private long status;
private String oUnit;

    public String getoUnit() {
        return oUnit;
    }

    public void setoUnit(String oUnit) {
        this.oUnit = oUnit;
    }

    private double oPrice;

    public String getOuthouseNo() {
        return outhouseNo;
    }

    public void setOuthouseNo(String outhouseNo) {
        this.outhouseNo = outhouseNo;
    }

    public double getoPrice() {
        return oPrice;
    }

    public void setoPrice(double oPrice) {
        this.oPrice = oPrice;
    }

    /** @pdOid 95aa3f88-74d7-41e6-a5dc-e1e2bda8c215 */
    public int getId() {
        return id;
    }

    /** @param newId
     * @pdOid 34a0d051-e946-4206-bc29-8cd9983b4af2 */
    public void setId(int newId) {
        id = newId;
    }

    /** @pdOid a86950ea-5fad-4110-b095-5699e27db099 */
    public String getGoodsCode() {
        return goodsCode;
    }

    /** @param newGoodsCode
     * @pdOid 1f2be7c2-c6b0-487b-a857-5bbf3b6aadd1 */
    public void setGoodsCode(String newGoodsCode) {
        goodsCode = newGoodsCode;
    }

    /** @pdOid c6894796-30a2-441b-b401-e269ccb8aee3 */
    public String getGoodsName() {
        return goodsName;
    }

    /** @param newGoodsName
     * @pdOid 3e73ec13-a4ae-4bd0-a27e-ee7db25af8a0 */
    public void setGoodsName(String newGoodsName) {
        goodsName = newGoodsName;
    }

    /** @pdOid e5dd36fc-94e3-4f37-9917-971afcfd44a3 */
    public int getStorageNum() {
        return storageNum;
    }

    /** @param newStorageNum
     * @pdOid 0f67aa6a-1e23-4f6d-a7fb-1d989b95c117 */
    public void setStorageNum(int newStorageNum) {
        storageNum = newStorageNum;
    }

    /** @pdOid bf14eece-f75e-4cfa-897d-be6c3694a344 */
    public int getActualNum() {
        return actualNum;
    }

    /** @param newActualNum
     * @pdOid 205539a3-ba0c-44e7-a297-76f66bef5b0a */
    public void setActualNum(int newActualNum) {
        actualNum = newActualNum;
    }

    /** @pdOid 4739b945-171e-42e1-9cb8-21b790f3436e */
    public double getPlannedPrice() {
        return plannedPrice;
    }

    /** @param newPlannedPrice
     * @pdOid 9899717d-926e-4809-ae5a-82a4bbe2aaca */
    public void setPlannedPrice(double newPlannedPrice) {
        plannedPrice = newPlannedPrice;
    }

    /** @pdOid ee5893aa-8e95-4702-b512-ee4ee0877bc4 */
    public String getSpecifications() {
        return specifications;
    }

    /** @param newSpecifications
     * @pdOid 288a41f6-0e83-42b4-b630-73b61afd97fa */
    public void setSpecifications(String newSpecifications) {
        specifications = newSpecifications;
    }

    /** @pdOid 301a212e-d6f8-4b7b-b532-c28d3f33e31e */
    public long getType() {
        return pacOutBoundType.getId();
    }


    /** @pdOid 77a887a3-0096-498a-ada4-735c45625845 */
    public long getStatus() {
        return status;
    }

    /** @param newStatus
     * @pdOid a106f4b8-94c9-4f27-8306-098aa5a86112 */
    public void setStatus(long newStatus) {
        status = newStatus;
    }

    @Override
    public String toString() {
        return "PacOutFromItem{" +
                "id=" + id +
                ", outhouseNo='" + outhouseNo + '\'' +
                ", goodsCode='" + goodsCode + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", storageNum=" + storageNum +
                ", actualNum=" + actualNum +
                ", plannedPrice=" + plannedPrice +
                ", specifications='" + specifications + '\'' +
                ", pacOutBoundType=" + pacOutBoundType +
                ", status=" + status +
                ", oUnit='" + oUnit + '\'' +
                ", oPrice=" + oPrice +
                '}';
    }
}
