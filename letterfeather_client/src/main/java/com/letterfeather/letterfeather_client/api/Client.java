package com.letterfeather.letterfeather_client.api;

import com.letterfeather.letterfeather_client.ClientConfig;
import com.letterfeather.letterfeather_client.api.protocol.LeFeProtocol;
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

    private LeFeProtocol protocol;

    private ClientConfig config;

    protected abstract void start();

    protected abstract void stop();

    protected abstract void destroy();

    protected abstract boolean isRunning();
}
