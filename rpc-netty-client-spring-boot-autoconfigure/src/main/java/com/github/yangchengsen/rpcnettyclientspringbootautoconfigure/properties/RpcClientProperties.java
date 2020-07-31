package com.github.yangchengsen.rpcnettyclientspringbootautoconfigure.properties;

import com.github.yangchengsen.rpcnettycommon.route.RouteStrategyEnum;
import com.github.yangchengsen.rpcnettycommon.serialization.SerializeTypeEnum;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "rpc.client")
public class RpcClientProperties {
    private RouteStrategyEnum routeStrategy= RouteStrategyEnum.Random;
    private SerializeTypeEnum serializeType=SerializeTypeEnum.JSON;
}
