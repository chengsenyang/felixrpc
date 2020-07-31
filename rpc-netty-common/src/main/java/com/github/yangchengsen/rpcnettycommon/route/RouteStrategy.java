package com.github.yangchengsen.rpcnettycommon.route;

import java.util.List;

/**
 * 路由策略接口
 */
public interface RouteStrategy {

    /**
     * 负载策略算法
     *
     * @param primeList 原始列表
     * @return
     */
    <T> T select(List<T> primeList);

    /**
     * 带权负载策略算法
     *
     * @param primeList 原始列表
     * @return
     */
    default  <T extends WeightGetAble> T selectWithWeight(List<T> primeList){
        return select(WeightUtil.getWeightList(primeList));
    }
}
