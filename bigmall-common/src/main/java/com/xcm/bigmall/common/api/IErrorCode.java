package com.xcm.bigmall.common.api;

/**
 * @描述 封装API的错误码
 * @创建人 xcm
 * @创建时间 2021/1/15
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
