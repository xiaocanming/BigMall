package com.xcm.bigmall.dao;

import com.xcm.bigmall.model.UmsMenu;
import com.xcm.bigmall.model.UmsResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @描述
 * @创建人 xcm
 * @创建时间 2020/12/3
 */
public interface UmsRoleDao {
    /**
     * 根据后台用户ID获取菜单
     */
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);
    /**
     * 根据角色ID获取菜单
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);
    /**
     * 根据角色ID获取资源
     */
    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);
}
