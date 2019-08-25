package com.example.demo.config;

import com.jayway.jsonpath.Criteria;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.regex.Pattern;


/**
 * Created by 胡文华 on 2019/8/24.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .pathMapping("/")
                .select()
                .paths(PathSelectors.regex(("/.*")))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("我的接口文档")
                .contact(String.valueOf(new Contact("dazhou","1751400385@qq.com")))
                .description("swaggerui")
                .version("1.0.0.0")
                .build();
    }

    private class Contact {
        public Contact(Object dazhou, String s) {
        }
    }
}
