package com.whaim;

import com.whaim.datagram.DataParser;
import com.whaim.service.IService;
import com.whaim.service.Service_szfs301002;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import szfs.std.szfs._2010.tech.xsd.szfs_301_002.Document;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by whaim on 2017/6/30.
 */

@Configuration
public class SpringConfig {


    @Autowired
    List<IService> serviceList;

    @Bean
    public Map<String,IService> registerService(){

        Map<String,IService> map=new HashMap<>();

        for(IService it : serviceList){
            map.put(it.getMessageTye(),it);
        }

        return map;
    }

}
