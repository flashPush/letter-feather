package com.letterfeather.letterfeather_client.api;

import com.letterfeather.letterfeather_client.api.protocol.LeFeProtocol;

/**
 * @author: jili
 * @description: 客户端
 * @date: 2019-09-25
 */
public abstract class Client{

    private LeFeProtocol protocol;

    protected abstract void start();

    protected abstract void stop();

    protected abstract void destroy();

    protected abstract boolean isRunning();
}
