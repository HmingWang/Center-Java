//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.06.27 ʱ�� 03:52:26 PM CST 
//


package szfs.std.szfs._2010.tech.xsd.szfs_302_002;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Currencycode1�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="Currencycode1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="HKD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Currencycode1")
@XmlEnum
public enum Currencycode1 {

    CNY,
    USD,
    HKD;

    public String value() {
        return name();
    }

    public static Currencycode1 fromValue(String v) {
        return valueOf(v);
    }

}
