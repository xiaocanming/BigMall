package com.xcm.bigmall;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @描述 访问地址 http://localhost:8101
 * @创建人 xcm
 * @创建时间 2021/2/1
 */
@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class BigMallMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigMallMonitorApplication.class, args);
    }

}
