package com.github.yangchengsen.rpcnettycommon.annotation;

import org.springframework.stereotype.Service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 目前仅起标识作用
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Service
public @interface RpcReference {

}