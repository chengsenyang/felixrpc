package com.github.yangchengsen.rpcprovider.Impl;


import com.github.yangchengsen.rpclib.HelloService;
import com.github.yangchengsen.rpcnettycommon.annotation.RpcService;

@RpcService(value = HelloService.class,weight = 2,workerThreads = 3)
public class HelloServiceImpl implements HelloService {

  @Override
  public String say(String name) {
    return "hello " + name;
  }

}
