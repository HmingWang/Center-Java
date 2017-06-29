package com.whaim.service;

/**
 * Created by whaim on 2017/6/28.
 * message process com.whaim.service
 */
public interface IService {
    // get message type
    public String getMessageTye();

    // message process main method
    public void process(byte[] msg);
}
