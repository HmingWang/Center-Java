package com.whaim.datagram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.SchemaFactory;

import java.io.File;
import java.io.StringReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by whaim on 2017/6/28.
 */

@Component
public class DataParser<Document>{

    private static final int headerlen=162;

    private Document doc;
    private byte[] rawData;
    private Class<?> clazz;

    public void setSchemaRootPath(String schemaRootPath) {
        this.schemaRootPath = schemaRootPath;
    }

    public void setSchemaPrefix(String schemaPrefix) {
        this.schemaPrefix = schemaPrefix;
    }

    public void setSchemaPostfix(String schemaPostfix) {
        this.schemaPostfix = schemaPostfix;
    }

    @Value("${datagram.schema.root}")
    private String schemaRootPath;
    @Value("${datagram.schema.prefix}")
    private String schemaPrefix;
    @Value("${datagram.schema.postfix}")
    private String schemaPostfix;

    //entry point
    public Datagram<Document> parser(byte[] msg,Class<?> valueType){

        rawData=msg;
        clazz=valueType;

        Datagram dg=new Datagram();
        dg.setHeader(getHeader(msg));
        dg.setDocument(getDocument(msg));

        return dg;
    }

    private DataHeader getHeader(byte[] msg){
        DataHeader header=new DataHeader();
        header.setMesgType("301.002");
        return header;
    }
    private Object getDocument(byte[] msg){
        String msgString=new String(msg);
        String xmlBody=msgString.substring(msgString.indexOf("<?xml"));

        try {
            JAXBContext jc = JAXBContext.newInstance(clazz.getPackage().getName());
            Unmarshaller u = jc.createUnmarshaller();
            u.setSchema(SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(new File(getSchemaPath())));
            doc= (Document) JAXBIntrospector.getValue(u.unmarshal(new StringReader(xmlBody)));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return doc;
    }

    //
    private String getSchemaPath(){
        return schemaRootPath+schemaPrefix+getMessageType()+schemaPostfix;
    }

    private String getMessageType(){
        byte[] msgType=new byte[7]; // e.g. 301.001
        System.arraycopy(rawData,93,msgType,0,7);
        return new String(msgType);
    }
}
