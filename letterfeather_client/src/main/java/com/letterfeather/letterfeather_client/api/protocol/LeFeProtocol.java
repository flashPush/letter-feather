package com.letterfeather.letterfeather_client.api.protocol;

/**
 * @author: jili
 * @description: 鸡毛信协议
 * @date: 2019-09-25
 */
public interface LeFeProtocol {

    boolean healthCheck();

    void fastConnect();

    void handshake();

    void bindUser(String var1);

    void unbindUser();
}
