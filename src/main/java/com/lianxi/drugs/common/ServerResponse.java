package com.lianxi.drugs.common;

public class ServerResponse {

    private int code;//
    private String msg;//
    private Object data;//

    /**
     *
     * @param data
     * @return 操作成功，返回一个ServerResponse 包括了code msg data
     */
    public static ServerResponse success(Object data){
        return new ServerResponse(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(),data);
    }

    /**
     *
     * @return 执行成功后返回的状态码
     */
    public static ServerResponse success(){
        return new ServerResponse(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg());
    }

    /**
     *
     * @return
     */
    public static ServerResponse error(){
        return new ServerResponse(ResponseEnum.ERROR.getCode(),ResponseEnum.ERROR.getMsg());
    }



    public ServerResponse() {
    }

    public ServerResponse(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ServerResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
