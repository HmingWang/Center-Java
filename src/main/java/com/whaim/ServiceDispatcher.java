package com.whaim;

import org.springframework.stereotype.Component;
import service.Service_szfs301002;

import java.util.Map;

/**
 * Created by whaim on 2017/6/27.
 * Message parser class
 */

@Component
public class ServiceDispatcher implements IDispatcher {

    private Map<String,IService> serviceMap;

    public void registerService(IService service){
        serviceMap.put(service.getMessageTye(),service);
    }


    //get message type and  subtype from message header
    private String getMsgType(byte[] msg){
        byte[] msgType=new byte[7]; // e.g. 301.001
        System.arraycopy(msg,94,msgType,0,7);

        return new String(msgType);
    }

    @Override
    public boolean dispatch(byte[] msg) {

        /*
        TODO: dispatch message
        1. Get message type and subtype
        2. send byte message to the process service
        */

        String msgType=getMsgType(msg);

        IService service=serviceMap.get(msgType);
        service.process(msg);

        return true;
    }

    // constructor function by singleton pattern
    public ServiceDispatcher(){

        //register service
        registerService(new Service_szfs301002());
    }
}
