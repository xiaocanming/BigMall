package com.xcm.bigmall.controller;

import com.xcm.bigmall.common.api.CommonPage;
import com.xcm.bigmall.common.api.CommonResult;
import com.xcm.bigmall.common.domain.UserDto;
import com.xcm.bigmall.model.UmsResource;
import com.xcm.bigmall.service.UmsResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @描述 后台资源管理Controller
 * @创建人 xcm
 * @创建时间 2020/12/4
 */
@Controller
@Api(tags = "UmsResourceController", description = "后台资源管理")
@RequestMapping("/resource")
public class UmsResourceController {
    @Autowired
    private UmsResourceService resourceService;


    @ApiOperation("添加后台资源")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody UmsResource umsResource) {
        int count = resourceService.create(umsResource);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("修改后台资源")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Long id,
                               @RequestBody UmsResource umsResource) {
        int count = resourceService.update(id, umsResource);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("根据ID获取资源详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<UmsResource> getItem(@PathVariable Long id) {
        UmsResource umsResource = resourceService.getItem(id);
        return CommonResult.success(umsResource);
    }

    @ApiOperation("根据ID删除后台资源")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable Long id) {
        int count = resourceService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("分页模糊查询后台资源")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<UmsResource>> list(@RequestParam(required = false) Long categoryId,
                                                      @RequestParam(required = false) String nameKeyword,
                                                      @RequestParam(required = false) String urlKeyword,
                                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsResource> resourceList = resourceService.list(categoryId,nameKeyword, urlKeyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(resourceList));
    }

    @ApiOperation("查询所有后台资源")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UmsResource>> listAll() {
        List<UmsResource> resourceList = resourceService.listAll();
        return CommonResult.success(resourceList);
    }

    @ApiOperation("获取角色资源初始化信息")
    @RequestMapping(value = "/listResourceRoles", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,List<String>> getResourceRolesList() {
        Map<String,List<String>> resourceRolesList = resourceService.initResourceRolesMap();
        return resourceRolesList;
    }
}
