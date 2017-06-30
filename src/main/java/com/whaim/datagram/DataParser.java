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
import java.io.UnsupportedEncodingException;

/**
 * Created by whaim on 2017/6/28.
 */

@Component
public class DataParser<Document>{

    @Value("${datagram.schema.root}")
    private String schemaRootPath;
    @Value("${datagram.schema.prefix}")
    private String schemaPrefix;
    @Value("${datagram.schema.postfix}")
    private String schemaPostfix;
    @Value("${datagram.charset}")
    private String charsetName;
    @Value("${datagram.block.header}")
    private String headerBlock;
    @Value("${datagram.block.signature}")
    private String signatureBlock;
    @Value("${datagram.block.xml}")
    private String xmlBlock;

    @Autowired //default autowired all member is null
    private Datagram<Document> datagram;

    //entry point parameters
    private byte[] rawData;
    private Class<?> clazz;

    //middle component
    private String message;
    private String headerField;
    private String xmlField;
    private String additionField;
    private String signatureField;
    private String signatureString;

    //entry point
    public Datagram<Document> parser(byte[] msg,Class<?> valueType) throws UnsupportedEncodingException, JAXBException, SAXException {

        rawData=msg;
        clazz=valueType;

        splitMessage();

        Datagram dg=new Datagram();
        dg.setHeader(getHeader());
        dg.setDocument(getDocument());

        return dg;
    }

    private void splitMessage() throws UnsupportedEncodingException {
        message =new String(rawData,charsetName);
        headerField = message.substring(message.indexOf(headerBlock), message.indexOf(signatureBlock));
        signatureField= message.substring(message.indexOf(signatureBlock), message.indexOf(xmlBlock));
        xmlField = message.substring(message.indexOf(xmlBlock));

        //signature string in hex
        signatureString=signatureField.substring(signatureField.indexOf(signatureBlock)+3,signatureField.indexOf('}')).trim();

        //TODO: additional field
    }

    private DataHeader getHeader(){
        DataHeader header=new DataHeader();
        header.setMesgType("301.002");
        return header;
    }
    private Object getDocument() throws JAXBException, SAXException {

        JAXBContext jc = JAXBContext.newInstance(clazz.getPackage().getName());
        Unmarshaller u = jc.createUnmarshaller();
        u.setSchema(SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(new File(getSchemaPath())));
        Document doc= (Document) JAXBIntrospector.getValue(u.unmarshal(new StringReader(xmlField)));

        return doc;
    }

    //
    private String getSchemaPath(){
        return schemaRootPath+'\\'+schemaPrefix+getMessageType()+schemaPostfix;
    }

    private String getMessageType(){
        byte[] msgType=new byte[7]; // e.g. 301.001
        System.arraycopy(rawData,93,msgType,0,7);
        return new String(msgType);
    }
}
