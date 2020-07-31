package com.github.yangchengsen.rpcnettycommon.bean;

import com.github.yangchengsen.rpcnettycommon.route.WeightGetAble;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  服务信息,用于存储到注册中心
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceInfo implements WeightGetAble {

    private String host;
    private int port;
    /**
     * 权重信息
     */
    private int weight;
    /**
     * 最大工作线程数
     */
    private int workerThreads;

    public ServiceInfo (ServiceInfo serviceInfo){
        this.host = serviceInfo.host;
        this.port = serviceInfo.port;
        this.weight = serviceInfo.weight;
        this.workerThreads = serviceInfo.workerThreads;
    }

    @Override
    public int getWeightFactors() {
        return getWeight();
    }
}
