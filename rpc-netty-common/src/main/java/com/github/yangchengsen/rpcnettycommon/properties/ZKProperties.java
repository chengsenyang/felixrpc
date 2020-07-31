package com.github.yangchengsen.rpcnettycommon.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "zk")
public class ZKProperties {
    private String address ;
    private int sessionTimeOut=5000;
    private int connectTimeOut=1000;
    private String registryPath="/defaultRegistry";

}
