package com.xr.boot.ienum;

import java.io.Serializable;
import java.util.Map;

/**
 * 返回类型，用于接口返回
 */
public class Return implements Serializable {
    //结果码
    private StausEnum stausEnum;
    //方便承载多种类型的数据
    //private Map maps;
    //方便直接从redis中取出并返回Json
    private Object map;
    //方便直接从redis中取出并返回Json
    public Return() {
    }

    public Return(StausEnum stausEnum, Object map) {
        this.stausEnum = stausEnum;
        this.map = map;
    }


    public StausEnum getStausEnum() {
        return stausEnum;
    }

    public void setStausEnum(StausEnum stausEnum) {
        this.stausEnum = stausEnum;
    }


    public Object getMap() {
        return map;
    }

    public void setMap(Object map) {
        this.map = map;
    }
}
