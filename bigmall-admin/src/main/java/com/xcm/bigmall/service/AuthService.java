package com.xcm.bigmall.service;

import com.xcm.bigmall.common.api.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @描述 认证服务远程调用
 * @创建人 xcm
 * @创建时间 2021/1/25
 */
@FeignClient("bigmall-auth")
public interface AuthService {

    @PostMapping(value = "/oauth/token")
    CommonResult getAccessToken(@RequestParam Map<String, String> parameters);
}
