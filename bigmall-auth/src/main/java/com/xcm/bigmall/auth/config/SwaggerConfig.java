package com.xcm.bigmall.auth.config;

import com.xcm.bigmall.common.config.BaseSwaggerConfig;
import com.xcm.bigmall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @描述 Swagger API文档相关配置
 * @创建人 xcm
 * @创建时间 2021/1/15
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.xcm.bigmall.auth.controller") //指定扫描的包
                .title("bigmall认证中心")
                .description("bigmall认证中心相关接口文档")
                .contactName("xcm")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
