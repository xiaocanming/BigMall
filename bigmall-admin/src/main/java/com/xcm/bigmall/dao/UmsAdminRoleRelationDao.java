package com.xcm.bigmall.dao;

import com.xcm.bigmall.model.UmsAdminRoleRelation;
import com.xcm.bigmall.model.UmsResource;
import com.xcm.bigmall.model.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @描述 自定义后台用户与角色管理Dao
 * @创建人 xcm
 * @创建时间 2020/12/2
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 批量插入用户角色关系
     */
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);
    /**
     * 获取用户所有可访问资源
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);
    /**
     * 获取用于所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);
    /**
     * 获取资源相关用户ID列表
     */
    List<Long> getAdminIdList(@Param("resourceId") Long resourceId);
}
