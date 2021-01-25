package com.xcm.bigmall.service.impl;

import com.xcm.bigmall.mapper.UmsResourceCategoryMapper;
import com.xcm.bigmall.model.UmsResourceCategory;
import com.xcm.bigmall.model.UmsResourceCategoryExample;
import com.xcm.bigmall.service.UmsResourceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @描述
 * @创建人 xcm
 * @创建时间 2020/12/4
 */
@Service
public class UmsResourceCategoryServiceImpl implements UmsResourceCategoryService {
    @Autowired
    private UmsResourceCategoryMapper resourceCategoryMapper;
    @Override
    public List<UmsResourceCategory> listAll() {
        UmsResourceCategoryExample example=new UmsResourceCategoryExample();
        example.setOrderByClause("sort desc");
        return resourceCategoryMapper.selectByExample(example);
    }

    @Override
    public int create(UmsResourceCategory umsResourceCategory) {
        umsResourceCategory.setCreateTime(new Date());
        return  resourceCategoryMapper.insert(umsResourceCategory);

    }

    @Override
    public int update(Long id, UmsResourceCategory umsResourceCategory) {
        umsResourceCategory.setId(id);
        return  resourceCategoryMapper.updateByPrimaryKeySelective(umsResourceCategory);
    }

    @Override
    public int delete(Long id) {
        return resourceCategoryMapper.deleteByPrimaryKey(id);
    }
}
