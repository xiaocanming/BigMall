package com.xcm.bigmall.common.exception;


import com.xcm.bigmall.common.api.IErrorCode;

/**
 * @描述 自定义API异常
 * @创建人 xcm
 * @创建时间 2020/12/3
 */
public class ApiException extends RuntimeException{
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
