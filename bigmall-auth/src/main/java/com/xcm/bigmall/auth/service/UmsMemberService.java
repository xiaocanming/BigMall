package com.xcm.bigmall.auth.service;

import com.xcm.bigmall.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @描述
 * @创建人 xcm
 * @创建时间 2021/1/14
 */
@FeignClient("bigmall-portal")
public interface UmsMemberService {
    @GetMapping("/sso/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);
}
