package com.xcm.bigmall.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.convert.Convert;
import com.xcm.bigmall.common.annotation.CacheException;
import com.xcm.bigmall.common.constant.AuthConstant;
import com.xcm.bigmall.common.domain.UserDto;
import com.xcm.bigmall.service.UmsAdminService;
import com.xcm.bigmall.service.UmsResourceCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @描述
 * @创建人 xcm
 * @创建时间 2021/1/29
 */
@Service
public class UmsResourceCacheServiceImpl implements UmsResourceCacheService {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public Map<Object,Object> getMap(String value) {
        Map<Object,Object> mapObject = redisTemplate.opsForHash().entries(value);
        return mapObject;
    }
}
