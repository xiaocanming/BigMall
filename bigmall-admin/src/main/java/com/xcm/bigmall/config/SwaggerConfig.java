package com.xcm.bigmall.config;

import com.xcm.bigmall.common.config.BaseSwaggerConfig;
import com.xcm.bigmall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @描述 Swagger2API文档的配置
 * @创建人 xcm
 * @创建时间 2020/12/2
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {

        return SwaggerProperties.builder()
                .apiBasePackage("com.xcm.bigmall.controller") //指定扫描的包
                .title("bigmall后台系统")
                .description("bigmall后台相关接口文档")
                .contactName("xcm")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}