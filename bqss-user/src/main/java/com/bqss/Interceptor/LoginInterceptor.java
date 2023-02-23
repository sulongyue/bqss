package com.bqss.Interceptor;

import com.bqss.Exception.BusinessException;
import com.bqss.constant.CommonConstant;
import com.bqss.thread.UserThreadLocal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * @Description TODO
 * @Date 2023/2/21 15:17
 * @Created by 18355
 */
@Component("loginInterceptor")
@Slf4j
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(! (handler instanceof HandlerMethod)){
            return true;
        }
        //用户id不能位空
        String userId = request.getHeader("User-Id");
        if(Objects.isNull(userId)){
            log.info("请求url:{}失败，用户id为空",request.getRequestURL());
            throw new BusinessException(CommonConstant.EMPTY_USER_ID,"用户id不能为空");
        }
        //将用户id放入ThreadLocal
        UserThreadLocal.setUserId(userId);
        return super.preHandle(request, response, handler);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        UserThreadLocal.remove();
        //log.error("afterCompletion=====>user-id"+ UserThreadLocal.getUserId());
        super.afterCompletion(request, response, handler, ex);
    }
}
