package com.xcm.bigmall.service;

import java.util.List;
import java.util.Map;

/**
 * @描述 缓存获取用户资源服务
 * @创建人 xcm
 * @创建时间 2021/1/29
 */
public interface UmsResourceCacheService {
    /**
     * 获取角色Map
     */
    Map<Object,Object> getMap(String value);
}
