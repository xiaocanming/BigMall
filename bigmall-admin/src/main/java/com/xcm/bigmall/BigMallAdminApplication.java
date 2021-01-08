package com.xcm.bigmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @描述 后台项目启动
 * @创建人 xcm
 * @创建时间 2021/1/7
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BigMallAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(BigMallAdminApplication.class,args);
    }
}
