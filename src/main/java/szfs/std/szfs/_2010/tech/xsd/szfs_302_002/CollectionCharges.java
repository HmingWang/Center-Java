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
 * <p>CollectionCharges complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CollectionCharges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}GroupHeader1"/>
 *         &lt;element name="ColltnChrgsInf" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}CollectionChargesInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionCharges", propOrder = {
    "grpHdr",
    "colltnChrgsInf"
})
public class CollectionCharges {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "ColltnChrgsInf", required = true)
    protected CollectionChargesInformation colltnChrgsInf;

    /**
     * ��ȡgrpHdr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader1 }
     *     
     */
    public GroupHeader1 getGrpHdr() {
        return grpHdr;
    }

    /**
     * ����grpHdr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader1 }
     *     
     */
    public void setGrpHdr(GroupHeader1 value) {
        this.grpHdr = value;
    }

    /**
     * ��ȡcolltnChrgsInf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CollectionChargesInformation }
     *     
     */
    public CollectionChargesInformation getColltnChrgsInf() {
        return colltnChrgsInf;
    }

    /**
     * ����colltnChrgsInf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionChargesInformation }
     *     
     */
    public void setColltnChrgsInf(CollectionChargesInformation value) {
        this.colltnChrgsInf = value;
    }

}
