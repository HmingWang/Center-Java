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
 * <p>CollectionChargesInformation complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CollectionChargesInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorprtnId" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max14Text"/>
 *         &lt;element name="DbtrId" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max14Text"/>
 *         &lt;element name="CdtrId" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max14Text"/>
 *         &lt;element name="Dbtr" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Debtor1"/>
 *         &lt;element name="Cdtr" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Creditor1"/>
 *         &lt;element name="PmtItmCd" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max5Text"/>
 *         &lt;element name="ChanlId" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Exact4Text" minOccurs="0"/>
 *         &lt;element name="Rmk" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max127Text" minOccurs="0"/>
 *         &lt;element name="AltCdtrFlg" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}AltCdtrFlgcode1" minOccurs="0"/>
 *         &lt;element name="AltCdtrNm" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max60Text" minOccurs="0"/>
 *         &lt;element name="ProCd" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Exact5Text" minOccurs="0"/>
 *         &lt;element name="AddtlLen" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max8NumericText"/>
 *         &lt;element name="AddtlInf" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}AdditionalInformation1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionChargesInformation", propOrder = {
    "corprtnId",
    "dbtrId",
    "cdtrId",
    "dbtr",
    "cdtr",
    "pmtItmCd",
    "chanlId",
    "rmk",
    "altCdtrFlg",
    "altCdtrNm",
    "proCd",
    "addtlLen",
    "addtlInf"
})
public class CollectionChargesInformation {

    @XmlElement(name = "CorprtnId", required = true)
    protected String corprtnId;
    @XmlElement(name = "DbtrId", required = true)
    protected String dbtrId;
    @XmlElement(name = "CdtrId", required = true)
    protected String cdtrId;
    @XmlElement(name = "Dbtr", required = true)
    protected Debtor1 dbtr;
    @XmlElement(name = "Cdtr", required = true)
    protected Creditor1 cdtr;
    @XmlElement(name = "PmtItmCd", required = true)
    protected String pmtItmCd;
    @XmlElement(name = "ChanlId")
    protected String chanlId;
    @XmlElement(name = "Rmk")
    protected String rmk;
    @XmlElement(name = "AltCdtrFlg")
    protected String altCdtrFlg;
    @XmlElement(name = "AltCdtrNm")
    protected String altCdtrNm;
    @XmlElement(name = "ProCd")
    protected String proCd;
    @XmlElement(name = "AddtlLen", required = true)
    protected String addtlLen;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation1 addtlInf;

    /**
     * ��ȡcorprtnId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorprtnId() {
        return corprtnId;
    }

    /**
     * ����corprtnId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorprtnId(String value) {
        this.corprtnId = value;
    }

    /**
     * ��ȡdbtrId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtrId() {
        return dbtrId;
    }

    /**
     * ����dbtrId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbtrId(String value) {
        this.dbtrId = value;
    }

    /**
     * ��ȡcdtrId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrId() {
        return cdtrId;
    }

    /**
     * ����cdtrId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtrId(String value) {
        this.cdtrId = value;
    }

    /**
     * ��ȡdbtr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Debtor1 }
     *     
     */
    public Debtor1 getDbtr() {
        return dbtr;
    }

    /**
     * ����dbtr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Debtor1 }
     *     
     */
    public void setDbtr(Debtor1 value) {
        this.dbtr = value;
    }

    /**
     * ��ȡcdtr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Creditor1 }
     *     
     */
    public Creditor1 getCdtr() {
        return cdtr;
    }

    /**
     * ����cdtr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Creditor1 }
     *     
     */
    public void setCdtr(Creditor1 value) {
        this.cdtr = value;
    }

    /**
     * ��ȡpmtItmCd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtItmCd() {
        return pmtItmCd;
    }

    /**
     * ����pmtItmCd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtItmCd(String value) {
        this.pmtItmCd = value;
    }

    /**
     * ��ȡchanlId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChanlId() {
        return chanlId;
    }

    /**
     * ����chanlId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChanlId(String value) {
        this.chanlId = value;
    }

    /**
     * ��ȡrmk���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmk() {
        return rmk;
    }

    /**
     * ����rmk���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmk(String value) {
        this.rmk = value;
    }

    /**
     * ��ȡaltCdtrFlg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltCdtrFlg() {
        return altCdtrFlg;
    }

    /**
     * ����altCdtrFlg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltCdtrFlg(String value) {
        this.altCdtrFlg = value;
    }

    /**
     * ��ȡaltCdtrNm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltCdtrNm() {
        return altCdtrNm;
    }

    /**
     * ����altCdtrNm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltCdtrNm(String value) {
        this.altCdtrNm = value;
    }

    /**
     * ��ȡproCd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProCd() {
        return proCd;
    }

    /**
     * ����proCd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProCd(String value) {
        this.proCd = value;
    }

    /**
     * ��ȡaddtlLen���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlLen() {
        return addtlLen;
    }

    /**
     * ����addtlLen���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlLen(String value) {
        this.addtlLen = value;
    }

    /**
     * ��ȡaddtlInf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation1 }
     *     
     */
    public AdditionalInformation1 getAddtlInf() {
        return addtlInf;
    }

    /**
     * ����addtlInf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation1 }
     *     
     */
    public void setAddtlInf(AdditionalInformation1 value) {
        this.addtlInf = value;
    }

}
