package com.github.yangchengsen.rpcnettycommon.codec.encode;

import com.github.yangchengsen.rpcnettycommon.protocal.xuan.RemotingTransporter;
import com.github.yangchengsen.rpcnettycommon.serialization.SerializeTypeEnum;
import com.github.yangchengsen.rpcnettycommon.serialization.SerializerEngine;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class RemotingTransporterEncoder extends MessageToByteEncoder<RemotingTransporter> {


    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, RemotingTransporter remotingTransporter, ByteBuf byteBuf) throws Exception {
        //获取请求体数组
        //使用序列化引擎
        byte[] body= SerializerEngine.serialize(remotingTransporter.getBodyContent(), SerializeTypeEnum.queryByCode(remotingTransporter.getFlag().getSerializeType()));
        //magic+flag+invokeId+bodyLength+bodyContent
        byteBuf.writeShort(RemotingTransporter.MAGIC)
                .writeByte(remotingTransporter.getFlag().getThisByte())
                .writeLong(remotingTransporter.getInvokeId())
                .writeInt(body.length)
                .writeBytes(body);
        log.info("write end");

    }


}
