package com.zqy.demo.common_modular.core;

import lombok.Data;

/**
 * JSON Result  统一返回类
 * @author 971
 * @date 2020/5/6 10:42
 */

public class Result {

    private int code;

    private String message;

    private Object data;


    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code;
        return this;
    }

    public Result setMessage(String message){
        this.message = message;
        return this;
    }

    public Result setData(Object data){
        this.data = data;
        return this;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
