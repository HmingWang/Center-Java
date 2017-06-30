package com.whaim.mq;

import com.whaim.datagram.DataParser;
import com.whaim.datagram.Datagram;
import com.whaim.mq.IDispatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.whaim.service.IService;
import com.whaim.service.Service_szfs301002;
import szfs.std.szfs._2010.tech.xsd.szfs_302_002.Document;
import xml.Szfs302001;

import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by whaim on 2017/6/27.
 * Message parser class
 */

@Component
public class ServiceDispatcher implements IDispatcher {

    private static Logger logger= LoggerFactory.getLogger( ServiceDispatcher.class );

    @Autowired
    public void setSzfs301002(Service_szfs301002 szfs301002) {
        this.szfs301002 = szfs301002;
    }

    @Autowired
    public void setServiceMap(Map<String, IService> serviceMap) {
        this.serviceMap = serviceMap;
    }


    private Service_szfs301002 szfs301002;


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

        serviceMap=new HashMap<>();

        //register service

        registerService(szfs301002);



    }
}
