//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.06.27 ʱ�� 03:52:26 PM CST 
//


package szfs.std.szfs._2010.tech.xsd.szfs_302_002;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Document complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ColltnChrgs" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}CollectionCharges"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "colltnChrgs"
})
public class Document {

    @XmlElement(name = "ColltnChrgs", required = true)
    protected CollectionCharges colltnChrgs;

    /**
     * ��ȡcolltnChrgs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CollectionCharges }
     *     
     */
    public CollectionCharges getColltnChrgs() {
        return colltnChrgs;
    }

    /**
     * ����colltnChrgs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionCharges }
     *     
     */
    public void setColltnChrgs(CollectionCharges value) {
        this.colltnChrgs = value;
    }

}
