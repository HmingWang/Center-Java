package com.whaim.service;

import com.whaim.datagram.DataParser;
import com.whaim.datagram.Datagram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import szfs.std.szfs._2010.tech.xsd.szfs_301_002.Document;

/**
 * Created by whaim on 2017/6/28.
 */


public class Service_szfs301002 implements IService{

    //message type
    private static final String msgType="301.002";

    private Datagram<Document> doc=new Datagram<>();

    public void setParser(DataParser<Document> parser) {
        this.parser = parser;
    }

    private DataParser<Document> parser;

    @Override
    public String getMessageTye() {
        return msgType;
    }

    @Override
    public void process(byte[] msg) {


        doc=parser.parser(msg,Document.class);

        System.out.println(doc.getDocument().getPmtByAgcy().getPmtByAgcyInf().getCdtr().getId());
        return;
    }

}
