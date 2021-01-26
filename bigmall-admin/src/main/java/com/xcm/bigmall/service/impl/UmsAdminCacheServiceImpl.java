package com.xcm.bigmall.service.impl;


import cn.hutool.core.collection.CollUtil;
import com.xcm.bigmall.common.service.RedisService;
import com.xcm.bigmall.dao.UmsAdminRoleRelationDao;
import com.xcm.bigmall.mapper.UmsAdminRoleRelationMapper;
import com.xcm.bigmall.model.UmsAdmin;
import com.xcm.bigmall.model.UmsAdminRoleRelation;
import com.xcm.bigmall.model.UmsAdminRoleRelationExample;
import com.xcm.bigmall.model.UmsResource;
import com.xcm.bigmall.service.UmsAdminCacheService;
import com.xcm.bigmall.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @描述 后台管理员缓存信息Service实现类
 * @创建人 xcm
 * @创建时间 2020/12/2
 */
@Service
public class UmsAdminCacheServiceImpl implements UmsAdminCacheService {
    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;
    @Value("${redis.key.admin}")
    private String REDIS_KEY_ADMIN;

    @Resource
    private RedisService redisService;

    @Override
    public void delAdmin(Long adminId) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_ADMIN + ":" + adminId;
        redisService.del(key);
    }

    @Override
    public UmsAdmin getAdmin(String username) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_ADMIN + ":" + username;
        return (UmsAdmin) redisService.get(key);
    }

    @Override
    public void setAdmin(UmsAdmin admin) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_ADMIN + ":" + admin.getUsername();
        redisService.set(key, admin, REDIS_EXPIRE);
    }


}
