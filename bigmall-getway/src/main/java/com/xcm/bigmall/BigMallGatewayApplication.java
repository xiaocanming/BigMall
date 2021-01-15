package com.xcm.bigmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @描述
 * @创建人 xcm
 * @创建时间 2021/1/12
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BigMallGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(BigMallGatewayApplication.class, args);
    }
}
