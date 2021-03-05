package com.anakin.common.tool.enums;

/**
 * @description: 通用错误码
 * @author: anakin
 * @date 2019/4/24 9:59
 */
public enum CodeMsg {

    SUCCESS(20000, "请求成功"),
    CREATED(20100, "创建成功"),

    VALIDATE_PARAMETER(40000, "无效的参数"),
    UNAUTHORIZED(40100, "暂未登录或登录已经过期"),
    FORBIDDEN(40300, "没有相关权限"),
    NOT_FOUND_FAILED(40400, "请求资源不存在"),

    FAILED(500, "系统异常");

    private int code;
    private String msg;


    CodeMsg(int code, String msg) {
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
}
