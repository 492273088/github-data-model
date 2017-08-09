package com.winsion.common;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/9/15:16
 **/
public class Message {
    private Integer code;
    private String msg = "";
    private Object data;

    Message(Integer code, String msg, Object data){
        this.setCode(code);
        this.setMsg(msg);
        this.setData(data);
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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

    public static Message create(Integer success, String msg, Object jsonObject) {
        return new Message(success,msg,jsonObject);
    }
}
