package com.xcm.bigmall.common.annotation;

import java.lang.annotation.*;

/**
 * @描述 redis 自定义注解，有该注解的缓存方法会抛出异常
 * @创建人 xcm
 * @创建时间 2020/12/4
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
