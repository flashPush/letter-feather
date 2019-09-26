package com.letterfeather.letterfeather_protocol.protocol;

/**
 * @author: jili
 * @description: 协议客户端
 * @date: 2019-09-26
 */
public abstract class ProtocolClient {

    protected String host;

    protected int port;

    public ProtocolClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public abstract void start() throws Exception;
}
