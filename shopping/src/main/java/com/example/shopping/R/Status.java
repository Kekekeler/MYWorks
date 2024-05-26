package com.example.shopping.R;
public enum Status {
    LOGINSUCCESS("10001","登录成功！"),
    LOGINFAIL("10002","登录失败"),
    REGISTERSUCCESS("10003","注册成功"),
    REGISTEREREX("10004","注册失败"),
    REGISTEREX("10005","用户已存在"),
    ADDSUCCESS("20001","商品添加成功"),
    ADDFAIL("20002","商品添加失败"),
    ADDREX("20003","商品已存在"),
    DELETESUCCESS("20004","商品删除成功"),
    DELETEFAIL("20005","商品删除失败"),
    CHANGESUCCESS("20006","商品修改成功"),
    CHANGEFAIL("20007","商品修改失败"),
    INSERTSUCCESS("20008","商品查询成功"),
    INSERTFAIL("20009","商品查询失败");


    private final String code;
    private final String msg;

    Status(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
