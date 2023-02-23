package com.bqss.api;

import com.bqss.constant.CommonConstant;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description TODO
 * @Date 2023/2/20 21:02
 * @Created by 18355
 */
@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean success = true;

    private Integer code = 0;

    private String message = "";

    private T result;

    private long timestamp = System.currentTimeMillis();

    public Result(){
    }

    public Result(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public static<T> Result<T> ok(){
        Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setCode(CommonConstant.OK_200);
        return result;
    }

    public static<T> Result<T> ok(String msg){
        Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setCode(CommonConstant.OK_200);
        result.setMessage(msg);
        return result;
    }

    public static<T> Result<T> ok(T data){
        Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setCode(CommonConstant.OK_200);
        result.setResult(data);
        return result;
    }

    public static<T> Result<T> ok(T data,String msg){
        Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setCode(CommonConstant.OK_200);
        result.setMessage(msg);
        result.setResult(data);
        return result;
    }

    public static<T> Result<T> fail500(String msg){
        Result<T> result = new Result<>();
        result.setSuccess(false);
        result.setMessage(msg);
        result.setCode(CommonConstant.SERVER_ERROR_500);
        return result;
    }

    public static<T> Result<T> fail(Integer code,String msg){
        Result<T> result = new Result<>();
        result.setSuccess(false);
        result.setMessage(msg);
        result.setCode(code);
        return result;
    }


    public Result<T> success(String message){
        this.message = message;
        this.code = CommonConstant.OK_200;
        this.success = true;
        return this;
    }

}
