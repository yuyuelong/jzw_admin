package com.jzw.handle;

import com.jzw.common.JSONDto;
import com.jzw.exception.JzwException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理类
 * Created by admin on 2017/5/22.
 */
@ControllerAdvice
public class ExceptionHandle<T> {

    //@ExcpetionHandler设置捕捉什么异常类
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JSONDto<T> handle(Exception e){
        if(e instanceof JzwException){
            JzwException jzwException = (JzwException)e;
            return new JSONDto<>(jzwException.getCode(),jzwException.getErrMsg(),null);
        }
        return new JSONDto<>("300",e.getMessage(),null);
    }
}

