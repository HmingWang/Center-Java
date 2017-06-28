package com.whaim;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;

import szfs.std.szfs._2010.tech.xsd.szfs_301_002.*;

import java.io.File;
import java.io.StringReader;

import static com.sun.jmx.mbeanserver.Util.cast;

/**
 * Created by whaim on 2017/6/28.
 */
public class XMLParser {

    public Document dc;
    public Object ob;

    void parser(String msg){
        try {
            JAXBContext jc = JAXBContext.newInstance(Document.class.getPackage().getName());
            Unmarshaller u = jc.createUnmarshaller();
            dc= cast(JAXBIntrospector.getValue(u.unmarshal(new StringReader(msg))));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
