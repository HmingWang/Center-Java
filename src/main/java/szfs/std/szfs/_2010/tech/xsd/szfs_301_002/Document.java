//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.06.28 ʱ�� 09:53:29 AM CST 
//


package szfs.std.szfs._2010.tech.xsd.szfs_301_002;

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
 *         &lt;element name="PmtByAgcy" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}PaymentByAgency"/>
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
    "pmtByAgcy"
})
public class Document {

    @XmlElement(name = "PmtByAgcy", required = true)
    protected PaymentByAgency pmtByAgcy;

    /**
     * ��ȡpmtByAgcy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PaymentByAgency }
     *     
     */
    public PaymentByAgency getPmtByAgcy() {
        return pmtByAgcy;
    }

    /**
     * ����pmtByAgcy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentByAgency }
     *     
     */
    public void setPmtByAgcy(PaymentByAgency value) {
        this.pmtByAgcy = value;
    }

}
