package com.xcm.bigmall.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述
 * @创建人 xcm
 * @创建时间 2021/1/7
 */
@Controller
@RequestMapping("/user")
@RefreshScope
public class UmsAdminController {
    @GetMapping("/{id}")
    @ResponseBody
    public String getUser(Long id) {
        return "结果"+String.valueOf(id);
    }

}
