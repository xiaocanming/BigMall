package com.xcm.bigmall.common.exception;

import com.xcm.bigmall.common.api.IErrorCode;

/**
 * @描述 断言处理类，用于抛出各种API异常
 * @创建人 xcm
 * @创建时间 2020/12/3
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
