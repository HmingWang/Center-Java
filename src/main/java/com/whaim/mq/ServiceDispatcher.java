package com.whaim.mq;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

    private static Logger logger= LoggerFactory.getLogger( ServiceDispatcher.class );

    private Map<String,IService> serviceMap;

    private void registerService(IService service){

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

    // constructor function by singleton pattern
    public ServiceDispatcher(){

        ApplicationContext  ac= new AnnotationConfigApplicationContext( "com.whaim" );

        serviceMap=new HashMap<>();

        //register service
        registerService(ac.getBean( Service_szfs301002.class ));



    }
}
