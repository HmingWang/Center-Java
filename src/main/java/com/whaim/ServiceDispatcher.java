package com.whaim;

import com.whaim.mq.IDispatcher;
import org.springframework.stereotype.Component;
import com.whaim.service.IService;
import com.whaim.service.Service_szfs301002;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by whaim on 2017/6/27.
 * Message parser class
 */

@Component
public class ServiceDispatcher implements IDispatcher {

    private Map<String, IService> serviceMap;

    public void registerService(IService service){
        String code=service.getMessageTye();

        serviceMap.put(code,service);
    }


    //get message type and  subtype from message header
    private String getMsgType(byte[] msg){
        byte[] msgType=new byte[7]; // e.g. 301.001
        System.arraycopy(msg,93,msgType,0,7);

        return new String(msgType);
    }

    @Override
    public boolean dispatch(byte[] msg) {

        /*
        TODO: dispatch message
        1. parser message
        2. send byte message to the process com.whaim.service
        */

        String msgType=getMsgType(msg);

        IService service=serviceMap.get(msgType);
        service.process(msg);

        return true;
    }

    // constructor function by singleton pattern
    public ServiceDispatcher(){
        serviceMap=new HashMap<String,IService>();
        //register com.whaim.service
        Service_szfs301002 szfs301002=new Service_szfs301002();
        registerService(szfs301002);
    }
}
