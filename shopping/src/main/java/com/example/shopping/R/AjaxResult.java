package com.example.shopping.R;

public class AjaxResult<T> {
    private T data;
    private String code;
    private String msg;

    public AjaxResult() {
    }

    public AjaxResult(T data, String code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }


    public T getData() {
        return data;
    }


    public void setData(T data) {
        this.data = data;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
