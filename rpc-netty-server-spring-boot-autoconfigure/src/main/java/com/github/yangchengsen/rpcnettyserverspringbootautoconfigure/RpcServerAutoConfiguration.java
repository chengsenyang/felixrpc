package com.github.yangchengsen.rpcnettyserverspringbootautoconfigure;


import com.github.yangchengsen.rpcnettycommon.properties.ZKProperties;
import com.github.yangchengsen.rpcnettyserverspringbootautoconfigure.properties.RpcServerProperties;
import com.github.yangchengsen.rpcnettyserverspringbootautoconfigure.registry.zookeeper.ZKServiceRegistry;
import com.github.yangchengsen.rpcnettyserverspringbootautoconfigure.server.RpcServer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(RpcServer.class)
public class RpcServerAutoConfiguration {
    @ConditionalOnMissingBean
    @Bean
    public RpcServerProperties defaultRpcServerProperties(){
        return new RpcServerProperties();
    }

    @ConditionalOnMissingBean
    @Bean
    public ZKProperties defaultZKProperties(){
        return new ZKProperties();
    }

    @ConditionalOnMissingBean
    @Bean
    public ZKServiceRegistry zkServiceRegistry(){
        return new ZKServiceRegistry();
    }

    @Bean
    public RpcServer rpcServer(){
        return new RpcServer();
    }



}
