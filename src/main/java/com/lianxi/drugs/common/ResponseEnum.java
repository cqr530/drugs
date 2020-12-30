package com.lianxi.drugs.common;

public enum ResponseEnum {
    SUCCESS(200,"操作成功"),
    ERROR(500,"操作失败"),

    ;
    private int code;
    private String msg;

    ResponseEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
