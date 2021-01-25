package com.xcm.bigmall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @描述 文件上传返回结果
 * @创建人 xcm
 * @创建时间 2020/12/15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MinioUploadDto {
    @ApiModelProperty("文件访问URL")
    private String url;
    @ApiModelProperty("文件名称")
    private String name;
}
