package com.xcm.bigmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @描述 MyBatis相关配置
 * @创建人 xcm
 * @创建时间 2020/12/2
 */
@Configuration
@ServletComponentScan
@MapperScan(basePackages = {"com.xcm.bigmall.mapper","com.xcm.bigmall.dao"})
public class MyBatisConfig {
}
