package com.github.yangchengsen.rpcnettycommon.bean;

import lombok.Data;

@Data
public class RpcRequest implements BodyContent {

    /**
     * 接口名称
     */
    private String interfaceName;
    /**
     * 方法名
     */
    private String methodName;
    /**
     * 方法参数类型列表
     */
    private Class<?>[] parameterTypes;
    /**
     * 参数列表
     */
    private Object[] parameters;
}
