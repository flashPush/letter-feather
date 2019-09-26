package com.letterfeather.letterfeather_client.api;

import com.letterfeather.letterfeather_client.ClientConfig;
import com.letterfeather.letterfeather_protocol.enums.ProtocolType;
import com.letterfeather.letterfeather_protocol.protocol.ProtocolClient;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: jili
 * @description: 客户端
 * @date: 2019-09-25
 */
@Setter
@Getter
@ToString
public abstract class Client{

    protected ProtocolType protocol;

    protected ProtocolClient client;

    protected ClientConfig config;

    protected abstract void start() throws Exception;

    protected abstract void stop();

    protected abstract void destroy();

    protected abstract boolean isRunning();
}
