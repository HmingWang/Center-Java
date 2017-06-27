package com.whaim;

import org.springframework.stereotype.Component;

/**
 * Created by whaim on 2017/6/27.
 * Message parser class
 */

@Component
public class MessageParser implements IMessageProcessor {




    @Override
    public boolean processMessage(String msg) {
        return true;
    }
}
