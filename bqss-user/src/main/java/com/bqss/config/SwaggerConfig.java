package com.bqss.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description TODO
 * @Date 2023/2/22 15:18
 * @Created by 18355
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                //页面标题
                .title("User服务API")
                //版本号
                .version("1.0")
                .description("User服务api")
                //.contact(new Contact("sulongyue","http://www.baidu.com","18355315065@168.com"))
                .build();
    }

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //包路径，控制器类包
                .apis(RequestHandlerSelectors.basePackage("com.bqss.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
