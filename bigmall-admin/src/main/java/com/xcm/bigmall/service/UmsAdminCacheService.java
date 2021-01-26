package com.xcm.bigmall.service;



import com.xcm.bigmall.model.UmsAdmin;
import com.xcm.bigmall.model.UmsResource;

import java.util.List;

/**
 * @描述 后台管理员缓存信息Service类
 * @创建人 xcm
 * @创建时间 2020/12/2
 */
public interface UmsAdminCacheService {
    /**
     * 删除后台用户缓存
     */
    void delAdmin(Long adminId);

    /**
     * 获取缓存后台用户信息
     */
    UmsAdmin getAdmin(String username);

    /**
     * 设置缓存后台用户信息
     */
    void setAdmin(UmsAdmin admin);
}
