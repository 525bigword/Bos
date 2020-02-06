package com.xr.boot.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class PacManegement implements Serializable {
    private static final long serialVersionUID = -1269141066094354485L;
    private Integer id;
    private PacPackaging gcode;
  //  private String goodsCode;

    public String getGoodsCode() {
        return gcode.getItemCode();
    }

    private Integer storageNum;
    private SyUnits gunitss;
    //private Integer gunit;
    private String zje;
    private String storageNums;

    public String getStorageNums() {
        return storageNums;
    }

    public void setStorageNums(String storageNums) {
        this.storageNums = storageNums;
    }

    public String getZje() {
        return zje;
    }

    public void setZje(String zje) {
        this.zje = zje;
    }

    public Long getGunit() {
        return gunitss.getId();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PacPackaging getGcode() {
        return gcode;
    }

    public void setGcode(PacPackaging gcode) {
        this.gcode = gcode;
    }

    public Integer getStorageNum() {
        return storageNum;
    }

    public void setStorageNum(Integer storageNum) {
        this.storageNum = storageNum;
    }

    public SyUnits getGunitss() {
        return gunitss;
    }

    public void setGunitss(SyUnits gunitss) {
        this.gunitss = gunitss;
    }

    @Override
    public String toString() {
        return "PacManegement{" +
                "id=" + id +
                ", gcode=" + gcode +
                ", storageNum=" + storageNum +
                ", gunitss=" + gunitss +
                ", zje='" + zje + '\'' +
                ", storageNums='" + storageNums + '\'' +
                '}';
    }
}
