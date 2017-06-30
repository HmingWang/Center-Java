package com.whaim;

import com.whaim.datagram.DataParser;
import com.whaim.service.Service_szfs301002;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import szfs.std.szfs._2010.tech.xsd.szfs_301_002.Document;

/**
 * Created by whaim on 2017/6/30.
 */

@Configuration
public class SpringConfig {
//
//    @Autowired
//    private DataParser<Document> dp;


    @Bean
    public Service_szfs301002 getService302001(){
        Service_szfs301002 tmp=new Service_szfs301002();
//        tmp.setParser(dp);
        return tmp;
    }



}
