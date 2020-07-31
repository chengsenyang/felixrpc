package com.github.yangchengsen.rpcnettycommon.dispatcher;

import com.github.yangchengsen.rpcnettycommon.protocal.xuan.RemotingTransporter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RequestPendingCenter {

    private Map<Long, RemotingTransporterFuture> map = new ConcurrentHashMap<>();

    public void add(Long invokeId, RemotingTransporterFuture future){
        this.map.put(invokeId, future);
    }

    public void set(Long invokeId, RemotingTransporter remotingTransporter){
        RemotingTransporterFuture remotingTransporterFuture = this.map.get(invokeId);
        if (remotingTransporterFuture != null){
            remotingTransporterFuture.setSuccess(remotingTransporter);
            this.map.remove(invokeId);
        }
    }
}
