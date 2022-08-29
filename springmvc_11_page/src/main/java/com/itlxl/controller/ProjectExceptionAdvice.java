package com.itlxl.controller;

import com.itlxl.exception.BusinessException;
import com.itlxl.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    // 系统异常
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        // 发送日志
        // 发送消息给运维
        // 发送邮件给开发人员
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    // 业务异常
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    // 其他异常
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        // 发送日志
        // 发送消息给运维
        // 发送邮件给开发人员
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"系统繁忙，请稍后再试！");
    }
}
