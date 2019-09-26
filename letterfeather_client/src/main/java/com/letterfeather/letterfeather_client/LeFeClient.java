package com.letterfeather.letterfeather_client;

import com.letterfeather.letterfeather_client.api.Client;
import com.letterfeather.letterfeather_protocol.enums.ProtocolType;
import com.letterfeather.letterfeather_protocol.netty.bootstrap.NettyClient;

/**
 * @author: jili
 * @description: LeFe client
 * @date: 2019-09-26
 */
public class LeFeClient extends Client {

    LeFeClient(ClientConfig config) {
        this.setConfig(config);
        this.setProtocol(config.getProtocol());
        if (ProtocolType.NETTY == config.getProtocol()) {
            this.setClient(new NettyClient(config.getServerHost(), config.getServerPort()));
        } else if (ProtocolType.HTTP == config.getProtocol()) {

        }
    }

    @Override
    public void start() throws Exception {
        client.start();
    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
