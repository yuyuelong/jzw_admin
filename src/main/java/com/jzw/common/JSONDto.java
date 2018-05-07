package com.jzw.common;

/**
 * JSON数据对象
 * Created by admin on 2017/5/27.
 */
public class JSONDto<T> {
    /**返回码**/
    private String code;

    /**返回信息**/
    private String message;

    /**返回数据**/
    private T data;

    public JSONDto() {
    }

    public JSONDto(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
