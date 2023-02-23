package com.bqss.Exception;

/**
 * @Description TODO
 * @Date 2023/2/20 21:25
 * @Created by 18355
 */
public class BusinessException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    private Integer code;

    public BusinessException(){}

    public BusinessException(Integer code,String msg){
        super(msg);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
