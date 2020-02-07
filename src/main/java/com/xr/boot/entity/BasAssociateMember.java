package com.xr.boot.entity; /***********************************************************************
 * Module:  BasAssociateMember.java
 * Author:  Administrator
 * Purpose: Defines the Class BasAssociateMember
 ***********************************************************************/

import org.springframework.stereotype.Component;

import java.io.Serializable;

/** 关联小件员表
 *
 * @pdOid 4883f6b8-3431-4cb9-84d6-7b2e601c6c3a */
@Component
public class BasAssociateMember implements Serializable {
    /** @pdOid 3f133139-df02-43e1-a233-60732eded09d */
    private long id;
    /** 取派人工号	对应员工表员工工号
     *
     * @pdOid 20d8ac07-e74a-4136-953c-676373f1ffef */
    private String zoneCode;
    private String empNo;
    /** 取派人名称	对应员工表员姓名
     *
     * @pdOid 902cac5f-7f76-4e0c-9c5e-1d9deada2ffe */
    private String empName;
    /** 收派标准（公斤）	保留二位小数
     *
     * @pdOid 0b334660-9678-4c51-a7ae-01d84da158cf */
    private String standardKg;
    /** 收派标准（长度）	保留二位小数
     *
     * @pdOid 2154f546-a0dd-4040-9b55-a57bf2ce071d */
    private double standardLength;
    /** 收派时间
     *
     * @pdOid a4212a8e-09bd-4226-a8a7-223b67d9cea6 */
    private BasStandarTime basStandardTime;
    private SyUnits syUnits;
    /** 类型
     *
     * @pdOid e6dc87ca-354f-41d4-a075-8889b2dc8878 */
    private String type;
    public BasAssociateMember(){}
    public long getstandardTimeId(){return basStandardTime.getId();}
    public long getunitId(){return syUnits.getId();}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getStandardKg() {
        return standardKg;
    }

    public void setStandardKg(String standardKg) {
        this.standardKg = standardKg;
    }

    public double getStandardLength() {
        return standardLength;
    }

    public void setStandardLength(double standardLength) {
        this.standardLength = standardLength;
    }

    public BasStandarTime getBasStandardTime() {
        return basStandardTime;
    }

    public void setBasStandardTime(BasStandarTime basStandardTime) {
        this.basStandardTime = basStandardTime;
    }

    public SyUnits getSyUnits() {
        return syUnits;
    }

    public void setSyUnits(SyUnits syUnits) {
        this.syUnits = syUnits;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}