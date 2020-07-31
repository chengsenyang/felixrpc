package com.github.yangchengsen.rpcnettycommon.bean;

import lombok.Data;

@Data
public class RpcResponse implements BodyContent {

    /**
     * 异常信息
     */
    private Exception exception;
    /**
     * 响应结果
     */
    private Object result;
}
