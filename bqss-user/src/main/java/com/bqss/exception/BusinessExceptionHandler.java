package com.bqss.exception;

import com.bqss.Exception.BusinessException;
import com.bqss.api.Result;
import com.bqss.constant.CommonConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Description TODO
 * @Date 2023/2/20 21:28
 * @Created by 18355
 */
@Slf4j
@RestControllerAdvice
public class BusinessExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public Result<?> handleBusinessException(BusinessException e){
        log.error(e.getMessage());
        return Result.fail(e.getCode(),e.getMessage());
    }

    /**
     * jsr303参数校验错误
     * @param response
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<?> handleArgumentException(HttpServletResponse response, MethodArgumentNotValidException e){
        StringBuilder msgBuilder = new StringBuilder();
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        for(FieldError fieldError : fieldErrors){
            msgBuilder.append(fieldError.getField()).append(":").append(fieldError.getDefaultMessage()).append(";");
        }
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        return Result.fail(CommonConstant.PARAM_ERROR,msgBuilder.toString());
    }

    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    public Result<?> handleMissingServletRequestParameterException(HttpServletResponse response,MissingServletRequestParameterException e){
        String msg = "缺少必须参数：" + e.getParameterName();
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        return Result.fail(CommonConstant.PARAM_ERROR,msg);

    }

    @ExceptionHandler(Exception.class)
    public Result<?> handleException(Exception e){
        log.error(e.getMessage());
        return Result.fail500(e.getMessage());
    }

}
