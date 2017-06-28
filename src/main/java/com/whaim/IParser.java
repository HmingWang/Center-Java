package com.whaim;

/**
 * Created by whaim on 2017/6/28.
 * Parser interface
 */

public interface IParser<MessageType> {

    public MessageType parser(byte[] msg);
}
