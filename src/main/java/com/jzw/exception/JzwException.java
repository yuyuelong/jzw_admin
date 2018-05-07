package com.jzw.exception;

/**
 * Created by admin on 2017/5/31.
 */
public class JzwException extends RuntimeException{
    /**返回码**/
    private String code;

    /**异常信息**/
    private String errMsg;

    public JzwException(String code, String errMsg) {
        this.code = code;
        this.errMsg = errMsg;
    }

    public String getCode() {
        return code;
    }

    public String getErrMsg() {
        return errMsg;
    }
}
