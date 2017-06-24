package com.whaim;

import org.springframework.stereotype.Component;

import javax.jms.*;

/**
 * Created by 王海明 on 2017/6/24.
 */

@Component
public class MessageQueueManager {
    private String hostname;
    private int port;
}
