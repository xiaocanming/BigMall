package com.xcm.bigmall.service;


import com.xcm.bigmall.model.UmsResourceCategory;

import java.util.List;

/**
 * @描述 后台资源分类管理Service
 * @创建人 xcm
 * @创建时间 2020/12/4
 */
public interface UmsResourceCategoryService {
    /**
     * 获取所有资源分类
     */
    List<UmsResourceCategory> listAll();

    /**
     * 创建资源分类
     */
    int create(UmsResourceCategory umsResourceCategory);

    /**
     * 修改资源分类
     */
    int update(Long id, UmsResourceCategory umsResourceCategory);

    /**
     * 删除资源分类
     */
    int delete(Long id);
}
