package com.whaim;

import org.springframework.stereotype.Component;
import szfs.std.szfs._2010.tech.xsd.szfs_302_002.Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamReader;
import java.io.ByteArrayInputStream;

/**
 * Created by whaim on 2017/6/27.
 * Message parser class
 */

@Component
public class MessageParser implements IMessageProcessor {


    private String header;
    private String xmlbody;
    private String detaillist;


    @Override
    public boolean processMessage(String msg) {

        //TODO：parser xml
        //szfs system user substring position is 811 ipsp system use 808
        xmlbody=msg.substring(808);

        //Unmarshaller xml string
        try {
            JAXBContext jc = JAXBContext.newInstance( "szfs.std.szfs._2010.tech.xsd.szfs_302_002" );
            Unmarshaller u = jc.createUnmarshaller();
            JAXBElement<Document> o = (JAXBElement<Document>)u.unmarshal(new ByteArrayInputStream(xmlbody.getBytes()));
            Document document = o.getValue();
            System.out.println(document.getColltnChrgs().getColltnChrgsInf().getCdtrId());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return true;
    }
}
