package com.github.yangchengsen.rpcnettyclientspringbootautoconfigure;


import com.github.yangchengsen.rpcnettyclientspringbootautoconfigure.processor.RpcClientBeanPostProcessor;
import com.github.yangchengsen.rpcnettyclientspringbootautoconfigure.client.RpcClient;
import com.github.yangchengsen.rpcnettyclientspringbootautoconfigure.discovery.zookeeper.ZKServiceDiscovery;
import com.github.yangchengsen.rpcnettyclientspringbootautoconfigure.properties.RpcClientProperties;
import com.github.yangchengsen.rpcnettycommon.properties.ZKProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConditionalOnClass(RpcClient.class)
public class RpcClientAutoConfiguration {

    @ConditionalOnMissingBean
    @Bean
    public RpcClientProperties defaultRpcServerProperties(){
        return new RpcClientProperties();
    }

    @ConditionalOnMissingBean
    @Bean
    public ZKProperties defaultZKProperties(){
        return new ZKProperties();
    }

    @ConditionalOnMissingBean
    @Bean
    public ZKServiceDiscovery zkServiceDiscovery(){
        return new ZKServiceDiscovery();
    }

    @Bean
    public RpcClient rpcClient(){
        return new RpcClient();
    }

    @Bean
    public RpcClientBeanPostProcessor rpcClientBeanPostProcessor(){
        return new RpcClientBeanPostProcessor();
    }
}
