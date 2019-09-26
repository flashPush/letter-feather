package com.letterfeather.letterfeather_client;

import com.letterfeather.letterfeather_client.api.Client;
import com.letterfeather.letterfeather_protocol.enums.ProtocolType;
import lombok.Getter;
import lombok.ToString;

/**
 * @author: jili
 * @description: 客户端配置
 * @date: 2019-09-26
 */
@Getter
@ToString
public final class ClientConfig {

    public static ClientConfig clientConfig = new ClientConfig();
    /**
     * 通信协议
     */
    private ProtocolType protocol;
    /**
     * 服务器host
     */
    private String serverHost;
    /**
     * 服务器端口
     */
    private int serverPort;
    /**
     * 客户端系统
     */
    private String hostSystem;
    /**
     * user id
     */
    private String userId;
    /**
     * device id
     */
    private String deviceId;

    public static ClientConfig build(){
        return clientConfig;
    }

    public Client create(){
        return new LeFeClient(this);
    }

    public ClientConfig setProtocol(ProtocolType protocol) {
        this.protocol = protocol;
        return this;
    }

    public ClientConfig setServerHost(String serverHost) {
        this.serverHost = serverHost;
        return this;
    }

    public ClientConfig setServerPort(int serverPort) {
        this.serverPort = serverPort;
        return this;
    }

    public ClientConfig setHostSystem(String hostSystem) {
        this.hostSystem = hostSystem;
        return this;
    }

    public ClientConfig setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public ClientConfig setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
}
