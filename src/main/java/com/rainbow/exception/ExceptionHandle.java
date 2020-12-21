package com.rainbow.exception;

import com.rainbow.commons.Result;
import com.rainbow.commons.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 通用异常处理
 */

@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    public Result<String> exceptionHandle() {
        return new Result<>(StatusCode.error, false, "未知错误");
    }
}
