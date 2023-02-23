package com.bqss.config;

import com.bqss.Interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description TODO
 * @Date 2023/2/21 16:07
 * @Created by 18355
 */
@Configuration
@ConditionalOnWebApplication
public class WebMvcAutoConfiguration implements WebMvcConfigurer {

    @Autowired
    @Qualifier("loginInterceptor")
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截路径
        String[] addPathPatterns = {"/**"};
        //排除路径
        String[] excludePathPatterns = {"/","/login","/index.html","/user/login",
                                    "/error",
                                    "/swagger-ui.html","/swagger-ui.*","/swagger-resources/**"
                                    };
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns(addPathPatterns)
                .excludePathPatterns(excludePathPatterns);

    }
}
