package com.whaim;

/**
 * Created by whaim on 2017/6/29.
 *
 */

public class Datagram<XMLDocument> {
    public DataHeader getHeader() {
        return header;
    }

    public void setHeader(DataHeader header) {
        this.header = header;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public XMLDocument getDocument() {
        return document;
    }

    public void setDocument(XMLDocument document) {
        this.document = document;
    }

    //message header
    private DataHeader header;
    //signature field
    private String signature;
    //xml body
    private XMLDocument document;
    //additional detail xxxx


}