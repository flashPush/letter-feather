package com.letterfeather.letterfeather_client;

import com.letterfeather.letterfeather_client.api.Client;
import com.letterfeather.letterfeather_client.api.protocol.LeFeProtocol;
import lombok.Setter;

/**
 * @author: jili
 * @description: 客户端配置
 * @date: 2019-09-26
 */
@Setter
public final class ClientConfig {

    public static ClientConfig clientConfig = new ClientConfig();
    /**
     * 通信协议
     */
    private LeFeProtocol protocol;
    /**
     * 服务器host
     */
    private String serverHost;
    /**
     * 服务器端口
     */
    private int serverPort;

    public static ClientConfig build(){
        return clientConfig;
    }

    public Client create(){
        return new LeFeClient(this);
    }
}
