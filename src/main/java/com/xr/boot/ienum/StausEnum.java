package com.xr.boot.ienum;

/**
 * 控制器返回错误代码类
 * 方便维护
 * 可以自行编辑，添加
 */
public enum StausEnum {
    SUCCESS(20000,"成功"),
    NO(19999,"失败"),
    LoginNo(19998,"登录失败"),
    NO_HANDLER(10000,"无请求头"),
    HANDLER_EXCEPTION(10001,"请求头错误"),
    PERMISSIONS_EXCEPTION(10003,"无权限");



    private StausEnum(Integer code, String messge){
        this.Code=code;
        this.messge=messge;
    }
    private Integer Code;
    private String messge;

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public String getMessge() {
        return messge;
    }

    public void setMessge(String messge) {
        this.messge = messge;
    }
}
