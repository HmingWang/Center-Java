package com.whaim;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;

import java.io.StringReader;
import java.lang.reflect.ParameterizedType;

import static com.sun.jmx.mbeanserver.Util.cast;

/**
 * Created by whaim on 2017/6/28.
 */
public class XmlParser<Document> {

    private Document dc;
    private String namespace;

    void parser(String msg){
        try {
            JAXBContext jc = JAXBContext.newInstance(namespace);
            Unmarshaller u = jc.createUnmarshaller();
            dc= cast(JAXBIntrospector.getValue(u.unmarshal(new StringReader(msg))));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public Document getDocument(){
        return dc;
    }

    public void setNamespace(String ns){
        namespace=ns;
    }
}
