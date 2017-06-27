//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.27 时间 03:52:26 PM CST 
//


package szfs.std.szfs._2010.tech.xsd.szfs_302_002;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the szfs.std.szfs._2010.tech.xsd.szfs_302_002 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Document_QNAME = new QName("urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: szfs.std.szfs._2010.tech.xsd.szfs_302_002
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link AdditionalInformation1 }
     * 
     */
    public AdditionalInformation1 createAdditionalInformation1() {
        return new AdditionalInformation1();
    }

    /**
     * Create an instance of {@link Debtor1 }
     * 
     */
    public Debtor1 createDebtor1() {
        return new Debtor1();
    }

    /**
     * Create an instance of {@link CollectionCharges }
     * 
     */
    public CollectionCharges createCollectionCharges() {
        return new CollectionCharges();
    }

    /**
     * Create an instance of {@link Creditor1 }
     * 
     */
    public Creditor1 createCreditor1() {
        return new Creditor1();
    }

    /**
     * Create an instance of {@link CollectionChargesInformation }
     * 
     */
    public CollectionChargesInformation createCollectionChargesInformation() {
        return new CollectionChargesInformation();
    }

    /**
     * Create an instance of {@link GroupHeader1 }
     * 
     */
    public GroupHeader1 createGroupHeader1() {
        return new GroupHeader1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

}
