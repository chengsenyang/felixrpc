package com.github.yangchengsen.rpcnettycommon.route.impl;

import com.github.yangchengsen.rpcnettycommon.route.RouteStrategy;
import org.apache.commons.lang3.RandomUtils;

import java.util.List;


/**
 * 随机策略 负载均衡
 */
public class RandomRouteStrategyImpl implements RouteStrategy  {

    @Override
    public <T> T select(List<T> primeList) {
        return primeList.get(RandomUtils.nextInt(0, primeList.size()));
    }

}
