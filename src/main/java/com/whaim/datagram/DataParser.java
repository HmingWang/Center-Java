package com.whaim.datagram;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;

import java.io.StringReader;

/**
 * Created by whaim on 2017/6/28.
 */
public class DataParser<Document> {

    private static final int headerlen=162;

    private Document dc;
    private String namespace;

    public Datagram<Document> parser(byte[] msg){

        Datagram<Document> dg=new Datagram<Document>();
        dg.setHeader(getHeader(msg));
        dg.setDocument(getDocument(msg));

        return dg;
    }

    public DataHeader getHeader(byte[] msg){
        DataHeader header=new DataHeader();
        header.setMesgType("301.002");
        return header;
    }
    public Document getDocument(byte[] msg){
        String msgString=new String(msg);
        String xmlbody=msgString.substring(msgString.indexOf("<?xml"));

        try {
            JAXBContext jc = JAXBContext.newInstance(namespace);
            Unmarshaller u = jc.createUnmarshaller();
            dc= (Document) JAXBIntrospector.getValue(u.unmarshal(new StringReader(xmlbody)));

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return dc;
    }

    public void setNamespace(String ns){
        namespace=ns;
    }
}
