package com.xcm.bigmall.service;

import com.xcm.bigmall.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @描述
 * @创建人 xcm
 * @创建时间 2021/1/14
 */
@FeignClient("bigmall-admin")
public interface UmsAdminService {

    @GetMapping("/resource/listResourceRoles")
    Map<String, List<String>> getResourceRolesList();

}
