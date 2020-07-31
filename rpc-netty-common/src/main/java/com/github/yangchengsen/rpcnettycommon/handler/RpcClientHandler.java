package com.github.yangchengsen.rpcnettycommon.handler;

import com.github.yangchengsen.rpcnettycommon.dispatcher.RequestPendingCenter;
import com.github.yangchengsen.rpcnettycommon.protocal.xuan.RemotingTransporter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.log4j.Log4j2;

import java.util.concurrent.ConcurrentMap;

@Log4j2
public class RpcClientHandler extends SimpleChannelInboundHandler<RemotingTransporter> {

    private RequestPendingCenter requestPendingCenter;

    public RpcClientHandler(RequestPendingCenter requestPendingCenter){
        this.requestPendingCenter = requestPendingCenter;
    }

//    private ConcurrentMap<Long,RemotingTransporter> remotingTransporterMap;
//
//    public RpcClientHandler(ConcurrentMap<Long,RemotingTransporter> remotingTransporterMap){
//        this.remotingTransporterMap=remotingTransporterMap;
//    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, RemotingTransporter remotingTransporter) throws Exception {
        log.info("read a Response,invokeId: "+remotingTransporter.getInvokeId());
//        remotingTransporterMap.put(remotingTransporter.getInvokeId(),remotingTransporter);
        requestPendingCenter.set(remotingTransporter.getInvokeId(), remotingTransporter);
    }
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
        log.error("client caught exception",cause);
        ctx.close();
    }


}
