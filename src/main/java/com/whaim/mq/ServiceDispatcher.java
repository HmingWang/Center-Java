package com.whaim.mq;


import com.whaim.service.Service_szfs301002;
import org.aspectj.lang.annotation.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import com.whaim.service.IService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by whaim on 2017/6/27.
 * Message parser class
 */

@Component
public class ServiceDispatcher implements IDispatcher {

    private static Logger logger= LoggerFactory.getLogger( ServiceDispatcher.class );

    @Resource(name = "registerService")
    private Map<String,IService> serviceMap;


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
        2. send byte message to the process service
        */

        String msgType=getMsgType(msg);

        logger.info( "Received message type :"+msgType );

        if(serviceMap.containsKey( msgType )){
            IService service=serviceMap.get(msgType);
            service.process(msg);
        }else{
            logger.warn( "message type : "+msgType+" don't have service" );
        }

        return true;
    }

}
