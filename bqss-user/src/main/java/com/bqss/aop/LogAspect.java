package com.bqss.aop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bqss.Exception.BusinessException;
import com.bqss.api.Result;
import com.bqss.thread.UserThreadLocal;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description TODO
 * @Date 2023/2/22 10:46
 * @Created by 18355
 */
@Slf4j
@Aspect
@Component
public class LogAspect {

    private static ThreadLocal<ProceedingJoinPoint> td = new ThreadLocal<>();

    @Pointcut("execution(* com.bqss.controller..*.*(..))")
    @Order(1)
    public void webLog() {

    }

    @Around("webLog()")
    public Object doAround(ProceedingJoinPoint point) throws Throwable {
        td.set(point);
        Object result;
        try {
            long startTime = System.currentTimeMillis();
            ProceedingJoinPoint joinPoint = td.get();
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            if (null != attributes) {
                HttpServletRequest request = attributes.getRequest();
                log.info("[来源IP：" + request.getRemoteAddr() + "],\n" +
                        "   [请求方式：" + request.getMethod() + "],\n" +
                        "   [请求URL：" + request.getRequestURL() + "],\n" +
                        "   [请求用户：" + UserThreadLocal.getUserId() + "],\n" +
                        "   [请求参数：" + JSONObject.toJSONString(point.getArgs()) + "]}");
            }
            try{
                result = joinPoint.proceed();
                log.info("[返回结果：{}] [执行耗时：{}ms", JSON.toJSONString(result), (System.currentTimeMillis() - startTime) );
            }catch (Throwable e){
                if(e instanceof BusinessException){
                    throw e;
                }else {
                    log.error("执行异常{}", e.getMessage());
                    result = Result.fail500(e.getMessage());
                }
            }
            return result;
        } finally {
            td.remove();
        }

    }



}
