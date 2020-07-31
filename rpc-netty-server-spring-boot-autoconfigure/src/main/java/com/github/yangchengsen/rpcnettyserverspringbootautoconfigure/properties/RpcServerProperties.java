package com.github.yangchengsen.rpcnettyserverspringbootautoconfigure.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "rpc.server")
public class RpcServerProperties {
    private int port=9000;
}
