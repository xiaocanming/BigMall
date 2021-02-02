package com.xcm.bigmall.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @描述 用户权限服务
 * @创建人 xcm
 * @创建时间 2021/1/13
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.xcm.bigmall")
public class BigMallAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(BigMallAuthApplication.class, args);
    }
}
