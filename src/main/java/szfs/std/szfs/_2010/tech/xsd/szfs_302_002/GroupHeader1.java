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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GroupHeader1 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GroupHeader1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxTpCd" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Exact3NumericText"/>
 *         &lt;element name="CnsDt" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Exact8NumericText"/>
 *         &lt;element name="TxId" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max8NumericText"/>
 *         &lt;element name="InstgPty" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max14Text"/>
 *         &lt;element name="Ccy" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Currencycode1"/>
 *         &lt;element name="Amt" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max15NumericText"/>
 *         &lt;element name="TxCd" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Exact5NumericText"/>
 *         &lt;element name="Areacd" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}AreaCode1"/>
 *         &lt;element name="AcctChckFlg" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}AcctChckFlgCode1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader1", propOrder = {
    "txTpCd",
    "cnsDt",
    "txId",
    "instgPty",
    "ccy",
    "amt",
    "txCd",
    "areacd",
    "acctChckFlg"
})
public class GroupHeader1 {

    @XmlElement(name = "TxTpCd", required = true)
    protected String txTpCd;
    @XmlElement(name = "CnsDt", required = true)
    protected String cnsDt;
    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "InstgPty", required = true)
    protected String instgPty;
    @XmlElement(name = "Ccy", required = true)
    @XmlSchemaType(name = "string")
    protected Currencycode1 ccy;
    @XmlElement(name = "Amt", required = true)
    protected String amt;
    @XmlElement(name = "TxCd", required = true)
    protected String txCd;
    @XmlElement(name = "Areacd", required = true)
    protected String areacd;
    @XmlElement(name = "AcctChckFlg")
    protected String acctChckFlg;

    /**
     * ��ȡtxTpCd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTpCd() {
        return txTpCd;
    }

    /**
     * ����txTpCd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxTpCd(String value) {
        this.txTpCd = value;
    }

    /**
     * ��ȡcnsDt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnsDt() {
        return cnsDt;
    }

    /**
     * ����cnsDt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnsDt(String value) {
        this.cnsDt = value;
    }

    /**
     * ��ȡtxId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * ����txId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * ��ȡinstgPty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgPty() {
        return instgPty;
    }

    /**
     * ����instgPty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstgPty(String value) {
        this.instgPty = value;
    }

    /**
     * ��ȡccy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Currencycode1 }
     *     
     */
    public Currencycode1 getCcy() {
        return ccy;
    }

    /**
     * ����ccy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Currencycode1 }
     *     
     */
    public void setCcy(Currencycode1 value) {
        this.ccy = value;
    }

    /**
     * ��ȡamt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmt() {
        return amt;
    }

    /**
     * ����amt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmt(String value) {
        this.amt = value;
    }

    /**
     * ��ȡtxCd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxCd() {
        return txCd;
    }

    /**
     * ����txCd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxCd(String value) {
        this.txCd = value;
    }

    /**
     * ��ȡareacd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreacd() {
        return areacd;
    }

    /**
     * ����areacd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreacd(String value) {
        this.areacd = value;
    }

    /**
     * ��ȡacctChckFlg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctChckFlg() {
        return acctChckFlg;
    }

    /**
     * ����acctChckFlg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctChckFlg(String value) {
        this.acctChckFlg = value;
    }

}
